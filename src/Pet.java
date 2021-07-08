
public class Pet {
	
	//instance variables
	private String name;
	private long id;
	private static long newID=0;
	private double foodBudget;
	
	//constructor for an empty pet
	public Pet() {
		name="";
		id=newID;
		newID++;
		foodBudget=0;
	}
	
	//constructor for a pet with a name but not a food budget
	public Pet(String n) {
		name=n;
		id=newID;
		newID++;
		foodBudget=0;
	}
	
	//constructor for a pet with a food budget but not a name
	public Pet(double budget) {
		name="";
		id=newID;
		newID++;
		foodBudget=budget;
	}
	
	//constructor for a pet with both a name and a food budget
	public Pet(String n, double budget) {
		name=n;
		id=newID;
		newID++;
		foodBudget=budget;
	}
	
	//change the food budget for your pet
	public void changeBudget(double newB) {
		foodBudget=newB;
	}
	
	//change the pet's name
	public void changeName(String n) {
		name=n;
	}
	
	//get the pet's name
	public String getName() {
		return name;
	}
	
	//get the pet's budget
	public double getBudget() {
		return foodBudget;
	}
	
	//get the pet's id
	public long getID() {
		return id;
	}
	
}
