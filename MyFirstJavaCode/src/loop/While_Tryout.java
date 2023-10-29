package loop;

public class While_Tryout {

	public static void main(String[] args) {
		/*
		 * Be careful while writing the statements inside while loops and the while loop
		 * condition. If the condition in the while loop always evaluates to true, it
		 * results in an infinite loop. Execute the below code and observe the output.
		 */
		int totalCost = 0;
		char wantToAddFoodItem = 'Y';
		int unitPrice = 10;
		int quantity = 1;
		while (wantToAddFoodItem == 'Y') {

			totalCost = totalCost + (quantity * unitPrice);

			System.out.println("Order placed successfully");

			System.out.println("Total cost: " + totalCost);

			System.out.println("Do you want to add one more food item to the order?");
		}
		System.out.println("Thank you for ordering the food! It will reach you shortly...");

	}

}
