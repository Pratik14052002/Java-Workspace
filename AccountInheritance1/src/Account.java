
public class Account {
	private int accNo;
	private String custName;
	private double accBal;
	public Account(int accNo, String custName, double accBal) {
		
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", custName=" + custName + ", accBal=" + accBal + ", getAccNo()="
				+ getAccNo() + ", getCustName()=" + getCustName() + ", getAccBal()=" + getAccBal() + "]";
	}
//	@Override
//	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		Account acc=(Account)obj;
//		System.out.println("we are comparing"+acc.getAccNo()+"with"+this.getAccNo());
//		if(this.getAccNo()==acc.getAccNo())
//		{
//			return true;
//		}
//		return false;
		// super.equals(obj);
//}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Thank you here  calling finalize method by garbage collection");
	}


}
