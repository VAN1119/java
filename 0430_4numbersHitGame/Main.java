import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("4�̐����ăQ�[��");
		
		// �����_���Ȑ����̐���(4�Ƃ��d���Ȃ�)
		int first = rand.nextInt(10);
		int second = rand.nextInt(10);
		if (second == first) { second--; } if (second < 0) { second += 2; }
		int third = rand.nextInt(10);
		if (third == first) { third--; } if (third == second) { third --; } if (third < 0) { third += 3; }
		int fourth = rand.nextInt(10);
		if (fourth == first) { fourth--; } if (fourth == second) { fourth--; } if (fourth == third) { fourth--; } if (fourth < 0) { fourth += 4; }
		
		for (int i = 0; i < 10; i++) {
			System.out.println(" ");
			System.out.println(i + 1 + "��ڂ̒���");
			
			System.out.print("��Ԗڂ̗\�z��������͂��Ă�������(0�`9�܂ł̐���):");
			int fAns = scanner.nextInt();
			System.out.print("��Ԗڂ̗\�z��������͂��Ă�������(0�`9�܂ł̐���):");
			int sAns = scanner.nextInt();
			System.out.print("�O�Ԗڂ̗\�z��������͂��Ă�������(0�`9�܂ł̐���):");
			int tAns = scanner.nextInt();
			System.out.print("�l�Ԗڂ̗\�z��������͂��Ă�������(0�`9�܂ł̐���):");
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
				System.out.println("�������A4���Ƃ���v���Ă��܂�");
				System.out.println(i + 1 + "��ڂŐ������܂���");
				break;
			} else if ((f && s && t) || (s && t && fo) || (f && s && t) || (f && t && fo)) {
				System.out.println("�ɂ����A3����v");
			} else if ((f && s) || (f && t) || (f && fo) || (s && t) || (s && fo) || (t && fo)) {
				System.out.println("2����v");
				if ((nf && ns) || (nf && nt) || (nf && nfo) || (ns && nt) || (ns && nfo) || (nt && nfo)) {
					System.out.println("2�̐������ꏊ�Ⴂ");
				} else if (nf || ns || nt || nfo) {
					System.out.println("1�̐������ꏊ�Ⴂ");	
				}
			} else if (f || s || t || fo) {
				System.out.println("1����v");
				if ((nf && ns && nt) || (ns && nt && nfo) || (nf && ns && nt) || (nf && nt && nfo)) {
					System.out.print("3�̐������ꏊ�Ⴂ");
				} else if ((nf && ns) || (nf && nt) || (nf && nfo) || (ns && nt) || (ns && nfo) || (nt && nfo)) {
					System.out.println("2�̐������ꏊ�Ⴂ");
				} else if (nf || ns || nt || nfo) {
					System.out.println("1�̐������ꏊ�Ⴂ");	
				}
			} else {
				System.out.println("�c�O");
				if (nf && ns && nt && nfo){
					System.out.println("4�̐������ꏊ�Ⴂ");
				} else if ((nf && ns && nt) || (ns && nt && nfo) || (nf && ns && nt) || (nf && nt && nfo)) {
					System.out.println("3�̐������ꏊ�Ⴂ");
				} else if ((nf && ns) || (nf && nt) || (nf && nfo) || (ns && nt) || (ns && nfo) || (nt && nfo)) {
					System.out.println("2�̐������ꏊ�Ⴂ");
				} else if (nf || ns || nt || nfo) {
					System.out.println("1�̐������ꏊ�Ⴂ");	
				}
			}
		}
		System.out.print("������" + first + second + third + fourth + "�ł���");
	}
}