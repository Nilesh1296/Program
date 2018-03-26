/******************************************************************************
  
 *  Purpose: Determine the sum of the three integer is equal to zero and count 
 *  it
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   26-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class SumofThreeInteger {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number of elements ");
		int number = utility.inputInteger();
		Utility.sumofThreeInteger(number);
	}
}
