/******************************************************************************
  
 *  Purpose: Determines 
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class PermutationString {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter the string for which you we have to find permutation");
		String OriginalString = utility.inputString();
		int n = OriginalString.length();
		Utility.permutation(OriginalString, 0, n - 1);
	}
}
