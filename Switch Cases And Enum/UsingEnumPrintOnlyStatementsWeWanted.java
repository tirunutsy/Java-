package dailyTasks;

public class UsingEnumPrintOnlyStatementsWeWanted {

//	Creating Enum with constants 
	enum Overseas{USA, UK, AUS, NZ}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Creating Enum(Overseas) variable to pass on its data
		Overseas country = Overseas.USA;
		
//		Switch case to what to print if that matches
		switch(country) {
		
		case USA :
			System.out.println("Hard to Get Visa to USA");
			break;
		case UK :
			System.out.println("Not that tough to Get Visa to UK");
			break;
		case AUS :
			System.out.println("Getting Student Visa or work visa is easy to AUS");
			break;
		case NZ :
			System.out.println("Now they made it bit difficult to get NZ visa");
			break;
		default :
			System.out.println("Home country is the best");
			break;
		}
		

	}

}
