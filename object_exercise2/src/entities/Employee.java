package entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double getNetSalary() {
		return grossSalary - tax;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public void increaseSalary(double percentagem) {
		this.grossSalary += grossSalary * (percentagem / 100);
	}

	@java.lang.Override
	public java.lang.String toString() {
		return name + ", " + "$" + this.getNetSalary();
	}
}
