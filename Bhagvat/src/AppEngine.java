import java.util.Scanner;
	import java.io.Reader;
	import java.lang.System;
	import java.util.Date;
public class AppEngine {

	Scanner sc=new Scanner(System.in);
	Student[] stdarr=new Student[10];
	Course[] c=new Course[10];
	Enroll[] elist=new Enroll[10];
    int sd,cnt=0,eo=0;
    public Student[] listofStudent() 
    {
	        for(Student std:stdarr)
	        {
	        	if(std==null)
	        	{
				break;
				}
	        	else
	        	{
	        		StudentDisplay(std);
	        	}
	        }
	    	return stdarr;
	    }
		public Course[] listofCourse() {
			Course c1=new Course(123, "fullStack", 30000, 10);
			Course c2=new Course(124, "Bcs      ", 15000, 12);
			Course c3=new Course(125, "Marathi", 12000, 11);
			Course c4=new Course(126, "Web Developement", 3000, 6);
			c[0]=c1;
			c[1]=c2;
			c[2]=c3;
			c[3]=c4;
			for(Course course:c) {
				if(course==null) {
				break;
				}
				else {
				Introduce(course);
				}
			}
		
			return c;
	}
		public void Regester() {
			Student s=AcceptData();
			System.out.println(sd);
			stdarr[sd]=s;
			sd++;
			System.out.println("Your Registered");
		}
		public Student AcceptData() {
				System.out.println("Enter Student ID");
				int stdId=sc.nextInt();
				System.out.println("enter student name");
				String stdName=sc.next();
				System.out.println("enter student Date of Birth in format xx/yy/zzzz");
				String stdDob=sc.next();
				Student s=new Student(stdId, stdName, stdDob);
				return s;
		}
		public Student[] introduce()
		{
			Student s=new Student(102, "Professor", "10-12-2000");
	    	Student s1=new Student(102, "Denver", "10-12-2000");
	    	Student s2=new Student(102, "Rio", "10-12-2000");
	    	Student s3=new Student(102, "Berlin", "10-12-2000");
	        stdarr[0]=s;
	        stdarr[1]=s1;
	        stdarr[2]=s2;
	        stdarr[3]=s3;
	        for (Student student : stdarr) {
				if(student==null)
				{
					break;
				}
				else
				{
					sd++;
				}
			}
	        return stdarr;
	    }
		
		public void listofenrollment(Student[] stdarr,Course[] c,String str) {
			System.out.println("-------welcome ------");
		
			for (int i = 0; i <stdarr.length; i++)
			{
			System.out.println("Enrollment Date \t :"+str);	
			System.out.println("------------------------------------------------------------");
			System.out.println("Student Id   \t\t"+stdarr[i].getStdId());
			System.out.println("Student Name \t\t"+stdarr[i].getStdName());
			System.out.println("Student DOB  \t\t"+stdarr[i].getStdDob());
			System.out.println("Course Id       \t"+c[i].getId());
			System.out.println("Course Name     \t"+c[i].getCourseName());
			System.out.println("Course Duration \t"+c[i].getDuration());
			System.out.println("Course Fees     \t"+c[i].getFees());
			
			}
		}
	public void Introduce(Course[] c) {
		 
			System.out.println("Course Id       \t"+c[0].getId());
			System.out.println("Course Name     \t"+c[1].getCourseName());
			System.out.println("Course Duration \t"+c[2].getDuration());
			System.out.println("Course Fees     \t"+c[3].getFees());
			System.out.println();
	}
	public void StudentDisplay(Student std) {
		
			System.out.println("Student Id   \t"+std[0].getStdId());
			System.out.println("Student Name \t"+std[1].getStdName());
			System.out.println("Student DOB  \t"+std[3].getStdDob());
			System.out.println();
		
	}

}
