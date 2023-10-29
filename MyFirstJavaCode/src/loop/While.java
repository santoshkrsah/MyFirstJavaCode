package loop;

public class While {

	public static void main(String[] args) {

		int x = 1;
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
		// another example
		int inputNumber = 7865; // 786,78,7,0
		int sumofDigits = 0;
		int temp = 0;
		while (inputNumber > 0) {
			temp = inputNumber % 10; // 5,6,8,7 =
			sumofDigits += temp; // 5,6,8,7,
			inputNumber = inputNumber / 10; //
		}

		System.out.println("Sum of digits are :" + sumofDigits);
	}

}
