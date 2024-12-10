package dailyTasks;

// The Class Encapsulate is encapsulated as the variables are declared Private, The Get methods like get Name , age and RollNo  are set as public these methods are used to access these variables And The setter methods like Set Name, age and RollNo are set as public methods and are used to set values to these variables

class Encapsulate{

	private String name;
	private int age, rollNo;
	
//	Adding Public Getter methods so that we can access the encapsulated(Private) Variables
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRoll() {
		return rollNo;
	}
	
//	Adding Public Setter methods so that we can set the values of these encapsulated(Private) Variables
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRoll(int rollNo) {
		this.rollNo = rollNo;
	}
	
}

public class Encapsulation { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate student1 = new Encapsulate();
		student1.setName("Tiru");
		student1.setAge(24);
		student1.setRoll(113);
		
		Encapsulate student2 = new Encapsulate();
		student2.setName("Siva");
		student2.setAge(23);
		student2.setRoll(114);
		
//		Now Printing those values using getters
		System.out.println("Student Name : "+student1.getName()+", Roll No : "+student1.getRoll()+", Age : "+student1.getAge());
		System.out.println("Student Name : "+student2.getName()+", Roll No : "+student2.getRoll()+", Age : "+student2.getAge());
		
//		OUTPUT : Student Name : Tiru, Roll No : 113, Age : 24
//		             Student Name : Siva, Roll No : 114, Age : 23
	}

}
