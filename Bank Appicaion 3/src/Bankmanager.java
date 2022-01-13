import java.util.Scanner;

public class Bankmanager 
{   int n;
    Scanner sc=new Scanner(System.in);
	public void Create()
	{
		System.out.println("Enter  number of customer");
		n=sc.nextInt();
		Custmer []c=new Custmer[n];
		Account accobj=null;
		Address addobj=null; //("pune","Maharashtra","412208");
		Custmer cobj=new Custmer(10,"Pratik", addobj, accobj);
		
	}
}
