package composite_exercise.entities;

import composite_exercise.entities.enums.OrderStatus;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;
    private Client client;
    private final List<OrderItem> items = new ArrayList<OrderItem>();

    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addOderItem(OrderItem orderItem){
        items.add(orderItem);
    }

    public void removeOderItem(OrderItem orderItem){
        items.remove(orderItem);
    }

    public double totalPrice(){
        double totalPrice = 0;

        for (OrderItem item : items) {
            totalPrice += item.subTotal();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("ORDER SUMMARY:\n")
                .append("Order moment: ").append(this.getMoment()).append("\n")
                .append("Order status: ").append(this.getOrderStatus()).append("\n")
                .append("Client: ").append(this.getClient()).append("\n");

        for (OrderItem item : items) {
            string.append(item).append("\n");
        }

        string.append("Total price: $").append(String.format("%.2f", this.totalPrice()));

        return string.toString();
    }
}
