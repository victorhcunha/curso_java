package composite_exercise.application;

import composite_exercise.entities.Client;
import composite_exercise.entities.Order;
import composite_exercise.entities.OrderItem;
import composite_exercise.entities.Product;
import composite_exercise.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramComposite {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client client = new Client();
        System.out.println("Enter client data:");

        System.out.print("Name: ");
        client.setName(sc.nextLine());

        System.out.print("Email: ");
        client.setEmail(sc.nextLine());

        System.out.print("Birth date (DD/MM/YYYY): ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        client.setBirthdate(formatter.parse(sc.next()));


        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        System.out.print("How many items to this order? ");
        int itemsQuantity = sc.nextInt();

        Order order = new Order(new Date(), orderStatus, client);

        for(int i = 0; i< itemsQuantity; i++){
            System.out.printf("Enter #%d item data: %n", i+1);

            Product product = new Product();
            System.out.print("Product name: ");
            sc.nextLine();
            product.setName(sc.nextLine());
            System.out.print("Product price: ");
            product.setPrice(sc.nextDouble());

            OrderItem orderItem = new OrderItem(product, product.getPrice());
            System.out.print("Quantity: ");
            orderItem.setQuantity(sc.nextInt());

            order.addOderItem(orderItem);
        }

        System.out.print("");
        System.out.println(order);

        sc.close();

    }
}
