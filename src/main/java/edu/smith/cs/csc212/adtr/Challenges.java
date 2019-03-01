package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {
/*
 *  I went to TA hours and got help, I also talked through some issues with Ileanna
 */
	
	
	// The union of two sets is the set of elements that either contains.
	public static SetADT<Integer> union(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
/*
 * takes the sets and makes them into list, then runs through both list
 * unifies the list into one set without having any repeats of the values
 */
		ListADT <Integer> leftList = left.toList();
		ListADT <Integer> rightList = right.toList();
		
		for(int i = 0 ; i < left.size();i++) {
			if(!output.contains(leftList.getIndex(i) ) ) {
				output.insert(leftList.getIndex(i) );
			}
		for(int j = 0 ; j < left.size(); j++) {
			if(!output.contains(rightList.getIndex(j) ) ) {
				output.insert(rightList.getIndex(j) );
			}
		}
		}
		return output;
	
	}
	
	// The intersection of two sets is the set of elements that both contain.
	public static SetADT<Integer> intersection(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
	/*
	 * makes both sets into list then compares both list and separates 
	 * whatever is the same into a new set
	 */
		ListADT <Integer> leftList = left.toList();
		ListADT <Integer> rightList = right.toList();
		
		for(int i = 0 ; i < left.size();i++) {
			for(int j = 0 ; j < left.size(); j++) {
				if(rightList.getIndex(j) == leftList.getIndex(i) ) {
					output.insert(rightList.getIndex(j) );
				}
			}
		}
		return output;
	}
	
	// Count the words in the input list and put them in the map.
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		for (int i  = 0; i < words.size(); i++) {
			output.put(words.getIndex(i), i);
		}
		return output;
	}
}
