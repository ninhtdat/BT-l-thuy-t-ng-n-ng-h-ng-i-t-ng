
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public int qtyOrdered = 0;
	private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
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
	
}