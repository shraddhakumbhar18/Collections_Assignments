package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.collection.model.Student;

public class StudentTest 
{
	private Student student1;
	private Student student2;
	private Student student3;
	private Student student4;

	@Before
	public void setUp()
	{
		student1 = new Student(1,"Shraddha","Nashik","Nashik", "A");
		student2 = new Student(2,"Mehvash","Panvel","Mumbai", "A");
		student3 = new Student(3,"Akshata","Kalyan","Mumbai", "A");
		student4 = new Student(4,"Pradnya","Nashik","Nashik", "A");
	}
	
	@Test
	public void testStudentWithArrayList()
	{
		ArrayList<Student> student = new ArrayList<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		Iterator<Student> it = student.iterator();
		assertEquals(student1, it.next());
		assertEquals(student2, it.next());
		assertEquals(student3, it.next());
		assertEquals(student4, it.next());
	}
	
	@Test
	public void testStudentWithTreeSet()
	{
		TreeSet<Student> student = new TreeSet<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		Iterator<Student> it = student.iterator();
		assertEquals(student3, it.next());
		assertEquals(student2, it.next());
		assertEquals(student4, it.next());
		assertEquals(student1, it.next());
		
	}
	
	@Test
	public void testStudentWithMap()
	{
		HashMap<String, String> student = new HashMap<>();
		student.put(student1.getName(), "Mango");
		student.put(student2.getName(), "Orange");
		student.put(student3.getName(), "Papaya");
		student.put(student4.getName(), "Grapes");
		
		assertEquals("Mango", student.get(student1.getName()));
		assertEquals("Orange", student.get(student2.getName()));
		assertEquals("Papaya", student.get(student3.getName()));
		assertEquals("Grapes", student.get(student4.getName()));
		
		assertTrue(student.keySet().contains(student1.getName()));
		assertTrue(student.keySet().contains(student2.getName()));
		assertTrue(student.keySet().contains(student3.getName()));
		assertTrue(student.keySet().contains(student4.getName()));
		
		assertTrue(student.values().contains("Mango"));
		assertTrue(student.values().contains("Orange"));
		assertTrue(student.values().contains("Papaya"));
		assertTrue(student.values().contains("Grapes"));
	}
}
