package polymorphism_exercise.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return sdf.format(manufactureDate);
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return this.getName() + " (used), $ " + String.format("%,.2f", this.getPrice()) + " (Manufactured date: " + this.getManufactureDate() + ")";
    }
}
