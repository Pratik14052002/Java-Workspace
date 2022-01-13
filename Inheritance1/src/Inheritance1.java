class A{
	protected int n1=20;
	public A() {
		
		System.out.println("Class A constructor");
	}
}
class B extends A{
	public B() {
		System.out.println("Class B constructor"+n1);
	}
}
class C extends B {
	public C() {  
		System.out.println("Class C constructor");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Class");
		
		C c1=new C();
		
		System.out.println("---------------Thank you---------------");

	}

}
