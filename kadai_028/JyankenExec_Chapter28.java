package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {

		Jyanken_Chapter28 jn = new Jyanken_Chapter28();
		
		//自分の手
		String myHand = jn.getMyChoice();
		
		//ゲームを始める
		jn.playGame(myHand);
		
	}

}
