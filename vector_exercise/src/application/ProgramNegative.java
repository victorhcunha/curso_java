package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegative {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int number = sc.nextInt();
		number = Math.abs(number);

		int[] vetor = new int[Math.abs(number)];

		for (int i = 0; i < number; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (i == 9) {
				break;
			}
		}

		System.out.print("NUMEROS NEGATIVOS:");
		System.out.println("");

		for (int i = 0; i < number; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}

			sc.close();

		}

	}
}
