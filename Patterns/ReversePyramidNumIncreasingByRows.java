package dailyTasks;

import java.util.Scanner;

public class ReversePyramidNumIncreasingByRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number of rows");
		Scanner obj = new Scanner(System.in);
		
		int n = obj.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j = 5; j >=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
