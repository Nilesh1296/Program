/******************************************************************************
  
 *  Purpose: Print the calender by using month and year 
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/
package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class WeekCalender {
	static String month[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	static int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static char week[] = { ' ', 'S', 'M', 'T', 'W', 'T', 'F', 'S' };
	static int months;

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Please Enter the year ");
		int year = utility.inputInteger();
		System.out.println("Please Enter the months");
		months = utility.inputInteger();
		Utility.leapYear(year);
		int daycode = utility.dayCode(year, months);
		utility.storeDay(daycode, months,year);
		System.out.println();

	}
}