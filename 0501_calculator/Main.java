import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("2�̐����d��");
		
		System.out.println(" ");
		System.out.println("�ǂ�Ȍv�Z�����܂����H");
		System.out.println("1:�����Z 2:�����Z 3:�|���Z 4:����Z 5:��]�Z");
		int calc = scanner.nextInt();
		
		System.out.print("1�ڂ̐�������͂��Ă�������:");
		int one = scanner.nextInt();
		System.out.print("2�ڂ̐�������͂��Ă�������:");
		int twe = scanner.nextInt();
		
		switch (calc) {
		  case 1:
			System.out.println("�����Z�F" + one + " + " + twe);
			System.out.println("����:" + puls(one, twe));
			break;
		  case 2:
			System.out.println("�����Z�F" + one + " - " + twe);
			System.out.println("����:" + min(one, twe));
			break;
		  case 3:
			System.out.println("�|���Z�F" + one + " * " + twe);
			System.out.println("����:" + milt(one, twe));
			break;
		  case 4:
			System.out.println("����Z�F" + one + " / " + twe);
			System.out.println("����:" + div(one, twe));
			break;
		 case 5:
			System.out.println("��]�Z�F" + one + " % " + twe);
			System.out.println("����:" + rem(one, twe));
			break;
		}
		System.out.println(" ");
	}
	public static int puls(int first, int second) {
		return first + second;
	}
	public static int min(int first, int second) {
		return first - second;
	}
	public static int milt(int first, int second) {
		return first * second;
	}
	public static int div(int first, int second) {
		return first / second;
	}
	public static int rem(int first, int second) {
		return first % second;
	}
}
