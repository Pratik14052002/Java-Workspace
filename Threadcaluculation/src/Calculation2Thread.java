import java.util.Scanner;

public class Calculation2Thread implements Runnable  {
	Scanner sc=new Scanner(System.in);
	private Calculation2 c1;
	int ch;
	float tarea;
	float carea;
	public Calculation2Thread(Calculation2 c1) {
		this.c1=c1;
		new Thread(this).start();
		
	}

	public void run() {
       
		do {
			System.out.println("1-add\n2-sub\n");
			System.out.println("ENter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				carea = c1.carea();
				System.out.println("circle area is:"+carea);
				
				break;
			case 2:
				 tarea=c1.tarea();
                System.out.println("traingle area is:"+tarea);
				
				break;
			default :
				System.out.println("Invalid choice");
				break;
			}
		System.out.println("DO you want to continue press 1:");
		ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you");
		
		
	}

}
