package banking_system_PART1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteStorage {
	 private final int capacity;
	    private final List<String> notes;

	    public NoteStorage(int capacity) {
	        this.capacity = capacity;
	        this.notes = new ArrayList<>();
	    }

	    public void addNote(String note) {
	        if (notes.size() >= capacity) {
	            // Delete the oldest note if the notepad is full
	            notes.remove(0);
	        }
	        notes.add(note);
}
}