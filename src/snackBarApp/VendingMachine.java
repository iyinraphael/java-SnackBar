package snackBarApp;

public class VendingMachine
{
//Mark: - Fields
	private int maxId = 0;
	private int id;
	private String name;

	public VendingMachine(String name){
		maxId++;
		id = maxId;
		this.name = name;
	}

//Mark: - Getters and Setters
	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}