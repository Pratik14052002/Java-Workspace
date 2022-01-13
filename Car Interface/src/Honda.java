
public class Honda extends AutomobileVar implements Bike {
public Honda(String model, String color, String price,int nocc) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.nocc= nocc;	
}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int getnocc() {
		// TODO Auto-generated method stub
		return nocc;
	}

}
