import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("おにぎり満腹限界挑戦");
		System.out.println("");
		
		int ran = rand(20);
		int i =0;
		
		 while (i <= ran) {
			int sca = scan();
		 	i += sca;
			
			if (ran < i) {
				System.out.println("もうお腹いっぱいなんだな");
				System.out.println("");
				break;
			} else if (i % 5 == 3) {
				System.out.println("お、おにぎりの具では梅が一番好きなんだな");
				System.out.println("");
			} else if (i % 7 == 5) {
				System.out.println("ほ、本当はサンドイッチが食べたいなんだな"); 
				System.out.println("");
			} else {
				System.out.println("お、おにぎりが欲しいんだな");
				System.out.println("");
			}
		 }
	}
	
	public static int rand(int ran) {
		int rand = new java.util.Random().nextInt(ran);
		return rand;
	}
	
	public static int scan() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("おにぎりをいくつ食べさせますか？: ");
		int scan = scanner.nextInt();
		return scan;
	}
}