
/******************************************************************************
  
 *  Purpose: Determines print the given input string hello inputstring how are you.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/
package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Username {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter any username whose lemgth greater than 3");
		String username = utility.inputString();
		Utility.replaceUsername(username);
	}
}
