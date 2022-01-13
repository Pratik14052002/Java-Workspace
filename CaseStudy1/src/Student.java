public class Student {

	private int stuId;
    private String stuName;
    private String dateofbirth;
	public Student(int stuId, String stuName, String dateofbirth) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.dateofbirth = dateofbirth;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
}
