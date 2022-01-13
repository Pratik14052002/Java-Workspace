
public class Addition extends Thread {

	private calculation cal;
	
	
	public Addition(calculation cal) {
		this.cal = cal;
	}


	public void run()
	{
	   cal.add();
	}
}
