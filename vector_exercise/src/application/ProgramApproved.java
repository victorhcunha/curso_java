package vector_exercise.src.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramApproved {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int number = sc.nextInt();

        String[] names = new String[number];
        Double[] aGrades = new Double[number];
        Double[] bGrades = new Double[number];

        for (int i = 0; i < number; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %so aluno: %n", i + 1);
            names[i] = sc.next();
            aGrades[i] = sc.nextDouble();
            bGrades[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < number; i++) {
            if (aGrades[i] + bGrades[i] / 2 >= 6.0) {
                System.out.println(names[i]);
            }
        }
    }
}
