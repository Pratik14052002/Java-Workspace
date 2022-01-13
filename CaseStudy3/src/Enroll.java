
public class Enroll {

	private Student student;
	private Course course;
	private String enrollDate;
	public Enroll(Student sarr, Course carr, String enrollDate) {
		this.student = sarr;
		this.course = carr;
		this.enrollDate = enrollDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	

}
