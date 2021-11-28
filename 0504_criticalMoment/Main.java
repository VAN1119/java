import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rand = new java.util.Random().nextInt(10);
		
		System.out.println("");
		System.out.println("危機一髪");
		System.out.println("");

		System.out.print("誰を危機一髪にしますか？: ");
		String name = scanner.next();
		
		for (int i = 1; i < 100; i++) {
			System.out.println(i + "回目の挑戦");
			System.out.print("好きな数字を選んでください(0～9まで): ");
			int ans = scanner.nextInt();
			if (rand == ans) {
				System.out.println(name + "『ぎゃーーーーー！！』");
				System.out.println(name + "の胸にナイフが刺さっている");
				System.out.println("");
				break;
			} else if (i % 3 == 0) {
				System.out.println(name + "『え？さっきウノって言ったよね？』");
			} else if (i % 7 == 0) {
				System.out.println(name + "『サツマイモって薩摩の芋って知ってた？』");
			} else {
				System.out.println(name + "『え？今何かした？』");
			}
		}
	}
}
		