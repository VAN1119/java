import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("電卓");
		
		System.out.println(" ");
		
		System.out.print("数字を入力してください:");
		int one = scanner.nextInt();
		
		int i = 0;
		while (i < 6) {
			System.out.println("1:＋ 2:− 3:× 4:÷ 5:％ 6:＝");
			int calc = scanner.nextInt();
			
			if (calc == 6) {
				System.out.println("合計は" + one + "です");
				System.exit(0);
			}
		
			System.out.print("数字を入力してください:");
			int twe = scanner.nextInt();
			
		switch (calc) {
		  case 1:
			System.out.println("足し算：" + one + " + " + twe);
			System.out.println("＝ " + puls(one, twe));
			one = puls(one, twe);
			break;
		  case 2:
			System.out.println("引き算：" + one + " - " + twe);
			System.out.println("＝ " + min(one, twe));
			one = min(one, twe);
			break;
		  case 3:
			System.out.println("掛け算：" + one + " * " + twe);
			System.out.println("＝ " + milt(one, twe));
			one = milt(one, twe);
			break;
		  case 4:
			System.out.println("割り算：" + one + " / " + twe);
			System.out.println("＝ " + div(one, twe));
			one = div(one, twe);
			break;
		 case 5:
			System.out.println("剰余算：" + one + " % " + twe);
			System.out.println("＝ " + rem(one, twe));
			one = rem(one, twe);
			break;
		}
			
			i = calc;
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
