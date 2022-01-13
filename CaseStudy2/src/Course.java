
public class Course {
	private int id;
	private String cname;
	private double duration;
	private double fees;
	public Course(int id, String cname, double duration, double fees) {
		this.id = id;
		this.cname = cname;
		this.duration = duration;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	

}
