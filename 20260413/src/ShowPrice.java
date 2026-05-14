//import java.util.Scanner;
//import java.util.ArrayList; // ArrayListを使用するためにインポート

public class ShowPrice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] pricebox = {500, 800};
		
		for(int i = 0; i < pricebox.length; i++) {
			System.out.println((i + 1) + "つ目の商品は" + cal_price(pricebox[i], 0.2, 0.1) + "です");
		}
	}
	
	static int cal_price(int price, double discount, double tax) {
		double discountPrice = price * (1-discount);
		double taxPrice = discountPrice * (1 + tax);
		return (int) taxPrice;
	}
	
}
