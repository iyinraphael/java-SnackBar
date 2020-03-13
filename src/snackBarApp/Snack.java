package snackBarApp;


public class Snack
{

//Mark: - Fields 
	private static maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId) {
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost
		this.vendingMachineId = vendingMachineId
	}

//Mark: - Getters and Settes methods
	public int getId(){
		return id;
	}

	public String getName(){
		return name; 
	}
	public void setName(String name){
		this.name = name;
	}

	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public double getCost(){
		return cost;
	}
	public void setCost(double cost){
		this.cost = cost;
	}

	public int getVendingMachineId(){
		return vendingMachineId;
	}
	public void setVendingMachineId(int vendingMachineId){
		this.vendingMachineId = vendingMachineId;
	}

	public int totalCost(int quantity, double cost){
		return quantity * cost;
	}

//Mark: - Other Methods

}