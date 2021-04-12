package hust.soict.hedspi.aims.utils;

public class DateUtils {
	public static int compareDate(MyDate date1, MyDate date2) {
		// dinh dang: 18 11 2021
		//date1 > date2 return 1;
		//date1 == date2 return 0;
		//date1 < date2 return -1;
		int k = (date1.getYear()).compareTo((date2.getYear()));
		if(k>0) return 1;
		else if(k<0) return -1;
		else if(k==0) {
			k = (date1.getMonth()).compareTo((date2.getMonth()));
			if(k>0) return 1;
			else if(k<0) return -1;
			else if(k==0) {
				k = (date1.getDay()).compareTo((date2.getDay()));
				if(k>0) return 1;
				else if(k<0) return -1;
				else if(k==0) return 0;
			}
		}
	return 0;
	}
	public static MyDate[] sortDate(MyDate[] listMyDate) {
		MyDate temp = new MyDate(null, null, null);
		for(int i=0; i< listMyDate.length - 1; i++) {
			for(int j = i+1; j < listMyDate.length ; j++) {
				if(compareDate(listMyDate[i], listMyDate[j]) == 1) {
					temp = listMyDate[i];
					listMyDate[i] = listMyDate[j];
					listMyDate[j] = temp;
				}
			}
		}
		return listMyDate;
	}
}
