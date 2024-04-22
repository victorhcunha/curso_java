package vector_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBiggestPosition {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int number = sc.nextInt();
        Double[] numbers = new Double[number];
        Double biggestValue = 0.0;
        int biggestPosition = 0;

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            if ( numbers[i] > biggestValue){
                biggestValue = numbers[i];
                biggestPosition = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %s %n", biggestValue);
        System.out.printf("POSICAO DO MAIOR VALOR = %s",biggestPosition);

        sc.close();
    }
}
