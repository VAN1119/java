import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("3�^�[���o�g��");
		System.out.println(" ");
		System.out.print("���O����͂��Ă�������:");
		String name = scanner.next();
		System.out.print("�G�̖��O����͂��Ă�������:");
		String enemyName = scanner.next();
		System.out.println("���x����I�����Ă�������");
		System.out.print("1.easy 2.normal 3.hard 4.�S: ");
		int level = scanner.nextInt();
		int life = 6;
		int enemy = 5;
		int last =0;
		
		switch (level) {
		case 1:
			enemy -= 1;
			break;
		case 3:
			enemy += 1;
			break;
		case 4:
			enemy += 3;
			break;
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(" ");
			System.out.println(i + 1 + "�^�[����");
			int rand = new java.util.Random().nextInt(3);
			
			System.out.println("�o�g���R�}���h��I�����Ă�������");
			System.out.println("1.��U�� 2.���U�� 3.���U�� 4.KAMIKAZE");
			int attack = scanner.nextInt();
			
			//switch�ŏ����ɂ́H
			if ((rand == 0 && attack == 2) || (rand == 1 && attack == 3) || (rand == 2 && attack == 4)) {
				System.out.println(name + "��" + enemyName + "�͌��߂����Ă���B�������܂ꂻ����");
			} else if (attack == 1) {
				System.out.println(name + "�̎�U�� " + enemyName + "��" + attack + "�̃_���[�W���󂯂�");
				System.out.println(enemyName + "�̎c��̗�" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "�͓|�ꂽ");
					System.out.println("�~�߂��h���܂����H");
					System.out.println("1.�͂� 2.������");
					last = scanner.nextInt();
				}
			} else if (attack ==2 && attack >= rand && !(rand == 0)) {
				System.out.println(name + "�̒��U�� " + enemyName + "��" + attack + "�̃_���[�W���󂯂�");
				System.out.println(enemyName + "�̎c��̗�" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "�͓|�ꂽ");
					System.out.println("�~�߂��h���܂����H");
					System.out.println("1.�͂� 2.������");
					last = scanner.nextInt();
				}
			} else if (attack == 3 && rand == 2) {
				System.out.println(name + "�̋��U�� " + enemyName + "��" + attack + "�̃_���[�W���󂯂�");
				System.out.println(enemyName + "�̎c��̗�" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "�͓|�ꂽ");
					System.out.println("�~�߂��h���܂����H");
					System.out.println("1.�͂� 2.������");
					last = scanner.nextInt();
				}
			} else if (attack == 4 && rand == 0) {
				System.out.println(name + "��KAMIKAZE " + enemyName + "��" + attack + "�̃_���[�W���󂯂�");
				System.out.println(enemyName + "�̎c��̗�" + (enemy - attack));
				enemy -= attack;
				if (enemy <= 0) {
					System.out.println(enemyName + "�͓|�ꂽ");
					System.out.println("�~�߂��h���܂����H");
					System.out.println("1.�͂� 2.������");
					last = scanner.nextInt();
				}
			} else if (attack == 4 && rand != 0) {
				System.out.println(name + "��KAMIKAZE�͎��s�B" + name +"�͓|�ꂽ");
				life -= 6;
				if (life <= 0) {
					System.out.println("���lA�w����ق�KAMIKAZE�͎g�����Ⴂ���˂����Č����Ă��̂Ɂc�x");
					System.out.println(" ");
					System.exit(0);
				}
			} else if (attack == 3 && rand != 2) {
				System.out.println(name + "�̋��U���͎��s�B" + name +"��" + attack + "�̃_���[�W���󂯂�");
				System.out.println(name + "�̎c��̗�" + (life - attack));
				life -= attack;
				if (life <= 0) {
					System.out.println(name + "�͓|�ꂽ");
					System.out.println(enemyName + "�w���֋A��񂾂ȁB���O�ɂ��Ƒ������邾�낤�x");
					System.out.println(" ");
					System.exit(0);
				}
			}
			if (last == 1) {
				System.out.println(enemyName + "�w���Ⴀ�[�[�[�[�[�[�[�[�[�[�[�[�I�I�x");
				System.out.println(" ");
				System.exit(0);
			} else if (last == 2) {
				System.out.println("�߂ł����߂ł���");
				System.out.println("�Ǝv������A��납��h���ꂽ");
				System.out.println(name + "�w�Ȃ񂶂Ⴀ�A�����[�[�[�I�h�x");
				System.out.println(" ");
				System.exit(0);
			}
		}
		System.out.println("�����͂��Ȃ������B");
		System.out.println("���A����ł悩�����Ǝv���B�����͂悭�Ȃ��B");
		System.out.println(" ");
	}
}