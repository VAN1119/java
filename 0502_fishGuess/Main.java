import java.util.Scanner;
//スキャナーのインポート

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//スキャナーの初期化
		
		
		System.out.println(" ");
		System.out.println("アナタの脳を覗き見します");
		System.out.println(" ");
		
		System.out.println("【鯨(クジラ)・鰯(イワシ)・鮫(サメ)・鮪(マグロ)・鯖(サバ)・鮭(サケ)・鰤(ブリ)・鰹(カツオ)】の中から好きな魚を1つ選んでください");
		System.out.println("選びましたか？ 1.YES 2.NO");
		int ans = scanner.nextInt();
		
		
		if (ans == 1) {
		
			System.out.println("それでは質問させていただきます");
		}else {
			System.out.println("帰れ！");
			System.out.println(" ");
			System.exit(0);
		}
		System.out.println(" ");
		System.out.println("[鰯,鮪,鮭,鰹] この中に選んだ魚はいますか？数字でお答えください");
		System.out.println("1.YES 2.NO");
		int first = scanner.nextInt();
		System.out.println(" ");
		System.out.println("[鮫,鮪,鰤,鰹] この中に選んだ魚はいますか？数字でお答えください");
		System.out.println("1.YES 2.NO");
		int second = scanner.nextInt();
		System.out.println(" ");
		System.out.println("[鯖,鮭,鰤,鰹] この中に選んだ魚はいますか？数字でお答えください");
		System.out.println("1.YES 2.NO");
		int third = scanner.nextInt();
		
		
		/*
		//答えがYESパターン
		boolean tF = first ==1;
		boolean tS = second == 1;
		boolean tT = third == 1;
		
		//答えがNOパターン
		boolean fF = first == 2;
		boolean fS = second == 2;
		boolean fT = third == 2;
		
		//switchで表したいけど方法がわからない
		if (tF && tS && tT) {
			System.out.println("アナタが選んだ魚は【鰹(カツオ)】ですね？");
		} else if (fF && fS && fT) {
			System.out.println("アナタが選んだ魚は【鯨(クジラ)】ですね？");
		} else if (tF && fS && fT){
			System.out.println("アナタが選んだ魚は【鰯(イワシ)】ですね？");
		} else if (fF && tS && fT){
			System.out.println("アナタが選んだ魚は【鮫(サメ)】ですね？");
		} else if (fF && fS && tT){
			System.out.println("アナタが選んだ魚は【鯖(サバ)】ですね？");
		} else if (tF && fS && tT){
			System.out.println("アナタが選んだ魚は【鮭(サケ)】ですね？");
		} else if (fF && tS && tT){
			System.out.println("アナタが選んだ魚は【鰤(ブリ)】ですね？");
		} else if (tF && tS && fT){
			System.out.println("アナタが選んだ魚は【鮪(マグロ)】ですね？");
		}
		*/
		
		//switchパターン
		
		int totalAns = first + second + third;
		
		switch (totalAns) {
		  case 0:
			System.out.println("アナタが選んだ魚は【鯨(クジラ)】ですね？");
			break;
		  case 6:
			System.out.println("アナタが選んだ魚は【鰹(カツオ)】ですね？");
			break;
		  case 5:
			if (first == 1) { System.out.println("アナタが選んだ魚は【鰯(イワシ)】ですね？"); }
			else if (second == 1) { System.out.println("アナタが選んだ魚は【鮫(サメ)】ですね？"); }
			else { System.out.println("アナタが選んだ魚は【鯖(サバ)】ですね？"); }
			break;
		  case 4:
			if (third == 2) { System.out.println("アナタが選んだ魚は【鮪(マグロ)】ですね？"); }
			else if (second == 2) { System.out.println("アナタが選んだ魚は【鮭(サケ)】ですね？"); }
			else { System.out.println("アナタが選んだ魚は【鰤(ブリ)】ですね？"); }
			break;
		}
		
		System.out.println(" ");
	}
}