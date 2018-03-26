/******************************************************************************
  
 *  Purpose: Determines the harmonic series upto n th number.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   24-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;
import com.bridgeit.utility.Utility;

public class Harmonic {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter the number upto calculate harmonic series");
		int nthNumber = utility.inputInteger();
		Utility.harmonicuptoN(nthNumber);

	}
}
