
public class Invalidqty extends Exception {
	private int qty;

	public Invalidqty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Invalidqty " + qty ;
	}
	

}
