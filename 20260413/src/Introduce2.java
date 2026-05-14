import java.util.Scanner;
public class Introduce2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("情報を登録します");
		System.out.print("名前：");
		String name = scan.next();
		
		String[] hobby = new String[3];
		for(int i = 1; i < 4; i++) {
			System.out.print("趣味" + i + "：");
			hobby[i-1] = scan.next();
		}
		System.out.println("---");
		System.out.println("こんにちは" + name + "です");
		System.out.println("私の趣味は、");
		for(String word : hobby) {
			System.out.println("・" + word);
		}
		System.out.println("です");
		scan.close();
		
	}

}
