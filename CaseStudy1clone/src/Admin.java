
public class Admin {
	private int adminId;
    private String adminName;
    private String dob;
	public Admin(int adminId, String adminName, String dob) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.dob = dob;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
    

}
