/******************************************************************************
  
 *  Purpose: Determines the given two String is anagram or not
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Anagram {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter a first string");
		String firststring = utility.inputString();
		System.out.println("Enter a secondString");
		String secondstring = utility.inputString();
		Utility.anagram(firststring, secondstring);
	}
}
