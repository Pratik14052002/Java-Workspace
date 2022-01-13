import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AppEngin a=new AppEngin();
		a.introduce();
		int ch;

		Course[] c =null;
		Student[] stdarr=null;
				do {
			System.out.println("1-View Courses\n2-Student Detail\n3-Student Register\n4-Enrol1"
				+ "l Course");
		System.out.println("1-Enter your Choice");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
		c=a.listofCourse();
		break;
		case 2:
		stdarr=a.listofStudent();
		break;
		case 3:
		a.Regester();
		break;
		case 4:
		a.listofenrollment(stdarr, c, "20-23-2000");
		break;
		}
		System.out.println("Do you want Continue press 1");
		ch=sc.nextInt();
		}while(ch==1);
		}

}
