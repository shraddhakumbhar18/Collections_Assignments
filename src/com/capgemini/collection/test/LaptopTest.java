package com.capgemini.collection.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Laptop;

public class LaptopTest {
	
	private Laptop dellLaptop;
	private Laptop hpLaptop;
	private Laptop acerLaptop;

	@Before
	public void setUp()
	{
		dellLaptop = new Laptop("Dell","Inspiron","Windows 10", "i5");
		hpLaptop = new Laptop("HP","Pavillion","Windows 10", "i7");
		acerLaptop = new Laptop("Acer","Mint","Ubuntu", "i3");
	}
	
	@Test
	public void testLaptopWithArrayList()
	{
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		Iterator<Laptop> it = laptops.iterator();
		assertEquals(dellLaptop, it.next());
		assertEquals(hpLaptop, it.next());
		assertEquals(acerLaptop, it.next());
		
	}
	
	@Test
	public void testLaptopWithHashSet()
	{
		HashSet<Laptop> laptops = new HashSet<Laptop>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(acerLaptop);
		laptops.add(dellLaptop);
		assertEquals(3, laptops.size());	
	}
	
	
}
