package array_exercise;

import java.util.Locale;
import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();
        int column = sc.nextInt();
        int[][] array = new int[line][column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] == number) {
                    System.out.printf("Position: %s,%s%n", i, j);
                    if (j != 0) {
                        System.out.printf("Left: %s%n", array[i][j - 1]);
                    }
                    if (j != column - 1) {
                        System.out.printf("Right: %s%n", array[i][j + 1]);
                    }
                    if (i != 0) {
                        System.out.printf("Up: %s%n", array[i - 1][j]);
                    }
                    if (i != line - 1) {
                        System.out.printf("Down: %s%n", array[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }

}
