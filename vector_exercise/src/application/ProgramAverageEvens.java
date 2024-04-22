package array_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAverageEvens {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int number = sc.nextInt();

        Double[] vector = new Double[number];
        Double sumEven = 0.0;
        int quantityEven = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
            if (vector[i] % 2 == 0) {
                sumEven += vector[i];
                quantityEven++;
            }
        }

        if (quantityEven == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %s", sumEven / quantityEven);
        }
        sc.close();
    }
}
