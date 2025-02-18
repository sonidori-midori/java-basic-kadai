package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	
		String myChoice = scanner.next();
		
		if(!(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p"))) {
			System.out.println(("グーのr、チョキのs、パーのpのいずれかを入力してください"));
			continue;
		} else {
			scanner.close();
			return myChoice;
			}
		}
	}
	
	
	public String getRandom() {
		String[] hands = {"r","s","p"};
		String choice = hands[(int) Math.floor(Math.random() * 3)];
		return choice;
	}
	
	public void playGame(String myChoice, String random) {
		String result = "";
		
		HashMap<String,String> hands = new HashMap<>();
		hands.put("r","グー");
		hands.put("s", "チョキ");
		hands.put("p", "パー");
		
		System.out.println("自分の手は" + hands.get(myChoice) + "です");
		System.out.println("対戦相手の手は" + hands.get(random) + "です");
		
		if(myChoice.equals("r") && random.equals("s")
		||(myChoice.equals("s") && random.equals("p"))
		||(myChoice.equals("p") && random.equals("r"))) {
			result = "自分の勝ちです";
		
	} else if((myChoice.equals("r") && random.equals("p"))
			||(myChoice.equals("s") && random.equals("r"))
			||(myChoice.equals("p") && random.equals("s"))) {
		result = "自分の負けです";
	
	} else {
		result = "あいこです";
	}
	
	System.out.println(result);
	}
}
