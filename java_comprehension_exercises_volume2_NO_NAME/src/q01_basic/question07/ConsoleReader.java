package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("input number>>");
		return Integer.parseInt(br.readLine());

	}
}
