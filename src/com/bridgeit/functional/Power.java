/******************************************************************************
  
 *  Purpose: Determines the percentage of head and tail in given tosses of n dice.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Power
{
public static void main(String[] args)
{
	Utility utility = new Utility();
	System.out.println("Enter the power of the number");
	int power =utility.inputInteger();
	Utility.powerOf2(power);
	
}
}
