import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("4‚Â‚Ì”“–‚ÄƒQ[ƒ€");
		
		// ƒ‰ƒ“ƒ_ƒ€‚È”š‚Ì¶¬(4‚Â‚Æ‚àd•¡‚È‚µ)
		int first = rand.nextInt(10);
		int second = rand.nextInt(10);
		if (second == first) { second--; } if (second < 0) { second += 2; }
		int third = rand.nextInt(10);
		if (third == first) { third--; } if (third == second) { third --; } if (third < 0) { third += 3; }
		int fourth = rand.nextInt(10);
		if (fourth == first) { fourth--; } if (fourth == second) { fourth--; } if (fourth == third) { fourth--; } if (fourth < 0) { fourth += 4; }
		
		for (int i = 0; i < 10; i++) {
			System.out.println(" ");
			System.out.println(i + 1 + "‰ñ–Ú‚Ì’§í");
			
			System.out.print("ˆê”Ô–Ú‚Ì—\‘z”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0`9‚Ü‚Å‚Ì”š):");
			int fAns = scanner.nextInt();
			System.out.print("“ñ”Ô–Ú‚Ì—\‘z”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0`9‚Ü‚Å‚Ì”š):");
			int sAns = scanner.nextInt();
			System.out.print("O”Ô–Ú‚Ì—\‘z”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0`9‚Ü‚Å‚Ì”š):");
			int tAns = scanner.nextInt();
			System.out.print("l”Ô–Ú‚Ì—\‘z”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(0`9‚Ü‚Å‚Ì”š):");
			int foAns = scanner.nextInt();
			
			boolean f = first == fAns;
			boolean s = second == sAns;
			boolean t = third == tAns;
			boolean fo = fourth == foAns;
			
			boolean nf = first == sAns || first == tAns || first == foAns;
			boolean ns = second == fAns || second == tAns || second == foAns;
			boolean nt = third == fAns || third == sAns || third == foAns;
			boolean nfo = fourth == fAns || fourth == sAns || fourth == tAns;
			
			if  (f && s && t && fo) {
				System.out.println("‚²–¼“šA4Œ…‚Æ‚àˆê’v‚µ‚Ä‚¢‚Ü‚·");
				System.out.println(i + 1 + "‰ñ–Ú‚Å³‰ğ‚µ‚Ü‚µ‚½");
				break;
			} else if ((f && s && t) || (s && t && fo) || (f && s && t) || (f && t && fo)) {
				System.out.println("É‚µ‚¢A3Œ…ˆê’v");
			} else if ((f && s) || (f && t) || (f && fo) || (s && t) || (s && fo) || (t && fo)) {
				System.out.println("2Œ…ˆê’v");
				if ((nf && ns) || (nf && nt) || (nf && nfo) || (ns && nt) || (ns && nfo) || (nt && nfo)) {
					System.out.println("2‚Â‚Ì”š‚ªêŠˆá‚¢");
				} else if (nf || ns || nt || nfo) {
					System.out.println("1‚Â‚Ì”š‚ªêŠˆá‚¢");	
				}
			} else if (f || s || t || fo) {
				System.out.println("1Œ…ˆê’v");
				if ((nf && ns && nt) || (ns && nt && nfo) || (nf && ns && nt) || (nf && nt && nfo)) {
					System.out.print("3‚Â‚Ì”š‚ªêŠˆá‚¢");
				} else if ((nf && ns) || (nf && nt) || (nf && nfo) || (ns && nt) || (ns && nfo) || (nt && nfo)) {
					System.out.println("2‚Â‚Ì”š‚ªêŠˆá‚¢");
				} else if (nf || ns || nt || nfo) {
					System.out.println("1‚Â‚Ì”š‚ªêŠˆá‚¢");	
				}
			} else {
				System.out.println("c”O");
				if (nf && ns && nt && nfo){
					System.out.println("4‚Â‚Ì”š‚ªêŠˆá‚¢");
				} else if ((nf && ns && nt) || (ns && nt && nfo) || (nf && ns && nt) || (nf && nt && nfo)) {
					System.out.println("3‚Â‚Ì”š‚ªêŠˆá‚¢");
				} else if ((nf && ns) || (nf && nt) || (nf && nfo) || (ns && nt) || (ns && nfo) || (nt && nfo)) {
					System.out.println("2‚Â‚Ì”š‚ªêŠˆá‚¢");
				} else if (nf || ns || nt || nfo) {
					System.out.println("1‚Â‚Ì”š‚ªêŠˆá‚¢");	
				}
			}
		}
		System.out.print("“š‚¦‚Í" + first + second + third + fourth + "‚Å‚µ‚½");
	}
}