import java.util.Scanner;
public class AppMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n = 0;
        int i=0;
        int sid = 0;
        String sname = null;
        String dob = null;
        Student []sarr=null;
        Student []sobj = null;
        Info iobj=new Info();
        iobj.create(n, i, sid, sname, dob,sarr);
        iobj.display(sobj);
       // sarr=create1(n,i,sid,sname,dob,sobj);
		//create(n,i,sid,sname,dob);
	}
	/*public  static Student[] create(int n,int i,int sid,String sname,String dob)
	{
		System.out.println("Enter number of student you want:");
		n=sc.nextInt();
		Student []sarr=new Student[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Student Id,Student Name,Student Date of birth");
			sid=sc.nextInt();
			sname=sc.next();
			dob=sc.next();
			Student sobj=new Student(sid,sname,dob);
			sarr[i]=sobj;
		}
		
	}*/
	 
}
