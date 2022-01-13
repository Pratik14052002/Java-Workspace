import java.util.Scanner;
public class MutltiTHread extends Thread{
  
	Scanner sc=new Scanner(System.in);
	
   String str1;
   String str2;
   String str3;
   String str4;
   String[] str=new String[4];
	public MutltiTHread(String str1, String str2, String str3, String str4) {
	this.str1 = str1;
	this.str2 = str2;
	this.str3 = str3;
	this.str4 = str4;
	str[0]=str1;
	str[1]=str2;
	str[2]=str3;
	str[3]=str4;
	
}
	
	public void display()
	{
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("String array is:");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);	
		}
	}
	public void check()
	{
		System.out.println("Enter your string that you want to search:");
		String str5=sc.next();
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(str5))
			{
				System.out.println("String is Present"+str[i]);
				break;
			}
			else
			{
			System.out.println("String is Absent");	
			}
		}
	}
	public void run()
	{
		display();
		//try {
			//Thread.sleep(10000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		//check();
	}

	
}
