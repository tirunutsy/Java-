package dailyTasks;

//Write Java Program to create Class called "GymMembership" with attributes name, type, duration and Crate subclass "PremiumMmbership" with attributes Personal trainer availability and SPA access 
// Now Implement a method to calculate membership fees and check special offers with Any Membership type

class GymMembership{
	String name = "Tirumalesh";
	String type = "Premium";
	String Duration = "1 Month";
	int gymFee = 2000, perTrainer = 1000, spaFee = 1000 ;
	int total = gymFee+perTrainer+spaFee;
	int month = 1;
	public void MemFees() {
		
		System.out.println("Gym Memberships and their Fees :");
		System.out.println("Silver : "+gymFee*month);
		System.out.println("Gold : "+(gymFee+perTrainer)*month);
		System.out.println("Premium : "+(gymFee+perTrainer+spaFee)*month);
		
	}
}

class PremiumMembership extends GymMembership{
	String personalTrainer = "Yes";
	String spaAccess = "Yes";
	
	public void PremiumOffers() {
		if(total == 4000) {
			System.out.println("Premium Membership holders Get Personal Trainer and SPA Access");
		} else
			System.out.println("You dont have Premium membership, You dont get Special Offers");
	}
}

public class GymMembershipAndPerks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PremiumMembership gym = new PremiumMembership();
		gym.MemFees();
		System.out.println();
		gym.PremiumOffers();
	}

}
