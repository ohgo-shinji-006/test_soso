package kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("購入金額：");
		int price = scan.nextInt();
		System.out.println("1:プレミア会員, 2：無料会員");
		System.out.print("会員ランク：");
		int rank = scan.nextInt();
		String grade;
		int point;

		if (rank == 1) {
			grade = "プレミア";
			point = getPoints(price, true);
		} else {
			grade = "無料";
			point = getPoints(price, false);
		}

		System.out.println(grade + "会員には" + point + "ポイント付与されます");
		scan.close();

	}

	static int getPoints(int price, boolean menber) {
		double point;
		if (menber == true)
			point = price * 0.2;
		else
			point = price * 0.1;
		return (int) point;
	}

}
