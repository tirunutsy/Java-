package AllPrograms;
import java.util.*;

public class UserInputMath {
	public static void main(String[] args) {
		int add, sub, mul, div, mod;

        

        Scanner var = new Scanner(System.in);

       

        System.out.println("ENter First Number A :");

        int a = var.nextInt();

       

        System.out.println("ENter Second Number B :");

        int b = var.nextInt();

       

        add = a+b;

        sub = a-b;

        mul = a*b;

        div = a/b;

        mod = a%b;

       

        System.out.println("Addition of A+B is :"+add);

        System.out.println("Subtraction of A-B is :"+sub);

        System.out.println("Multiplication of A*B is :"+mul);

        System.out.println("Division of A/B is :"+div);

        System.out.println("Modulo of A%B is :"+mod);
	}
}
