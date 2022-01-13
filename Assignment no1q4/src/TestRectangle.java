import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    float l = 0;
		float b = 0;
		float rarea = 0;
		System.out.println("ENter Length and Breadth of Reactangle");
		l=sc.nextFloat();
		b=sc.nextFloat();
       Rectangle robj=new Rectangle(b,l);
       area(l,b,rarea);
	}
public  static void area(float l,float b,float rarea) 
{
	rarea=l*b;
	System.out.println("Area of rectangle is:"+rarea);
}
}
