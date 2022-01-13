
public class Circle extends Shape {
	private float r;
	private float ca;

	public Circle(float r) {
		
		this.r = r;
	}
	@Override
	public void findArea() {
		//super.findArea();
		// TODO Auto-generated method stub
		ca=3.14f*r*r;
		System.out.println("Circle area is:"+ca);
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", ca=" + ca + "]";
	}
	
	
	
}
