package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	public String printInfo() {
		return "ke thua cua Media";
	}
	Book(String title) {
		super(title);
	}
	Book(String title, String category) {
		super(title, category);
	}
	Book(String title, String category, ArrayList<String> authors) {
		super(title, category);
		this.authors = authors;
	}
	
}
