package hust.soict.hedspi.aims.utils;


public class MyDate {
	private String day;
	private String month;
	private String year;
	public MyDate(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void printMyDate() {
		System.out.println(month + " " + day + " " + year);	
	}
	public void printMyDate(String type) {
		switch(type) {
			case "yyyy-MM-dd":
				System.out.println(year + "-" + month + "-" + day);
				break;
			case "d/M/yyyy":
				System.out.println(day + "/" + month + "/" + year);
				break;
			case "dd-MMM-yyyy":
				System.out.println(day + "-" + month + "-" + year);
				break;
			case "MMM d yyyy":
				System.out.println(month + " " + day + " " + year);
				break;
			case "mm-dd-yyyy":
				System.out.println(month + "-" + day + "-" + year);
				break;
		}
	}
}