public class Main {
	public static void main(String[] args) {
		
		int array[] = {12, 13, 11, 14, 10};
		int count = array.length;
		int sum = 0;
		int eve = 0;
		int min = array[0];
		int max = array[0];
		float ave = 0;
		int mul = 1;
		
		for(int i = 0; i < count; i++) {
			sum += array[i];
			if(array[i] % 2 == 0)
				eve += array[i];
			if(min > array[i])
				min = array[i];
			if(max < array[i])
				max = array[i];
		}
		ave = (float)sum / count;
		for(int j = 0; j < count; j++) {
			if(array[j] != max && array[j] != min)
				mul *= array[j];
		}
		System.out.println("���v�l��" + sum + "�ł��B");
		System.out.println("�����݂̂̍��v�l��" + eve + "�ł��B");
		System.out.println("�ŏ��l��" + min + "�ł��B");
		System.out.println("�ő�l��" + max + "�ł��B");
		System.out.println("���ϒl��" + ave + "�ł��B");
		System.out.println("�ŏ��l�ƍő�l�����O������Z���ʂ�" + mul + "�ł��B");
	}
}