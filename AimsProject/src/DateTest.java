
public class DateTest {
	public static void main(String[] args) {
	MyDate date = new MyDate("29th", "February", "2020");
	date.printMyDate();
	//
	date = new MyDate("03", "02", "1930");
	date.printMyDate1();
	//
	MyDate date1 = new MyDate("11", "8", "2020");
	MyDate date2 = new MyDate("12", "8", "2020");
	System.out.println(DateUtils.compareDate(date1, date2));
	//
	MyDate[] listDate = new MyDate[3];
	listDate[0] = new MyDate("13", "8", "2020");
	listDate[1] = new MyDate("11", "8", "2020");
	listDate[2] = new MyDate("12", "8", "2020");
	System.out.println("trc khi sap xep: ");
	for(int i = 0; i<listDate.length ; i++)
		listDate[i].printMyDate2();
	listDate = DateUtils.sortDate(listDate);
	System.out.println("sau khi xap xep: ");
	for(int i = 0 ; i<listDate.length ; i++)
		listDate[i].printMyDate2();
	}
}
