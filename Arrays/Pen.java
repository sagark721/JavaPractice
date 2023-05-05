package Arrays;

public class Pen {

	int price;
	String brand;
	Pen() {}
	
	public Pen(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Pen [price=" + price + ", brand=" + brand + "]";
	}
	
	
	

}
