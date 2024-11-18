package dailyTasks;

public class PrintEvenAndOddSeperately {

	public static void main(String[] args) {
		// PRINT EVEN AND ODD NUMBERS SEPERATELY USING IF STATEMENT
		
//		This Loop will print Even Numbers
		System.out.println("The Even Numbers are :");
		for(int i=1; i<=10; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
//		This Loop will print Odd Numbers
		System.out.println("The Odd Numbers are :");
		for(int i=1; i<=10; i++) {
			if(i%2==1)
				System.out.print(i+" ");
		}
	}
}
