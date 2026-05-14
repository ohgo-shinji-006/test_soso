package kadai3;

import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 1;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String number = "";
		while (true) {
			for (int i = 0; i < 3; i++)
				number += String.valueOf(rand.nextInt(10));
			char a = number.charAt(0);
			char b = number.charAt(1);
			char c = number.charAt(2);
			if (a != b && a != c && b != c) {
				break;
			}
			number = "";
		}

		String input = "";

		//		System.out.println("------ゲーム開始------");
		while (!number.equals(input)) {
			System.out.print("3桁の数字を入力してください：");
			input = scan.next();

			if (input.equals(number)) {
				//				System.out.println("-----ゲーム終了-----");
				System.out.println(count + "回で当たりました！");
				break;
			}

			int eat = 0;
			int bite = 0;

			for (int i = 0; i < 3; i++) {
				if (number.charAt(i) == input.charAt(i)) {
					eat += 1;
				}
				if (input.contains(String.valueOf(number.charAt(i)))) {
					bite += 1;
				}
			}
			//			System.out.println("------" + count + "回目------");
			System.out.println(eat + "ヒット・" + (bite - eat) + "ブロー");
			//			System.out.println();
			count += 1;

		}

		scan.close();
	}

}
