import java.util.Scanner;

public class Info {
	  Scanner sc=new Scanner(System.in);
	public Student[] create(int n,int i,int sid,String sname,String dob,Student[] sarr) {
		System.out.println("Enter number of student you want:");
		n=sc.nextInt();
		 Student sarr1[]=new Student[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Student Id,Student Name,Student Date of birth");
			sid=sc.nextInt();
			sname=sc.next();
			dob=sc.next();
			sarr2=new Student(sid,sname,dob);
			sarr1[i]=sarr2;
		}
		return sarr1;
        }
	public void display(Student[] sobj)
	{
		for(int i=0;i<sobj.length;i++)
		{
		System.out.println("Student Id:"+sobj[i].getStuId());
		System.out.println("Student Name:"+sobj[i].getStuName());
		System.out.println("Student date of birth:"+sobj[i].getDateofbirth());
	}
}
}
