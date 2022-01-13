
public class Custmer 
{
private int custId;
private String custName;
private Address add;
private Account acc;
public Custmer(int custId, String custName, Address add, Account acc) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.add = add;
	this.acc = acc;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public Account getAcc() {
	return acc;
}
public void setAcc(Account acc) {
	this.acc = acc;
}

}
