public class Buki extends Item {
	public Buki(String name, int value) {
		super(name, value);
	}
	public void use() {
		System.out.println(this.name + "でこうげき!\n敵に" + this.value + "のダメージ!");
	}
}