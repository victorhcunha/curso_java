package ProgramExeption.application;

import ProgramExeption.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramException {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Enter account data");

        System.out.print("Number: ");
        account.setNumber(sc.nextInt());

        System.out.print("Holder: ");
        account.setHolder(sc.next());

        System.out.print("Initial balance: ");
        account.setBalance(sc.nextDouble());

        System.out.print("Withdraw limit: ");
        account.setWithdrawLimit(sc.nextDouble());

        System.out.print("Enter amount for withdraw: ");

        try {
            account.withdraw(sc.nextDouble());
            System.out.println("New balance: " + account.getBalance());

        }catch (IllegalArgumentException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }


}
