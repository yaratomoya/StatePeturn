package statePeturn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        HelloBot helloBot=new HelloBot();

     // 「end」が入力されるまでループ
        while (true) {
            // コンソールから値を受け付ける処理
            String input = "";
            try {
                System.out.print(">");
                input = new String(reader.readLine().getBytes("UTF-8"));
            } catch (IOException e){
                System.out.println("入力エラー：" + e.getMessage());
                break;
            }

            // 入力判定
            if (input.equals("end")) {
                System.out.println("入力終了");
                break;
            } else {
                //System.out.println(input);
                helloBot.say(input);
            }
        }
	}

}
