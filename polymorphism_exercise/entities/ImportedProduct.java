package polymorphism_exercise.entities;

public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double getTotalPrice() {
        return this.getPrice() + this.getCustomsFee();
    }

    @Override
    public String priceTag(){
        return this.getName() + ", $ " + String.format("%,.2f", this.getTotalPrice()) + " (Customs fee: $ " + String.format("%,.2f", this.getCustomsFee()) + ")";
    }
}
