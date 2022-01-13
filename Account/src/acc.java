
public class acc {

		private int accno;
		private String cname;
		private double bal;
		public acc(int accno, String cname, double bal) {
			super();
			this.accno = accno;
			this.cname = cname;
			this.bal = bal;
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public double getBal() {
			return bal;
		}
		public void setBal(double bal) {
			this.bal = bal;
		}
		
}
