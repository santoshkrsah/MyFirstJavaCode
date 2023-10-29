package loop;

public class Break_Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {

			if (i == 10 | i == 12) {

				continue; // jump the number
			}

			if (i > 15) {
				break; // will not print next
			}

			System.out.println(i);
		}

	}
}