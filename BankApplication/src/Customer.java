import java.math.*;
public class Customer {
    
	private int cusId;
	private String CusName;
	
	private Account acc;
	private Address add;
	public Customer(int cusId, String cusName, Account acc, Address add) {
		
		this.cusId = cusId;
		this.CusName = cusName;
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
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
