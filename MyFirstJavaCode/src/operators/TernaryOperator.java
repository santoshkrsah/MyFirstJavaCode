package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		/*Ternary operator is used as a single line replacement for if-then-else statements and acts upon three operands.

		Syntax:<condition> ? <value if condition is true> <value if condition is false> */

		int numOne = 10;

		int numTwo = 5;

		int min = (numOne < numTwo) ? numOne : numTwo;

		System.out.println(min); // Output will be 5
	}

}
