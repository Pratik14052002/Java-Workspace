
public class InvalidAge extends Exception{

int age;
	
	public InvalidAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "InvalidAge Excepton\t"+"your age is" + age ;
	}

}
