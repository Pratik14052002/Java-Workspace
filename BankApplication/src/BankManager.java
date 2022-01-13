import java.math.*;
import java.util.Scanner;
public class BankManager {
	Scanner sc=new Scanner(System.in);
	int ch; 
	int cId;
	 String cName; 
	 Account acc;
	 Address add;
	 
	
	 //int[] accNo;
	 String accName;
	 int accType;
	 double accBal;
	 
	 String ct;
	 String st;
	 String pc;
	 int n;
	 int i;
	   
	 
	public Customer[] createcustomer(int []accNo1) {
	    	
		
		System.out.println("Enter number of Account that you want:");
		n=sc.nextInt();
		Customer[] carr=new Customer[n];
	
		
		for(i=0;i<carr.length;i++)
		{
			/*
			while((random1<1)||(random1>9))
			{
				random1=(int)(Math.random()*9+1);
			}
			while((random2<1)||(random2>9))
			{
			random2=(int)(Math.random()*9+1);
			}
			while((random3<1)||(random3>9))
			{
			random3=(int)(Math.random()*9+1);
			}
			while((random4<1)||(random4>9))
			{
			random4=(int)(Math.random()*9+1);
			}

			while((random5<1)||(random5>9))
			{
				random5=(int)(Math.random()*9+1);
			}
			while((random6<1)||(random6>9))
			{
				random6=(int)(Math.random()*9+1);
			}
			int accNo[]= {random1,random2,random3,random4,random5,random6};
			*/
		System.out.println("Enter customer city:");
		System.out.println("Enter customer state:");
		System.out.println("Enter customer pincode:");
		Address a1=new Address(sc.next(),sc.next(),sc.next());
        
	/*	1. System.out.println("Accont number is:");
	    for(int i=0;i<accNo.length;i++)
	    {
		  System.out.print(accNo[i]);
		}
		*/
		System.out.println("\nEnter account Name");
		System.out.println("Enter account Balance");
	   
		Account acc1=new Account(accNo1,sc.next(),sc.nextDouble());
	   
	    System.out.println("Enter customer Id:");
		System.out.println("Enter customer Name:");
		Customer c1=new Customer(sc.nextInt(),sc.next(),acc1,a1);
		carr[i]=c1;
		}
		return carr;

	}
     /*
      * public Customer createaccount()
      
	 {
	//System.out.println("Enter number of Account that you want:");
	//n=sc.nextInt();
	//Customer carr[]=new Customer[n];
	//for(i=0;i<carr.length;i++)
	//{
	System.out.println("Enter customer Id:");
	System.out.println("Enter customer Name:");
	Customer c1=new Customer(sc.nextInt(),sc.next(),acc,add);
	System.out.println("Enter customer city:");
	System.out.println("Enter customer state:");
	System.out.println("Enter customer pincode:");
	Address a1=new Address(sc.next(),sc.next(),sc.next());
	   
	
	System.out.println("Enter account Number");
	System.out.println("Enter account Name");
	System.out.println("Enter account Balance");
    Account  acc1=new Account(sc.nextInt(),sc.next(),sc.nextInt());
   
	//carr[i]=c1;
	//}
	return c1;

}*/
	public void display(Customer[] carr,int []accNo2)
	{
		/*for(int i=0;i<carr.length;i++)
		{
		System.out.println(carr[i]);
		}*/
	
	for(int i=0;i<carr.length;i++) 
	{
	System.out.println("-----------Customer Details------------");
	System.out.println("Customer Id:"+carr[i].getCusId());
	System.out.println("Customer Name:"+carr[i].getCusName());
	//System.out.println("Account Number:"+carr[i].getAccNo());
	System.out.println("----------Account details--------------");
	System.out.println("----------Customer Address details---------------");
	System.out.println("city:"+carr[i].getAdd().getCity());
	System.out.println("State:"+carr[i].getAdd().getState());
	System.out.println("pincode:"+carr[i].getAdd().getPincode());

	
	System.out.println("Account Name:"+carr[i].getAcc().getAccName());
	System.out.println("Account Balance:"+carr[i].getAcc().getBal());
	
	
	//for(i=0;i<carr.length;i++)
	//{
		//for(int j=0;j<accNo2.length;j++)
		//{
	  //    System.out.print(accNo2[i]);
			//System.out.println(accNo2[i]);
	    //  System.out.println("\n");
		//}
		//}
	
	}
	System.out.println("Account Number is:");
	for(i=0;i<accNo2.length;i++)
	{
		System.out.print(accNo2[i]);
	}
	//for(i=0;i<carr.length;i++)
	//{
		//for(int j=0;j<accNo2.length;i++)
		//{
			//System.out.print(accNo2[i]);
			//System.out.println("\n");
		//}
	//}
	
	}	
	
	
	public Customer search(Customer[] arr,int cid)
	{
		int i=0;
	//	boolean b=false;
	Customer temp=null;
	
	for(i=0;i<arr.length;i++)
	{
		if(arr[i].getCusId()==cid)
		{
			//b=true;
			temp=arr[i];
			break;
		}
	}
	return temp;
		//return b;
   }
	public void transaction(Customer c1[])
	{int i = 0;
		Transaction tobj=new Transaction();
		 String str;
		 do {		 
		 Transaction tobj1=new Transaction();
		 double wAmount;
		 double dAmount;
			 System.out.println("\n1-withdrwal of amount\n2-Deposit of amount");
	     System.out.println("Enter your choice");
		 ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:
			 System.out.println("Enter amount to withdraw:");
			tobj1.withdrawl(c1[i].getAcc(),sc.nextDouble());
			 break;
	     
		 case 2:
			 System.out.println("Enter amount to deposit:");
			 tobj1.Deposit(c1[i].getAcc(),sc.nextDouble());
			 break;
		 
		 }
		 System.out.println("Do you want to continue enter yes");
		str=sc.next();
		 }while(str=="yes");
		 System.out.println();	
	}
	public int[] raccno() {
		
		int random1=0;
		int random2=0;
		int random3=0;
		int random4=0;
		int random5=0;
		int random6=0;
		
			while((random1<1)||(random1>9))
			{
				random1=(int)(Math.random()*9+1);
			}
			while((random2<1)||(random2>9))
			{
			random2=(int)(Math.random()*9+1);
			}
			while((random3<1)||(random3>9))
			{
			random3=(int)(Math.random()*9+1);
			}
			while((random4<1)||(random4>9))
			{
			random4=(int)(Math.random()*9+1);
			}

			while((random5<1)||(random5>9))
			{
				random5=(int)(Math.random()*9+1);
			}
			while((random6<1)||(random6>9))
			{
				random6=(int)(Math.random()*9+1);
			}
			 //accNo[]={random1,random2,random3,random4,random5,random6};
			int accNo2[]= {random1,random2,random3,random4,random5,random6};
		return accNo2;
	}
	/*public Customer[] sorting(Customer[] c1)
	{
	int i,j;
	Customer []temp=new Customer [10];
	 Customer []temp2=null;
		System.out.println("Sorting");
		for(i=0;i<c1.length;i++)
		{
			for(j=i+1;j<c1.length;i++)
			{
				if(c1[i].getCusId()<c1[i+1].getCusId())
				{
					temp[0]=c1[i+1];
					c1[i+1]=c1[i];
					c1[i]=temp[0];
				}
			}
		}
		System.out.println("Array get sorted");
		for(i=0;i<c1.length;i++)
		display(c1);
		
	}
	*/
	
	
	//public void deleteaccount()
//	{
	//	Customer temp=search(Customer arr[],int cid);
		//Account temp=m1.search
//	}
}