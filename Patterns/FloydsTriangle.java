package AllPrograms;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// Floyed Traingle is a right angle traingle that keeps increasing its weight 1 by 1
		int numberOfRows;
		System.out.println("Input nUmber of Rows");
		Scanner obj = new Scanner(System.in);
		numberOfRows = obj.nextInt();
		int number = 1;
		
		for(int row =1; row <= numberOfRows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
		
		
//		for( int i = numberOfRows; i <= 1; i-- ) {
//			for(int j = numberOfRows; j <= numberOfRows; j++) {
//				System.out.print(number+" ");
//			}
//			System.out.println();
//		}
	}

}
