
public class Addition extends Thread {
private Calculation cal;
	
	
	public Addition(Calculation cal) {
		this.cal = cal;
	}


	public void run()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   cal.add();
	}

}
