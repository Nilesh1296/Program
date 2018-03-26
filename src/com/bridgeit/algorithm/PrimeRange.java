/******************************************************************************
  
 *  Purpose: Print the prime number within limit
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   28-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class PrimeRange
{
  public static void main(String args[])
  
  {
	  Utility utility = new Utility();
	  System.out.println("Enter the last range of the array");
	  int number = utility.inputInteger();
	  Utility.primerange(number);
	
  }
}

