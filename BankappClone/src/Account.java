import java.util.Arrays;

public class Account  {
		private int[] accNo;
		 //private int []accNo;
		 private String accName;
		 private double bal;
		public Account( int[] accNo,String accName, double bal) {
			
			this.accNo = accNo;
			this.accName = accName;
			this.bal = bal;
		}
		public int[] getAccNo() {
			return accNo;
		}
		public void setAccNo(int[] accNo) {
			this.accNo = accNo;
		}
		public String getAccName() {
			return accName;
		}
		public void setAccName(String accName) {
			this.accName = accName;
		}
		public double getBal() {
			return bal;
		}
		public void setBal(double bal) {
			this.bal = bal;
		}
		@Override
		public String toString() {
			return "Account [accNo=" + Arrays.toString(accNo) + ", accName=" + accName + ", bal=" + bal
					+ ", getAccNo()=" + Arrays.toString(getAccNo()) + ", getAccName()=" + getAccName() + ", getBal()="
					+ getBal() + "]";
		}
		
}



