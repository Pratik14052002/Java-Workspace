
public class Customer {
	private int cusId;
	private String cusName;
	private String cusMob;
	private Product prod;
	private Address add;
	public Customer(int cusId, String cusName, String cusMob, Product prod,Address add) 
	{
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusMob = cusMob;
		this.prod = prod;
		this.add = add;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusMob() {
		return cusMob;
	}
	public void setCusMob(String cusMob) {
		this.cusMob = cusMob;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	

}
