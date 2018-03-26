/******************************************************************************
  
 *  Purpose:Swap the nibble of Binarynumber and find the decimal number
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   28-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class BinaryExchange {
	public static void main(String arsg[]) {
		Utility utility = new Utility();
		System.out.println("Enter any number from user");
		int number = utility.inputInteger();
		String s2 = Utility.convertBinary1(number);
		System.out.println("The number to binary conversion is" + s2);
		String swappedString = Utility.newNibble(s2);
		int swapnewNumber = Integer.parseInt(swappedString);
		System.out.println("The new Swapped String is" + swapnewNumber);
		int decimal = utility.BinaryToDecimal(swapnewNumber);
		System.out.println("The decimal conversion of new SwappedNumber" + decimal);
	}
}