package welcome;

import java.util.Scanner;

public class eMployeeManager {

	public Employee getdata()
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp Id");
         int empid=sc.nextInt();
        System.out.println("Enter emp Name");
         String empname=sc.next();
        System.out.println("Enter emp Salary");
		  double empsal=sc.nextDouble();
		  
	     
			
     	
		
		Employee e1=new Employee(empid,empname,empsal);
		return e1;
	}
	public void displaydata(Employee e1)
	{
		   System.out.println("emp Id:"+e1.getEmpid());
			System.out.println("emp Name:"+e1.getEmpname());
			System.out.println("emp Salary:"+e1.getEmpsal());
		
	}
    public Account data()
    {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Acocunt number");
	      int accno=sc.nextInt();
	     System.out.println("Enter customer Name");
	      String cname=sc.next();
        System.out.println("Enter balance");
    	  double bal=sc.nextDouble();
    	
    	Account a1=new Account(accno,cname,bal); 
  		return a1;
    	
    }
	public void display(Account a1)
	{
		System.out.println("account number:"+a1.getAccno());
		System.out.println("emp Name:"+a1.getCname());
		System.out.println("emp Salary:"+a1.getBal());
	}
}
