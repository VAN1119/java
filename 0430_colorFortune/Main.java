import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println("�F�肢");
		int ran = new java.util.Random().nextInt(5);
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 1; i--) {
			System.out.print("�D���ȐF����͂��Ă��������F");
			String color = scanner.next();
			System.out.println("�D���ȐF��" + color + "�ł�낵���ł����H");
			System.out.println("1:�͂�  2:������");
			int ans = scanner.nextInt();
			if (ans == 1) {
				System.out.println("����ł͌��ʂ�\�����܂�");
				
				switch (ran) {
					case 0:
						System.out.println(color + "���D���ȃA�i�^�͍����ǂ���������܂�");
					System.exit(0);
					case 1:
						System.out.println(color + "���D���ȃA�i�^�͖����ǂ���������܂�");
					System.exit(0);
					case 2:
						System.out.println(color + "���D���ȃA�i�^�͖�����ǂ���������܂�");
					System.exit(0);
					case 3:
						System.out.println(color + "���D���ȃA�i�^�͍���ǂ���������܂���");
					System.exit(0);
					case 4:
						System.out.println(color + "���D���ȃA�i�^�͂������N�ȓ��ɗǂ���������܂�");
					System.exit(0);
			}
		}
		
		}
	}
}
		