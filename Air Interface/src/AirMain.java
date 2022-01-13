import java.util.Scanner;

public class AirMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int ch=0;
		String str;
		Flyable fobj=null;

		do {
			System.out.println("\n1-Airoplane\n2-jet\n3-AirBallon");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			if(ch==1) {
				Flyable fobj1=new Airoplane();
				show(fobj1,"Airplane");
				Airoplane ai =new Airoplane();
				show(ai,"Airplane");
			}
			else if(ch==2){
				fobj=new jet();
				show(fobj,"jet");
			}
			else if(ch==3){
				fobj=new AirBallon();
				show(fobj,"AirBallon");
			}
			System.out.println("Do you want to continue press 1");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("----Thank you----");
	}
	public static void show(Flyable fobj,String str) 
	{
	System.out.println(str+"Top Speed is:"+fobj.topSpeed());
	System.out.println(str+"Average Speed is:"+fobj.avgSpeed());
	System.out.println(str+"Fuel Type:"+fobj.fuelType());
    fobj.display();
	
	}
	

}
 