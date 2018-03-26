
/******************************************************************************

 *  Purpose: Print the Prime factor of a number
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/
package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class PrimeFactor {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter any mumber");
		int number = utility.inputInteger();
		Utility.primeFactor(number);

	}
}