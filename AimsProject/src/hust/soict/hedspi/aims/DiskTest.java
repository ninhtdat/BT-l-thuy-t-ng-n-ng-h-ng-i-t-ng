package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;


public class DiskTest {
	public static void main(String[] args) {
		Order anOrder = new Order();
//		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation","Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation","A", 87, 18.99f);
		anOrder.addMedia(dvd3);

		anOrder.printOrder();
		System.out.println(dvd1.search("king liON"));
		}
}	