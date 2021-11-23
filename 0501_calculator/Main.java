import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("2‚Â‚Ì”š“d‘ì");
		
		System.out.println(" ");
		System.out.println("‚Ç‚ñ‚ÈŒvZ‚ğ‚µ‚Ü‚·‚©H");
		System.out.println("1:‘«‚µZ 2:ˆø‚«Z 3:Š|‚¯Z 4:Š„‚èZ 5:è—]Z");
		int calc = scanner.nextInt();
		
		System.out.print("1‚Â–Ú‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		int one = scanner.nextInt();
		System.out.print("2‚Â–Ú‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		int twe = scanner.nextInt();
		
		switch (calc) {
		  case 1:
			System.out.println("‘«‚µZF" + one + " + " + twe);
			System.out.println("“š‚¦:" + puls(one, twe));
			break;
		  case 2:
			System.out.println("ˆø‚«ZF" + one + " - " + twe);
			System.out.println("“š‚¦:" + min(one, twe));
			break;
		  case 3:
			System.out.println("Š|‚¯ZF" + one + " * " + twe);
			System.out.println("“š‚¦:" + milt(one, twe));
			break;
		  case 4:
			System.out.println("Š„‚èZF" + one + " / " + twe);
			System.out.println("“š‚¦:" + div(one, twe));
			break;
		 case 5:
			System.out.println("è—]ZF" + one + " % " + twe);
			System.out.println("“š‚¦:" + rem(one, twe));
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
