import java.util.*;
import static java.lang.System.out;
public  class demo1 {
		int n1;
		static int n2;
	    public void show()
	    {
	    	out.println("n1 value is:"+n1);
	    	out.println("n2 value is:"+n2);   
	    }
	    
	    public demo1(){
	 		 this(100);
	    	System.out.println("default constructor of demo 1 class");
	 	
	    }

		public demo1(int n1) {	
			this.n1 = n1;
		}
		public static void display()
		{   demo1 d1=new demo1(); 
			d1.n1=10;
			d1.n2=20;
			System.out.println("n2 is"+n2);
			System.out.println("n1 is"+d1.n1);
		}
	    
	}


