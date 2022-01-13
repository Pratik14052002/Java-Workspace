
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo d1=new Demo();
     Demo d2=new Demo();
   // d1.n1=10;
     //d2.n2=11;
     //d1.show();
     //d2.show();
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
