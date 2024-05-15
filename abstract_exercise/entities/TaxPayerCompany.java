package abstract_exercise.entities;

public class TaxPayerCompany extends TaxPayer{

    private int employeesNumber;

    public TaxPayerCompany(String name, double annualIncome, int employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public double getTax() {
        double tax = 0;

        if (this.getEmployeesNumber() <= 10){
            tax = this.getAnnualIncome() * 0.12;
        }else{
            tax = this.getAnnualIncome() * 0.14;
        }
        return tax;
    }


    @Override
    public String toString() {
        return "Name: " + this.getName() + " $ ";
    }
}
