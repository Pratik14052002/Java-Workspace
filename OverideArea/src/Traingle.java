
public class Traingle extends Shape {
	private float b;
	private float h;
	private float ta;

	public Traingle(float b, float h) {
		super();
		this.b = b;
		this.h = h;
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		ta=b*h;
        System.out.println("Traingle area is:"+ta);
	}

	@Override
	public String toString() {
		return "Traingle [b=" + b + ", h=" + h + ", ta=" + ta + "]";
	}
	
	

}
