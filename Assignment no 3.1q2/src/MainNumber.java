import java.util.Scanner;

public class MainNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int ch = 0;
		int n1,n2;
		System.out.println("Enter n1");
		n1=sc.nextInt();
		System.out.println("Enter n2");
		n2=sc.nextInt();
		//NumberException number= new NumberException(n1, n2);
		if(n1==0||n2==0)
		{
			try {
				throw new NumberException(n1, n2);
			}
			catch(NumberException ex)
			{
				System.out.println(ex);
			}
			
		}
		else {

		do {
			System.out.println("\n1-add\n2-sub\n3-sub");
			System.out.println("ENter your choice:");
			ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
				int add=n1+n2;
				System.out.println("Addition is:"+add);

				break;
			case 2:

				int sub=n1-n2;
				System.out.println("Addition is:"+sub);

				break;
			case 3:

				int div=n1/n2;
				System.out.println("Addition is:"+div);

				break;	
			default:
				System.out.println("Enter valid choice");
				break;
			}
			System.out.println("DO you want to continue press 1:");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you");

		}
	}
	}

