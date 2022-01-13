import java.util.Scanner;

public class BankInfo {

	Scanner sc=new Scanner(System.in);
	int accNo;
	String cusName;
	String accType;
	float balance;
	
	int cusId;
	String CusName;
	
    String state;
	String city;
    String pincode;
	
    int n,i;
	 
    public Customer[] createAccount()
	{   
		System.out.println("------Creating Account-------");
        System.out.println("Enter Number of Account that you want:");
        n=sc.nextInt();
		Customer[] carr=new Customer[n];
		for(i=0;i<n;i++)
		{
			System.out.println("------Enter Customer Details------");
			System.out.println("Customer Id:");
			cusId=sc.nextInt();
			System.out.println("Customer Name:");
			cusName=sc.next();
			
			System.out.println("------Enter Customer Address Details------");
			System.out.println("Enter Customer State:");
			state=sc.next();
			System.out.println("Enter Customer State:");
			city=sc.next();
			System.out.println("Enter Customer Pincode:");
			pincode=sc.next();
		    Address add=new Address(state,city,pincode);
			
			
			System.out.println("------Enter Account Details------");
			System.out.println("Enter Account Number:");
			accNo=sc.nextInt();
			System.out.println("ENter Account Type");
			accType=sc.next();
			System.out.println("ENter Account Balance");
			balance=sc.nextFloat();
			BankAccount acc=new BankAccount(accNo,accType,balance);
			
			Customer cobj=new Customer(cusId,cusName,acc,add);
			carr[i]=cobj;	
		}
		return carr;
		//deposit(balance,barr);
		
	}
	 public void displayAccount(Customer[] carr)
	 {
		 System.out.println("Account is Created");
		 for(i=0;i<carr.length;i++)
		 {
			 System.out.println("------Customer Details------");
			 System.out.println("Customer Id:"+carr[i].getCusId());
			 System.out.println("Customer Name:"+carr[i].getCusName());
			 
			 System.out.println("------Customer Address Details------");
			 System.out.println("Customer State:"+carr[i].getAdd().getCity());
			 System.out.println("Customer City:"+carr[i].getAdd().getState());
			 System.out.println("Pincode:"+carr[i].getAdd().getPincode());
			 
			 System.out.println("------Customer Account Details------");
			 System.out.println("Accouunt Number:"+carr[i].getAcc().getAccNo());
			 System.out.println("Accouunt Type:"+carr[i].getAcc().getAccType());
			 System.out.println("Accouunt Balance:"+carr[i].getAcc().getBalance());
			 
		 }
	 }
	 public void searchAccount(Customer[] carr)
	 {
		 int accno;
		 System.out.println("Enter Account Number That you want to Search:");
		 accno=sc.nextInt();
		 for(int i=0;i<carr.length;i++)
		 {
			 if(carr[i].getAcc().getAccNo()==accno)
			 {
				 System.out.println("Account found"+carr[i].getAcc().getAccNo());
				 displayAccount(carr);
			 }
			 else {
				 System.out.println("Renter Correct Account Number");
				 accno=sc.nextInt();
				 for(int j=0;i<=carr.length;j++)
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
		int i=0,ch=0;
		//String str1="yes";
		 Transaction tobj=new  Transaction();
		
		 do {
			 System.out.println("\n1-Deposit Amount\n2-Withdrawl of Amount");
			 System.out.println("Enter your Choice:");
			 ch=sc.nextInt();
			 int accno;
			 float dbal;
			 float wbal;
			 switch(ch)
			 {
			 case 1:
				 System.out.println("Enter account number for deposit of amount");
				 accno=sc.nextInt();
				 System.out.println("Enter Amount for deposit");
				 dbal=sc.nextFloat();
				 //for(i=0;i<carr.length;i++)
			 		//{
				while(i<carr.length)
				{
					 if(carr[i].getAcc().getAccNo()==accno)
				 {
					 System.out.println("Enter Amount for deposit in account");
					 wbal=sc.nextFloat();
					 tobj.deposit(carr[i].getAcc().getBalance(),carr,accno,dbal);
					
				 }
				 
				 else {
						System.out.println("Enter valid account number");
					}
				 i++;
			 	}
				 
				 //tobj.deposit(carr[i].getAcc().getAccNo(), carr, accno, dbal);
				// break;
			 case 2:
				 System.out.println("Enter account number for Withdraw of amount");
				 accno=sc.nextInt();
				for(i=0;i<carr.length;i++)
			   {
				 if(carr[i].getAcc().getAccNo()==accno)
				 {
					 System.out.println("Enter Amount for Withdraw");
					 wbal=sc.nextFloat();
					 tobj.withdrawl(carr[i].getAcc().getBalance(),carr,accno,wbal);
					 
				 }
				
				   else 
				    {
						System.out.println("Enter valid accoint number");
				     }
				 break;
			 	}
				
				
				 default:
				 System.out.println("Enter valid choice");
			     break;
				 
			 }
			 System.out.println("Do you want to continue press 1:");
			 ch=sc.nextInt();
		 }while(ch==1);
		 System.out.println("Thank you");
		 
	}
	//public void withdraw()
	//{
		
	//}
	//public void getBalance()
	//{
		
	//}

}
