package dailyTasks;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		// NESTED SWITCH USING STRINGS
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a language Name :");
		String input = obj.nextLine();
		
		switch(input) {
		case "Java" :
			System.out.println("Java is the most useful and powerfull language");
			System.out.println("Which version you are Using");
			int javaNum = obj.nextInt();
			switch(javaNum) {
			case 21 :
				System.out.println("21 Version is great");
				break;
			case 23 :
				System.out.println("23 Version is also good but it wont support Enum");
				break;
			}
			break;
			
		case "Python" :
			System.out.println("Python is also good but its mainly Used in ML,Data analytics etc");
			break;
		case "C++" :
			System.out.println("Its also good and object oriented language");
			break;
		}

	}

}
