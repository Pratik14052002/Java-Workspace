
public class NumberException extends Exception{
	int n1,n2;

	public NumberException(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public String toString() {
		if(n1==0)
		{
			return "n1 is" + n1 + " Exception" ;			
		}
		else {
			return "n2 is" + n2 + " Exception" ;
		}
		
	}

}
