package employees_exercise.application;

import boardingHouse_exercise.entities.Rent;
import employees_exercise.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployees {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int countEmployee = sc.nextInt();

        for (int i = 0; i < countEmployee; i++){

            System.out.printf("\nEmployee #%s:", i + 1);
            System.out.print("\nId: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new Employee(id,name,salary));
        }

        boolean hasId = false;
        int position;


        System.out.print("\nEnter the employee id that will have the salary increase: ");
        int idToIncreaseSalary = sc.nextInt();

        if(PositionList(employeeList,idToIncreaseSalary) ==null){
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percentageToIncreaseSalary = sc.nextDouble();
            employeeList.get(PositionList(employeeList,idToIncreaseSalary)).increaseSalary(percentageToIncreaseSalary);
        }

        System.out.println("\nList of employees: ");
        for (Employee e : employeeList ){
            System.out.println(e);
        }

        sc.close();
    }

    public static Integer PositionList(List<Employee> employeeList, int id){
        for (int i = 0; i < employeeList.size(); i++){
            if (employeeList.get(i).getId() == id) {
                return i;
            }

        }
        return null;
    }
}
