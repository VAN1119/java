import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int i = 0;
		
		String array[] = {"グー", "チョキ", "パー"};
		String comArray[] = {"グー", "チョキ", "パー"};
		
		while(i < 5) {
			System.out.println((i + 1) + "回目");
		
			System.out.println("コンピュータとじゃんけんします。好きな手を入力してください。");
			System.out.print("1.グー 2.チョキ 3.パー : ");
			int hand = scanner.nextInt();
			hand -= 1;
			int rand = random.nextInt(3);
			if(hand == rand) {
				System.out.println(array[hand] + "と" + comArray[rand] + "で、引き分け");
			} else if(hand < rand || hand - 2 == rand) {
				System.out.println(array[hand] + "と" + comArray[rand] +"で、アナタの勝ち");
			} else {
				System.out.println(array[hand] + "と" + comArray[rand] +"で、アナタの負け");
			}
			i++;
		}
	}
}
		
		