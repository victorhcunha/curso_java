package vector_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEvenNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int number = sc.nextInt();
        Double[] numbers = new Double[number];
        int quantityEvens = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
        }

        System.out.printf("%nNUMEROS PARES: ");

        for (int i = 0; i < number; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.printf("%s  ", numbers[i]);
                quantityEvens++;
            }
        }

        System.out.println("\n");
        System.out.printf("QUANTIDADE DE PARES = %s", quantityEvens);

        sc.close();
    }
}
