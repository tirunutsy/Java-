package dailyTasks;

// Write a java Program to Create a class called person with attributes name, age and Crate two instances of the "Person" class, set their attributes using constructor, Now Print their name and age

class Person {
	String name ;
	int age ;
	
//	Crating a constructor that takes the same name and age as parameters and assigns that to main person class attributes 
	public Person(String name, int age) {
		this.name = name ;
		this.age = age;
	}
	public void print() {
		System.out.println("Person Name : "+name+" Age : "+age);
	}
}

public class SetPersonClassValuesUsingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person per1 = new Person("Thiru",23);
		Person per2 = new Person("Tommy",24);
//		Using the .class attributes to print here it self 
		System.out.println("Person 1 Name : "+per1.name+" Age : "+per1.age);
		System.out.println("Person 2 Name : "+per2.name+" Age : "+per2.age);
		
//		Or We can also create separate method to print person attributes like below shown
		Person per3 = new Person("Robert",25);
		per3.print();
	}

}
