package ObjectClass;

import java.util.Arrays;

public class Bike implements Comparable {
	String brand;
	double price;
	
	Bike(){}
	
	public Bike(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public int compareTo(Object o) {
		Bike b1= (Bike) o;
		
		return this.brand.compareTo(b1.brand);
	}
	
	public String toString() {
		return "Brand: "+this.brand+" =====>>>>> Price: "+this.price;
	}
	
	
	public static void main(String[] args) {
		
		Bike [] bikes=new Bike[5];
		
		bikes[0]=new Bike("Yamaha",150000);
		bikes[1]=new Bike("Honda",120000);
		bikes[2]=new Bike("Hero",85000);
		bikes[3]=new Bike("Suzuki",125000);
		bikes[4]=new Bike("Royal Enfield",200000);
		
		System.out.println("Elements in Array: ");
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i]);
		}
		
		System.out.println("After Sorting by Brand: ");
		Arrays.sort(bikes);
		
		
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i]);
		}
		
		System.out.println("After Sorting by Price: ");
		Arrays.sort(bikes,new SortByPrice());
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i]);
		}
		
	}
	
	
	
}
