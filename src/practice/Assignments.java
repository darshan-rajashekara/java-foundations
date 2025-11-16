package practice;

public class Assignments {

	public static void main(String[] args) {
		// Reverse a number (% / = operators)
		// input = 1234 output = 4321
		
		int num = 1234;
		int rev=0;
		
		while(num != 0) {
			int digit = num % 10;  //last number(we get reminder)
			rev = rev * 10 + digit;  //reverse numbers
			num = num/10;           //removing last number(we get quotient)
		}
		
		System.out.println(rev);
	}

}
