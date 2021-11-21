import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("数当てゲーム");
		
		int ran = new java.util.Random().nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(" ");
			System.out.print("コンピュータの数字を予想してください(1～100):");
			int guess = scanner.nextInt();
			if (ran == guess) {
				System.out.println("当たり。素晴らしい");
				System.out.println("またの挑戦お待ちしております");
				System.out.println(" ");
				System.exit(0);
			} else if (ran < guess) {
				System.out.println("予想の数字は大きすぎます");
			} else {
				System.out.println("予想の数字は小さすぎます");
			}
		}
		System.out.println("国に帰るがいい。お前にも待っている家族がいるだろう");
		System.out.println("答えは" + (ran + 1));
		System.out.println(" ");
	}
}
