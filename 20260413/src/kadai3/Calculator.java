package kadai3;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = add(3, 7);
		System.out.println(a);
		
		int b = sub(3, 7);
		System.out.println(b);
		
		double c = ave(3, 7);
		System.out.println(c);
		
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	static double ave(int a, int b) {
		return (a+b)/2.0;
	}

}
