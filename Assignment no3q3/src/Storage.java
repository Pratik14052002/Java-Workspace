
public class Storage {

	int n1;
    private  Printer p1;
	public Storage(Printer p1) {
		this.p1 = p1;
	}
	public void store(int n1)
	{
		this.n1=n1;//here this .n1 is current n1 and second one is int n1
		//display(n1);
		//for(int i=0;i<6;i++)
		//{
			//n1++;
		p1.run(n1);
			//System.out.println("n1 is"+n1);
			//break;
		//}
	}
	
	
	
}
