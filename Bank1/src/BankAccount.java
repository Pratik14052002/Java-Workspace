
public class BankAccount {


	private int accNo;
	private String accType;
	private float balance;
	
	public BankAccount(int accNo,String accType, float balance) {
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo2) {
		this.accNo = accNo2;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
