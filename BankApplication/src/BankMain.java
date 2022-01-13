import java.util.Scanner;
public class BankMain
{
	public static void main(String[] args)
	{
		
	    int ch=0;
		//int accno;
		String cname;
		int bal=0 ;
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int accNo1[] = null;
	
		//Customer c1[]=null;
		Customer[] c1 = null;
		do
		{		
		System.out.println("\n1-Create account\n2-Display account\n3-Search account\n4-Transaction\n5-random acc");
		System.out.println("ENter your choice:");
		ch=sc.nextInt();
		
		BankManager m1=new BankManager();
        
		 if(ch==1) 
		{
		  int []accNo2=m1.raccno();
		  // accNo1[]=new int[accNo2.length];
		  accNo1=accNo2;
	      c1=m1.createcustomer(accNo1);
	      flag++;
		}
		else if(ch==2)
		{
			
			if(flag!=0) {
				m1.display(c1,accNo1);	
			}
			else {
				System.out.println("Create customer");
				
			}
			
		}
		else if(ch==3){
		
		int element;
		int cid;
		System.out.println("Enter account number that you want to search:");
		Customer temp=null;
		//boolean b=m1.search(a1,sc.nextInt());
	    temp=m1.search(c1,sc.nextInt());
		//boolean b=m1.search(a1,sc.nextInt());
	    System.out.println("Account found");
	    System.out.println("Customer Id is:"+temp.getCusId());
	    System.out.println("Customer Name is:"+temp.getCusName());
	    System.out.println("Customer city is:"+temp.getAdd().getCity());
	    System.out.println("Customer State is:"+temp.getAdd().getState());
	    System.out.println("Customer Pincose is:"+temp.getAdd().getPincode());
		//System.out.println("Account  number is:"+temp.getAcc().getAccNo());
		System.out.println("Account  name is:"+temp.getAcc().getAccName());
		System.out.println("Account  balance is:"+temp.getAcc().getBal());
		
		}
		else if(ch==4)
		 {
			 m1.transaction(c1);
		 }
		else if(ch==5)
		{
			int []accNo=m1.raccno();
		}
		 
		 //	if(b)
	   // {
		//	System.out.println("Account found");
	//	}
		//else
		//{
			//System.out.println("Account not found");
		//}
		//else if(ch==4)
		//{
			//m1.transaction(bal);
		//}
	System.out.println("\n");
    System.out.println("Do you want to continue press 1:");
    ch=sc.nextInt();  		
   }while(ch==1);
 System.out.println("----Thank you----");
}		
}