/******************************************************************************
  
 *  Purpose: Determines the whether given String are palindrome by using queue
 *  order
 * 
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PalindromeUsingDeque {
	

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Program Started ");
		System.out.println("Please Enter the String ");
		String string = utility.inputString();
		boolean status = Utility.check(string);
		if (status)
		{
			System.out.println("This String is Palindrome");
		} else 
		{
			System.out.println("This String is not Palindrome");
		}
		System.out.println("Program Ended ");
	}

}