package abstract_exercise.entities;

public class TaxPayerIndividual extends TaxPayer {
    private double hearthExpenditures;
    @Override
    public double getTax() {
        double tax = 0;
        if(this.getAnnualIncome() < 2000){
            tax = this.getAnnualIncome() * 0.15;
        }else{
            tax = this.getAnnualIncome() * 0.25;
        }

        tax -= this.getHearthExpenditures() * 0.50;
        return tax;
    }

    public TaxPayerIndividual(String name, double annualIncome, double hearthExpenditures) {
        super(name, annualIncome);
        this.hearthExpenditures = hearthExpenditures;
    }

    public double getHearthExpenditures() {
        return hearthExpenditures;
    }

    public void setHearthExpenditures(double hearthExpenditures) {
        this.hearthExpenditures = hearthExpenditures;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " $ " + String.format("%,.2f",this.getTax());
    }
}
