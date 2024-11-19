package dailyTasks;
import java.util.*;

public class FindIfMultipleByTwo {

	public static void main(String[] args) {
		// WRITE A PROGRAM TO FIND IF THE NUMBER IS MULTIPLE OF 2(TWO) OR NOT, TAKE INPUT         //         FROM USER

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number to FInd if its a Multiple of two or Not :");
		int userInput = obj.nextInt();
		
//		Multiple of 2 means the number should be able to multiplied by 2, So if the input % 2 reminder is 0(zero) then its a multiple 
		if(userInput % 2 ==0) {
			System.out.println("Yup, Given number is Multiple of 2");
		} else
			System.out.println("Nope, Given Number is not a multiple of 2");
			
	}

}
