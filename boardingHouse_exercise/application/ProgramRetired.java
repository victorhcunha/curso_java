package retired_exercise.application;

import retired_exercise.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetired {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int countRoomsRented = sc.nextInt();

        for (int i = 0; i < countRoomsRented; i++){
            System.out.printf("\nRent #%s", i + 1);
            sc.nextLine();
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            rooms[roomNumber] = new Rent(name,email);

//            System.out.print(name + email + room);
        }

        System.out.println("\nBusy rooms:");

        for (int i = 0; i < 10; i++){
            if (rooms[i] != null){
                System.out.printf("%s: %s%n", i, rooms[i]);
            }
        }

        sc.close();
    }
}
