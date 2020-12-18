/**
 * assignment 4 part 4: junit test
 */
package com.ss.sf.training.assignment4;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

//import com.ss.sf.training.assignment4.Line;

/**
 * @author abelldm
 *
 */
public class LineTest {

	Line line = new Line(1, 2, 3, 4);
	Line line1 = new Line(2, 4, 6, 8);
	Line line2 = new Line(12, 15, 4, 8);
	Line line3 = new Line(4, 8, 12, 16);
	Line line4 = new Line(73, 2, 8, 12);

	@Test
	public void getSlopeTest() {
		assertEquals(1, line.getSlope(), 1);
		assertNotEquals(2, line.getSlope());
		
		assertEquals(1, line1.getSlope(), 1);
		assertNotEquals(2, line1.getSlope());
		
		assertEquals(1, line3.getSlope(), 1);
		assertNotEquals(2, line3.getSlope());		
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(2.82842712474619, line.getDistance(), 2.82842712474619);
		assertNotEquals(12, line.getDistance());
		
		assertEquals(2.82842712474619, line.getDistance(), 2.82842712474619);
		assertNotEquals(12, line1.getDistance());

		assertEquals(2.82842712474619, line.getDistance(), 2.82842712474619);
		assertNotEquals(12, line3.getDistance());
	}
	
	@Test
	public void parallelToTest() {
		assertTrue(line.parallelTo(line1));
		assertFalse(line.parallelTo(line2));

		assertTrue(line1.parallelTo(line3));
		assertFalse(line3.parallelTo(line4));
		
		assertTrue(line.parallelTo(line3));
		assertFalse(line2.parallelTo(line4));
	}	
}
