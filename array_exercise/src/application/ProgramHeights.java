package array_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeights {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int number = sc.nextInt();

        String[] names = new String[number];
        int[] ages = new int[number];
        double[] heights = new double[number];

        double averageHeight = 0;
        int sumPeopleUnder16 = 0;
        double percentagePeopleUnder16;

        for (int i = 0; i < number; i++) {
            System.out.printf("Dados da %sa Pessoa:%n", i + 1);

            System.out.print("Nome: ");
            names[i] = sc.next();

            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            if (ages[i] < 16) {
                sumPeopleUnder16++;
            }

            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();

            averageHeight += heights[i] / number;
        }

        System.out.printf("Altura média: %s%n", averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f %% %n", (double) sumPeopleUnder16 / number * 100);

        for (int i = 0; i < number; i++) {
            if (ages[i] < 16) {
                System.out.println(names[i]);
            }
        }


        sc.close();
    }


}
