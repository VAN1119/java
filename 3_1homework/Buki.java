public class Buki extends Item {
	public Buki(String name, int value) {
		super(name, value);
	}
	public void use() {
		System.out.println(this.name + "�ł�������!\n�G��" + this.value + "�̃_���[�W!");
	}
}