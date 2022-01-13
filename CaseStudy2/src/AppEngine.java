
public class AppEngine {
	public Course[] introduce()
	{
		 
			   Course []carr=new Course[5];
			   carr[0]=new Course(101,"java",5,2000);
			   carr[1]=new Course(101,"python",5,2000);
			   carr[2]=new Course(101,"dt",5,2000);
			   carr[3]=new Course(101,"data",5,2000);
			   carr[4]=new Course(101,"structure",5,2000);
			   return carr;
			   
	}
	public Student[] register() 
	{
		Student []sarr=new Student[5];
		   sarr[0]=new Student(1001,"Pratik","14may2002");
		   sarr[1]=new Student(1002,"Om","15may2002");
		   sarr[2]=new Student(1003,"Aniket","16may2002");
		   sarr[3]=new Student(1004,"Sham","17may2002");
		   sarr[4]=new Student(1005,"Omkar","18may2002");
		   return sarr;
	}
	public void listofstudent(Student[] sarr) 
	{
	System.out.println("List of Student");
	//for(int i=0;i<sarr.length;i++)
	//{
		System.out.println("Student id\t"+sarr[0].getId()+"Student Name\t"+sarr[0].getName()+"Student Date of birth\t"+sarr[0].getDateofbirth());
		System.out.println("Student id\t"+sarr[1].getId()+"Student Name\t"+sarr[1].getName()+"Student Date of birth\t"+sarr[1].getDateofbirth());
		System.out.println("Student id\t"+sarr[2].getId()+"Student Name\t"+sarr[2].getName()+"Student Date of birth\t"+sarr[2].getDateofbirth());
		System.out.println("Student id\t"+sarr[3].getId()+"Student Name\t"+sarr[3].getName()+"Student Date of birth\t"+sarr[3].getDateofbirth());
		System.out.println("Student id\t"+sarr[4].getId()+"Student Name\t"+sarr[4].getName()+"Student Date of birth\t"+sarr[4].getDateofbirth());
	//}
	
	}
	public Enroll[] enroll(Student student,Course course)
	{
		Enroll earr[]=new Enroll[5];
		earr[0]=new Enroll(student,course, "14may2002");
		earr[1]=new Enroll(student,course, "14may2002");
		earr[2]=new Enroll(student,course, "14may2002");
		earr[3]=new Enroll(student,course, "14may2002");
		earr[4]=new Enroll(student,course, "14may2002");
		return earr;
		
	}
	public void listofenrollments(Enroll[] eobj,Student[] sarr,Course[] carr)
	{
		System.out.println("List of Enrollments");
		//for(int i=0;i<eobj.length;i++)
		//{
			//System.out.println("Student id:"+eobj.getStudent().getId()+"Student name:"+eobj.getStudent().getName()+"Student Date of Birth:"+eobj.getStudent().getDateofbirth()+"Course Name:"+eobj.getCourse().getId()+"Course ");
			//System.out.println("enroll 2:"+eobj.getStudent().getName());
			//System.out.println("enroll 3:"+eobj.getStudent().getDateofbirth());
		System.out.println("List of Student");
		//for(int i=0;i<sarr.length;i++)
		//{
			System.out.println("Student id\t"+sarr[0].getId()+"Student Name\t"+sarr[0].getName()+"Student Date of birth\t"+sarr[0].getDateofbirth());
			System.out.println("Student id\t"+sarr[1].getId()+"Student Name\t"+sarr[1].getName()+"Student Date of birth\t"+sarr[1].getDateofbirth());
			System.out.println("Student id\t"+sarr[2].getId()+"Student Name\t"+sarr[2].getName()+"Student Date of birth\t"+sarr[2].getDateofbirth());
			System.out.println("Student id\t"+sarr[3].getId()+"Student Name\t"+sarr[3].getName()+"Student Date of birth\t"+sarr[3].getDateofbirth());
			System.out.println("Student id\t"+sarr[4].getId()+"Student Name\t"+sarr[4].getName()+"Student Date of birth\t"+sarr[4].getDateofbirth());
		//}
			System.out.println("List of Course");
			//for(int i=0;i<sarr.length;i++)
			//{
				System.out.println("Course id\t"+carr[0].getId()+"Course Name\t"+carr[0].getCname()+"Course duration \t"+carr[0].getDuration()+"Course fees"+carr[0].getFees());
				System.out.println("Course id\t"+carr[1].getId()+"Course Name\t"+carr[1].getCname()+"Course duration \t"+sarr[1].getDateofbirth()+"Course fees"+carr[1].getFees());
				System.out.println("Course id\t"+carr[2].getId()+"Course Name\t"+carr[2].getCname()+"Course duration \t"+sarr[2].getDateofbirth()+"Course fees"+carr[2].getFees());
				System.out.println("Course id\t"+carr[3].getId()+"Course Name\t"+carr[3].getCname()+"Course duration \t"+sarr[3].getDateofbirth()+"Course fees"+carr[3].getFees());
				System.out.println("Course id\t"+carr[4].getId()+"Course Name\t"+carr[4].getCname()+"Course duration \t"+sarr[4].getDateofbirth()+"Course fees"+carr[0].getFees());
			//}
			System.out.println("Enrollment date:"+eobj[0].getEnrollDate());
			System.out.println("Enrollment date:"+eobj[1].getEnrollDate());
			System.out.println("Enrollment date:"+eobj[2].getEnrollDate());
			System.out.println("Enrollment date:"+eobj[3].getEnrollDate());
			System.out.println("Enrollment date:"+eobj[4].getEnrollDate());
		//}
	}

}
