package com.capgemini.collection.model;

import java.util.Objects;

public class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	private String city;
	private String schoolDistrict;
	private String schoolRanking;
	
	public Student() 
	{
		super();
	}

	public Student(int rollNo, String name, String city, String schoolDistrict, String schoolRanking) 
	{
		super();
		this.rollNo=rollNo;
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.schoolRanking = schoolRanking;
		
	}
	

	public int getRollNo() 
	{
		return rollNo;
	}

	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getSchoolDistrict() 
	{
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) 
	{
		this.schoolDistrict = schoolDistrict;
	}

	public String getSchoolRanking() 
	{
		return schoolRanking;
	}

	public void setSchoolRanking(String schoolRanking) 
	{
		this.schoolRanking = schoolRanking;
	}

	
	

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", schoolRanking=" + schoolRanking + "]";
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(rollNo,name,city,schoolDistrict);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj == null)
			return false;
		if(!(obj instanceof Student))
			return false;
		if(this == obj)
			return true;
		Student student = (Student) obj;
		if(this.rollNo==student.rollNo && this.name==student.name && this.city==student.city && this.schoolDistrict==student.schoolDistrict)
			return true;
		return false;
		
	}

	@Override
	public int compareTo(Student student) 
	{
		String name1 = this.name;
		String name2 = student.name;
		int result = name1.compareTo(name2);
		if(result==0)
		{
			result=Integer.compare(this.rollNo, student.rollNo);
		}
		return result;
		
	}

}
