import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("パスワードを入力して下さい：");
		while (true) {
			String pw = scan.next();
			if (pw.equals("himitu")) {
				System.out.println("ログインできました");
				break;
			} else {
				System.out.print("再入力して下さい：");
			}
		}

		scan.close();
	}

}
