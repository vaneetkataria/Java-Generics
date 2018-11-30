package com.katariasoft.technologies.generics.collections.wildCards.upperbounded;

import static com.katariasoft.technologies.generics.PersonsDataSource.*;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import com.katariasoft.technologies.generics.beans.Employee;
import com.katariasoft.technologies.generics.beans.Person;

public class PersonUtilityProvider {

	private static final String locationToBeChanged = "Ambala City";
	private Consumer<List<Person>> onlyPersonListInfoPrinter = onlyPersonListInfoPrinterDef();
	private Consumer<List<? extends Person>> personListInfoPrinter = personListInfoPrinterDef();
	private UnaryOperator<List<Employee>> onlyEmployeesLacationChnager = onlyEmployeesLacationChnagerDef();
	private UnaryOperator<List<? extends Employee>> employeesLacationChanger = employeesLacationChangerDef();
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
			l.stream()
					.forEach(p -> System.out.println("Person Name :" + p.getName() + " Contact No :" + p.getPhoneNo()));

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
		PersonUtilityProvider utilityProvider = new PersonUtilityProvider();
		// List<Person can only take ArrayList<Person>> coming from anywhere.
		utilityProvider.getOnlyPersonListInfoPrinter().accept(getPersons());
		// List<? extends Person> can only take ArrayList<Person>> as well as
		// ArrayList<Employee> coming from anywhere.
		utilityProvider.getPersonListInfoPrinter().accept(getEmployees());
		// ####
		// Can only take List<Employee>
		utilityProvider.getOnlyEmployeesLacationChnager().apply(getEmployees())
				.forEach(utilityProvider.employeeDataPrinter);
		// List<? extends Employee can take ArrayList<PermenentEmployee>> as well as
		// ArrayList<Intern> too.
		utilityProvider.getEmployeesLacationChnager().apply(getPermanentEmployees())
				.forEach(utilityProvider.employeeDataPrinter);
		utilityProvider.getEmployeesLacationChnager().apply(getInterns()).forEach(utilityProvider.employeeDataPrinter);

	}

}
