/******************************************************************************
  
 *  Purpose: Print the minimum number of notes required to dispense the amount
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class VendingMachine {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter the amount ");
		int amount = utility.inputInteger();
		Utility.vendingMachine(amount);
	}
}
