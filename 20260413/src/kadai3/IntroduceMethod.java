package kadai3;

public class IntroduceMethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		introduce("田中太郎", 25);
		System.out.println("---");
		introduce("鈴木一郎", 30);
	}
	
	static void introduce(String name, int age) {
		System.out.println(name + age + "歳です");
		System.out.println("10年後は" + (age+10) + "歳です");
		return;
	}
	
}
