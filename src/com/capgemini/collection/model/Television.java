package com.capgemini.collection.model;

import java.util.Objects;

public class Television 
{
	private String company;
	private String type;
	private boolean threeDEnabled;
	private double price;
	
	public Television() 
	{
		super();
	}

	public Television(String company, String type, boolean threeDEnabled, double price) 
	{
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}

	public String getCompany() 
	{
		return company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public boolean isThreeDEnabled() 
	{
		return threeDEnabled;
	}

	public void setThreeDEnabled(boolean threeDEnabled) 
	{
		this.threeDEnabled = threeDEnabled;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Television [company=" + company + ", type=" + type + ", threeDEnabled=" + threeDEnabled + ", price="
				+ price + "]";
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(company,type,price);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj == null)
			return false;
		if(!(obj instanceof Television))
			return false;
		if(this == obj)
			return true;
		Television television = (Television) obj;
		if(this.company==television.company && this.type==television.type && this.price==television.price)
			return true;
		return false;
		
	}
}
