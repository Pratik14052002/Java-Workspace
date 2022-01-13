public class Account 
{
	private Double Accno;
	private String Acctype;
	private Double bal;
	public Account(Double accno, String acctype, Double bal) {
		super();
		Accno = accno;
		Acctype = acctype;
		this.bal = bal;
	}
	public Double getAccno() {
		return Accno;
	}
	public void setAccno(Double accno) {
		Accno = accno;
	}
	public String getAcctype() {
		return Acctype;
	}
	public void setAcctype(String acctype) {
		Acctype = acctype;
	}
	public Double getBal() {
		return bal;
	}
	public void setBal(Double bal) {
		this.bal = bal;
	}
	
}
