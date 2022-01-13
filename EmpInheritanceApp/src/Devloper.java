
public class Devloper extends Employee{

	private int  noHr;

	public Devloper(int empId, String empNAme, int noHr) {
		super(empId, empNAme);
		this.noHr = noHr;
	}

	public int getNoHr() {
		return noHr;
	}

	public void setNoHr(int noHr) {
		this.noHr = noHr;
	}
	
	
}
