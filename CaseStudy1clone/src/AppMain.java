import java.util.Scanner;
import java.util.Scanner;
public class AppMain {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int ch;
        int i=0;
        int sid = 0;
        String sname = null;
        String dob = null;
        Student []sarr=null;
        Student sobj = null;
        int cId;
    	String cName;
        double duration;
        int fees;
       do {
        System.out.println("\n1-Student\n2-Admin");
        System.out.println("Enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        	ManagerStudent mobj=new ManagerStudent();
            sarr=mobj.create1(n, i, sid, sname, dob, sobj);
            mobj.display(sarr);
        	break;
        	
        case 2:
        	break;
        }
    	
        
       }while(ch==1);
       System.out.println("----Thank you----");
		//create(n,i,sid,sname,dob);
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
}	
