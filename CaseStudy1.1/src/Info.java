import java.util.Scanner;

public class Info {
	private Student sobj;
	Scanner sc=new Scanner(System.in);
	public Info() {
		this.sobj = sobj;
	}
    int n,i;
    int sid;
    String sname;
    String dob;
	public Student[] create()
	{
		    System.out.println("Enter number of student do you want:");
		    n=sc.nextInt();
		    Student []sarr=new Student[n];
		   
		    for(i=0;i<n;i++)
			{ 
		    System.out.println("Enter Student id,Student Name,Student Date of birth");
		    sid=sc.nextInt();
		    sname=sc.next();
		    dob=sc.next();
		    Student sobj=new Student(sid, sname, dob);
			sarr[i]=sobj;
			}
	 
		    return sarr;
	}
    public void display(Student[] sarr)
    {
    	for(i=0;i<sarr.length;i++)
    	{
    		System.out.println("Student Id:"+sarr[i].getId());
    		System.out.println("Student Name:"+sarr[i].getName());
    		System.out.println("Student Date Of Birth:"+sarr[i].getDateofbirth());
    	}
    }
 
   
}
