package abstract_exercise.application;

import abstract_exercise.entities.TaxPayer;
import abstract_exercise.entities.TaxPayerCompany;
import abstract_exercise.entities.TaxPayerIndividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AbstractProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int number = sc.nextInt();
        List<TaxPayer> taxPayerList = new ArrayList<>();

        for (int i = 0; i < number; i++){
            System.out.printf("Tax payer #%s data:%n", i+1);

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();


            if(type =='c'){
                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();

                taxPayerList.add(new TaxPayerCompany(name,annualIncome,employeesNumber));

            }else{
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxPayerList.add(new TaxPayerIndividual(name,annualIncome,healthExpenditures));
            }




        }
        double totalTax = 0;
        System.out.println("\nTAXES PAID:");
        for (TaxPayer t : taxPayerList){
            System.out.println(t.getName() + ": $ " + String.format("%.2f", t.getTax()));
            totalTax += t.getTax();
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax));


    }
}
