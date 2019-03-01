package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testSize() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		assertEquals(abc.size(),3);
	}
	
	@Test
	public void testInsert() {
		//add A 3x and make sure size is 1!
		SetADT<String> a = new JavaSet<>();
		a.insert("a");
		a.insert("a");
		a.insert("a");
		assertEquals(a.size(),1);
	}
	
	@Test
	public void testContains() {
		SetADT<String> containTest = new JavaSet<>();
		containTest.insert("a");
		containTest.insert("b");
		containTest.insert("c");
		assertTrue(containTest.contains("a"));
		}
	
	@Test
	public void testRemove() {
		SetADT<String> removeTest = new JavaSet<>();
		removeTest.insert("a");
		removeTest.insert("b");
		removeTest.insert("c");
		removeTest.remove("a");
		assertEquals(removeTest.contains("a"),false);
	}
	@Test
	public void testtoList() {
		SetADT<String> testToList = new JavaSet<>();
		testToList.insert("a");
		assertEquals(testToList.toList().size(),1);
	}
	
	@Test
	public void testtoJava() {
		SetADT<String> testtoJava = new JavaSet<>();
		testtoJava.insert("a");
		testtoJava.insert("b");
		testtoJava.insert("c");
		testtoJava.remove("a");
		assertEquals(testtoJava.toJava().size(),2);
	}
}

