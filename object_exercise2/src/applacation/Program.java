package applacation;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.print("Name: ");
		employee.setName(sc.next());

		System.out.print("Groos Salary: ");
		employee.setGrossSalary(sc.nextDouble());

		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());

		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();

		System.out.print("Wich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());

		sc.close();
		System.out.println();
		System.out.println("Updated data: " + employee);

	}

}
