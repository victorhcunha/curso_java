package entities;

public class CurrencyConverter {
	private final double tax = 0.06;
	private double dolarPrice;
	private double dolarBought;
	
	public void setDollarPrice(double dollarPrice) {
		this.dolarPrice = dollarPrice;
	}
	
	public double getRealPrice() {
		return dolarPrice * dolarBought * tax;
	}
	
	public void setdollarBought(double dolarBought) {
		this.dolarBought = dolarBought;
	}
	
	
	
	

}
