
public class Sub extends Thread{
	private calculation cal;

	public Sub(calculation cal) {
		this.cal = cal;
	}
	
	public void run() {
		cal.sub();
	}
	

}
