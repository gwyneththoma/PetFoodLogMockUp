import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrackUpdate {
	
	//instance variables
	private Pet pet;
	private double foodGiven;
	private Date date;
	
	//constructor
	public TrackUpdate() {
		pet=new Pet();
		date=new Date();
	}
	
	//constructor when the pet is known
	public TrackUpdate(Pet myPet) {
		pet=myPet;
		date=new Date();
	}
	
	//update the pet's food info
	public void update(double foodGiven1) {
		foodGiven=foodGiven1;
	}
	
	//get the food given that day
	public double getFoodGiven() {
		return foodGiven;
	}
	
	public Pet getPet() {
		return pet;
	}
	public Date getDate() {
		return date;
	}
	
}
