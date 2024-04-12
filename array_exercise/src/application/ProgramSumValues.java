package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProgramSumValues {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int number = sc.nextInt();
		number = Math.abs(number);

		double sum = 0;
		double average = 0;

		double[] vector = new double[Math.abs(number)];

		for (int i = 0; i < number; i++) {
			System.out.print("Digite um número: ");
			vector[i] = sc.nextDouble();
			sum += vector[i];
			average += vector[i]/number;
		}

		System.out.printf("%nVALORES: %s %n", Arrays.toString(vector));
		System.out.printf("SOMA: %.2f %n", sum);
		System.out.printf("MÉDIA: %.2f", average);

		sc.close();
	}
}
