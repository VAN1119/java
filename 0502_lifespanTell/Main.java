import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("�A�i�^���ۗL���Ă���������v�Z���܂�");
		System.out.println("");
		System.out.print("���O����͂��Ă��������F");
		String name = scanner.next();
		System.out.print("�N�����͂��Ă��������F");
		int age = scanner.nextInt();
		System.out.print("���܂ꂽ������͂��Ă��������F");
		int month = scanner.nextInt();
		System.out.print("���܂ꂽ������͂��Ă��������F");
		int day = scanner.nextInt();
		System.out.print("���ϐ������Ԃ���͂��Ă��������F");
		int sleep = scanner.nextInt();
		System.out.print("���΂܂Ő�����\��ł����H�F");
		int limit = scanner.nextInt();
		
		if (limit < age) {
			System.out.println("���O�͂��łɎ���ł���");
			System.exit(0);
		} else if (limit == age) {
			System.out.println("�c�菭�Ȃ��]�������y���݂�������");
			System.exit(0);
		}
				
		int life = limit - age;
		int lifeHour = life * 365 * (24 - sleep);
		
		if (lifeHour <= 0) {
			System.out.println("�A�i�^��Sleeping Beauty�Ȃ̂ł��ˁI�I");
			System.exit(0);
		}
		
		System.out.println(" ");
		System.out.println("�A�i�^�̎�����" + limit + "�΂��Ƃ����ꍇ");
		System.out.println("�A�i�^�͖�" + String.format("%,d",life * 365) + "���������܂�");
		System.out.println("���Ԃɂ����" + String.format("%,d",lifeHour) + "���Ԋ����ł��܂�");
		System.out.println("���ׂĂ̊������ԉf������Ă���Ƃ�����" + String.format("%,d",lifeHour / 2) + "�{���鎖���ł��܂�(2���ԉf�抷�Z)");
		System.out.println("�J�b�v���[������" + String.format("%,d",lifeHour * 60 / 3) + "���܂�(NISSIN)");
		System.out.println("�ӎ��̂���b�����Ɩ�" + String.format("%,d",(long)lifeHour * 86401) + "�b�ɂȂ�܂�");
		System.out.println(" ");
		
		System.out.println("ENJOY YOUR TIME!!");
	}
}