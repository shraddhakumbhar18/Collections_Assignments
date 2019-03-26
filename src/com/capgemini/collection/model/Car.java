package com.capgemini.collection.model;

import java.util.Objects;

public class Car implements Comparable<Car>
{
	private String brand;
	private String model;
	private int year;
	private double price;
	
	public Car() 
	{
		super();
		
	}
	public Car(String brand, String model, int year, double price) 
	{
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(brand,model);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj == null)
			return false;
		if(!(obj instanceof Car))
			return false;
		if(this == obj)
			return true;
		Car car = (Car) obj;
		if(this.brand==car.brand && this.model==car.model)
			return true;
		return false;
		
	}
	@Override
	public int compareTo(Car car) 
	{
		String name1 = this.brand;
		String name2 = car.brand;
		String model1 = this.model;
		String model2 = car.model;
		int result = name1.compareTo(name2);
		if(result == 0)
		{
			result = model1.compareTo(model2);
		}
		return result;
	}
}
