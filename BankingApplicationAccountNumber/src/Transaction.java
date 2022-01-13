import java.util.Scanner;

public class Transaction {
	

	Scanner sc=new Scanner(System.in);
	public void deposit(float balance,Customer[] carr,int accno,float dbal)
	{
		//float dbal;
		int i;		
		
	//	for(i=0;i<carr.length;i++)
		//{
			//do {
				//System.out.println("");
				//System.out.println("Enter your choice:");
				//ch=sc.nextInt();			
				//if(carr[i].getAcc().getAccNo()==accno) {
					//System.out.println("Enter Amount of Balance do you you want to Deposit:");
					//dbal=sc.nextFloat();
					//balance=dbal+balance;
					//carr[i].getAcc().setBalance(balance);
					//break;
				//}
				//else {
					//System.out.println("Enter valid accoint number");
				//}
		for(i=0;i<carr.length;i++)
		{
			balance=balance+dbal;
			carr[i].getAcc().setBalance(balance);
		    break;
		}
				
			 //  }while(i<=barr.length-1);
			//System.out.println("Thank you");
		//}
	   }
	public void withdrawl(float balance,Customer[] carr,int accno,float wbal)
	{
		//float wbal;
		int i;
		
	
 	    //balance=balance-wbal;
 		
 			//System.out.println("Enter account number for deposit of amount");
			//accno=sc.nextInt();
			
				//System.out.println("Enter Amount of Balance do you you want to Deposit:");
				//wbal=sc.nextFloat();
				for(i=0;i<carr.length;i++)
				{
					balance=balance-wbal;
					carr[i].getAcc().setBalance(balance);
				    break;
				}
 	            
			
			
 		}
	
}
 		

