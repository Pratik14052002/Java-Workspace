import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch=0;
		AppEngine aobj=new AppEngine();
		Student[] sarr=null;
		Course[] carr=null; 
		Enroll[] earr=null;
		Enroll eobj = null;
		Student student = null;
		Course course = null;
		do {
			System.out.println("\n1-introduce\n2-register\n3-list of students\n4-enroll\n5-list of inrollments");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				carr=aobj.introduce();
				break;
			case 2:
				sarr=aobj.register();
				break;
			case 3:
				aobj.listofstudent(sarr);
				break;
			case 4:
				 earr=aobj.enroll(student,course);
				break;
			case 5:
				 aobj.listofenrollments(earr,sarr,carr);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue press 1:");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you for visiting");
        //aobj.enroll(sobj, cobj);
	}

}
