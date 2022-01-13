
public class Customer {
	 
	private int cusId;
	private String cusName;
	private Product prod;
	public Customer(int cusId, String cusName, Product prod) {
		
		this.cusId = cusId;
		this.cusName = cusName;
		this.prod = prod;
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
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	
	
	

}
