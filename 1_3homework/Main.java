public class Main{
	public static void main(String[] args){
		/* "Student"�Ƃ����f�[�^�^��"students"�Ƃ����z�񖼂�����"Student"�^��3�p�ӂ��� */
		Student[] students = new Student[3];
		
		/* �e�X�̔z��(students)�̒���new��Student�̃R���X�g���N�^����� */
		students[0] = new Student("�^���E", 80, 75, 90);
		students[1] = new Student("�n�i�R", 90, 70, 80);
		students[2] = new Student("�W���E");
		
		System.out.println("���ѕ\");
		for(int i = 0; i < students.length; i++) {
			students[i].show();
		}
	}
}
