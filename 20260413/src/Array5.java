
public class Array5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int[][] ary = {{1,2},{10,11}};
		int[][] ary = new int[][]{{1,2},{10,11}};
//		ary[0][0] = 1;
//		ary[0][1] = 2;
//		ary[1][0] = 10;
//		ary[1][1] = 11;
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary[i].length; j++) {
//				System.out.println("ary[" + i + "][" + j + "] = " + ary[i][j]);
//			}
//		}
//		
		for (int[] i : ary) {
			for (int value : i) {
				System.out.println(value);
			}
		}
		
//		System.out.println("ary[0][0] = " + ary[0][0]);
//		System.out.println("ary[0][1] = " + ary[0][1]);
//		System.out.println("ary[1][0] = " + ary[1][0]);
//		System.out.println("ary[1][1] = " + ary[1][1]);
	}

}
