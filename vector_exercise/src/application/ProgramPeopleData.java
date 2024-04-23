package vector_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPeopleData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int number = sc.nextInt();

        char[] gender = new char[number];
        Double[] heights = new Double[number];

        int menCount = 0;
        int womenCount = 0;
        Double womenSumHeights = 0.0;
        Double taller = 0.0;
        Double small = null;

        for (int i = 0; i < number; i++) {
            System.out.printf("Altura da %sa pessoa: ", i + 1);
            heights[i] = sc.nextDouble();
            System.out.printf("Genero da %sa pessoa: ", i + 1);
            gender[i] = sc.next().charAt(0);

            if (gender[i] == 'F'){
                womenSumHeights += heights[i];
                womenCount ++;
            }else if(gender[i] == 'M'){
                menCount ++;
            }

            if (heights[i] > taller){
                taller = heights[i];
            }
            if (small == null || heights[i] < small){
                small = heights[i];
            }

        }

        System.out.printf("Menor altura = %s%n", small);
        System.out.printf("Maior altura = %s%n", taller);
        System.out.printf("Media das alturas das mulheres = %.2f%n", womenSumHeights / womenCount);
        System.out.printf("Numero de homens = %s%n", menCount);


    }
}
