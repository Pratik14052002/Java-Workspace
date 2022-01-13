
public class Toyota extends AutomobileVar implements Car{
public Toyota(String model, String color, String price) {
		
		this.model = model;
		this.color = color;
		this.price = price;
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "102";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "200000";
	}

}
