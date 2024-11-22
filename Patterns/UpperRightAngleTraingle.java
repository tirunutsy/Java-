package AllPrograms;

import java.util.Scanner;

public class UpperRightAngleTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j, n;
		System.out.println("Enter number of rows");
		Scanner obj = new Scanner(System.in);
		
		n = obj.nextInt();
		for(i = 1; i<=n; i++) {
//			System.out.print(" ");
			for(j=1; j<=i ; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
