import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("1つ目の文字列を入力して下さい");
		String ch1 = scan.next();
		System.out.println("2つ目の文字列を入力して下さい");
		String ch2 = scan.next();
		if (ch1.equals(ch2)) {
			System.out.println("2つの文字列は同じです");
		} else {
			System.out.println("2つの文字列は異なります");
		}

		scan.close();

	}

}
