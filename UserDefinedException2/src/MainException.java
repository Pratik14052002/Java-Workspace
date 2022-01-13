import java.util.Scanner;

public class MainException {

	static Scanner sc=new Scanner(System.in);
	public static void Age()throws InvalidAge
	{
		
		int age;
		System.out.println("Enter Your Age:");
		age=sc.nextInt();
		
		//try {
			if(age<20)
			{
				throw new InvalidAge(age);
			}
		//}
		//catch(InvalidAge ex)
		//{
			//System.out.println(ex);
			//throw ex;
		//}
		
	}
	public static void main(String[] args) //throws InvalidAge//this indicate that you directly give exception to JVM so it will directly terminate your program after exception
	//this line will terminate program after it will gave exception but we neeed to print thsnk you msg  
	{
		// TODO Auto-generated method stub
		try {
			Age();
			System.out.println("Open Account");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();//you will get detailed about exception
		}
		
		System.out.println("Thank you");
	}

}
