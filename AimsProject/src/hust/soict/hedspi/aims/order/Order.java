package hust.soict.hedspi.aims.order;
import java.util.Random;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private static int nbOrders = 0;
	
	private String dateOrdered = new String("23-3-2021");
	
	public float totalCost() {
		float total = 0;
		for(int i=0; i<itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
	public void addMedia(Media dvd1) {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
		itemsOrdered.add((DigitalVideoDisc)dvd1);
		System.out.println("da them dvd.");
		}
		else System.out.println("khong the them dvd!");
	}
	public void removeMedia (int id) {
		int k = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			if(id == itemsOrdered.get(i).getId()) {
				k = 1;
				itemsOrdered.remove(i);
			}
		}
		if(k==1) System.out.println("Da xoa!");
		else System.out.println("id khong ton tai!");
	}
 /*	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {

		if(nbOrders<MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
		}else System.out.println("da day!");

		if(nbOrders<MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
		}else System.out.println("da day!");
		
	}
	*/
	public static void updateNbOrders(){
		nbOrders++;
	}
	public static int getNbOrders() {
		return nbOrders;
	}
	private DigitalVideoDisc getAluckyItem() {
		if(itemsOrdered.size() > 0) {
			Random rand = new Random();
			int val = rand.nextInt(itemsOrdered.size());
			return (DigitalVideoDisc) itemsOrdered.get(val);
		}
		return null;
	}
	public void printOrder() {
		System.out.println("********************Order********************");
		System.out.println("Date: " + dateOrdered);
		System.out.println("Ordered Items: ");
		for(int i=0; i<itemsOrdered.size(); i++) {
			System.out.println((i+1)+". DVD - " + itemsOrdered.get(i).getId() + " - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + " - " + itemsOrdered.get(i).getCost() + "$");
		}
		if(getAluckyItem() != null) {
			System.out.println("FREE: DVD - " + getAluckyItem().getTitle() + " - " + getAluckyItem().getCategory());
			System.out.println("Total cost: " + (totalCost() - getAluckyItem().getCost()));
		}
		System.out.println("*********************************************");
	}

	
}