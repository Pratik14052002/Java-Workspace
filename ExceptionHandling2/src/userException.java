
public class userException extends Exception
{
	int n1,n2;

	public userException(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "n1 is" + n1 + " n2 is " + n2 ;
	}
	
}
