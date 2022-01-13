import java.util.Arrays;

public class BankAccount {

	private int[] accNo;
	//private String cusName;
	private String accType;
	private float balance;
	
	public BankAccount(int[] accNo2,String accType, float balance) {
		this.accNo = accNo2;
		//this.cusName = cusName;
		this.accType = accType;
		this.balance = balance;
	}

	public int[] getAccNo() {
		return accNo;
	}

	public void setAccNo(int[] accNo2) {
		this.accNo = accNo2;
	}

	//public String getCusName() {
		//return cusName;
	//}

	//public void setCusName(String cusName) {
		//this.cusName = cusName;
	//}

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
