package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		System.out.print("Enter the rectangle width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter the rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		sc.close();
		
		System.out.println("AREA = " + rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
	}

}
