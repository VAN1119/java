import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rand = new java.util.Random().nextInt(10);
		
		System.out.println("");
		System.out.println("��@�ꔯ");
		System.out.println("");

		System.out.print("�N����@�ꔯ�ɂ��܂����H: ");
		String name = scanner.next();
		
		for (int i = 1; i < 100; i++) {
			System.out.println(i + "��ڂ̒���");
			System.out.print("�D���Ȑ�����I��ł�������(0�`9�܂�): ");
			int ans = scanner.nextInt();
			if (rand == ans) {
				System.out.println(name + "�w����[�[�[�[�[�I�I�x");
				System.out.println(name + "�̋��Ƀi�C�t���h�����Ă���");
				System.out.println("");
				break;
			} else if (i % 3 == 0) {
				System.out.println(name + "�w���H�������E�m���Č�������ˁH�x");
			} else if (i % 7 == 0) {
				System.out.println(name + "�w�T�c�}�C�����ĎF���̈����Ēm���Ă��H�x");
			} else {
				System.out.println(name + "�w���H�����������H�x");
			}
		}
	}
}
		