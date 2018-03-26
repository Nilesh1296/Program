/******************************************************************************
  
 *  Purpose: Print the Calendar of the given month and year
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class Calendar1 {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the month");
		int month = utility.inputInteger();
		System.out.println("Enter the year");
		int year = utility.inputInteger();

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean status = Utility.isLeapYear(year);
		if (month == 2 && status) {
			days[month] = 29;
		}

		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");

		int d = Utility.day(month, 1, year);

		Utility.print1(d, month,year);
	}
	}


