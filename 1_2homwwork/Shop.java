public class Shop {
	String name;
	int sales;
	
	public Shop(String name, int sales) {
		this.name = name;
		this.sales = sales;
	}
	
	public Shop() {
		this("�o�X�\��", 0);
	}
	
	public void display() {
		System.out.println(this.name + ":���㍂" +this.sales + "�~");
	}
}