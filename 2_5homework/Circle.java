public class Circle {
	final double PI = 3.14;
	int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getEnsyu() {
		return this.radius * 2 * PI;
	}
	public double getMenseki() {
		return this.radius * this.radius * PI;
	}
}