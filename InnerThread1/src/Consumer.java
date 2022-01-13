
public class Consumer extends Thread {
	private DataReadWrite dobj;
    
	public Consumer(DataReadWrite dobj) {
		this.dobj = dobj;
	}
	
	public void run()
	{
	synchronized(dobj)
	{
		while(true)
		{
			dobj.getData();
		}
	}
	}
}
