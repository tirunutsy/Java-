package dailyTasks;

import java.util.Scanner;

public class IndiasBiggestMoviesUsingNestedSwitch {

	public static void main(String[] args) {
		// Now Lets do a Fun Code Indias Biggest movies using nestedSwitch 
		
		Scanner obj = new Scanner(System.in);
		System.out.println("1) Bahubali 2");
		System.out.println("2) RRR");
		System.out.println("3) KGF 2");
		System.out.println("Enter a Top Movie name:");
		String input = obj.nextLine();
		
		switch(input) {
//		Case 1
		case "Bahubali 2" :
			System.out.println("Its Indias Biggest BlockBuster, And Industry hit in Every state");
			System.out.println("Want to know its Main Cast and Crew :");
			String BahubaliDetails = obj.nextLine();
			switch(BahubaliDetails) {
			case "Yes" :
				System.out.println("Its Directed by SS Rajamouli, Acted by Prabhas and Others");
				System.out.println("Want to know its Box-Office Collections :");
				String Collections = obj.nextLine();
				switch(Collections) {
				case "Yes" :
					System.out.println("1800+ Crores Worldwide");
					break;
				case "No" :
					System.out.println("Got it See you around");
					break;
				}
				break;
			case "No" : 
				System.out.println("Got it See you around");
				break;
			}
			break;
//		case 2
		case "RRR" :
			System.out.println("Its Indias 2nd Biggest BlockBuster");
			System.out.println("Want to know its Main Cast and Crew :");
			String RRRDetails = obj.nextLine();
			switch(RRRDetails) {
			case "Yes" :
				System.out.println("Its Directed by SS Rajamouli, Acted by Ram Charan, Jr NTR and Others");
				System.out.println("Want to know its Box-Office Collections :");
				String Collections = obj.nextLine();
				switch(Collections) {
				case "Yes" :
					System.out.println("1350+ Crores Worldwide");
					break;
				case "No" :
					System.out.println("Got it See you around");
					break;
				}
				break;
			case "No" : 
				System.out.println("Got it See you around");
				break;
			}
			break;
//		case 3
		case "KGF 2" :
			System.out.println("Its Indias 3rd Biggest BlockBuster");
			System.out.println("Want to know its Main Cast and Crew :");
			String KGFDetails = obj.nextLine();
			switch(KGFDetails) {
			case "Yes" :
				System.out.println("Its Directed by Prashant Neel, Acted by Yash and Others");
				System.out.println("Want to know its Box-Office Collections :");
				String Collections = obj.nextLine();
				switch(Collections) {
				case "Yes" :
					System.out.println("1250+ Crores Worldwide");
					break;
				case "No" :
					System.out.println("Got it See you around");
					break;
				}
				break;
			case "No" : 
				System.out.println("Got it See you around");
				break;
			}
			break;
			
			default :
				System.out.println("Enter Correct Movie");
			break;
		}
	}

}
