package com.katariasoft.technologies.generics;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class NeedOfGenerics {

	public static void main(String[] args) {
		conceptuateNeedOfGenerics();
	}

	private static void conceptuateNeedOfGenerics() {
		List studentNamesList = new ArrayList();
		studentNamesList.add("Vaneet");
		studentNamesList.add("Pratapi");
		toSomeAnotherMethod(studentNamesList);
		sayHiToAllStudents(studentNamesList);
	}

	private static void toSomeAnotherMethod(List studentNamesList) {
		studentNamesList.add(Instant.now());
		studentNamesList.add(1);
		studentNamesList.add(LocalTime.now(ZoneId.systemDefault()));
	}

	private static void sayHiToAllStudents(List listToPrint) {
		// Say Hi to all students.
		for (Object stuName : listToPrint)
			System.out.println("Hi " + (String) stuName);
	}

}
