
public class Exam2 {

	/*String q;
	Exam2[] qarr= new Exam2[2];
	Exam2[] aarr=new Exam2[2];
	
	public Exam2(String q) {
		this.q = q;
	}*/
	
	
	public void question(Exam qarr)
	{
		qarr[0]=new Exam("dsa","asd");
				
	}
	public void answer()
	{
		aarr[0]=new Exam2("a");
	}
	public void check()
	{
		for(int i=0;i<1;i++)
		{
		if(qarr[i]==aarr[i])
		{
			System.out.println("Answer is correct");
		}
		}
	}
	
}
