package kadai3;

import java.util.Scanner;

public class UserRegistration1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力してください：");
		String name = scan.next();
		
		if(name.length() > 20) {
			System.out.println("名前は20文字以内で入力してください");
			System.exit(0);
		}
		
		if(name.equals("admin")) {
			System.out.println("利用できない名前です");
			System.exit(0);
		}
		
		if(name.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています");
			System.exit(0);
		}
		
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		
		if(age < 0 || age > 130) {
			System.out.println("年齢は0以上130以下で入力してください");
			System.exit(0);
		}
		
		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		
		scan.close();
		
	}

}
