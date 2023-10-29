package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
//		Bitwise AND (&) operator:

		int a = 5; // binary: 0101
		int b = 3; // binary: 0011
		int result = a & b; // binary: 0001 (decimal: 1)
		System.out.println("result=" + result);

//	Bitwise OR (1) operator: 
		result = a | b; // binary: 0111 (decimal: 7)
		System.out.println(result);

		// Bitwise XOR (^) operator:
		result = a ^ b; // binary: 0110 (decimal: 6)
		System.out.println(result);

		// Bitwise NOT (~) operator:
		result = ~a; // binary: 1010 (decimal: -6)
//		System.out.println(result);
	}

}
