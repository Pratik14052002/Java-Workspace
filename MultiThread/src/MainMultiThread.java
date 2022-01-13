
public class MainMultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo t1=new Demo("Java");
         Demo t2=new Demo("python");
         System.out.println(t1);
         t1.setName("UserThread");
         System.out.println(t1.isAlive());
         System.out.println(t1.isAlive());
         t1.start();
         t2.start();
         System.out.println(t1.isAlive());
         System.out.println(t1.isAlive());
         
         for(int i=0;i<=5;i++)
         {
        	 System.out.println("Main :"+i);
        	 try {
 				t1.sleep(4000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
        	 
         }
         
	}

}
