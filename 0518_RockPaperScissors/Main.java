import java.util.Random;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		String[] hand = new String[] {"ぐー", "ちょき", "ぱー"};
		Random myRandom = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		do {
			System.out.println("0.ぐー 1.ちょき 2.ぱー 9.やめる");
			int man = stdIn.nextInt();
			if(man == 9)
				break;
			if(man < 0 || man > 2) {
				System.out.println("0～2または9を入力してください");
				continue;
			}
			int com = myRandom.nextInt(3);
			System.out.println("コンピュータの手: " + hand[com]);
			
			int judge = (man - com + 3) % 3;
			if(judge == 0)
				System.out.println("あいこ\n");
			else if(judge == 1)
				System.out.println("あなたの負け\n");
			else
				System.out.println("あなたの勝ち\n");
		} while(true);
	}
}