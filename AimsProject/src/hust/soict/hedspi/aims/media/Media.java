package hust.soict.hedspi.aims.media;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	protected int id;
	public abstract String printInfo();
	Media(String title) {
		this.title = title;
	}
	Media(String title, String category) {
		this(title);
		this.category = category;
	}
	Media(int id, String title, String category, float cost) {
		this(title, category);
		this.cost = cost;
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
