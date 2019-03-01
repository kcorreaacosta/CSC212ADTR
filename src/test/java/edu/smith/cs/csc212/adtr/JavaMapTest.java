package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
/**
 * JJ code from lab
 * @param x
 * @param y
 */
	void assertIntEq(int x, int y) {
		assertEquals(x,y);
	}
	
	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void putFruits() {
		MapADT<String, Integer> putFruits = new JavaMap<>();
		putFruits.put("apple", 0);
		putFruits.put("mango", 1);
		putFruits.put("kiwi", 2);
		putFruits.put("mango",1 );
		assertEquals(putFruits.size(), 3);
	}
	
	@Test
	public void getFruits() {
		MapADT<String, Integer> getFruits = new JavaMap<>();
		getFruits.put("apple", 0);
		getFruits.put("mango", 1);
		getFruits.put("kiwi", 2);
		assertEquals(getFruits.size(), 3);
	}
	
	@Test
	public void sizeofFruits() {
		MapADT<String, Integer> sizeofFruits = new JavaMap<>();
		sizeofFruits.put("apple", 0);
		sizeofFruits.put("mango", 1);
		sizeofFruits.put("kiwi", 2);
		sizeofFruits.put("kiwi", 2);
		assertEquals(sizeofFruits.size(), 3);
	}
	
	@Test
	public void removeFruits() {
		MapADT<String, Integer> removeFruits = new JavaMap<>();
		removeFruits.put("apple", 0);
		removeFruits.put("mango", 1);
		removeFruits.put("kiwi", 2);
		removeFruits.remove("kiwi");
		assertEquals(removeFruits.size(), 2);
	}
	
	@Test
	public void TestgetKeys() {
		MapADT<String, Integer> TestgetKeys = new JavaMap<>();
		TestgetKeys.put("apple", 0);
		TestgetKeys.put("mango", 1);
		TestgetKeys.put("kiwi", 2);
		TestgetKeys.remove("kiwi");
		assertEquals(TestgetKeys.getKeys().size(), 2);
	}
	
	@Test
	public void TestgetEntries() {
		MapADT<String, Integer> TestgetEntries = new JavaMap<>();
		TestgetEntries.put("apple", 0);
		TestgetEntries.put("mango", 1);
		TestgetEntries.put("kiwi", 2);
		TestgetEntries.remove("kiwi");
		assertEquals(TestgetEntries.getEntries().size(), 2);
	}
	
	@Test
	public void TesttoJava() {
		MapADT<String, Integer> TesttoJava = new JavaMap<>();
		TesttoJava.put("apple", 0);
		TesttoJava.put("mango", 1);
		TesttoJava.put("kiwi", 2);
		TesttoJava.remove("kiwi");
		assertEquals(TesttoJava.toJava().size(), 2);
	}
}
