package fastening_exercise.src.application;
import fastening_exercise.src.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFastening {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double dollarPrice = sc.nextDouble();
		double dollarBought = sc.nextDouble();

		sc.close();
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		currencyConverter.setdollarBought(dollarBought);
		currencyConverter.setDollarPrice(dollarPrice);

	}

}
