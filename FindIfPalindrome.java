package dailyTasks;

public class FindIfPalindrome {

	public static void main(String[] args) {
		// FIND IF THE GIVEN STRING IS PALINDROME OR NOT
		
		//Lets Find a simplest way to approach this
		String word = "malayalam";
		//Convert the string to char Array using .toCharArray function(So that we can travel through 
		char[] charArray = word.toCharArray(); 
		//Create an Empty string to store the reversed string char/data
		String reverse = "";
		
		//Traveling reverse 
		for(int i=charArray.length-1; i >= 0; i--) {
			reverse += charArray[i];
//			System.out.println(charArray[i]);
		}
//		System.out.println(reverse);
		
//		Now compare the original string(word) with reversed string
		if(word.equals(reverse)) {
			System.out.println("Yup, Thats a Palindrome");
		} else
			System.out.println("Nope, Thats not a Palindrome");
		

	}

}
