package ArrayList;

public class Marker 
{
	String color;
	double price;
	
	Marker(){}
	
	public Marker(String color, double price) 
	{
		super();
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Marker [color=" + color + ", price=" + price + "]";
	}
	
	
	
}