
public class Printer extends Thread{

	private Storage sobj;

	public Printer(Storage sobj) {
		this.sobj = sobj;
	}
	public void run(int n1)
	{
		//synchronized(sobj)
		//{
		
			
			System.out.println("n1 is"+n1);
			
		
			//sobj.display();
		//}
		
	}
	
}
