/******************************************************************************
  
 *  Purpose: Print the String in Albhabetical order by using insertion order
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   28-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Insertion {
	public static void main(String args[])

	{

		System.out.println("Enter the wodrs in the linkedlist");
		String[] stringArray = { "E", "D", "C", "B", "A", "B" };
		Utility.insertion(stringArray);

	}

}
