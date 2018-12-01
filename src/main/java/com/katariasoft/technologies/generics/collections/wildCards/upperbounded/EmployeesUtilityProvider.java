package com.katariasoft.technologies.generics.collections.wildCards.upperbounded;

import static com.katariasoft.technologies.generics.PersonsDataSource.*;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import com.katariasoft.technologies.generics.beans.Consultant;
import com.katariasoft.technologies.generics.beans.Contractor;
import com.katariasoft.technologies.generics.beans.Employee;
import com.katariasoft.technologies.generics.beans.Intern;
import com.katariasoft.technologies.generics.beans.PermanentEmployee;
import com.katariasoft.technologies.generics.beans.Person;

public class EmployeesUtilityProvider {

	private static final String locationToBeChanged = "Ambala City";
	private Consumer<List<Person>> onlyPersonListInfoPrinter = onlyPersonListInfoPrinterDef();
	private Consumer<List<? extends Person>> personListInfoPrinter = personListInfoPrinterDef();
	private UnaryOperator<List<Employee>> onlyEmployeesLacationChnager = onlyEmployeesLacationChnagerDef();
	private UnaryOperator<List<? extends Employee>> employeesLacationChanger = employeesLacationChangerDef();
	// Defs
	private Consumer<? super Employee> employeeDataPrinter = e -> {
		Objects.requireNonNull(e, "Employee cannot be null.");
		System.out.println("Name : " + e.getName() + " Location: " + e.getLocation());
	};

	private UnaryOperator<Employee> onlyEmployeelocationChnager = e -> {
		Objects.requireNonNull(e, "Employee cannot be null");
		e.setLocation(locationToBeChanged);
		return e;
	};

	private Consumer<List<Person>> onlyPersonListInfoPrinterDef() {
		return l -> {
			Objects.requireNonNull(l, "Person List cannot be null or empty.");
			l.stream()
					.forEach(p -> System.out.println("Person Name :" + p.getName() + " Contact No :" + p.getPhoneNo()));

		};
	}

	private Consumer<List<? extends Person>> personListInfoPrinterDef() {
		return l -> {
			Objects.requireNonNull(l, "Person List cannot be null or empty.");
			// data cannot be added in a upper bounded wild card list.
			// l.add(new Employee());
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
				else
					System.out.println("Employee dept and qual is : " + ((Employee) se).getDepartment() + ","
							+ ((Employee) se).getEducationalQualificartion());

			});

		};
	}

	private UnaryOperator<List<Employee>> onlyEmployeesLacationChnagerDef() {
		return l -> {
			Objects.requireNonNull(l, "Employee list cannot be null.");
			return l.stream().map(onlyEmployeelocationChnager).collect(Collectors.toList());
		};
	}

	private UnaryOperator<List<? extends Employee>> employeesLacationChangerDef() {
		return l -> {
			Objects.requireNonNull(l, "Employee Subclass List cannot be null");
			return l.stream().map(onlyEmployeelocationChnager).collect(Collectors.toList());
		};

	}

	public Consumer<List<Person>> getOnlyPersonListInfoPrinter() {
		return onlyPersonListInfoPrinter;
	}

	public Consumer<List<? extends Person>> getPersonListInfoPrinter() {
		return personListInfoPrinter;
	}

	public UnaryOperator<List<Employee>> getOnlyEmployeesLacationChnager() {
		return onlyEmployeesLacationChnager;
	}

	public UnaryOperator<List<? extends Employee>> getEmployeesLacationChnager() {
		return employeesLacationChanger;
	}

	public static void main(String args[]) {
		EmployeesUtilityProvider utilityProvider = new EmployeesUtilityProvider();
		// List<Person can only take ArrayList<Person>> coming from anywhere.
		utilityProvider.getOnlyPersonListInfoPrinter().accept(getPersons());
		// List<? extends Person> can only take ArrayList<Person>> as well as
		// ArrayList<Employee> coming from anywhere.
		utilityProvider.getPersonListInfoPrinter().accept(getEmployees());
		// ####
		// Can only take List<Employee>
		List<Employee> employees = utilityProvider.getOnlyEmployeesLacationChnager().apply(getEmployees());
		employees.forEach(utilityProvider.employeeDataPrinter);
		// List<? extends Employee can take ArrayList<PermenentEmployee>> as well as
		// ArrayList<Intern> too.
		// sending permanent employees
		utilityProvider.getPersonListInfoPrinter()
				.accept(utilityProvider.getEmployeesLacationChnager().apply(getPermanentEmployees()));
		// sending interns
		utilityProvider.getPersonListInfoPrinter()
				.accept(utilityProvider.getEmployeesLacationChnager().apply(getInterns()));
		// sending Employees
		utilityProvider.getPersonListInfoPrinter()
				.accept(utilityProvider.getEmployeesLacationChnager().apply(getEmployees()));

	}

}
