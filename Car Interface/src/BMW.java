
public class BMW extends AutomobileVar implements Car{
public BMW(String model, String color, String price) {
		
		this.model = model;
		this.color = color;
		this.price = price;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "103";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "300000";
	}

}
