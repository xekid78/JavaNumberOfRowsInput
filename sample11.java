/**
 *
 * @author xekid78
 *
 */
import java.util.Scanner;

public class sample11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("行数の入力をお願いします。");
		int num = scan.nextInt();
		System.out.println("それでは" + num + "行入力してください。");

		String data;
		for (int i = 1; i <= num; i++) {
			System.out.println(i + "行目");
			data = scan.next();
			System.out.println(data + "  " + i + "行目");
		}

		System.out.println("入力は以上です。");
		scan.close();

	}

}
