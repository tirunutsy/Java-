package dailyTasks;

//Create Class called "Course" with attributes name, trainer, credits and Create subclass called "Online Course" with attributes such as platform, duration
// Now Implement methods to print Course details and check if the course is eligible for certificate based on duration

class Course {
	String name = "Java FullStack(JFS)";
	String instructor = "Priya Mohanan";
	int credits = 5;
}

class OnlineCourse extends Course {
	String platfrom = "Google Meet";
	int minDuration = 119 ; //Hours Spent
	
	public void CourseDetails() {
		System.out.println("Course Name : "+name);
		System.out.println("Course Instructor : "+instructor);
		System.out.println("Course Credits : "+credits);
//		Now lets check the minDuration(Hours spent) satisfies the Minimum Hourse needs to be spent in order to get Certification(Which is 120 hours)
		if(minDuration >= 120) {
			System.out.println("Eligibility : Yes, You are Eligible for Certificate");
		} else 
			System.out.println("Eligibility : Oops, Sorry You are not Yet Eligible for certificate");
		
	}
}

public class CourseAndCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineCourse course = new OnlineCourse();
		course.CourseDetails();
		
//		OUTPUT = Course Name : Java FullStack(JFS)
//		         Course Instructor : Priya Mohanan
//		         Course Credits : 5
//		         Eligibility : Oops, Sorry You are not Yet Eligible for certificate (Because in inside CourseDetails Subclass we given minDuration = 119 as 119 is still less than 120) 
	}

}
