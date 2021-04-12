package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;
import java.util.Scanner;

public class Aims {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation","Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation","A", 87, 18.99f);
		anOrder.addMedia(dvd3);

/*		for(int i = 0; i<10; i++) {
			if(Order.getNbOrders() < Order.MAX_LIMITTED_ORDERS) {
				Order Order1 = new Order();
				Order.updateNbOrders();
			}
			else System.out.println("khong the tao them order!");
		}		

		//
		//anOrder.addDigitalVideoDisc(dvd1, dvd2);
		/*System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		//
		System.out.println(dvd1.getCost());
		dvd1 = anOrder.removeDigitalVideoDisc(dvd1);
		if(dvd1 != null)
		System.out.println(dvd1.getCost());
		else
		System.out.println("da xoa!");
		*/
//		anOrder.printOrder();
	//
		Scanner keyboard = new Scanner(System.in);
		int key = -1;
		while(key != 0) {
			System.out.println("---");
			showMenu();
			key = keyboard.nextInt();
			switch(key) {
			case 0:
				System.exit(0);
			case 1: 
				if(Order.getNbOrders() < Order.MAX_LIMITTED_ORDERS) {
					anOrder = new Order();
					Order.updateNbOrders();
					System.out.println("tao order thanh cong.");
				}
				else System.out.println("khong the tao them order!");
				break;
			case 2:{
				System.out.println("1.DVD - 4 - Inception - Action - 333.95$");
				System.out.println("2.DVD - 5 - Inception - Action Movie - 333.95$");
				System.out.println("3.DVD - 6 - Inception - Action Movie - 333.95$");
				System.out.println("4.DVD - 7 - Inception - Action Movie - 333.5$");
				System.out.println("5.DVD - 8 - Die Hard - Action Movie - 222.95$");
				System.out.print("ban chon dvd: ");
				int num = keyboard.nextInt();
				switch(num) {
				case 1:
					DigitalVideoDisc dvd = new DigitalVideoDisc( 4, "Inception", "Action", "Christopher Nolan", 66, 333.95f);
					anOrder.addMedia(dvd);
					break;
				case 2:
					dvd = new DigitalVideoDisc(5, "Inception", "Action Movie", "Christopher", 66, 333.95f);
					anOrder.addMedia(dvd);
					break;
				case 3:
					dvd = new DigitalVideoDisc(6, "Inception", "Action Movie", "Christopher Nolan", 6, 333.95f);
					anOrder.addMedia(dvd);
					break;
				case 4:
					dvd = new DigitalVideoDisc(7, "Inception", "Action Movie", "Christopher Nolan", 66, 333.5f);
					anOrder.addMedia(dvd);
					break;
				case 5:
					dvd = new DigitalVideoDisc(8, "Die Hard", "Action Movie", "John McTiernan", 55, 222.95f);
					anOrder.addMedia(dvd);
					break;
				default: System.out.println("ERROR!");
					break;
				}
			}
				break;
			case 3: 
				System.out.println("nhap id item ban muon xoa:");
				int deleteId = keyboard.nextInt();
				anOrder.removeMedia(deleteId);
				break;
			case 4:
				anOrder.printOrder();
				break;
			default:	
				System.out.println("ERROR!");
			}
		}
		keyboard.close();
	}	
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("-----------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("-----------------------------");
		System.out.println("plase choose a number: 0-1-2-3-4");
	}
}	