
public class DataReadWrite {
	int number;
	boolean b=false;
	
	public void putData(int n)
	{
		if(b)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.number=n;
		System.out.println("Putdata value product"+n);
		
			b=true;	

		
		//if(n==100)
		//{
			//System.exit(0);
		//}
		//System.out.println("Putdata value product");
		notify();
	}
	public void getData() 
	{
		if(b==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        System.out.println("Value Consume "+number);
        b=false;
		notifyAll();
		
	}
			

	
}
