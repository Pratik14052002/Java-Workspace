
public class Exception2ex extends Exception{
	int n1;
	int n2;
	public Exception2ex(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "Exception2ex n1 is 0" + n1 + "or n2  is 0" + n2 ;
	}
	
	

}
