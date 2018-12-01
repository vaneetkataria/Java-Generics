package com.katariasoft.technologies.generics.collections.wildCards.lowerbounded;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import static com.katariasoft.technologies.generics.PersonsDataSource.*;

import com.katariasoft.technologies.generics.beans.Consultant;
import com.katariasoft.technologies.generics.beans.Contractor;
import com.katariasoft.technologies.generics.beans.Employee;
import com.katariasoft.technologies.generics.beans.Intern;
import com.katariasoft.technologies.generics.beans.PermanentEmployee;
import com.katariasoft.technologies.generics.beans.Person;

public class PersonUtilityProvider {

	private Consumer<List<? super Employee>> allEmployeeTypesAttributePrinter = allEmployeeTypesAttributePrinterDef();
	private BiFunction<List<? super Employee>, List<? extends Employee>, List<? super Employee>> companyNewEmployeesAdder = companyNewEmployeesAdderDef();

	// Defs
	private BiFunction<List<? super Employee>, List<? extends Employee>, List<? super Employee>> companyNewEmployeesAdderDef() {
		return (existing, newJoinees) -> {
			Objects.requireNonNull(existing, "Existing cannot be null");
			Objects.requireNonNull(newJoinees, "Existing cannot be null");
			existing.addAll(newJoinees);
			return existing;
		};

	}

	private Consumer<List<? super Employee>> allEmployeeTypesAttributePrinterDef() {
		return l -> {
			Objects.requireNonNull(l, "List cannot be empty.");
			l.stream().forEach(se -> {
				if (se instanceof Intern)
					System.out.println("Intern start and end date is : " + ((Intern) se).getInternshipStartDate() + ","
							+ ((Intern) se).getInternshipEndDate());
				else if (se instanceof PermanentEmployee)
					System.out.println("Permanent  confirmation date and access card no is  : "
							+ ((PermanentEmployee) se).getDateOfConfirmation() + ","
							+ ((PermanentEmployee) se).getAccessCardNo());
				else if (se instanceof Contractor)
					System.out
							.println("Contractor original company is:  " + ((Contractor) se).getOriginalCompanyName());
				else if (se instanceof Consultant)
					System.out.println("Consultant perhour rate is: " + ((Consultant) se).getPerHourRate());
				else if (se instanceof Employee)
					System.out.println("Employee dept and qual is : " + ((Employee) se).getDepartment() + ","
							+ ((Employee) se).getEducationalQualificartion());
				else
					System.out.println(((Person) se).getEmailId() + "," + ((Person) se).getName() + ","
							+ ((Person) se).getPhoneNo());
			});

		};
	}

	// getters
	public BiFunction<List<? super Employee>, List<? extends Employee>, List<? super Employee>> getCompanyNewEmployeesAdder() {
		return companyNewEmployeesAdder;
	}

	public Consumer<List<? super Employee>> getAllEmployeeTypesAttributePrinter() {
		return allEmployeeTypesAttributePrinter;
	}

	// test
	public static void main(String args[]) {
		PersonUtilityProvider utilityProvider = new PersonUtilityProvider();
		List<? super Employee> persons = getEmployees();
		persons.addAll(getPermanentEmployees());

		@SuppressWarnings("unchecked")
		List<Employee> finalList = (List<Employee>) utilityProvider.getCompanyNewEmployeesAdder().apply(persons,
				getInterns());
		finalList.forEach(System.out::println);

		// Combine Employees and Interns Only.
		System.out.println("\n");
		System.out.println("Combine Employees and interns only.");
		utilityProvider.getCompanyNewEmployeesAdder().apply(getEmployees(), getInterns());

		// Not possible to combine Interns and Permanent Employees.
		// utilityProvider.getCompanyNewEmployeesAdder().apply(getInterns(),
		// getPermanentEmployees());

		System.out.println("\n");
		System.out.println("Combining 0 Persons and Interns");
		// Here Persons sent in List are zero and only interns are there .
		// General Rule : TypeCasting of List<? super Employee> should be done to the
		// maximum level of object upper than employee if it is known it is present in
		// it.
		// For example if while sending in existing some persons are also sent then
		// casting must be done
		// to List<Person> as no object upper then Employee can be added in it .
		// else only List<Employee> casting must be done .
		utilityProvider.getAllEmployeeTypesAttributePrinter()
				.accept(utilityProvider.getCompanyNewEmployeesAdder().apply(
						utilityProvider.getCompanyNewEmployeesAdder().apply(new ArrayList<Person>(), getInterns()),
						getInterns()));

		System.out.println("\n");
		utilityProvider.getAllEmployeeTypesAttributePrinter()
				.accept(utilityProvider
						.getCompanyNewEmployeesAdder().apply(
								utilityProvider.getCompanyNewEmployeesAdder()
										.apply(utilityProvider.getCompanyNewEmployeesAdder().apply(getPersons(),
												getPermanentEmployees()), getPermanentEmployees()),
								getPermanentEmployees()));

	}

}