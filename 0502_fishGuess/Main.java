import java.util.Scanner;
//�X�L���i�[�̃C���|�[�g

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//�X�L���i�[�̏�����
		
		
		System.out.println(" ");
		System.out.println("�A�i�^�̔]��`�������܂�");
		System.out.println(" ");
		
		System.out.println("�y�~(�N�W��)�E��(�C���V)�E�L(�T��)�E��(�}�O��)�E�I(�T�o)�E��(�T�P)�E��(�u��)�E��(�J�c�I)�z�̒�����D���ȋ���1�I��ł�������");
		System.out.println("�I�т܂������H 1.YES 2.NO");
		int ans = scanner.nextInt();
		
		
		if (ans == 1) {
		
			System.out.println("����ł͎��₳���Ă��������܂�");
		}else {
			System.out.println("�A��I");
			System.out.println(" ");
			System.exit(0);
		}
		System.out.println(" ");
		System.out.println("[��,��,��,��] ���̒��ɑI�񂾋��͂��܂����H�����ł�������������");
		System.out.println("1.YES 2.NO");
		int first = scanner.nextInt();
		System.out.println(" ");
		System.out.println("[�L,��,��,��] ���̒��ɑI�񂾋��͂��܂����H�����ł�������������");
		System.out.println("1.YES 2.NO");
		int second = scanner.nextInt();
		System.out.println(" ");
		System.out.println("[�I,��,��,��] ���̒��ɑI�񂾋��͂��܂����H�����ł�������������");
		System.out.println("1.YES 2.NO");
		int third = scanner.nextInt();
		
		
		/*
		//������YES�p�^�[��
		boolean tF = first ==1;
		boolean tS = second == 1;
		boolean tT = third == 1;
		
		//������NO�p�^�[��
		boolean fF = first == 2;
		boolean fS = second == 2;
		boolean fT = third == 2;
		
		//switch�ŕ\���������Ǖ��@���킩��Ȃ�
		if (tF && tS && tT) {
			System.out.println("�A�i�^���I�񂾋��́y��(�J�c�I)�z�ł��ˁH");
		} else if (fF && fS && fT) {
			System.out.println("�A�i�^���I�񂾋��́y�~(�N�W��)�z�ł��ˁH");
		} else if (tF && fS && fT){
			System.out.println("�A�i�^���I�񂾋��́y��(�C���V)�z�ł��ˁH");
		} else if (fF && tS && fT){
			System.out.println("�A�i�^���I�񂾋��́y�L(�T��)�z�ł��ˁH");
		} else if (fF && fS && tT){
			System.out.println("�A�i�^���I�񂾋��́y�I(�T�o)�z�ł��ˁH");
		} else if (tF && fS && tT){
			System.out.println("�A�i�^���I�񂾋��́y��(�T�P)�z�ł��ˁH");
		} else if (fF && tS && tT){
			System.out.println("�A�i�^���I�񂾋��́y��(�u��)�z�ł��ˁH");
		} else if (tF && tS && fT){
			System.out.println("�A�i�^���I�񂾋��́y��(�}�O��)�z�ł��ˁH");
		}
		*/
		
		//switch�p�^�[��
		
		int totalAns = first + second + third;
		
		switch (totalAns) {
		  case 0:
			System.out.println("�A�i�^���I�񂾋��́y�~(�N�W��)�z�ł��ˁH");
			break;
		  case 6:
			System.out.println("�A�i�^���I�񂾋��́y��(�J�c�I)�z�ł��ˁH");
			break;
		  case 5:
			if (first == 1) { System.out.println("�A�i�^���I�񂾋��́y��(�C���V)�z�ł��ˁH"); }
			else if (second == 1) { System.out.println("�A�i�^���I�񂾋��́y�L(�T��)�z�ł��ˁH"); }
			else { System.out.println("�A�i�^���I�񂾋��́y�I(�T�o)�z�ł��ˁH"); }
			break;
		  case 4:
			if (third == 2) { System.out.println("�A�i�^���I�񂾋��́y��(�}�O��)�z�ł��ˁH"); }
			else if (second == 2) { System.out.println("�A�i�^���I�񂾋��́y��(�T�P)�z�ł��ˁH"); }
			else { System.out.println("�A�i�^���I�񂾋��́y��(�u��)�z�ł��ˁH"); }
			break;
		}
		
		System.out.println(" ");
	}
}