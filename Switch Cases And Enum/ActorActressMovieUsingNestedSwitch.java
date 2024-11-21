package dailyTasks;

import java.util.Scanner;

public class ActorActressMovieUsingNestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("1) Rajini");
		System.out.println("2) Vijay");
		System.out.println("3) Ajith");
		System.out.println("Select an Actor Name:");
		String input = obj.nextLine();
		
		switch(input) {
//		Case 1
		case "Rajini" :
			System.out.println("Select His pair(Actress) :");
			String actress = obj.nextLine();
			switch(actress) {
			case "Aishwarya Rai" :
				System.out.println("They Both acted in Enthiran :");
				System.out.println("Want to know Film Result :");
				String result = obj.nextLine();
				switch(result) {
				case "Yes" :
					System.out.println("Its a BlockBuster");
					break;
				case "No" :
					System.out.println("Got it See you around");
					break;
				}
				break;
			default : 
				System.out.println("Enter Correct name");
				break;
			}
			break;
//		case 2
		case "Vijay" :
			System.out.println("Select His pair(Actress) :");
			String VijayActress = obj.nextLine();
			switch(VijayActress) {
			case "Rashmika" :
				System.out.println("They Both acted in Leo :");
				System.out.println("Want to know Film Result :");
				String result = obj.nextLine();
				switch(result) {
				case "Yes" :
					System.out.println("Its a BlockBuster and Vijay career highest Grosser");
					break;
				case "No" :
					System.out.println("Got it See you around");
					break;
				}
				break;
			default : 
				System.out.println("Enter Correct name");
				break;
			}
			break;
//		case 3
		case "Ajith" :
			System.out.println("Select His pair(Actress) :");
			String AjithActress = obj.nextLine();
			switch(AjithActress) {
			case "Nayanthara" :
				System.out.println("They Both acted in Viswasam :");
				System.out.println("Want to know Film Result :");
				String result = obj.nextLine();
				switch(result) {
				case "Yes" :
					System.out.println("Its a BlockBuster");
					break;
				case "No" :
					System.out.println("Got it See you around");
					break;
				}
				break;
			default :
				System.out.println("Enter Correct name");
				break;
			}
			break;		
		}
	}

}
