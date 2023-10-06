package banking_system_PART1;


import java.util.Scanner;

public class login {
	


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("WELCOME TO LOGIN PAGE:");
		System.out.println("");
		
		System.out.println("PLEASE FILL UP THIS SOME PERSONAL INFO BEFORE WE PROCEED IN NEXT STEP:");
		System.out.println("");
		
		while(true) {
		System.out.println("TYPE OK TO CONTINUE OR TYPE EXIT TO END THE PROCESS: ");
		String IN=sc.nextLine();

		if (IN.equalsIgnoreCase("OK"))
		{
			System.out.println("Let's Continue ");
			break;
		}
		else if (IN.equalsIgnoreCase("EXIT")) {
			System.out.println("OK THANK YOU HAVE A GREAT DAY");
			break;

		}
		else 
		{
			System.out.println("INVALID CHOICE");
			System.out.println("");	
			break;
		}		
	}
		 System.out.println("FULLNAME: ");
			String userName1 = sc.nextLine();
			
			System.out.println("Adress: ");
			String ADress1 = sc.nextLine();
			
			

	    	 System.out.println("Your Age: ");
	  		String age = sc.nextLine();
	    	
	    	 System.out.println("Enter a phone number (11 digits): ");
	 		String PhNum = sc.nextLine();
	    	
	    	if (PhNum.length ()== 11) {
	    		System.out.println("So Your Number is " + PhNum + " Good now let's continue.");
	    	}
	    	else {
	            System.out.println(" Please enter exactly 11 digits.");
	            
	        }
	    	
	    	  System.out.print("Enter your email: ");
	          String email = sc.nextLine();

	          if (isValidEmail(email)) {
	              System.out.println();
	              
	          } else {
	              System.out.println("Incorrect Email Input. Please enter a valid email address.");
	              
	          }

	    	
		PersonalDetails Det=new PersonalDetails(userName1, ADress1);
		PersonalDetails Det2=new PersonalDetails(age, PhNum);
		
		 generateAccountNumber generator = new RandomAccountNumberGenerator();
		 
		 String accountNumber = generator.generateAccountNumber();

	        // Print the generated account number
	        System.out.println("Generated Account Number: " + accountNumber);


	}

	public  static boolean isValidEmail(String email) {
		
		return email.contains("@") && email.contains(".");
	}	
}


