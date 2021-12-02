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
		System.out.println("合計値は" + sum + "です。");
		System.out.println("偶数のみの合計値は" + eve + "です。");
		System.out.println("最小値は" + min + "です。");
		System.out.println("最大値は" + max + "です。");
		System.out.println("平均値は" + ave + "です。");
		System.out.println("最小値と最大値を除外した乗算結果は" + mul + "です。");
	}
}