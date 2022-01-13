public class Demo extends Thread {

	String str;

	public Demo(String str) {
		this.str = str;
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
			
			System.out.println(str+"\t"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
