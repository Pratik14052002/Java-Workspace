
public class demo1main {
	 static 
	    {
	    	System.out.println("Staic block");
	    	demo1 d1=new demo1();
	    	//d1.display();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo1  d3=new demo1();
		demo1 d1=new demo1();
	     demo1 d2=new demo1();
	   
	 d1.n1=10;//n1=10
	 d1.n2=10;//n2=10
	 System.out.println("N1 value is:"+d1.n1);
	 System.out.println("N2 value is:"+d1.n2);
	 d2.n1=20;//n1=20 override
	 d2.n2=20;//n2=20 override
	 System.out.println("N1 value is:"+d2.n1);
	 System.out.println("N2 value is:"+d2.n2);
	// d1.n1=30;//
	// d1.n2=30;//
	 //System.out.println("N1 value is:"+d1.n1);
	 //System.out.println("N2 value is:"+d1.n2);
	 System.out.println("N1 value is:"+d1.n1);
	 System.out.println("N2 value is:"+d1.n2);
	}
}
