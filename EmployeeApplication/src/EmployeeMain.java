
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInfo eobj=new EmployeeInfo();
		Employee e1=eobj.createmp();
		eobj.displayemp(e1);
		int empSalary=0;
		
		bill b1=eobj.empbill();
		eobj.empbilldisplay(b1);
		eobj.updatesalary(e1,empSalary);
	}
}



