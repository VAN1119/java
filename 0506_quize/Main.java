import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("�Q�n�N�C�Y");
		System.out.println("");
		
		quiz();
		
	}
	public static void quiz() {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		System.out.println("����");
		System.out.println("�Q�n�̌������ݒn�͂ǂ��H");
		System.out.print("1.���� 2.�O�� 3.�ɐ��� 4.���c : ");
		int ans1 = scanner.nextInt();
		
		if (ans1 == 2) {
			System.out.println("�����B�Q�n�̌������ݒn�͑O���ł�");
			total += 10;
		} else {
			System.out.println("�s�����B�Q�n�̌������ݒn�͑O���ł�");
		}
		
		System.out.println("����");
		System.out.println("�Q�n���̖ʐς́H");
		System.out.print("1.��5000km2 2.��6000km2 3.��7000km2 4.��8000km2 : ");
		int ans2 = scanner.nextInt();
		
		if (ans2 == 2) {
			System.out.println("�����B�Q�n�̖ʐς�6,362km2�ł�");
			total += 10;
		} else {
			System.out.println("�s�����B�Q�n�̖ʐς�6,362km2�ł�");
		}
		
		System.out.println("��O��");
		System.out.println("�Q�n���̑��l���́H");
		System.out.print("1.��170���l 2.��180���l 3.��190���l 4.��200���l : ");
		int ans3 = scanner.nextInt();
		
		if (ans3 == 3) {
			System.out.println("�����B�Q�n�̐l����1,919,014�l(���v�F2021�N4��1��)");
			total += 10;
		} else {
			System.out.println("�s�����B�Q�n�̐l����1,919,014�l(���v�F2021�N4��1��)");
		}
		
		System.out.println("��l��");
		System.out.println("�Q�n���ɂ����錧�̉Ԃ́H");
		System.out.print("1.�T�N�� 2.�`���[���b�v 3.�����h�E 4.�����Q�c�c�W : ");
		int ans4 = scanner.nextInt();
		
		if (ans4 == 4) {
			System.out.println("�����B�Q�n���̌��̉Ԃ̓����Q�c�c�W�ł�");
			total += 10;
		} else {
			System.out.println("�s�����B�Q�n���̌��̉Ԃ̓����Q�c�c�W�ł�");
		}
		
		System.out.println("��ܖ�");
		System.out.println("�Q�n���̃}�X�R�b�g�L�����N�^�[�́H");
		System.out.print("1.����܂���� 2.����܂��� 3.�ӂȂ����[ 4.�ƍN���� : ");
		int ans5 = scanner.nextInt();
		
		if (ans5 == 1) {
			System.out.println("�����B�Q�n���̃}�X�R�b�g�L�����N�^�[�͂���܂����ł�");
			total += 10;
		} else {
			System.out.println("�s�����B�Q�n���̃}�X�R�b�g�L�����N�^�[�͂���܂����ł�");
		}
		
		System.out.println("�A�i�^�̃X�R�A��" + total + "�_�ł�");
	
		switch (total) {
			case 50:
				System.out.println("�S�␳���I�A�i�^�͗D�G�ȌQ�n�����ł�");
				break;
			case 40:
			case 30:
				System.out.println("�A�i�^�͕��ʂȌQ�n�����ł�");
				break;
			case 20:
			case 10:
				System.out.println("���������Q�n�̂��Ƃ�m���ĉ�����");
				break;
			case 0:
				System.out.println("�����z���I�����z���I�������ƈ����z���I���΂����I");
				break;
		}
	}
}
		
		/*
	public static void score() {
		switch (total) {
		case 50:
			System.out.println("�S�␳���I�A�i�^�͗D�G�ȌQ�n�����ł�");
			break;
		case 40:
		case 30:
			System.out.println("�A�i�^�͕��ʂȌQ�n�����ł�");
			break;
		case 20:
		case 10:
			System.out.println("���������Q�n�̂��Ƃ�m���ĉ�����");
			break;
		case 0:
			System.out.println("�����z���I�����z���I�������ƈ����z���I���΂����I");
			break;
		}
	} */