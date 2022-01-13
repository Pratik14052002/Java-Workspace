
public class Product extends Thread  {
	private DataReadWrite dobj;
    int n=1;
	public Product(DataReadWrite dobj) {
		this.dobj = dobj;
	}
	public void run()
	{
		synchronized(dobj)
		{
			while(true)
			{  
				dobj.putData(n++);
			}
		}
	}
}
