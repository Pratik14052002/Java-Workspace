
public class InvalidBalance extends Exception  {
	private int  bal;

	public InvalidBalance(int bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "InvalidBalance [bal=" + bal + "]";
	}
	

}
