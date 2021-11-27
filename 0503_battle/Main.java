import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("3ターンバトル");
		System.out.println(" ");
		System.out.print("名前を入力してください:");
		String name = scanner.next();
		System.out.print("敵の名前を入力してください:");
		String enemyName = scanner.next();
		System.out.println("レベルを選択してください");
		System.out.print("1.easy 2.normal 3.hard 4.鬼: ");
		int level = scanner.nextInt();
		int life = 6;
		int enemy = 5;
		int last =0;
		
		switch (level) {
		case 1:
			enemy -= 1;
			break;
		case 3:
			enemy += 1;
			break;
		case 4:
			enemy += 3;
			break;
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(" ");
			System.out.println(i + 1 + "ターン目");
			int rand = new java.util.Random().nextInt(3);
			
			System.out.println("バトルコマンドを選択してください");
			System.out.println("1.弱攻撃 2.中攻撃 3.強攻撃 4.KAMIKAZE");
			int attack = scanner.nextInt();
			
			//switchで書くには？
			if ((rand == 0 && attack == 2) || (rand == 1 && attack == 3) || (rand == 2 && attack == 4)) {
				System.out.println(name + "と" + enemyName + "は見つめあっている。恋が生まれそうだ");
			} else if (attack == 1) {
				System.out.println(name + "の弱攻撃 " + enemyName + "は" + attack + "のダメージを受けた");
				System.out.println(enemyName + "の残り体力" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "は倒れた");
					System.out.println("止めを刺しますか？");
					System.out.println("1.はい 2.いいえ");
					last = scanner.nextInt();
				}
			} else if (attack ==2 && attack >= rand && !(rand == 0)) {
				System.out.println(name + "の中攻撃 " + enemyName + "は" + attack + "のダメージを受けた");
				System.out.println(enemyName + "の残り体力" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "は倒れた");
					System.out.println("止めを刺しますか？");
					System.out.println("1.はい 2.いいえ");
					last = scanner.nextInt();
				}
			} else if (attack == 3 && rand == 2) {
				System.out.println(name + "の強攻撃 " + enemyName + "は" + attack + "のダメージを受けた");
				System.out.println(enemyName + "の残り体力" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "は倒れた");
					System.out.println("止めを刺しますか？");
					System.out.println("1.はい 2.いいえ");
					last = scanner.nextInt();
				}
			} else if (attack == 4 && rand == 0) {
				System.out.println(name + "のKAMIKAZE " + enemyName + "は" + attack + "のダメージを受けた");
				System.out.println(enemyName + "の残り体力" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "は倒れた");
					System.out.println("止めを刺しますか？");
					System.out.println("1.はい 2.いいえ");
					last = scanner.nextInt();
				}
			} else if (attack == 4 && rand != 0) {
				System.out.println(name + "のKAMIKAZEは失敗。" + name +"は倒れた");
				life -= 6;
				if (life <= 0) {
					System.out.println("村人A『あれほどKAMIKAZEは使っちゃいけねぇって言ってたのに…』");
					System.out.println(" ");
					System.exit(0);
				}
			} else if (attack == 3 && rand != 2) {
				System.out.println(name + "の強攻撃は失敗。" + name +"は" + attack + "のダメージを受けた");
				System.out.println(name + "の残り体力" + (life - attack));
				life -= attack;
				if (life <= 0) {
					System.out.println(name + "は倒れた");
					System.out.println(enemyName + "『国へ帰るんだな。お前にも家族がいるだろう』");
					System.out.println(" ");
					System.exit(0);
				}
			}
			if (last == 1) {
				System.out.println(enemyName + "『ぎゃあーーーーーーーーーーーー！！』");
				System.out.println(" ");
				System.exit(0);
			} else if (last == 2) {
				System.out.println("めでたしめでたし");
				System.out.println("と思ったら、後ろから刺された");
				System.out.println(name + "『なんじゃあ、こりゃーーー！”』");
				System.out.println(" ");
				System.exit(0);
			}
		}
		System.out.println("決着はつかなかった。");
		System.out.println("が、それでよかったと思う。争いはよくない。");
		System.out.println(" ");
	}
}