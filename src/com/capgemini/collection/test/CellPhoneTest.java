package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.CellPhone;

public class CellPhoneTest 
{

	private CellPhone samsungG9;
	private CellPhone motorolaG5;
	private CellPhone sonyT2Ultra;

	@Before
	public void setUp()
	{
		samsungG9 = new CellPhone("Samsung","G9","WaterProof", "Android",23000);
		motorolaG5 = new CellPhone("Motorola","G5Plus","GorillaGlass", "Android",25000);
		sonyT2Ultra= new CellPhone("Sony","Ultra","Efficient", "Android",21000);
	}
	
	@Test
	public void testCellPhoneWithArrayList()
	{
		ArrayList<CellPhone> phone = new ArrayList<>();
		phone.add(samsungG9);
		phone.add(motorolaG5);
		phone.add(sonyT2Ultra);
		Iterator<CellPhone> it = phone.iterator();
		assertEquals(samsungG9, it.next());
		assertEquals(motorolaG5, it.next());
		assertEquals(sonyT2Ultra, it.next());
		
	}
	
	@Test
	public void testCellPhoneWithHashSet()
	{
		HashSet<CellPhone> phone = new HashSet<>();
		phone.add(samsungG9);
		phone.add(motorolaG5);
		phone.add(sonyT2Ultra);
		assertEquals(3, phone.size());	
	}
	

}
