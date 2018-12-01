package com.katariasoft.technologies.generics;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class NeedOfGenerics {

	public static void main(String[] args) {
		conceptiseNeedOfGenerics();
	}

	@SuppressWarnings("unchecked")
	private static void conceptiseNeedOfGenerics() {
		@SuppressWarnings("rawtypes")
		List studentNamesList = new ArrayList();
		studentNamesList.add("Vaneet");
		studentNamesList.add("Pratapi");
		toSomeAnotherMethod(studentNamesList);
		sayHiToAllStudents(studentNamesList);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void toSomeAnotherMethod(List studentNamesList) {
		studentNamesList.add(Instant.now());
		studentNamesList.add(1);
		studentNamesList.add(LocalTime.now(ZoneId.systemDefault()));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void sayHiToAllStudents(List listToPrint) {
		listToPrint.forEach(s -> System.out.println("Hi " + (String) s));

	}

}
