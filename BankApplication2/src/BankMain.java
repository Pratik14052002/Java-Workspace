import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
	    Customer[] cus=null;
		BankInfo b=new BankInfo();
		int ch=0;
		do {
			
		System.out.println("\n1-create\n2-display\n");
        System.out.println("ENter your choice:");
        ch=sc.nextInt();
       switch(ch)
       {
       case 1:
	         cus=b.create();	
             break;
       case 2:
		     b.display(cus);
		     break;
       }
        System.out.println("do you want to continue press 1");
        ch=sc.nextInt();
		}while(ch==1);
	}
}
