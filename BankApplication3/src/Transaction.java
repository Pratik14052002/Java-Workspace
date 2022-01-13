import java.util.Scanner;

public class Transaction {
	Scanner sc=new Scanner(System.in);
	public void withdrawl(Account acc,double amount)
	{
 		double bal=acc.getBal()-amount;
 		acc.setBal(bal);
 		
	}
	public void  Deposit(Account acc,double amount)
	{
		double bal=acc.getBal()+amount;
		acc.setBal(bal);
		
	}

}
