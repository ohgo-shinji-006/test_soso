package kadai3;

public class CalcPoints1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price =1000;
		
		int p1 = getPoints(price, true);
		System.out.println("プレミア会員には" + p1 + "ポイント付与されます");
		
		int p2 = getPoints(price, false);
		System.out.println("無料会員には" + p2 + "ポイント付与されます");
		
		
	}
	
	static int getPoints(int price, boolean menber) {
		double point;
		if(menber == true) point = price*0.2;
		else point = price*0.1;
		return (int)point;
	}

}
