
public class User extends Thread {
    private Shopping sobj;
    String str;
    
	public User(Shopping sobj) {
		this.sobj = sobj;
	}

	public void run()
	{
		sobj.displaydata("User");
	}
}
