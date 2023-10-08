package banking_system_PART1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserInfo {
	 private List<PersonalDetails> clients;
	    private String filePath;

	    public UserInfo(String filePath) {
	        this.clients = new ArrayList<>();
	        this.filePath = filePath;
	    }

	    public void addClient(PersonalDetails client) {
	        clients.add(client);
	    }

	    public void saveToFile() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            for (PersonalDetails client : clients) {
	                writer.write(client.toString());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}