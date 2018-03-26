/******************************************************************************
  
 *  Purpose: Print the gambler win or loss in a given n number of tosses
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;
import com.bridgeit.utility.Utility;

public class Gambler {
	public static void main(String args[]) {

		Utility utility = new Utility();
		System.out.println("Enter Gambler amount");
		int amount = utility.inputInteger();
		System.out.println("Enter the number of attempts");
		int attempts = utility.inputInteger();
		System.out.println("Enter the goal amount");
		int goalamount = utility.inputInteger();
		Utility.Gamblerwinsorloss(attempts, goalamount, amount);
	}
}
