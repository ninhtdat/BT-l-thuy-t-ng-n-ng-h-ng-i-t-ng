
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
	public void printMyDate1() {
		System.out.println(year + "-" + month + "-" + day);
	}
	public void printMyDate2() {
		System.out.println(day + "/" + month + "/" + year);
	}
	public void printMyDate3() {
		System.out.println(day + "-" + month + "-" + year);
	}
	public void printMyDate4() {
		System.out.println(month + " " + day + " " + year);
	}
	public void printMyDate5() {
		System.out.println(month + "-" + day + "-" + year); 
	}
}
	
