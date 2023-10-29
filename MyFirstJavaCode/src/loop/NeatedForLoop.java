package loop;

public class NeatedForLoop {

	public static void main(String[] args) {
		int j = 4;

		for (int i = 0; i < j; i++) {

			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int s = 10;
		for (int i = 1; i <= s; i++) {
			for (int k = 1; k <= i; k++) { 
//						 print displays the text without adding a new line
				System.out.print(k + "");
			}
			// print displays the text along with a new line

			System.out.println("");
		}

	}
}