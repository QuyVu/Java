package mutable_immutable;

import java.util.Date;

public class Student {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date myDOB = new Date();
		ImmutableClass student = new ImmutableClass("Manh", "Do", myDOB);
		System.out.println(student.getDateOfBirth());
		myDOB.setMonth(myDOB.getMonth() + 2);
		System.out.println(myDOB);
		System.out.println(student.getDateOfBirth());
		System.out.printf("\n");

		ImmutableClass student2 = new ImmutableClass("Do", "Manh", new Date());
		System.out.println(student2.getDateOfBirth());
		Date myDOB2 = student2.getDateOfBirth();
		myDOB2.setMonth(myDOB2.getMonth() + 2);
		System.out.println(myDOB2);
		System.out.println(student2.getDateOfBirth());

	}

}
