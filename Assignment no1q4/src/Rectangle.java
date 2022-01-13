
public class Rectangle {
	float b;
	float l;
	float rarea;
	public Rectangle(float b, float l) {
		this.b = b;
		this.l = l;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		if((b>0.0)&&(b<20.0))
		{
			this.b = b;
		}
		
	}
	public float getL() {
		return l;
	}
	public void setL(float l) {
		if((l>0.0)&&(l<20.0))
		{
		this.l = l;
		}
	}
	public float getRarea() {
		return rarea;
	}
	public void setRarea(float rarea) {
		this.rarea = rarea;
	}
}
