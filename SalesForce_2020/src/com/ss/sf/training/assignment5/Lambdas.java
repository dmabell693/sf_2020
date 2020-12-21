/**
 * assignment 5 part 1: basic lambdas
 */
package com.ss.sf.training.assignment5;

import java.util.Arrays;

/**
 * @author abelldm
 *
 */
public class Lambdas {
	
	public static void main(String[] args) {
				
		String[] words = new String[] {"crack", "pot", "excellent", "excruciating", "banana"};
		
		for (int i = 0; i < words.length; i++) {
			System.out.println("before: " + words[i]);
		}
		
		// sort short to long
		Arrays.sort(words, (w1, w2) -> w1.length() - w2.length());
		for (int i = 0; i < words.length; i++) {
			System.out.println("length: " + words[i]);
		}

		// sort long to short
		Arrays.sort(words, (w1, w2) -> w2.length() - w1.length());
		for (int i = 0; i < words.length; i++) {
			System.out.println("reverse length: " + words[i]);
		}

		// sort alphabetically
		Arrays.sort(words, (w1, w2) -> w1.charAt(0) - w2.charAt(0));
		for (int i = 0; i < words.length; i++) {
			System.out.println("alphabetically: " + words[i]);
		}

		// words with 'e' first
		Arrays.sort(words, (w1, w2) -> w1.contains("e") ? -1 : 1);
		for (int i = 0; i < words.length; i++) {
			System.out.println("contains 'e': " + words[i]);
		}

		// words with 'e' helper method
		Arrays.sort(words, (w1, w2) -> sortByE(w1));
		for (int i = 0; i < words.length; i++) {
			System.out.println("2nd contains 'e': " + words[i]);
		}		
	}
	
	public static Integer sortByE(String w1) {
		if (w1.contains("e")) {
			return -1;
		} else {
			return 1;
		}
	}
}
