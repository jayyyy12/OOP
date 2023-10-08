package banking_system_PART1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

			return;

		}
		else 
		{
		System.out.println("INVALID CHOICE");
		System.out.println("");	
		continue;
		}		
		}
		while(true) {
		System.out.println("FULLNAME: ");
			String userName1 = sc.nextLine();
			
		System.out.println("Adress: ");
			String ADress1 = sc.nextLine();
			
			

	    System.out.println("Your Birthdate(YYYY/MM/DD) : ");
	  			String Bday = sc.nextLine();
	  			
	 
	    System.out.println("Enter a phone number (11 digits): ");
	 			String PhNum = sc.nextLine();
	    	
	    	if (PhNum.length ()== 11) {
	    		System.out.println("So Your Number is " + PhNum + " Good now let's continue.");
	    	}
	    	else {
	            System.out.println(" Please enter exactly 11 digits.");
	            continue;
	            
	        }
	    	
	    	  System.out.print("Enter your email: ");
	          String email = sc.nextLine();
	          
	          if (isValidEmail(email)) {
	              System.out.println();
	              
	          } else {
	              System.out.println("Incorrect Email Input. Dont forget to put @ sign and .com");
	              continue;
	          }
	          
//	    	
//		PersonalDetails Det=new PersonalDetails(userName1, ADress1);
//		PersonalDetails Det2=new PersonalDetails(age, PhNum);
		
		 generateAccountNumber generator = new RandomAccountNumberGenerator();
		 
		 String accountNumber = generator.generateAccountNumber();
		 

			System.out.println("");
			System.out.println("Please Create Your 6 Digit PIN Code:");
			String PIN=sc.nextLine();
			if (PIN.length()==6) {
				System.out.println("Your PIN is created");
			}
			else {
				System.out.println(" Please enter exactly 6 digits.");
	            continue;
			}
			
			
			
		 System.out.println("Account Was Created");
		 System.out.println("");
		 System.out.println("Your Personal Info: ");
		 System.out.println("");
		 System.out.println(" Name: "+userName1);
		 System.out.println(" Adress: "+ADress1);
		 System.out.println(" Age: "+Bday);
		 System.out.println(" Phone Number: "+PhNum);
		 System.out.println(" Adress: "+email);
		 System.out.println(" Account Number: " + accountNumber);
	   
 
		 
		 
		 try {
			 FileReader fileReader = new FileReader("D:\\IT file\\userINfo\\INFO.txt");
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            
			 
			FileWriter fileWriter = new FileWriter("D:\\IT file\\userINfo\\INFO.txt",true);
			BufferedWriter Writter= new BufferedWriter(fileWriter);


	                
				
					
					Writter.write("USER PERSONAL INFO LIST:");
					
					Writter.write("\nNAME OF USER: " + userName1);
					Writter.write("\nADRESS OF USER: " + ADress1);
					Writter.write("\nBIRTH DATE OF USER: " + Bday );
					Writter.write("\nPHONE NUMBER OF USER: " + PhNum);
					Writter.write("\nEMAIL OF USER: " + email);
					Writter.write("\nPIN OF USER: " + PIN);
					Writter.write("\nACCOUNT NUMBER OF USER: " + accountNumber);
					Writter.write("");
					
				 Writter.newLine(); 
		
			 bufferedReader.close();
			 Writter.close();
			 
			 System.out.println("");
			 System.out.println("LOG IN NOW");
			 System.out.println("YOUR ACCOUNT NUMBER:");
			 String ACLOG=sc.nextLine();
			 if(ACLOG == accountNumber) {
				 System.out.println("ACCOUNT NUMBER VERIFIED");
			 }
			 else {
				 System.out.println("Invalid ACCOUNT NUMBER, PLEASE ENTER YOU CORRECT ACCOUNT NUMBER");
				 continue;
			 }
			 
		System.out.println("ENTER YOUR 6 DIGIT PIN:");
		String PnLOG=sc.nextLine();
		if(PnLOG.equalsIgnoreCase(PIN) ) {
			 System.out.println("PIN IS CORRECT");
		 }
		 else {
			 System.out.println("Invalid PIN, PLEASE TRY AGAIN");
		 }
			 
			 
		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}
		
		 
		
		}		
		
	}

	
		
	public  static boolean isValidEmail(String email) {
		
		return email.contains("@") && email.contains(".");
	}	
}


