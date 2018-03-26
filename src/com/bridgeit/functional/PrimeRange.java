/******************************************************************************
  
 *  Purpose: Determines 
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   26-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class PrimeRange {
	public static void main(String args[])

	{
		Utility utility = new Utility();
		System.out.println("Enter the maximum range do you want to enter");
		int number = utility.inputInteger();
		Utility.primerange(number);

	}
}
