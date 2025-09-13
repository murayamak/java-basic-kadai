package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//辞書クラスのインスタンス
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる英単語の配列
		String[] words = {"apple","banana","grape","orange"};
		
		//調べた単語の意味を出力する
		for(int i = 0;i <= words.length - 1;i++) {	
			String wordMean = dictionary.checkDict(words[i]);
			
			if (wordMean == null) {
				System.out.println("単語" + words[i] + "は辞書に登録されていません");
			}else {
				System.out.println("単語" + words[i] + "の意味は"+ wordMean + "です");				
			}
		}
	}

}
