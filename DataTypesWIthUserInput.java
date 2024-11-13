package AllPrograms;
import java.util.*;

public class DataTypesWIthUserInput {
	
	public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

       

        System.out.println("Enter your Name :");

        String name = var.nextLine();

        System.out.println("Enter your Age :");

        int age = var.nextInt();

        System.out.println("Enter your Salary :");

        float sal = var.nextInt();

        System.out.println("Enter your Degree GPA :");

        double gpa = var.nextInt();

        System.out.println("Enter your Birth year :");

        long by = var.nextInt();

        System.out.println("Enter your lucky number :");

        short lucky = var.nextShort();

        System.out.println("Enter your Father age :");

        byte fage = var.nextByte();

        System.out.println("Do You Like Dogs :");

        boolean isDogs = var.nextBoolean();
        
        

        System.out.println("Your name is :"+name);

        System.out.println("Your Age is :"+age);

        System.out.println("Your Salary is :"+sal);

        System.out.println("Your Degree GPA is :"+gpa);

        System.out.println("Your Birth year is :"+by);

        System.out.println("Your Lucky number is :"+lucky);

        System.out.println("Your Father's Age is :"+fage);

        System.out.println("You Like Dogs :"+isDogs);

       

  }

}
