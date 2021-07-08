import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean endOfDay=false;
		Date today=new Date();
		List<User> users=new ArrayList<User>();
		List<TrackUpdate> updates=new ArrayList<TrackUpdate>();
		while(!endOfDay) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter your username");
			String user = in.nextLine();
			System.out.println("Please enter your password");
			String pass = in.nextLine();
			boolean userInArray=false;
			User thisUser=new User(user,pass);
			Pet thisPet = new Pet();
			for(int i=0; i<users.size(); i++) {
				if(users.get(i).getUsername().equals(thisUser.getUsername())&&users.get(i).getPassword().equals(thisUser.getPassword())){
					userInArray=true;
					thisUser=users.get(i);
					thisPet=thisUser.getPet();
				}
				
			}
			if(!userInArray) {
				users.add(thisUser);
				thisUser.setPet(thisPet);
				System.out.println("Welcome new user! Please enter the name of your pet");
				String n = in.nextLine();
				thisPet.changeName(n);
				System.out.println("How much do you aim to feed your pet each day (in cups)");
				double goal = in.nextDouble();
				thisPet.changeBudget(goal);
			}
			System.out.println("How many cups did you feed "+thisPet.getName());
			double fed=in.nextDouble();
			TrackUpdate up = new TrackUpdate(thisPet);
			up.update(fed);
			updates.add(up);
			double fedSoFar = 0;
			for(int i=0; i<updates.size(); i++) {
				if(updates.get(i).getDate().getDay()==(today.getDay())&&updates.get(i).getPet().equals(thisPet)) {
					fedSoFar+=updates.get(i).getFoodGiven();
				}
			}
			System.out.println("You have fed "+thisPet.getName()+" "+fedSoFar+" cups of food today");
			if(fedSoFar>thisPet.getBudget()) {
				System.out.println("You have fed "+thisPet.getName()+" too much food today!");
				
			}
			else if(fedSoFar<thisPet.getBudget()) {
				System.out.println("You have not fed "+thisPet.getName()+" enough food today");
			}
			else {
				System.out.println("You have fed your pet the right amount of food today!");
			}
			System.out.println("Thank you for logging the food you have fed "+thisPet.getName());
			System.out.println("Please check back in when you have fed your pet again!");
			if(today.getHours()==0) {
				endOfDay=true;
			}
		}
		
	}

}
