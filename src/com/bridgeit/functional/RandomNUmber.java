/******************************************************************************
  
 *  Purpose: Print the number of coupon without repeating any of the coupon
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class RandomNUmber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number of coupon which should generate without repeating");
		int totalcoupon = utility.inputInteger();
		Utility.randomnonrepeating(totalcoupon);

	}
}