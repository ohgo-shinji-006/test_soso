import java.util.Scanner;

public class AddSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("xの値を入力してください：");
		int x = scan.nextInt();
		System.out.print("yの値を入力してください：");
		int y = scan.nextInt();
		
		int a = add(x, y);
		int b = add(10, -4);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		scan.close();
	}
	
	static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	{}
	
}
