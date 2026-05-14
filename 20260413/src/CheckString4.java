import java.util.Scanner;

public class CheckString4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("繰り返す回数を入力してください：");
		int num = scan.nextInt();
		String[] words = new String[num];
		int indent = 0;
		int wordLength = 0;

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "つ目の文字列を入力してください：");
			words[i] = scan.next();
			if (words[i].length() > wordLength) {
				indent = i;
				wordLength = words[i].length();
			}
		}

		System.out.println("最も長い文字列は「" + words[indent] + "」です");

		scan.close();
	}

}
