import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int i,n;
		int eId;
		String eName;
		int eSal;
	    int nH;
	    int bo;
		
	    System.out.println("Enter number emp do you want");
		n=sc.nextInt();
		Manager []marr=new Manager[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter MAnager id,name,salary,number of hours");
		eId=sc.nextInt();
		 eName=sc.next();
	    eSal=sc.nextInt();
	    
	     nH=sc.nextInt();
		
	    Manager mangerobj1=new Manager(eId,eName,eSal,nH);
	    
		marr[i]=mangerobj1;
		
		}
		//Manager mangerobj2=new Manager(eId,eName,eSal,bo);
		Devloper []darr=new Devloper[n];
		for(i=0;i<n;i++)
		{
		System.out.println("Enter Devloper id,name,salary,bonus");
		eId=sc.nextInt();
		 eName=sc.next();
	    eSal=sc.nextInt();
	     bo=sc.nextInt();
	     
		
	     Devloper devobj=new Devloper(eId,eName,eSal,bo);
	     darr[i]=devobj;
		
		}
		
	//	Manager m2=mangerobj2; 
		//if(mangerobj1.equals(mangerobj2))
		//{
			//System.out.println("objects are same");
		//}
		//else {
			//System.out.println("objects are different");
		//}
		//if(mangerobj1==mangerobj2)//reference address
		//{
		//	System.out.println("objects are same");
		//}
		//else {
			//System.out.println("objects are different");
		//}
		display(marr,"Manager");
		//display(mangerobj2,"Devloper");
		display(darr,"Devloper");
		

	}
	public static void display(Employee[] eobj,String str) {
		for (int i=0;i<eobj.length;i++)
		{
		System.out.println(eobj[i]);
		}
		//System.out.println(str+"Id:"+eobj.getEmpId());
		//System.out.println(str+"NAme:"+eobj.getEmpName());
		//System.out.println(str+"Salary:"+eobj.getEmpSalary());
		//System.out.println(str+"Salary:"+eobj.);
//		int i;
//		for(i=0;i<eobj.length;i++)
//		{
//		if(eobj[i] instanceof Manager)
//		{
//			Manager m=(Manager)eobj[i];
//			System.out.println(str+"Id:"+m.getEmpId());
//			System.out.println(str+"NAme:"+m.getEmpName());
//			System.out.println(str+"Salary:"+m.getEmpSalary());
//			System.out.println(str+"Number of hours:"+m.getNoHr());
//		}
//		}
//		for(i=0;i<eobj.length;i++)
//		{
//		if(eobj[i] instanceof Devloper)
//		{
//			Devloper d= (Devloper)eobj[i];
//			System.out.println(str+"Bonus"+d.getEmpId());
//			System.out.println(str+"Bonus"+d.getEmpName());
//			System.out.println(str+"Bonus"+d.getEmpSalary());
//			System.out.println(str+"Bonus"+d.getBonuse());
//		}
//		}	
	}

}
