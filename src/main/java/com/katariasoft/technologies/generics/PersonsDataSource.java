package com.katariasoft.technologies.generics;

import java.util.ArrayList;
import java.util.List;

import com.katariasoft.technologies.generics.beans.Employee;
import com.katariasoft.technologies.generics.beans.Intern;
import com.katariasoft.technologies.generics.beans.PermanentEmployee;
import com.katariasoft.technologies.generics.beans.Person;

public class PersonsDataSource {

	public static List<Person> getPersons() {
		return populatePersons();
	}

	public static List<Employee> getEmployees() {
		return populateEmployees();
	}

	public static List<PermanentEmployee> getPermanentEmployees() {
		return populatePermanentEmployees();
	}

	public static List<Intern> getInterns() {
		return populateInterns();
	}

	private static List<Person> populatePersons() {
		List<Person> employees = new ArrayList<>();
		employees.add(new Person("Vaneet", "vaneet.kumar@yatra.com", "8742910240"));
		employees.add(new Person("Sahil", "sahil.kumar@yatra.com", "8742910241"));
		return employees;
	}

	private static List<Employee> populateEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Vaneet", "vaneet.kumar@yatra.com", "8742910240", "1", "IT", "B.tech", "05/01/2015",
				"Gurgaon"));
		employees.add(new Employee("Sahil", "sahil.kumar@yatra.com", "8742910241", "1", "IT", "B.tech", "05/01/2015",
				"Gurgaon"));
		return employees;
	}

	private static List<PermanentEmployee> populatePermanentEmployees() {
		List<PermanentEmployee> employees = new ArrayList<>();
		employees.add(new PermanentEmployee("Vaneet", "vaneet.kumar@yatra.com", "8742910240", "1", "IT", "B.tech",
				"05/01/2015", "Gurgaon", "05/03/2015", "1", "vaneet.kumar@yatra.com", "1"));
		employees.add(new PermanentEmployee("sahil", "sahil.kumar@yatra.com", "8742910241", "2", "IT", "B.tech",
				"05/01/2015", "Gurgaon", "05/03/2015", "2", "sahil.kumar@yatra.com", "2"));
		return employees;

	}

	private static List<Intern> populateInterns() {
		List<Intern> employees = new ArrayList<>();
		employees.add(new Intern("Raj", "raj.kumar@yatra.com", "8742910242", "1", "IT", "B.tech", "05/01/2015",
				"Gurgaon", "05/03/2015", "05/06/2015"));
		employees.add(new Intern("Kartik", "kartik.kumar@yatra.com", "8742910243", "2", "IT", "B.tech", "05/01/2015",
				"Gurgaon", "05/03/2015", "05/06/2015"));
		return employees;
	}

}