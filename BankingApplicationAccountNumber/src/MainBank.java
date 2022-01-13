import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		//float balance = 0;
		BankInfo bobj=new BankInfo();
		int ch=0;
		Customer[] carr=null;
		do {
			System.out.println("\n1-Create Account\n2-Display Account\n3-Search account\n4-Perform Transcation in Account");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				carr=bobj.createAccount();
				break;
			case 2:
				bobj.displayAccount(carr);
				break;
			case 3:
				bobj.searchAccount(carr);
				break;
			case 4:
				bobj.transaction(carr);
				break;	
			default:
				System.out.println("Enter Valid choice");
				ch=sc.nextInt();
				break;
			}
			System.out.println("Do you want to continue press 1:");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Thank you");
		
		
	}

}
