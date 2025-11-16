package practice;

public class ConditionalStatementPractice {

	public static void main(String[] args) {
		//check if a number is positive
	       int a=3;
	       if(a>0) {
	    	   System.out.println("Positive");
	       }
	       
	       //check if a person is eligible
	       int age = 20;
	       if(age>=18) {
	    	   System.out.println("eligible");
	       }
	       
	       //check if a number is even
	       int num=2;
	       if(num%2==0) {
	    	   System.out.println("Even");
	       }
	       
	       //check if a character is vowel
	       char ch = 'A';
	       ch = Character.toLowerCase(ch);

	       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
	           System.out.println("Vowel");
	       } else {
	           System.out.println("Not Vowel");
	       }


	}

}
