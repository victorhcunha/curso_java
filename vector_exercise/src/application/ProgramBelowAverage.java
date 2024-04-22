package vector_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBelowAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int number = sc.nextInt();

        Double[] vector = new Double[number];
        Double average = 0.0;

        for (int i = 0; i < number; i++) {
            vector[i] = sc.nextDouble();
            average += vector[i] / number;
        }

        System.out.printf("\nMEDIA DO VETOR = %s", average);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < number; i++) {
            if (vector[i] < average) {
                System.out.println(vector[i]);
            }
        }

        sc.close();


    }
}
