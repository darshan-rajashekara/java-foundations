package practice;

public class IfElsePracticeProblems {
	public static void main(String[] args) {
		// Check whether a number is even or odd.
		
		int num = 2;
		if(num % 2 == 0) {
			System.out.println("the given number is even");
		} else {
			System.out.println("the given number is odd");
		}
		
		
		//Check whether a person can drive (age ≥ 18).
		
		int age = 20;
		
		if(age >= 18) {
			System.out.println("Person can drive");
		} else {
			System.out.println("cannot drive");
		}
		
		
		//Find the largest of two numbers.
		
		int a=10 , b=20;
		
		if(a>b) {
			System.out.println(a + " is largest");
		} else {
			System.out.println(b + " is largest");
		}
		
		
		//Check if the entered password matches "admin123".
		
		String pass = "admin123";
		
		//if(pass == "admin123") {      // == operators checks memory location (reference comparison), .equals() compares values (content).
		if(pass.equals("admin123")) {
			System.out.println("the Password Matched");
		} else {
			System.out.println("Wrong Password");
		}
		
		
		//Interview-Level
        //Write a program to check if a given character is an alphabet or not.
		
		char alph = 'd';
		
		if((alph >= 'a') && (alph <= 'z') || (alph >= 'A') && (alph <= 'Z')) {
			System.out.println("the given character is alphabet");
		} else {
			System.out.println("the given character is not alphabet");
		}
	}

}
