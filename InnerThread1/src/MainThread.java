
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataReadWrite dobj=new DataReadWrite();
		Product pobj=new Product(dobj);
		Consumer cobj=new Consumer(dobj);
		System.out.println(pobj.isAlive());
		System.out.println(cobj.isAlive());
		pobj.start();
		cobj.start();
		System.out.println(pobj.isAlive());
		System.out.println(cobj.isAlive());
		System.out.println("Thank you");
	}

}
