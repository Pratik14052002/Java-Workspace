
public class Calculation2 {
	
	float r;
	float b,h;
    float  carea;
    float  tarea;
	
	public Calculation2(float r, float b, float h) {
		this.r = r;
		this.b = b;
		this.h = h;
	}
	public float carea() {
		carea= 3.14f*r*r;
		return carea;
	}
	public float tarea() {
		tarea= b*h;
		return tarea; 
	}
	

}
