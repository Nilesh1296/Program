/******************************************************************************
  
 *  Purpose: Determines the number search using binary method
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Wordssearch {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter a string");
		String searchWord = utility.inputString();
		try {
			Utility.readFile(searchWord);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
