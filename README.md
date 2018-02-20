# JavaNumberOfRowsInput
行数を入力し、その行数分だけ入力

## 処理
キーボードから入力する行数を入力し、その行数分だけ入力を行う。

## コード
```
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
```

## 出力例
```
行数の入力をお願いします。  
3  
それでは3行入力してください。  
1行目  
あいうえお  
あいうえお  1行目  
2行目  
かきくけこ  
かきくけこ  2行目  
3行目  
さしすせそ  
さしすせそ  3行目  
入力は以上です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
