package array_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSumVectors {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int number = sc.nextInt();

        int[] aVector = new int[number];
        int[] bVector = new int[number];
        int[] sumsVector = new int[number];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < number; i++) {
            aVector[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < number; i++) {
            bVector[i] = sc.nextInt();
            sumsVector[i] =  aVector[i] +  bVector[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < number; i++) {
            System.out.println( sumsVector[i]);
        }

        sc.close();



    }
}
