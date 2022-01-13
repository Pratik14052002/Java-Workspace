
public class Product {

	private int proId;
	private String proName;
	private int proPrice;
	private int proQty;
	public Product(int proId, String proName, int proPrice, int proQty) {
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proQty = proQty;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getProQty() {
		return proQty;
	}
	public void setProQty(int proQty) {
		this.proQty = proQty;
	}
	
	
	
}
