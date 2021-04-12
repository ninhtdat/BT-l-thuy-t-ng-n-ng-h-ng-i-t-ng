package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	public String printInfo() {
		return "ke thua Media";
	}
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		super(id ,title, category, cost);
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	

	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public boolean search(String title) {
		String str = title.toLowerCase();
		for(String w:str.split("\\s",0)) {
			if((this.title.toLowerCase()).contains(w) == false)
				return false;
		}
		return true;
	}
}