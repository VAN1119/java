import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("���ɂ��薞�����E����");
		System.out.println("");
		
		int ran = rand(20);
		int i =0;
		
		 while (i <= ran) {
			int sca = scan();
		 	i += sca;
			
			if (ran < i) {
				System.out.println("�������������ς��Ȃ񂾂�");
				System.out.println("");
				break;
			} else if (i % 5 == 3) {
				System.out.println("���A���ɂ���̋�ł͔~����ԍD���Ȃ񂾂�");
				System.out.println("");
			} else if (i % 7 == 5) {
				System.out.println("�فA�{���̓T���h�C�b�`���H�ׂ����Ȃ񂾂�"); 
				System.out.println("");
			} else {
				System.out.println("���A���ɂ��肪�~�����񂾂�");
				System.out.println("");
			}
		 }
	}
	
	public static int rand(int ran) {
		int rand = new java.util.Random().nextInt(ran);
		return rand;
	}
	
	public static int scan() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ɂ���������H�ׂ����܂����H: ");
		int scan = scanner.nextInt();
		return scan;
	}
}