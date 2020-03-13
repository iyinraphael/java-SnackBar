package snackBarApp;

public class Customer
{
//Mark: - Fields
	private int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash){
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

//Mark: - Getters and Setters
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public double setCash(double cost, int numberOfItem) {
		double expense = cost * numberOfItem;
		double newCash = this.cash - expense;
		return this.cash = newCash;
	}
}