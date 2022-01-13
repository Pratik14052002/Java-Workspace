
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer(null);
		 Storage sobj=new Storage(p1);
      Counter t1=new Counter(sobj);
      Printer t2=new Printer(sobj);
     
		
      t1.start();
      
      t2.start();
      
	}

}
