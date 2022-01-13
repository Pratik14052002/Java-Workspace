import java.util.Scanner;

public class EmployeeInfo {
       public Employee createmp() {
    	   Scanner sc=new Scanner(System.in);
   		System.out.println("Enter Employee Id:");
   		int empId=sc.nextInt();
   		System.out.println("Enter Employee Name:");
   		String empName=sc.next();
   		System.out.println("Enter Employee Salary:");
   		int empSalary=sc.nextInt();
   		Employee e1=new Employee(empId,empName,empSalary);
   		return e1;
       }
       public void displayemp(Employee e1) {//here we pass e1 as argument which is passed by e1
    	System.out.println("Employee Id:"+e1.getEmpId());
   	    System.out.println("Employee Name:"+e1.getEmpName());
   	    System.out.println("Employee Salary:"+e1.getEmpSalary());
       }
       public bill empbill(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Bill Id:");
        int billId=sc.nextInt();
        System.out.println("ENter Bill Name:");
        String  billName=sc.next();
        bill b1=new bill(billId,  billName);
        return b1;
	    
        }
       public void empbilldisplay(bill b1) {
    	   System.out.println("Employee bill:"+b1.getBillId());
    	   System.out.println("Employee bill Name:"+b1.getBillName());
    	   
       }
       public void updatesalary(Employee x,int empSalary)//Here x act as call by reference variable
       {
    	x.setEmpSalary(2000);
    	System.out.println("New employee salary is:"+x.getEmpSalary());
       }
	
}
