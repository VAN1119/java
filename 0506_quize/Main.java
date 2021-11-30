import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("群馬クイズ");
		System.out.println("");
		
		quiz();
		
	}
	public static void quiz() {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		System.out.println("第一問");
		System.out.println("群馬の県庁所在地はどこ？");
		System.out.print("1.高崎 2.前橋 3.伊勢崎 4.太田 : ");
		int ans1 = scanner.nextInt();
		
		if (ans1 == 2) {
			System.out.println("正解。群馬の県庁所在地は前橋です");
			total += 10;
		} else {
			System.out.println("不正解。群馬の県庁所在地は前橋です");
		}
		
		System.out.println("第二問");
		System.out.println("群馬県の面積は？");
		System.out.print("1.約5000km2 2.約6000km2 3.約7000km2 4.約8000km2 : ");
		int ans2 = scanner.nextInt();
		
		if (ans2 == 2) {
			System.out.println("正解。群馬の面積は6,362km2です");
			total += 10;
		} else {
			System.out.println("不正解。群馬の面積は6,362km2です");
		}
		
		System.out.println("第三問");
		System.out.println("群馬県の総人口は？");
		System.out.print("1.約170万人 2.約180万人 3.約190万人 4.約200万人 : ");
		int ans3 = scanner.nextInt();
		
		if (ans3 == 3) {
			System.out.println("正解。群馬の人口は1,919,014人(推計：2021年4月1日)");
			total += 10;
		} else {
			System.out.println("不正解。群馬の人口は1,919,014人(推計：2021年4月1日)");
		}
		
		System.out.println("第四問");
		System.out.println("群馬県における県の花は？");
		System.out.print("1.サクラ 2.チューリップ 3.リンドウ 4.レンゲツツジ : ");
		int ans4 = scanner.nextInt();
		
		if (ans4 == 4) {
			System.out.println("正解。群馬県の県の花はレンゲツツジです");
			total += 10;
		} else {
			System.out.println("不正解。群馬県の県の花はレンゲツツジです");
		}
		
		System.out.println("第五問");
		System.out.println("群馬県のマスコットキャラクターは？");
		System.out.print("1.ぐんまちゃん 2.ぐんまさん 3.ふなっしー 4.家康くん : ");
		int ans5 = scanner.nextInt();
		
		if (ans5 == 1) {
			System.out.println("正解。群馬県のマスコットキャラクターはぐんまちゃんです");
			total += 10;
		} else {
			System.out.println("不正解。群馬県のマスコットキャラクターはぐんまちゃんです");
		}
		
		System.out.println("アナタのスコアは" + total + "点です");
	
		switch (total) {
			case 50:
				System.out.println("全問正解！アナタは優秀な群馬県民です");
				break;
			case 40:
			case 30:
				System.out.println("アナタは普通な群馬県民です");
				break;
			case 20:
			case 10:
				System.out.println("もう少し群馬のことを知って下さい");
				break;
			case 0:
				System.out.println("引っ越し！引っ越し！さっさと引っ越し！しばくぞ！");
				break;
		}
	}
}
		
		/*
	public static void score() {
		switch (total) {
		case 50:
			System.out.println("全問正解！アナタは優秀な群馬県民です");
			break;
		case 40:
		case 30:
			System.out.println("アナタは普通な群馬県民です");
			break;
		case 20:
		case 10:
			System.out.println("もう少し群馬のことを知って下さい");
			break;
		case 0:
			System.out.println("引っ越し！引っ越し！さっさと引っ越し！しばくぞ！");
			break;
		}
	} */