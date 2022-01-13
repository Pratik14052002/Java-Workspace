class Base
{
	protected int n1;
	public Base() {
		System.out.println("BAss class constructor");
	}
	public Base(int n) {
		System.out.println("BAse calss paramatric constructor");
	}
	protected void display() {
		System.out.println("show method from Base Class ");
	}
}
class Derived1 extends Base{
	private int n1;
	public Derived1() {
		super(100);
		n1=200;
		System.out.println("Derived class class default");
	}
	public void display() {
		super.display();
		//display();
		System.out.println("Value of base class n1 is "+super.n1);
		System.out.println("Value of base class n1 is "+n1);;
	}
}
	