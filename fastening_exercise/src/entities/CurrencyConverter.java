package fastening_exercise.src.entities;

public class CurrencyConverter {
	private final double tax = 0.06;
	private double dollarPrice;
	private double dolarBought;
	
	public void setDollarPrice(double dollarPrice) {
		this.dollarPrice = dollarPrice;
	}
	
	public double getRealPrice() {
		return dollarPrice * dolarBought * tax;
	}
	
	public void setdollarBought(double dolarBought) {
		this.dolarBought = dolarBought;
	}
	
	
	
	

}
