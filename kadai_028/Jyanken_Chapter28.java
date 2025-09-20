package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String myhand ;
		while(true) {
			myhand = sc.nextLine();
			
			//正しい入力
			if(myhand.equals("r") || myhand.equals("s") || myhand.equals("p")) {
				break;
			}else {
				System.out.println("正しい手を入力してください");	
			}
		}
		sc.close();
		
		return myhand;
	}
	
	public String getRandom() {

		String[] hands = {"r","s","p"};
		
		int num = (int)Math.floor(Math.random() * 3);
		
		
		return hands[num];
	}
	
	public Void playGame(String myHand) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("r","グー");
		map.put("s","チョキ");
		map.put("p","パー");
		
		//相手の手
		String enHand = this.getRandom();
		
		System.out.println("自分の手は" + map.get(myHand) + "です");
		System.out.println("相手の手は" + map.get(enHand) + "です");
		
		//勝敗の判定
		//あいこ
		if(myHand.equals(enHand)) {
			System.out.println("あいこです");
		}
		//勝ち
		if(myHand.equals("r") && enHand.equals("s")) {
			System.out.println("自分の勝ちです");
		}else if(myHand.equals("s") && enHand.equals("p")) {
			System.out.println("自分の勝ちです");
		}else if(myHand.equals("p") && enHand.equals("r")) {
			System.out.println("自分の勝ちです");
		}
		//負け
		if(myHand.equals("r") && enHand.equals("p")) {
			System.out.println("自分の負けです");
		}else if(myHand.equals("s") && enHand.equals("r")) {
			System.out.println("自分の負けです");
		}else if(myHand.equals("p") && enHand.equals("s")) {
			System.out.println("自分の負けです");
		}
		
		return null;
	}

}
