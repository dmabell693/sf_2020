/**
 * assignment 5 part 4: Date-Time API
 */
package com.ss.sf.training.assignment5;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
/**
 * @author abelldm
 *
 */
public class DateTime {

	public static void main(String[] args) {
		
		LocalDateTime birthday = LocalDateTime.of(1990, 02, 06, 14, 06, 32, 0000333);
		
		System.out.println(birthday);
		
		LocalDate today = LocalDate.now();
		
		LocalDate previousThursday = today.with( TemporalAdjusters.previous( DayOfWeek.THURSDAY ) ) ;

		System.out.println(previousThursday);
		
	}

}
