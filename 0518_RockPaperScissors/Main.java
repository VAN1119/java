import java.util.Random;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		String[] hand = new String[] {"���[", "���傫", "�ρ["};
		Random myRandom = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		do {
			System.out.println("0.���[ 1.���傫 2.�ρ[ 9.��߂�");
			int man = stdIn.nextInt();
			if(man == 9)
				break;
			if(man < 0 || man > 2) {
				System.out.println("0�`2�܂���9����͂��Ă�������");
				continue;
			}
			int com = myRandom.nextInt(3);
			System.out.println("�R���s���[�^�̎�: " + hand[com]);
			
			int judge = (man - com + 3) % 3;
			if(judge == 0)
				System.out.println("������\n");
			else if(judge == 1)
				System.out.println("���Ȃ��̕���\n");
			else
				System.out.println("���Ȃ��̏���\n");
		} while(true);
	}
}