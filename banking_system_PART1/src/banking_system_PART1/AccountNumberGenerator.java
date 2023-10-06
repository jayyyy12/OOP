package banking_system_PART1;
import java.util.Random;


	interface generateAccountNumber {
	    String generateAccountNumber();
	}

	// Implement the interface with a random account number generator
	class RandomAccountNumberGenerator implements generateAccountNumber {
	    private static final int ACCOUNT_NUMBER_LENGTH = 10; // You can adjust the length as needed
	    private static final String ACCOUNT_NUMBER_CHARS = "0123456789";

	    @Override
	    public String generateAccountNumber() {
	        StringBuilder accountNumber = new StringBuilder();
	        Random random = new Random();

	        for (int i = 0; i < ACCOUNT_NUMBER_LENGTH; i++) {
	            int randomIndex = random.nextInt(ACCOUNT_NUMBER_CHARS.length());
	            char randomChar = ACCOUNT_NUMBER_CHARS.charAt(randomIndex);
	            accountNumber.append(randomChar);
	        }

	        return accountNumber.toString();
	    }
	}



