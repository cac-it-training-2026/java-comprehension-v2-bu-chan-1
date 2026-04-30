package q01_basic.question07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain07 {

	public static void main(String[] args) throws IOException {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		ConsoleReader console = new ConsoleReader();
		try {
			limit = console.inputNumber();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			numberList.addFromOneTo(limit);
			List<Integer> numbers = new ArrayList<>();
			numbers = numberList.getNumbers();
			for (int i = 0; i < limit; i++) {
				if (i == 0) {
					System.out.print("[");
				}
				if (i != limit - 1) {
					System.out.print(numbers.get(i) + ", ");
				} else {
					System.out.println(numbers.get(i) + "]");
				}
			}

			System.out.println("****************");
			System.out.println("\nListの合計を計算します");
			int sum = 0;
			//TODO ここから実装する
			sum = numberList.calcSumOfList();

			System.out.println("1から" + limit + "までの合計は" + sum + "です。");

			System.out.println("****************");
			System.out.println("\nListの各要素を2倍します");
			//TODO ここから実装する
			numberList.doubleListEachValue();
			System.out.print("[");
			for (int i = 0; i < limit; i++) {
				if (i != limit - 1) {
					System.out.print(numbers.get(i) + ", ");
				} else {
					System.out.print(numbers.get(i));
				}
			}
			System.out.println("]");

			System.out.println("****************");
			System.out.println("\nListの前半分のインデックスの要素を削除します");
			//TODO ここから実装する
			numberList.removeIndexOfFirstHalf();
			System.out.print("[");
			if (limit % 2 == 0) {
				for (int i = 0; i < limit / 2; i++) {
					if (i != limit / 2 - 1) {
						System.out.print(numbers.get(i) + ", ");
					} else {
						System.out.print(numbers.get(i));
					}
				}
			} else {
				for (int i = 0; i <= limit / 2; i++) {
					if (i != limit / 2) {
						System.out.print(numbers.get(i) + ", ");
					} else {
						System.out.print(numbers.get(i));
					}
				}
			}

			System.out.println("]");
		}

	}

}
