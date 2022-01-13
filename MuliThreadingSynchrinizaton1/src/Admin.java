
public class Admin extends Thread {
	private Shopping sobj;
	String str;
	public Admin(Shopping sobj) {
		this.sobj = sobj;
	}
   public void run()
   {
	   
	 //sobj.savedata("Admin");
	   //synchronized(sobj)
	   //{
		   for(int i=1;i<4;i++)
		   {
			 sobj.displaydata("Admin");
			  }  
	   //}
	  
		
   }


}
