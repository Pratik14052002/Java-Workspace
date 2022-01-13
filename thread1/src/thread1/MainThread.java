package thread1;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        UserThread uobj=new UserThread(10, 20);
        uobj.run();
        System.out.println("Thank you");
	}

}
