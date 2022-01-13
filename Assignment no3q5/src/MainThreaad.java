
public class MainThreaad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1=args[0];
		String str2=args[1];
		String str3=args[2];
		String str4=args[3];
		
		MutltiTHread t1=new MutltiTHread(str1, str2, str3, str4);
		MutltiTHread t2=new MutltiTHread(str1, str2, str3, str4);
		
		t1.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
