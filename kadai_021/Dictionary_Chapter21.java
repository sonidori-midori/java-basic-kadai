package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void search(String[] words) {
	
		HashMap<String,String> dictionaryMap = new HashMap<String,String>();
		
		dictionaryMap.put( "apple","りんご");
		dictionaryMap.put( "peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put( "lemon","レモン");
		dictionaryMap.put( "pear","梨");
		dictionaryMap.put( "kiwi","キウイ");
		dictionaryMap.put( "strawberry","いちご");
		dictionaryMap.put( "grape","ぶどう");
		dictionaryMap.put( "muscat","マスカット");
		dictionaryMap.put( "cherry","さくらんぼ");
		
		String  result = "";
		
		for(int i = 0; i < words.length; i++) {
			result = dictionaryMap.get(words[i]);
			
		if(result == null) {
			result = words[i] + "は辞書にありません。";
		
		} else {
			result = words[i] + "の意味は" + result + "です。";
		}
		System.out.println(result);
		}
		
	}
		
}



