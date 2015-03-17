package creditcardeval;
import java.util.Scanner;
public class CredCardCheckDigit {
 public static void checkcardnumber(int[] creditcard) {
	 Scanner in = new Scanner(System.in);
	        System.out.println("Enter a Credit Card Number: ");
	        creditcard = in.nexInt();	 
	        
	 		int sum = 0;
	         int length = creditcard.length;
	         for (int i = 0; i < length; i++) {
	        	 int digit = creditcard[length - i - 1];
	        	 if (i % 2 == 1) {
	                 digit *= 2;
	             }
	        	 if (digit <= 9){
	             sum += digit; 
	         }
	        	 if(digit >= 9){
	        		 digit=digit-9;
	        		 sum+=digit;
	        	 }
	             
	        	 }
	        	 if(sum%10==0){
	             System.out.println("the number is valid");
	     }
	         	 if (sum%10!=0){
	        	 System.out.println("the number is invalid");
	         	 }
	    

	    
	}  

	}
	  
	  


	
	
	

