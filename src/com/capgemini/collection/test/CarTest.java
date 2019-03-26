package com.capgemini.collection.test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Car;

public class CarTest {

	private Car bmwCar;
	private Car lodgyCar;
	private Car jagquarCar;
	
	@Before
	public void setUp()
	{
		bmwCar = new Car("BMW","bmw",2015, 50000);
		lodgyCar = new Car("Renault","lodgy",2016, 60000);
		jagquarCar = new Car("Jagquar","jagquarlx",2017, 70000);
		
	}
	@Test
	public void testCarWithArrayList()
	{
		ArrayList<Car> car = new ArrayList<>();
		car.add(bmwCar);
		car.add(lodgyCar);
		car.add(jagquarCar);
		assertEquals(3, car.size());	
	}
	
	@Test
	public void testCarWithTreeSet()
	{
		TreeSet<Car> car = new TreeSet<>();
		car.add(bmwCar);
		car.add(lodgyCar);
		car.add(jagquarCar);
		Iterator<Car> it = car.iterator();
		assertEquals(bmwCar, it.next());
		assertEquals(jagquarCar, it.next());
		assertEquals(lodgyCar, it.next());
	}
	
}
