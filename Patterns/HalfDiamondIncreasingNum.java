package dailyTasks;

import java.util.Scanner;

public class HalfDiamondIncreasingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int n =scan.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
				for(int k=1;k<=2*i-1;k++) {
					System.out.print("*");
//					System.out.print("\n");
					System.out.println();
				}
				
			}
		}
	}

}
