/******************************************************************************
  
 *  Purpose: Print the day of the given date,month and year
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class DayofCalendar {
	public static void main(String[] args) {

		System.out.println("Enter a month between 1 to 12");
		int month = Integer.parseInt(args[0]);
		System.out.println("Enter the year which is valid ");
		int year = Integer.parseInt(args[1]);
		System.out.println("Enter the date between t to 31");
		int date = Integer.parseInt(args[2]);
		Utility.calendarDay(month, date, year);
	}
}
