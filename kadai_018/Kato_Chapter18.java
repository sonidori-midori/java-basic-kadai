package kadai_018;

public abstract class Kato_Chapter18 {
	
	//姓のフィールド
	public String familyName = "加藤";
	//名のフィールド
	public String givenName = "";
	//住所のフィールド
	public String address = "東京都中野区◯×";
	
	//commonlntroduceメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	//eachlntroduceメソッド
	public abstract void eachIntroduce();
	
	//実行メソッド
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
	
	
	    
}

