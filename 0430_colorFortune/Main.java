import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("色占い");
		int ran = new java.util.Random().nextInt(5);
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 1; i--) {
			System.out.print("好きな色を入力してください：");
			String color = scanner.next();
			System.out.println("好きな色は" + color + "でよろしいですか？");
			System.out.println("1:はい  2:いいえ");
			int ans = scanner.nextInt();
			if (ans == 1) {
				System.out.println("それでは結果を表示します");
				
				switch (ran) {
					case 0:
						System.out.println(color + "が好きなアナタは今日良い事があります");
					System.exit(0);
					case 1:
						System.out.println(color + "が好きなアナタは明日良い事があります");
					System.exit(0);
					case 2:
						System.out.println(color + "が好きなアナタは明後日良い事があります");
					System.exit(0);
					case 3:
						System.out.println(color + "が好きなアナタは昨日良い事がありました");
					System.exit(0);
					case 4:
						System.out.println(color + "が好きなアナタはここ数年以内に良い事があります");
					System.exit(0);
			}
		}
		
		}
	}
}
		