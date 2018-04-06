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
		utility.printmonthofcalendar(month, year);
	}
	}


