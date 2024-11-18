package dailyTasks;

import java.util.*;

public class FindArmstrongNum {

	public static void main(String[] args) {
		// Find Given Number is Armstrong num or not by taking input from the User
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number to find if its Armstrong or Not :");
		int userNum = obj.nextInt();
		
		//TO FIND THE LENGTH OF THE UNSER INPUT NUMBER WE HAVE TO CONVERT IT INTO STRING FIRST TO KNOW ITS LENGTH/TOTAL NUMBER OF DIGITS
		String str = Integer.toString(userNum);
		int size = str.length();
		int total =0;
		int pow =0;
		for(int i=0; i<size; i++) {
			
			//Getting Char Value in Numeric(Integer)
			int num = Character.getNumericValue(str.charAt(i));
			//Since math.pow function returns double, So We have to Covert the double value
//           (number.decimal(2.0)) into integer by using (int)
			pow = (int) Math.pow(num, size);
			
			total += pow;  //Adding every pow values in total to get the sum of all powered values 
			
		}
		
		if(userNum == total) {
			System.out.println("Hurrey! The given Number is Armstrong Number :)");
		} else
			System.out.println("Oops, The given Number is Not an Armstrong Number :(");
	}

}
