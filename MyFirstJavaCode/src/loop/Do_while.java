package loop;

public class Do_while {

	public static void main(String[] args) {
		int inputNumber = 96;
		int sumofDigits = 0;
		int temp = 0;
		do {
			temp = inputNumber % 10;
			sumofDigits += temp;
			inputNumber = inputNumber / 10;
		} while (inputNumber > 0);
		System.out.println("Sum of digits: " + sumofDigits);
	}

}
