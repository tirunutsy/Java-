package dailyTasks;

//Write a Java Program to create a Class called Vehicle with attributes model/type and year, Crate a Subclasses named Cars and trucks with attributes like mileage or size  etc..
// now Implement methods to display both Vehicles and their details(Both have common and different details)

class Vehicles{
String carType = "SUV";
String truckType = "Container"; 
int year = 2020;
	public void VehicleDetails() {
		System.out.println("The Types of Cars and trucks are "+carType+" And "+truckType);
		System.out.println("Year manufactured : "+year);
	}
}

class Cars extends Vehicles{
	String carMil = "25 Mpl";
	public void CarMileage() {
		System.out.println("The Average mileage for "+carType+ " Cars is : "+carMil);
	}
}
class Trucks extends Vehicles{
	String truckMil ="6.5 Kmpl";
	public void TruckMileage() {
		System.out.println("The Average mileage for "+truckType+" Trucks is : "+truckMil);
	}
}

public class VehiclesUsingInheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars car = new Cars();
		Trucks truck = new Trucks();
		car.VehicleDetails();
		car.CarMileage();
		System.out.println();
		truck.VehicleDetails();
		truck.TruckMileage();
	}

}
