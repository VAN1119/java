public class Main{
	public static void main(String[] args){
		/* "Student"というデータ型に"students"という配列名をつけて"Student"型を3つ用意する */
		Student[] students = new Student[3];
		
		/* 各々の配列(students)の中にnewでStudentのコンストラクタを作る */
		students[0] = new Student("タロウ", 80, 75, 90);
		students[1] = new Student("ハナコ", 90, 70, 80);
		students[2] = new Student("ジロウ");
		
		System.out.println("成績表");
		for(int i = 0; i < students.length; i++) {
			students[i].show();
		}
	}
}
