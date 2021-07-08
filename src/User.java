
public class User {
	
	//instance variables
	private String username;
	private String password;
	private Pet pet;
	
	//constructor for an empty user
	public User() {
		username="";
		password="";
		pet=null;
	}
	
	//constructor for a user with a password and a username 
	public User(String user, String pass) {
		username=user;
		password=pass;
		pet=new Pet();
	}
	
	//getter and setter methods
	public void setUsername(String user){
		username=user;
	}
	
	public void setPassword(String pass) {
		password=pass;
	}
	
	//if a pet is now deceased, delete the pet from the owner's profile
	public void deletePet() {
		pet=null;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Pet getPet() {
		return pet;	
		
	}
	
	public void setPet(Pet myPet) {
		pet=myPet;
	}
	
	
	
}
