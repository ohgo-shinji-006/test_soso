package kadai3;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int cpnum = rand.nextInt(100);
		int count = 1;
		while (true) {
			System.out.print("数字を入力して下さい：");
			int num = scan.nextInt();
			if (num == cpnum) {
				System.out.println("**当たりです**");
				System.out.println(count + "回で当たりました！");
				break;
			}
			if (num > cpnum) {
				System.out.println("**大きすぎです**");
			} else {
				System.out.println("**小さすぎです**");
			}
			count += 1;
		}
		scan.close();

	}

}
