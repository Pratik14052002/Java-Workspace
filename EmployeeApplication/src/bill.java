
public class bill {
	
	private int billId;
	private String billName;
	public bill(int billId, String billName) {
		
		this.billId = billId;
		this.billName = billName;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	

}
