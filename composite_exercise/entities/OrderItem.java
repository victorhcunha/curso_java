package composite_exercise.entities;

public class OrderItem {
    private Product product;
    private double price;
    private int quantity;

    public OrderItem() {

    }

    public OrderItem(Product product, double price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItem(Product product, double price) {
        this.product = product;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double subTotal(){
        return this.getPrice() * this.getQuantity();
    }

    @Override
    public String toString() {
        return getProduct() + ", $" + String.format("%.2f", this.getPrice()) + ", Quantity: " + quantity + ", Subtotal: $" +  String.format("%.2f", subTotal());
    }
}
