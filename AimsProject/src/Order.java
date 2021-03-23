
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 3;
	private int qtyOrdered = 0;
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private String MyDate = new String("23-3-2021");
	private static int nbOrders = 0;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(nbOrders<MAX_NUMBERS_ORDERED) {
			itemsOrdered[nbOrders] = disc;
			qtyOrdered++;
			nbOrders++;
		}else System.out.println("da day!");
	}
	public DigitalVideoDisc removeDigitalVideoDisc(DigitalVideoDisc disc) {
		return null;
	}
	public float totalCost() {
		float total = 0;
		for(int i=0; i<qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {

		if(nbOrders<MAX_NUMBERS_ORDERED) {
			itemsOrdered[nbOrders] = dvd1;
			qtyOrdered++;
			nbOrders++;
		}else System.out.println("da day!");

		if(nbOrders<MAX_NUMBERS_ORDERED) {
			itemsOrdered[nbOrders] = dvd2;
			qtyOrdered++;
			nbOrders++;
		}else System.out.println("da day!");
		
	}
	public void printOrder() {
		System.out.println("********************Order********************");
		System.out.println("Date: " + MyDate);
		System.out.println("Ordered Items: ");
		for(int i=0; i<nbOrders; i++) {
			System.out.println((i+1)+". DVD - "+ itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*********************************************");
	}
	
}