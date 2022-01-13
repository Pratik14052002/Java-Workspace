
public class Address {


	private String state;
	private String city;
	private String pincode;
	
	public Address(String state, String city, String pinclode) {
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPinclode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
