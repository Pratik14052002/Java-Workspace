
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cobj=new Calculation(10,20);
		Addition a1=new Addition(cobj);
		Sub s1=new Sub(cobj);
		
		a1.setPriority(1);
		a1.start();
		
		s1.setPriority(2);
		s1.start();
		
	}

}
