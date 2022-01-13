
public class InvalidBalanceExp extends Exception {
	private double balance;

	public InvalidBalanceExp(double balance) {
		
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Invalid Balance Exception " + balance + "Balance is less than 1000";
	}
}
