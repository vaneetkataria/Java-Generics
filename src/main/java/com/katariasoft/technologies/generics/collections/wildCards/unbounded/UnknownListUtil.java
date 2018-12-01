package com.katariasoft.technologies.generics.collections.wildCards.unbounded;

import static com.katariasoft.technologies.generics.PersonsDataSource.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.katariasoft.technologies.generics.beans.Consultant;
import com.katariasoft.technologies.generics.beans.Contractor;
import com.katariasoft.technologies.generics.beans.Employee;
import com.katariasoft.technologies.generics.beans.Intern;
import com.katariasoft.technologies.generics.beans.PermanentEmployee;
import com.katariasoft.technologies.generics.beans.Person;

public class UnknownListUtil {
	private List<?> empty = new ArrayList<>();

	public List<?> getEmpty() {
		return empty;
	}

	public void printAllObjects(List<Object> listOfObjects) {
		Objects.requireNonNull(listOfObjects, "List of Objects cannot be null");
		listOfObjects.stream().forEach(System.out::println);

	}

	public void printAllElements(List<?> listOfAnyType) {
		Objects.requireNonNull(listOfAnyType, "List of any Type cannot be null");
		listOfAnyType.stream().forEach(se -> {
			if (se instanceof Intern)
				System.out.println("Intern start and end date is : " + ((Intern) se).getInternshipStartDate() + ","
						+ ((Intern) se).getInternshipEndDate());
			else if (se instanceof PermanentEmployee)
				System.out.println("Permanent  confirmation date and access card no is  : "
						+ ((PermanentEmployee) se).getDateOfConfirmation() + ","
						+ ((PermanentEmployee) se).getAccessCardNo());
			else if (se instanceof Contractor)
				System.out.println("Contractor original company is:  " + ((Contractor) se).getOriginalCompanyName());
			else if (se instanceof Consultant)
				System.out.println("Consultant perhour rate is: " + ((Consultant) se).getPerHourRate());
			else if (se instanceof Employee)
				System.out.println("Employee dept and qual is : " + ((Employee) se).getDepartment() + ","
						+ ((Employee) se).getEducationalQualificartion());
			else
				System.out.println(
						((Person) se).getEmailId() + "," + ((Person) se).getName() + "," + ((Person) se).getPhoneNo());
		});
	}

	public static void main(String args[]) {
		UnknownListUtil util = new UnknownListUtil();
		List<? extends Employee> interns = getInterns();
		util.printAllElements(interns);
		util.printAllElements(getEmployees());
		util.printAllElements(getPermanentEmployees());
		// cannot send List<Employee> to printAllObjects method.
		// util.printAllObjects(getEmployees());
		// Nothing can be added in it .
		// util.getEmpty().add(new Object());

	}
}
