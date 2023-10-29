package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		int numOne = 100;
		int numTwo = 20;
		int numThree = 30;
		System.out.println(numOne > numTwo && numOne > numThree); // Output will be true

		// or we can write both & && or | 11

		boolean a = true;
		boolean b = false;
		System.out.println(a & b);
		System.out.println(a & a);
		System.out.println(b & b);
		System.out.println(a | b);
		System.out.println(a || b);
		System.out.println(!b);

	}

}
