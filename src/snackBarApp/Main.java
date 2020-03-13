package snackBarApp;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Customer customer1 = new Customer("Jane", 45.25);
		Customer customer2 = new Customer("Bob", 33.14);

		VendingMachine vend1 = new VendingMachine("Food");
		VendingMachine vend2 = new VendingMachine("Drink");
		VendingMachine vend3 = new VendingMachine("Office");

		Snack snack1 = new Snack("Chips", 36, 1.75, vend1.getId());
		Snack snack2 = new Snack("Chocolate", 36, 1.00, vend1.getId());
		Snack snack3 = new Snack("Pretzel", 30, 2.00, vend1.getId());

		Snack snack4 = new Snack("Soda", 24, 2.50, vend2.getId());
		Snack snack5 = new Snack("Water", 20, 2.75, vend2.getId());

	
		double cash1 = customer1.setCash(snack4.getCost(), 3);
		double cash2 = customer1.setCash(snack3.getCost(), 1);
		int quatity1 = snack4.setQuantity(snack4.getQuantity(), 3);
		int quatity2 = snack3.setQuantity(snack3.getQuantity(), 1);

		double cash3 = customer2.setCash(snack4.getCost(), 2);
		int quantity3 = snack4.setQuantity(snack4.getQuantity(), 2);


		
		System.out.println("*** List of snacks");
		System.out.println();
		System.out.println(snack1);
		System.out.println(snack2);
		System.out.println(snack3);
		System.out.println(snack4);
		System.out.println(snack5);
		System.out.println(cash1);
		System.out.println(cash2);
		System.out.println(cash3);
		System.out.println(quatity1);
		System.out.println(quatity2);
		System.out.println(quantity3);

	}
}
