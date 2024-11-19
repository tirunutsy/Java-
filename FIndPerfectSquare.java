package dailyTasks;

public class FIndPerfectSquare {

	public static void main(String[] args) {
		// WRITE A JAVA PROGRAM TO FIND IF THE NUMBER IS VALUE OF A SQUARE OR NOT(ALSO KNOWN AS PERFECT SQUARE)
//		EX: 1^2=1, 2^2=4, 3^2=9, 4^2=16, 5^2=25 THERE FORE 1,4.9,16,25 ARE PERFECT SQAURES
		
		int input = 36;
//		First we need to find the square root of the given number
		double sqRoot = Math.sqrt(input); //Note : this will give a decimal value of square root
//		Now we need to find floor value of the square root, Floor value is nothing but closest possible lower number Ex : 15.4 or 15.8 or 15.0 = 15 or in this case we can also covert it to int using (int) function
		int flr = (int) sqRoot;
		
		if(sqRoot % flr == 0) {
			System.out.println("Yes, Its a Perfect Square");
		} else
			System.out.println("No, its not a Perfect Square");
	}

}
