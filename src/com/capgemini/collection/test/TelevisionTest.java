package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Television;

public class TelevisionTest 
{
	private Television samsungTv;
	private Television sonyTv;
	private Television panasonicTv;

	@Before
	public void setUp() 
	{
		samsungTv = new Television("Samsung", "LED", true, 50000);
		sonyTv = new Television("Sony", "LCD", true, 60000);
		panasonicTv = new Television("Panasonic", "Plasma", true, 70000);
	}

	@Test
	public void testTelevisionWithArrayList() 
	{
		ArrayList<Television> television = new ArrayList<>();
		television.add(samsungTv);
		television.add(sonyTv);
		television.add(panasonicTv);
		Iterator<Television> it = television.iterator();
		assertEquals(samsungTv, it.next());
		assertEquals(sonyTv, it.next());
		assertEquals(panasonicTv, it.next());

	}


	@Test
	public void testTelevisionWithHashSet()
	{
		HashSet<Television> television = new HashSet<>();
		television.add(samsungTv);
		television.add(sonyTv);
		television.add(panasonicTv);
		television.add(panasonicTv);
		assertEquals(3,television.size());	
	}
}
