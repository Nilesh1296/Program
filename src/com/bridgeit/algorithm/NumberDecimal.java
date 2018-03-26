
/******************************************************************************
  
 *  Purpose: Print the given number into decimal number
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class NumberDecimal 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
        System.out.println("Enter a decimal number");
        int decimalnumber = utility.inputInteger();
        Utility.convertBinary(decimalnumber);
  
	}
}
