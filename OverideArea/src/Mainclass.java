

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[]=new Shape[5];
		//Shape s=null;
		//Circle c=new Circle(10f);
	//	c.findArea();
		//Traingle t=new Traingle(10f,20f);
		//t.findArea();
		
		//Shape s=new Shape();//here we cant create object of abstract class
	//	Circle c=new Circle(20f);
		//Traingle t=new Traingle(20f, 10f);
		//dynamic polymorphism[][[[[[[[[[  
		s[0]=new Circle(10f);
		
		s[1]=new Traingle(10f,20f);
		s[2]=new Circle(10f);
		s[3]=new Traingle(10f,20f);
		s[4]=new Circle(10f);
		display(s);
	}
	public static void display(Shape[] s) {
		for(int i=0;i<s.length;i++)
		{
			if(s[i] instanceof Circle)
			{
			s[i].findArea();
			System.out.println(s[i]);
			}
			else if(s[i] instanceof Traingle)
			{
				s[i].findArea();
				System.out.println(s[i]);
			}
		}
	}

}


