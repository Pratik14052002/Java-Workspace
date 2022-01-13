import java.util.Scanner;

public class accManager {

	public acc getdata() {
		
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Acocunt number");
	      int accno=sc.nextInt();
	     System.out.println("Enter customer Name");
	      String cname=sc.next();
        System.out.println("Enter balance");
    	  double bal=sc.nextDouble(); 
    	
    	  acc a=new acc(accno,cname,bal);
          return a;
	}
	public void display(acc a) {
		
		System.out.println("account number:"+a.getAccno());
		System.out.println("emp Name:"+a.getCname());
		System.out.println("emp Salary:"+a.getBal());
	

	}
}
