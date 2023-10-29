package loop;

public class For {

	public static void main(String[] args) {
		// for (<initialization>; <condition>; <increment/decrement>) ( <statements>;}

		int totalNoOfCustomers = 12;

		String customerId = "";

		for (int counter = 1; counter <= totalNoOfCustomers; counter++) {

			if (counter <= 9)

				customerId = "CO" + counter;

			else

				customerId = "C" + counter;

			System.out.println("Customer Id for customer" + counter + " is " + customerId);
		}

//		other simple example

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

		}

	}
}
