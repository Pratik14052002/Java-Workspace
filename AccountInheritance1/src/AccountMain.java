
public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   
	Account aobj1=create();
	Account aobj2=create();
	Account aobj3=aobj2;
	display(aobj1);
	display(aobj2);
	aobj1=null;
	aobj2=null;
	aobj3=null;
	/*
	if(aobj1==aobj2)
	{
		System.out.println("objexta are same using ==");
	}
	else
	{
		System.out.println("objexta are same using ==");
	}
	if(aobj1.equals(aobj2))
	{

		System.out.println("objexta are same using ==");
		
	}
	else
	{
		System.out.println("objexta are same using equals Methos");
	}
*/    
	System.gc();
	}
	public static Account create()
	{
		Account aobj=new Account(101,"pratik",500);
		return aobj;
	}
	public static void display(Account aobj) {
	System.out.println(aobj);	
	}

}
