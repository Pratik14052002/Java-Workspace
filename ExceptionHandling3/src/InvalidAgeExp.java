
public class InvalidAgeExp extends Exception{

	private int age;
	
    public InvalidAgeExp(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "InvalidAgeExp [ age] : "+age;
	}
    
    
}
