
public class Rectangle {
	float b;
	float l;
	float rarea;
	public Rectangle(float b, float l) {
		this.b = b;
		this.l = l;
	}
	public void area() 
	{
		rarea=l*b;
		System.out.println("Area of rectangle is:"+rarea);
	}

}
