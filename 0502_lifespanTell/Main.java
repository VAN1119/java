import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("アナタが保有している日数を計算します");
		System.out.println("");
		System.out.print("名前を入力してください：");
		String name = scanner.next();
		System.out.print("年齢を入力してください：");
		int age = scanner.nextInt();
		System.out.print("生まれた月を入力してください：");
		int month = scanner.nextInt();
		System.out.print("生まれた日を入力してください：");
		int day = scanner.nextInt();
		System.out.print("平均睡眠時間を入力してください：");
		int sleep = scanner.nextInt();
		System.out.print("何歳まで生きる予定ですか？：");
		int limit = scanner.nextInt();
		
		if (limit < age) {
			System.out.println("お前はすでに死んでいる");
			System.exit(0);
		} else if (limit == age) {
			System.out.println("残り少ない余生をお楽しみください");
			System.exit(0);
		}
				
		int life = limit - age;
		int lifeHour = life * 365 * (24 - sleep);
		
		if (lifeHour <= 0) {
			System.out.println("アナタはSleeping Beautyなのですね！！");
			System.exit(0);
		}
		
		System.out.println(" ");
		System.out.println("アナタの寿命が" + limit + "歳だとした場合");
		System.out.println("アナタは約" + String.format("%,d",life * 365) + "日生きられます");
		System.out.println("時間にすると" + String.format("%,d",lifeHour) + "時間活動できます");
		System.out.println("すべての活動時間映画を見ているとしたら" + String.format("%,d",lifeHour / 2) + "本見る事ができます(2時間映画換算)");
		System.out.println("カップラーメンは" + String.format("%,d",lifeHour * 60 / 3) + "個作れます(NISSIN)");
		System.out.println("意識のある秒数だと約" + String.format("%,d",(long)lifeHour * 86401) + "秒になります");
		System.out.println(" ");
		
		System.out.println("ENJOY YOUR TIME!!");
	}
}