
public class SportClassCar extends Car {

	int AirBallon;
	
	public SportClassCar(int airBallon) {
		AirBallon = airBallon;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}

	@Override
	public void display() {
		super.drive();
		super.display();
		System.out.println("Number of airballons in sports car is:"+AirBallon);
		// TODO Auto-generated method stub
		
	}
	

}
