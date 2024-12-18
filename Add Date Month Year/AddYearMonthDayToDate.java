package dailyTasks;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

// Program To print the a date which  should add 4 days 4 month and 4 years to the given date.

public class AddYearMonthDayToDate {
	
	public static void AddDateMonthYear(String date, int days, int months, int years) throws ParseException {
		//Setting a Basic format for date
		SimpleDateFormat format = new SimpleDateFormat("d/m/y");
		Date inputDate = format.parse(date); //Storing input date in Date var(throws parse exception so adding it to method)
		System.out.println("The Given date is : "+format.format(inputDate)); //Printing User input
//		Create Calendar variable for getting future year/month/dates from calendar class to add and manipulate it further
		Calendar outputDate = Calendar.getInstance();
//		Now Setting user input to calendar outputDate
		outputDate.setTime(inputDate);
//		Now adding user input data's one by one to output 
		outputDate.add(Calendar.DATE, days);
		outputDate.add(Calendar.MONTH, months);
		outputDate.add(Calendar.YEAR, years);
//		Since outputDate is Calendar class variable it prints extra details about deafault time week days etc to avoid it we just store year, month and day on separate integers
		int day = outputDate.get(Calendar.DATE);
		int month = outputDate.get(Calendar.MONTH);
		int year = outputDate.get(Calendar.YEAR);
		System.out.println("After Adding Given Date/Month/Year : "+day+"/"+month+"/"+year);
		Date outputDetails = outputDate.getTime();
		System.out.println("More about "+day+"/"+month+"/"+year+" :"+outputDetails);
	}

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The Date/Month/Year :");
		String userInput = obj.nextLine();
		
		System.out.println("Enter Number of DAYS You want to  add :");
		int day = obj.nextInt();
		System.out.println("Enter Number of MONTHS You want to  add :");
		int month = obj.nextInt();
		System.out.println("Enter Number of YEARS You want to  add :");
		int year = obj.nextInt();
//      calling Method and assigning values
		AddDateMonthYear(userInput, day, month, year);
		
	}

}

//OUTPUT :
//	    Enter The Date/Month/Year :
//		1/1/2025
//		Enter Number of DAYS You want to  add :
//		4
//		Enter Number of MONTHS You want to  add :
//		4
//		Enter Number of YEARS You want to  add :
//		4
//		The Given date is : 1/1/2025
//		After Adding Given Date/Month/Year : 5/4/2029
//		More about 5/4/2029 :Sat May 05 00:01:00 IST 2029