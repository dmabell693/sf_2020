/**
 * assignment 5 part 3: return a list of strings that start with 'a' and have three letters
 */
// Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters

package com.ss.sf.training.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author abelldm
 *
 */
public class ThreeLetterA {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		
		words.add("app");
		words.add("jar");
		words.add("binks");
		words.add("crushed");
		words.add("ass");
		words.add("apple");
		
		System.out.println("before filter: " + words);
		
		words.stream().filter(w -> w.length() == 3 && w.substring(0, 1).contains("a"));
		
		List<String> threeLetterA = words.stream().filter(w -> w.length() == 3 && w.substring(0, 1).contains("a")).collect(Collectors.toList());
		
		System.out.println("after filter: " + threeLetterA);
				
	}

}
