import java.util.Scanner;
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int ch=0,n=0;
		
		empinfo einfoobj=new empinfo();
		Manager marr[] = null;
		Devloper darr[] = null;
		
		
		do {
		System.out.println("\n1-create\n2-display");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			 
			System.out.println("Enter number of employee");
			n=sc.nextInt();
	
		     marr= einfoobj.create1(n);
		     darr=einfoobj.create2(n);
	         break;
		case 2:
			
		     einfoobj.display(marr,darr,"Manager","Devloper");
		    // einfoobj.display(e2,"Devloper");
		     break;
		}
		System.out.println("Do you want  to continue press 1");	
		}while(sc.nextInt()==1);
		
		
	}

}
