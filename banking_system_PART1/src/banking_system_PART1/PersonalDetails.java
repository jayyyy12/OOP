package banking_system_PART1;
import java.util.Scanner;
public class PersonalDetails {
	public String FULLname,Adress;
//    public String Adress;
    public int Age,PhoneNum;
//    public int PhoneNum;
    
    
    Scanner sc=new Scanner(System.in);
    
    public PersonalDetails(String FULLname,String Adress) {
    	this.FULLname = FULLname;
        this.Adress = Adress;
        
       

    }
    	PersonalDetails(int Age, int PhoneNum) {
    	this.Age = Age;
    	this.PhoneNum = PhoneNum;
    	
        
    }

	public String getName() {
		return FULLname;
	}  
	public String getAdress() {
		return Adress;
	}  
	
	public  static boolean isValidEmail(String email) {
		
		return email.contains("@") && email.contains(".");
	}	
	
}
