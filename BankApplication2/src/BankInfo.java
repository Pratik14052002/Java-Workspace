import java.util.Scanner;
import javax.print.attribute.IntegerSyntax;
public class BankInfo {
	 Scanner sc=new Scanner(System.in);
	 
	 int cId;
	 String cName; 
	 Account acc;
	 Address add;
	 
	 int accNo;
     String accName;
	 String accType;
	 double accBal;
	 
	 String ct;
	 String st;
	 String pc;
	
	 int i=0;
	int n;
		
	 
	
	Customer arr[]=null;
	 
	 
	 public Customer[] create()
	 {
		    System.out.println("Enter number of Account ");
		    n=sc.nextInt();
			
			Customer[] ar =new Customer[n];
			 
		 
		for(i=0;i<ar.length;i++)
		{
			System.out.println("ENter customer Id:");
			cId=sc.nextInt();
			System.out.println("Enter Customer NAme:");
			cName=sc.next();
			System.out.println("Enter Account Number:");
			accNo=sc.nextInt();
			System.out.println("Enter Account Name:");
			accName=sc.next();
			System.out.println("Enter Account Type:");
			accType=sc.next();
			System.out.println("Enter Account Balance:");
			accBal=sc.nextInt();
			Account ac=new Account(accNo,accName,accType,accBal);
			Address ad=new Address(ct,st,pc);
			
			Customer cus=new Customer(cId,cName,ac,ad);
			ar[i]=cus;
		}
			
			return ar;		
		}
		
		

	 public void display(Customer[] cus)
	 {
	
		 for (Customer c : cus)
		 {
			 System.out.println("-------Customer details-------");
			 System.out.println("Customer Id:"+c.getCusId());
			 System.out.println("Customer Name:"+c.getCusName());
			 System.out.println("-------Account details-------");
			 System.out.println("Account Name:"+c.getAcc().getAccNo());
			 System.out.println("Account Number:"+c.getAcc().getAccName());
			 System.out.println("Account Type:"+c.getAcc().getAccType());
			 System.out.println("Account Balance:"+c.getAcc().getAccBal());
			 System.out.println("-------Customer address  details-------");
			 System.out.println("City Name:"+c.getAdd().getCity());
			 System.out.println("State Name:"+c.getAdd().getState());
			System.out.println("Pincode:"+c.getAdd().getPincode());
			

		 }
		 /*
		 for(i=0;i<cus.length;i++)
		 {
		 System.out.println("-------Customer details-------");
		 System.out.println("Customer Id:"+cus[i].getCusId());
		 System.out.println("Customer Name:"+cus[i].getCusName());
		 System.out.println("-------Account details-------");
		 System.out.println("Account Name:"+cus[i].getAcc().getAccNo());
		 System.out.println("Account Number:"+cus[i].getAcc().getAccName());
		 System.out.println("Account Type:"+cus[i].getAcc().getAccType());
		 System.out.println("Account Balance:"+cus[i].getAcc().getAccBal());
		 System.out.println("-------Customer address  details-------");
		// System.out.println("City Name:"+cus[i].getAcc().getCity());
		// System.out.println("State Name:"+cus[i].getAcc().getState());
		// System.out.println("Pincode:"+cus[i].getAcc().getPincode());
		
		 }
		 */
		 //System.out.println("");
	 }
}
