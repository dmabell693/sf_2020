/**
 * assignment 5 part 2: comma separated string
 */
package com.ss.sf.training.assignment5;

/**
 * @author abelldm
 *
 */
public class CommaSeparatedString {
	
	public static void main(String[] args) {

		CommaSeparatedString commaSepString = new CommaSeparatedString();
		
		int[] intArray = { 3, 44, 63, 77, 4, 7, 4, 8 };
		
		commaSepString.convertToString(intArray);
		
	}
	
	public void convertToString(int[] intArray) {
				
		String concatString = new String("");
		
		int[] localArr = intArray;
						
		for (int i = 0; i < localArr.length; i++) {
			
			Integer num = Integer.valueOf(localArr[i]);
						
			String odd = new String("o");
			String even = new String("e");
			
			if (i == localArr.length - 1) {
				if (num % 2 == 0) {
					even = even.concat(num.toString());
					concatString = concatString + even;
				} else {
					odd = odd.concat(num.toString());
					concatString = concatString + odd;
				}
			} else {
				if (num % 2 == 0) {
					even = even.concat(num.toString());
					concatString = concatString + even + ",";
				} else {
					odd = odd.concat(num.toString());
					concatString = concatString + odd + ",";
				}
			}			
		}
		System.out.println(concatString);
		
//		for (int a : localArr) {
//		Integer num = Integer.valueOf(a);
//		String odd = new String("o");
//		String even = new String("e");
//
//		if (a == localArr.length-1) {
//			if (a % 2 == 0) {
//				concatString = concatString + "e" + num.toString();
//			} else {
//				concatString = concatString + "o" + num.toString();
//			}
//		} else {
//			if (a % 2 == 0) {
//				concatString = concatString + "e" + num.toString() + ",";
//			} else {
//				concatString = concatString + "o" + num.toString() + ",";
//			}
//		}
//		
//		System.out.println(concatString);
//	
//	}

	}
}
