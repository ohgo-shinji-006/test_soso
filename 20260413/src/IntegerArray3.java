
public class IntegerArray3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 1, 7, 2, 7, 3 };
		int count = 0;
		for (int num : numbers) {
			if (num == 7) {
				count += 1;
			}
		}
		System.out.println(count + "個ありました");
	}

}
