
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Calculation c=new Calculation(10, 20);
     CalculationThread cobj=new CalculationThread(c);
     //c.join
     Calculation2 c1=new Calculation2(10, 20, 30); 
     Calculation2Thread cobj2=new Calculation2Thread(c1);
     
     
    // Thread t=new Thread(c);
    
	}

}
