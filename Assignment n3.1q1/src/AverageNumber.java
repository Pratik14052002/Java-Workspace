import java.util.Scanner;

public class AverageNumber {
static Scanner sc=new Scanner(System.in);
	public static void Average()
	{
		int n;
		int c;
		System.out.println("Enter number:");
		n=sc.nextInt();
		if(n<0)
		{
		try {
			throw new NumberFormatException();
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
			System.out.println("Enter Natural number");
		}
		}
		else
		{
			System.out.println("Valid number");
			c=n*10;
			System.out.println("AVerage is:"+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Average();
	}

}
