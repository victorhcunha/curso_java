package vector_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramOlder {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int number = sc.nextInt();

        String[] names = new String[number];
        int[] ages = new int[number];

        int olderAge = 0;
        String olderName = "";

        for (int i = 0; i < number; i++) {
            System.out.printf("Dados da %sa pessoa: %n", i + 1);
            System.out.print("Nome: ");
            names[i] = sc.next();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();

            if (ages[i] > olderAge) {
                olderAge = ages[i];
                olderName = names[i];
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", olderName);

        sc.close();

    }
}
