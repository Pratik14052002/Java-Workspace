
public class Course {
	private int cId;
	private String cName;
	private double duration;
	private int fees;
	public Course(int cId, String cName, double duration, int fees) {
		this.cId = cId;
		this.cName = cName;
		this.duration = duration;
		this.fees = fees;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
