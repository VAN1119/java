import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("�����ăQ�[��");
		
		int ran = new java.util.Random().nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(" ");
			System.out.print("�R���s���[�^�̐�����\�z���Ă�������(1�`100):");
			int guess = scanner.nextInt();
			if (ran == guess) {
				System.out.println("������B�f���炵��");
				System.out.println("�܂��̒��킨�҂����Ă���܂�");
				System.out.println(" ");
				System.exit(0);
			} else if (ran < guess) {
				System.out.println("�\�z�̐����͑傫�����܂�");
			} else {
				System.out.println("�\�z�̐����͏��������܂�");
			}
		}
		System.out.println("���ɋA�邪�����B���O�ɂ��҂��Ă���Ƒ������邾�낤");
		System.out.println("������" + (ran + 1));
		System.out.println(" ");
	}
}
