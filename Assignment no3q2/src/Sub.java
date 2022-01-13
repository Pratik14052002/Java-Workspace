
public class Sub extends Thread{
	private Calculation cal;

	public Sub(Calculation cal) {
		this.cal = cal;
	}
	
	public void run() {
		cal.sub();
	}

}
