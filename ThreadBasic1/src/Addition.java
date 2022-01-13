
public class Addition implements Runnable  {
	int n1;
	int n2;
	
	public Addition(int n1, int n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}

	public void add()
	{
		int add=n1+n2;
		System.out.println("Addition is:"+add);
	}

	public void run()
	{
		add();
	}
}
