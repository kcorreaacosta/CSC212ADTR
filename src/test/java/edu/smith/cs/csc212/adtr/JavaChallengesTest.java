package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.Challenges;

import edu.smith.cs.csc212.adtr.real.JavaSet;


public class JavaChallengesTest {
	@Test
	/*
	 * making sure the union does not add the same value twice
	 */
	public void testUnion () {
		SetADT <Integer> left = new JavaSet<>();
		SetADT <Integer> right = new JavaSet<>();
		
		left.insert(1);
		right.insert(3);
		left.insert(3);
		right.insert(1);
		assertEquals(Challenges.union(left,right).size(), 2);
	}
	/*
	 * test to make sure it makes a new set with the values that are equal
	 */
	@Test
	public void testIntersection () {
		SetADT <Integer> left = new JavaSet<>();
		SetADT <Integer> right = new JavaSet<>();
		
		left.insert(1);
		right.insert(3);
		left.insert(3);
		right.insert(1);
		assertEquals(Challenges.union(left,right).size(), 2);
	}
	
	}

