package conditions;

public class Problems {

	public static void main(String[] args) {
		// Implement a program to find and display the maximum number out of the given
		// three numbers.
		int num1 = 3;
		int num2 = 4;
		int num3 = 1;
		int maxNumber = findMaxNumber(num1, num2, num3);
		System.out.println("The maximum number is: " + maxNumber);
	}

	public static int findMaxNumber(int numl, int num2, int num3) {
		int max = numl;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}

		return max;
		// or
//		int a=3,b=4, c=1,max=a;
//		if (b>max) {
//		max=b; }
//		if (c>max) {
//		max=c;
//		}
//		System.out.println (max);
	}

}
