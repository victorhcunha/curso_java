package polymorphism_exercise.application;

import polymorphism_exercise.entities.ImportedProduct;
import polymorphism_exercise.entities.Product;
import polymorphism_exercise.entities.UsedProduct;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PolymorphismProgram {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int number = sc.nextInt();
        List<Product> productList = new ArrayList<>();

        for(int i = 0; i<number;i++){

            System.out.printf("Product #%s data:%n", i+1);
            System.out.print("Common, Used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();

                ImportedProduct product = new ImportedProduct(name,price,customsFee);
                productList.add(product);

            }else if(type == 'u'){
                System.out.print("Manufactured Date (DD/MM/YYYY): ");
                String manufacturedDateString = sc.next();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date manufacturedDate = sdf.parse(manufacturedDateString);

                UsedProduct product = new UsedProduct(name,price,manufacturedDate);
                productList.add(product);
            }else{
                Product product = new Product(name,price);
                productList.add(product);

            }

        }


        System.out.println("PRICE TAGS  :");
        for (Product p: productList){
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}
