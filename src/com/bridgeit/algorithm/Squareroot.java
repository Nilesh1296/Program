/******************************************************************************
  
 *  Purpose: Print the Squareroot of the given number using newton formula
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   28-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Squareroot {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number from user ");
		double a = utility.inputDouble();
		Utility.SqrtNew(a);

	}

}
