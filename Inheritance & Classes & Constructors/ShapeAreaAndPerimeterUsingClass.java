package dailyTasks;

//  Write a Java Program to create a class "Shapes" and Subclasses Rectangle, Triangle, Circle, Now Implement Abstract Methods to Finds each Shapes Area and Perimeter

class Shapes{
	
	double area, perimeter;
}

class Rectangle extends Shapes{
	int length, width ;
//	Creating a constructor to assign values to main class variables
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
//	Print method to print Rectangle Area and Perimeters
	public void PrintRectangle() {
//		Area = length * width and Perimeter = 2 * (Length+width) so lets assign values 
		area = length * width;
		perimeter = 2 * (length + width);
		
		System.out.println("The Given Rectangle Length = "+length+" And Width = "+width);
		System.out.println("Area of Rectangle : "+area+" And Perimeter of Rectangle : "+perimeter);
	}	
}

class Triangle extends Shapes{
	int side1, side2, side3;
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void PrintTriangle() {
//		In Order to know the Area of the Traingle first we have to know Semi Parimeter of the triangle
		int sp = (side1+side2+side3)/2;
//		Formula to find Area A=Square root of sp (sp-side1)*....(sp-side n)
		area = Math.sqrt(sp * (sp-side1) * (sp-side2) * (sp-side3));
		perimeter = side1+side2+side3;
		
		System.out.println("The Given Triangle 3 sides are "+side1+" And "+side2+" And "+side3);
		System.out.println("Area of Triangle : "+area+" And Perimeter of Triangle : "+perimeter);
		
	}
}

class Circle extends Shapes{
	int radius;
//	Constructor to assign values to main class var 
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void PrintCircle() {
//		Formula to find Area od Circle = PI Value * radius times square(radius^2)
		area = Math.PI * radius * radius;
		perimeter = 2 * (Math.PI * radius);
		
		System.out.println("The Given Circle Radius is "+radius);
		System.out.println("Area of Circle : "+area+" And Perimeter of Circle : "+perimeter);
	}
	
}
public class ShapeAreaAndPerimeterUsingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(4, 2);
		Triangle triangle = new Triangle(4,5,4);
		Circle circle = new Circle(3);
		
		rectangle.PrintRectangle();
		System.out.println(); //Breaking a like
		triangle.PrintTriangle();
		System.out.println(); //Breaking a like
		circle.PrintCircle();
		
//		OUTPUT : 
//		        The Given Rectangle Length = 4 And Width = 2
//				Area of Rectangle : 8.0 And Perimeter of Rectangle : 12.0
//
//				The Given Triangle 3 sides are 4 And 5 And 4
//				Area of Triangle : 4.898979485566356 And Perimeter of Triangle : 13.0
//
//				The Given Circle Radius is 3
//				Area of Circle : 28.274333882308138 And Perimeter of Circle :            18.84955592153876

	}

}
