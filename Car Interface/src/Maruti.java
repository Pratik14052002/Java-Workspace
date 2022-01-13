
public class Maruti extends AutomobileVar  implements Car{
    
	public Maruti(String model, String color, String price) {
		
		this.model = model;
		this.color = color;
		this.price = price;
	}
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "101";
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "20000";
	}

}
