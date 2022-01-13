import java.math.*;
import java.util.Scanner;
import java.math.*;
public class BankInfo {

	Scanner sc=new Scanner(System.in);
	//int[] accNo=new int[6];
	//int accNo;
	String cusName;
	String accType;
	float balance;
	
	int cusId;
	String CusName;
		
	String state;
	String city;
	String pincode;
	
	int n,i;
	int random1=0;
	int random2=0;
	int random3=0;
	int random4=0;
	int random5=0;
	int random6=0;
	int accNo2[]=new int[6];
	BankAccount acc;
	 public void createAccount()
	{   
		System.out.println("------Creating Account-------");
        System.out.println("Enter Number of Customer that you want:");
        n=sc.nextInt();
		//BankAccount[] barr=new BankAccount[n];
		Customer[] carr=new Customer[n];
        for(i=0;i<carr.length;i++)
		{

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
    		//int accNo2[]= {random1,random2,random3,random4,random5,random6};
    		
    		accNo2[0]=random1;
    		accNo2[1]=random2;
    		accNo2[2]=random3;
    		accNo2[3]=random4;
    		accNo2[4]=random4;
    		accNo2[5]=random4;
    		
    		//for(int i=0;i<6;i++)
    		//{
    			//System.out.println("Account number"+accNo2[i]);
    		//}
			System.out.println("Enter Customer Details");
			System.out.println("Enter Cutomer Id:");
			cusId=sc.nextInt();
			System.out.println("Enter Cutomer Name:");
			cusName=sc.next();
			
			System.out.println("Enter Cutomer Address:");
			System.out.println("Enter State:");
			state=sc.next();
			System.out.println("Enter City:");
			city=sc.next();
			System.out.println("Enter pincode:");
			pincode=sc.next();
			Address add=new Address(state,city,pincode);
			
			System.out.println("Enter Account Details");
			//System.out.println("Enter Account Number:");
			//accNo=sc.nextInt();
			//raccno(carr);
			//System.out.println("Enter Customer Name:");
			//cusName=sc.next();
			System.out.println("ENter Account Type");
			accType=sc.next();
			System.out.println("ENter Account Balance");
			balance=sc.nextFloat();
			
			
			//BankAccount boj=new BankAccount(accNo,cusName,accType,balance);
			Customer cobj=new Customer(cusId,cusName,acc,add);
			//barr[i]=boj;	
			carr[i]=cobj;
			for(i=0;i<carr.length;i++)
			{
				 //acc=new BankAccount(accNo2[i],accType,balance);
			     carr[i].getAcc().setAccNo(accNo2);
			     System.out.println(carr[i].getAcc().getAccNo());
			     break;
			}
			
		}
		//return barr;
		//deposit(balance,barr);
       // displayAccount(carr,carr[i].getAcc().getAccNo());
		//displayAccount(carr,accNo2);
	}
	 public void displayAccount(Customer[] carr)
	 {
		 System.out.println("Account is Created");
		 for(i=0;i<carr.length;i++)
		 {
			 System.out.println("Customer Details");
			 System.out.println("Customer Id:"+carr[i].getCusId());
			 System.out.println("Customer Name:"+carr[i].getCusName());
			 System.out.println("State:"+carr[i].getAdd().getState());
			 System.out.println("City:"+carr[i].getAdd().getPincode());
			 System.out.println("Pincode:"+carr[i].getAdd().getPincode());
			 System.out.println("Account details");
			
				// System.out.println(carr);
			
			 
			// System.out.println("Customer Name:"+carr[i].getAcc().getAccName());
			 System.out.println("Account Type:"+carr[i].getAcc().getAccType());
			 System.out.println("Account Balance:"+carr[i].getAcc().getBalance());
		 }
		 System.out.println("Account number is:");
		 //for(i=0;i<accNo2.length;i++)
			//{
				//System.out.println(carr[i].getAcc().getAccNo());
			 //System.out.println(accNo2[i]);
			///}	
	 
	 }
	 public void searchAccount(Customer[] carr)
	 {
		 int[] accno=new int[6];
		 System.out.println("Enter Account Number That you want to Search:");
		 for(i=0;i<6;i++)
		 {
			 accno[i]=sc.nextInt();
		 }
		
		 for(int i=0;i<carr.length;i++)
		 {
			 if(carr[i].getAcc().getAccNo()==accno)
			 {
				 System.out.println("Account found"+carr[i].getAcc().getAccNo());
				 displayAccount(carr);
			 }
			 else {
				 System.out.println("Renter Correct Account Number");
				 
				 for(i=0;i<6;i++)
				 {
					 accno[i]=sc.nextInt();
				 }
				 
				
				 for(int j=0;i<carr.length;j++)
				 {
					 if(carr[j].getAcc().getAccNo()==accno)
					 {
						 System.out.println("Account found");
						 break;
						 
					 }
					 else {
						 System.out.println("Renter Correct Account Number");
					 }
				 }
				 
			 }
		 }
			 
		 
	 }
	public void transaction(Customer[] carr)
	{
		int i=0,ch;
		String str1="yes";
		Transacation  tobj=new  Transacation ();
		
		 do {
			 System.out.println("\n1-Deposit Amount\n2-Withdrawl of Amount");
			 System.out.println("Enter your Choice:");
			 ch=sc.nextInt();
			 switch(ch)
			 {
			 case 1:
				 tobj.deposit(carr[i].getAcc().getBalance(),carr);
				 break;
			 case 2:
				 break;
			 default:
				 System.out.println("Enter valid choice");
				 str1=sc.next();
				 break;
				 
			 }
			 System.out.println("Do you want to continue enter yes:");
		 }while(sc.next()==str1);
		 System.out.println("Thank you");
		 
	}
public void raccno(Customer[] carr) {
		
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
		for(int i=0;i<carr.length;i++)
		{
		//	carr[i].getAcc().setAccNo(accNo2);
		}
			
	}
	//public void withdraw()
	//{
		
	//}
	//public void getBalance()
	//{
		
	//}

}
