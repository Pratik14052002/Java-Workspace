
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping sobj=new Shopping();
		Admin aobj=new Admin(sobj);
		User uobj=new User(sobj);
		uobj .start();
		aobj.start();
		

	}

}
