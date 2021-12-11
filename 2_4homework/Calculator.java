public class Calculator {
	double tax;
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	public int calc(int price) {
		double total = price * this.tax + price;
		return (int)total;
	}
}