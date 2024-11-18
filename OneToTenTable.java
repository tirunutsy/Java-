package dailyTasks;
import java.util.*;

public class OneToTenTable {

	public static void main(String[] args) {
//		PRINT ONE TO TEN(1-10) TABLE USING FOR LOOP
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number to Print its Table :");
		int num = obj.nextInt();
		
		for(int i=1; i<=10; i++) {
//			Giving a condition that input says input should be between 1 to 10
			if(num > 10) {
				System.out.println("Give the number between 1 to 10");
				break;
			}
			int sum = num * i;
			System.out.println(num+" X "+i+" = "+sum);
			
		}
		
		
	}

}
