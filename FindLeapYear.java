package dailyTasks;
import java.util.*;

public class FindLeapYear {

	public static void main(String[] args) {
		// FIND IF THE GIVEN YEAR IS LEAP YEAR OF NOT BY TAKING YEAR FROM USER INPUT :
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Year to know if its Leap year or Not :");
		int year = obj.nextInt();
//		System.out.println(year % 400);
		
//		Leap year has to be fully divisible by 4 
		if(year%4 == 0) {
//			System.out.println("Yup! The Given year "+year+" is Leap Year");
//			If the year is divisible by 100 but not by 400 then its not leap year
			if(year%100==0 && year%400 !=0) {
				//
				System.out.println("Nope! The Given year "+year+" is Not Leap Year");
			}else
				//If all above conditions satisfy then its a leap year
			System.out.println("Yup! The Given year "+year+" is Leap Year");
		}
//			else
//			System.out.println("Nope! The Given year "+year+" is Not Leap Year");
	}

}
