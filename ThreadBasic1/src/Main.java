
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add=new Addition(10, 20);
		Thread t1=new Thread(add);
		t1.start();

	}

}
