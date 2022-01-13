import java.util.Scanner;

public class CalculationThread implements Runnable     {
	Scanner sc=new Scanner(System.in);
	private Calculation c;
	int ch;
	int sum;
	int sub;
	public CalculationThread(Calculation c) {
		this.c = c;
		new Thread(this).start();
		
	}
	

	public void run() {
		
		do {
			System.out.println("1-add\n2-sub\n");
			System.out.println("ENter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				sum=c.getsum();
				System.out.println("Addition is:"+sum);
				
				break;
			case 2:
				sub=c.getsub();
				System.out.println("Substraction is:"+sub);
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
		System.out.println("DO you want to continue press 1:");
		ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you");
		 
		
	}
}
