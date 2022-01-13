
public class Customer {

	private int cusId;
	private String CusName;
	private BankAccount acc;
	private Address add;
	public Customer(int cusId, String cusName, BankAccount acc, Address add) {
		this.cusId = cusId;
		CusName = cusName;
		this.acc = acc;
		this.add = add;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return CusName;
	}
	public void setCusName(String cusName) {
		CusName = cusName;
	}
	public BankAccount getAcc() {
		return acc;
	}
	public void setAcc(BankAccount acc) {
		this.acc = acc;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

}
