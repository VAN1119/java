import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int i = 0;
		
		String array[] = {"�O�[", "�`���L", "�p�["};
		String comArray[] = {"�O�[", "�`���L", "�p�["};
		
		while(i < 5) {
			System.out.println((i + 1) + "���");
		
			System.out.println("�R���s���[�^�Ƃ���񂯂񂵂܂��B�D���Ȏ����͂��Ă��������B");
			System.out.print("1.�O�[ 2.�`���L 3.�p�[ : ");
			int hand = scanner.nextInt();
			hand -= 1;
			int rand = random.nextInt(3);
			if(hand == rand) {
				System.out.println(array[hand] + "��" + comArray[rand] + "�ŁA��������");
			} else if(hand < rand || hand - 2 == rand) {
				System.out.println(array[hand] + "��" + comArray[rand] +"�ŁA�A�i�^�̏���");
			} else {
				System.out.println(array[hand] + "��" + comArray[rand] +"�ŁA�A�i�^�̕���");
			}
			i++;
		}
	}
}
		
		