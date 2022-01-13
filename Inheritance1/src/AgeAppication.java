class grandfather
{  
	private int gage; 	
	
	public grandfather(int gage) {
		this.gage = gage;
	}
    public void showage() {
		System.out.println("Grand faher age is:"+gage);
	}	
}

class father extends grandfather
{   
	private int fage; 
	
	public father(int fage) {
		super(fage+30);
		this.fage=fage;
	}
	public void showage() {
		super.showage();
		System.out.println("faher age is:"+fage);
	}
}
class son extends father
{
	int sage;
	
	public son(int sage) {
		super(sage+30);
		this.sage = sage;
	}

	public void showage() {
		super.showage();
		//System.out.println("Grand faher age is:"+gage);//if you want acess this you need protected variablein base class
		//System.out.println("faher age is:"+fage);
		System.out.println("son age is:"+sage);
	}
}
public class AgeAppication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s1=new son(20);
		s1.showage();

	}

}
