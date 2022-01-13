import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in); 
		int n,cnt=0;
		int i;
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				cnt++;	
			}
		}
		System.out.println("Number of even number is:"+cnt);
	}

}
