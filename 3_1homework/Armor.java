public class Armor extends Item {
	public Armor(String name, int value) {
		super(name, value);
	}
	public void use() {
		System.out.println(this.name + "��g�ɒ�����\n����͂�" + this.value + "�オ����");
	}
}