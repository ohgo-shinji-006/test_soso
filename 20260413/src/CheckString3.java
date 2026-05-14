import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("繰り返す回数を入力してください：");
		int num = scan.nextInt();
		String word = "";

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "つ目の文字列を入力してください：");
			word = word + scan.next();
			System.out.println(word);
		}
		scan.close();
	}

}
