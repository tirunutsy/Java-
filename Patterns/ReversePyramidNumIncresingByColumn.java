package dailyTasks;

import java.util.Scanner;

public class ReversePyramidNumIncresingByColumn {

	public static void main(String[] args) {
		// Reverse pyramid numbers should increase by column
		
		System.out.println("Enter number of rows");
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j = 5; j >=i; j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
