package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		String name = sc.nextLine();
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		
		student.setName(name);
		student.setFirstGrade(grade1);
		student.setSecondGrade(grade2);
		student.setThirdGrade(grade3);
		
		sc.close();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.getFinalGrade());

		if (student.getMissingPoints() != 0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.getMissingPoints());
			
		}else {
			System.out.println("PASS");
		}
		
	}

}
