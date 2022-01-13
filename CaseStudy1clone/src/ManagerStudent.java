import java.util.Scanner;

public class ManagerStudent {

	   Scanner sc=new Scanner(System.in);
	public  Student[] create1(int n,int i,int sid,String sname,String dob,Student sobj) {
			System.out.println("Enter number of student you want:");
			n=sc.nextInt();
			Student []sarr=new Student[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter Student Id,Student Name,Student Date of birth");
				sid=sc.nextInt();
				sname=sc.next();
				dob=sc.next();
				sobj=new Student(sid,sname,dob);
				sarr[i]=sobj;
			}
			return sarr;
	        }
	public void display(Student sarr[])
	{
		for(int i=0;i<sarr.length;i++)
		{
		System.out.println("Student Id:"+sarr[i].getStuId());
		System.out.println("Student Name:"+sarr[i].getStuName());
		System.out.println("Student date of birth:"+sarr[i].getDateofbirth());
		}
	}
	public void createcourse() {
		
		System.out.println("ENter number of courses:");
		int n=sc.nextInt();
		Course carr[]=new Course[n];
		for(int i=0;i<n;i++)
		{
			Course cobj=new Course(, null, i, i);
		}
		
	}


}



