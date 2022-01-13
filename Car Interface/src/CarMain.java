import java.util.Scanner;

public class  CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		String s;
		Scanner sc=new Scanner(System.in);
		Car cobj=null;
		Bike bobj=null;
		String str;
	do {	
		System.out.println("\n1-Bike\n2-Car");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		do {
			System.out.println("\n1-Honda");
			ch=sc.nextInt();
			if(ch==1)
			{
			bobj=new Honda("Splender","black","20000",6);
			display(bobj,"Honda bikes");
			}
			System.out.println("do you want to continue bike enter bike");
		   }while(sc.next()=="bike");
		System.out.println("----bikes----");
		
		break;
	case 2:
		do {
			System.out.println("\n1-Maruti\n2-Toyota\n3-BMW");
			System.out.println("Enter Your Choice:");
			ch=sc.nextInt();
			if(ch==1)
			{
				cobj=new Maruti("swift", "red", "20000");
				//Maruti m1=new Maruti();
				display(cobj,"Maruti");
			}
			else if(ch==2)
			{
				cobj=new Toyota("fortuner", "white", "30000");
				//Toyota t=new Toyota();
				
				display(cobj,"Toyota");
			}
			else if(ch==3)
			{
				cobj=new BMW("x1", "red", "20000");
				//BMW b=new BMW();
				display(cobj,"BMW");
			}
		System.out.println("DO you want to continue Enter car:");	
		}while(sc.next()=="car");
		System.out.println("----Cars----");
		break;	
	}
	
	System.out.println("Do you want to continue press 1");
	ch=sc.nextInt();
	}while(ch==1);
	System.out.println("-----Thank you------");
	}
	public static void display(Car cobj,String str) {
		//System.out.println("-----Maruti details------");
		System.out.println(str+"\t"+cobj.getModel());
		System.out.println(str+"\t"+cobj.getColor());
		System.out.println(str+"\t"+cobj.getPrice());
		if(cobj instanceof Bike)
		{
			Bike bobj=(Bike)cobj;
		System.out.println(str+"\t"+bobj.getnocc());
		}
		/*System.out.println("-----Toyota details------");
		System.out.println(str+"\t"+cobj.getModel());
		System.out.println(str+"\t"+cobj.getColor());
		System.out.println(str+"\t"+cobj.getPrice());
		System.out.println("-----BMW details------");
		System.out.println(str+"\t"+cobj.getModel());
		System.out.println(str+"\t"+cobj.getColor());
		System.out.println(str+"\t"+cobj.getPrice());
		*/
		
	}

}
