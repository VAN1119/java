import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("2つの数字電卓");
		
		System.out.println(" ");
		System.out.println("どんな計算をしますか？");
		System.out.println("1:足し算 2:引き算 3:掛け算 4:割り算 5:剰余算");
		int calc = scanner.nextInt();
		
		System.out.print("1つ目の数字を入力してください:");
		int one = scanner.nextInt();
		System.out.print("2つ目の数字を入力してください:");
		int twe = scanner.nextInt();
		
		switch (calc) {
		  case 1:
			System.out.println("足し算：" + one + " + " + twe);
			System.out.println("答え:" + puls(one, twe));
			break;
		  case 2:
			System.out.println("引き算：" + one + " - " + twe);
			System.out.println("答え:" + min(one, twe));
			break;
		  case 3:
			System.out.println("掛け算：" + one + " * " + twe);
			System.out.println("答え:" + milt(one, twe));
			break;
		  case 4:
			System.out.println("割り算：" + one + " / " + twe);
			System.out.println("答え:" + div(one, twe));
			break;
		 case 5:
			System.out.println("剰余算：" + one + " % " + twe);
			System.out.println("答え:" + rem(one, twe));
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
