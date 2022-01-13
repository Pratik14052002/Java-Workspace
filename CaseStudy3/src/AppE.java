import java.util.Scanner;

public class AppE implements User{

	Scanner sc=new Scanner(System.in);
	int ch=0;
	@Override
	public void showFirstScreen() {
		// TODO Auto-generated method stub
		do {
			System.out.println("----------Welcome----------");
			System.out.println("Tell us Who you are: \n1-Student\n2-Admin");
			System.out.println("Enter your Choice: 1 or 2");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				showStudentScreen();
				break;
			case 2:
				showAdminScreen();
				break;
			default:
				System.out.println("Enter Valid Choice");
				break;
			
			}
			System.out.println("Do you want to continue press 1");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you Visit Again");
	}

	@Override
	public void showStudentScreen() {
		// TODO Auto-generated method stub
		System.out.println("----------Welcome----------");
		System.out.println("\n1-Enroll Student ");
		System.out.println("To Register Student Press 1");
		ch=sc.nextInt();
		if(ch==1)
		{
			showStudentRegistrationScreen();
			//showStudentRegistrationScreen();
			//showAdminAllStudentScreen();
		}
		
	}

	@Override
	public void showAdminScreen() {
		// TODO Auto-generated method stub
		System.out.println("----------Welcome----------");
		System.out.println("\n1-Enroll Course ");
		System.out.println("To Register Course Press 1");
		if(ch==1)
		{
			 introduceNewCourseScreen();
			// showAllCourseScreen(); 
		}
		
	}

	
	@Override
	public void showAdminAllStudentScreen(Student [] sarr) {
		// TODO Auto-generated method stub
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

	@Override
	public void showStudentRegistrationScreen() {
		// TODO Auto-generated method stub
		Student []sarr=new Student[5];
		   sarr[0]=new Student(1001,"Pratik","14may2002");
		   sarr[1]=new Student(1002,"Om","15may2002");
		   sarr[2]=new Student(1003,"Aniket","16may2002");
		   sarr[3]=new Student(1004,"Sham","17may2002");
		   sarr[4]=new Student(1005,"Omkar","18may2002");
		   //return sarr;
		   showAdminAllStudentScreen(sarr);
		
	}

	@Override
	public void introduceNewCourseScreen() {
		// TODO Auto-generated method stub
		Course []carr=new Course[5];
		   carr[0]=new Course(101,"java",5,2000);
		   carr[1]=new Course(101,"python",5,2000);
		   carr[2]=new Course(101,"dt",5,2000);
		   carr[3]=new Course(101,"data",5,2000);
		   carr[4]=new Course(101,"structure",5,2000);
		//   return carr;
		   showAllCourseScreen(carr);
		
	}

	@Override
	public void showAllCourseScreen(Course[] carr) {
		// TODO Auto-generated method stub
		System.out.println("List of Course");
	    System.out.println("Course id\t"+carr[0].getId()+"Course Name\t"+carr[0].getCname()+"Course duration \t"+carr[0].getDuration()+"Course fees"+carr[0].getFees());
		System.out.println("Course id\t"+carr[1].getId()+"Course Name\t"+carr[1].getCname()+"Course duration \t"+carr[1].getDuration()+"Course fees"+carr[1].getFees());
		System.out.println("Course id\t"+carr[2].getId()+"Course Name\t"+carr[2].getCname()+"Course duration \t"+carr[2].getDuration()+"Course fees"+carr[2].getFees());
		System.out.println("Course id\t"+carr[3].getId()+"Course Name\t"+carr[3].getCname()+"Course duration \t"+carr[3].getDuration()+"Course fees"+carr[3].getFees());
		System.out.println("Course id\t"+carr[4].getId()+"Course Name\t"+carr[4].getCname()+"Course duration \t"+carr[4].getDuration()+"Course fees"+carr[0].getFees());
		
	
	}

}
