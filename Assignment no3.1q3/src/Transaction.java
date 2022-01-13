import java.util.Scanner;
public class Transaction {

	Scanner sc=new Scanner(System.in);
	public void deposit(float balance,Customer[] carr)
	{
		float dbal;
		int i,ch=0;
		int accno;
		
		for(i=0;i<carr.length;i++)
		{
			//do {
				//System.out.println("");
				//System.out.println("Enter your choice:");
				//ch=sc.nextInt();
				
				System.out.println("Enter account number for deposit of amount");
				accno=sc.nextInt();
				if(carr[i].getAcc().getAccNo()==accno) {
					System.out.println("Enter Amount of Balance do you you want to Deposit:");
					dbal=sc.nextFloat();
					balance=dbal+balance;
					carr[i].getAcc().setBalance(balance);
					break;
				}
				
				
			 //  }while(i<=barr.length-1);
			//System.out.println("Thank you");
		}
	   }
	public void withdrawl(float balance,Customer[] carr)
	{
		float wbal;
		int i;
		float accno;
		System.out.println("Enter Amount that you want to withdraw from your Account:");
		wbal=sc.nextFloat();
 	    balance=balance-wbal;
 		for(i=0;i<carr.length;i++)
 		{
 			System.out.println("Enter account number for deposit of amount");
			accno=sc.nextInt();
			if(carr[i].getAcc().getAccNo()==accno) {
				System.out.println("Enter Amount of Balance do you you want to Deposit:");
				wbal=sc.nextFloat();
				balance=balance-wbal;
				carr[i].getAcc().setBalance(balance);
				break;
			}
			
 		}
 		
	}
}
