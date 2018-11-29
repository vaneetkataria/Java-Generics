package com.katariasoft.technologies.generics.collections;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ProducerExtendsConsumerSuper {

	private static final String needOfWildCards = "needOfWildCards";
	private static final String needOfGenerics = "needOfGenerics";

	public static void main(String[] args) {
		String testCase = "needOfGenerics";
		switch (testCase) {
		case needOfGenerics:
			needOfGenerics();
			break;
		case needOfWildCards:
			needOfWildCards();
			break;
		default:
			break;
		}

	}

	private static void needOfWildCards() {
	}

	private static void needOfGenerics() {
		List studentNamesList = new ArrayList();
		studentNamesList.add("Vaneet");
		studentNamesList.add("Pratapi");
		studentNamesList.add("Deepak");
		studentNamesList.add("Dheeraj");
		studentNamesList.add("Franka");
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
