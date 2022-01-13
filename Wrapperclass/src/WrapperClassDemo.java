
public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n1=10;
      //boxing .primetive to object
      Integer iobj=new Integer(n1);
      //unboxing object to primetive
      int x=iobj.intValue();
      //----------------------------
      //java5
      int y=10;
      Integer iobj2=y;//Autoboxing
      int z=iobj2; //Autounboxing
     //---------------------
      String s="10";
      //convert string into integer
      int a=Integer.parseInt(s);
      Integer iobj3=new Integer(x);
      System.out.println(iobj3.toBinaryString(a));
      System.out.println(iobj3.toHexString(a));
      
	}

}
