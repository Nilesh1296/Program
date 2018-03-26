/******************************************************************************
  
 *  Purpose: Determine the monthly payment required to pay a principal amount 
 *  
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Principalamount {
	public static void main(String args[]) {

		System.out.println("Enter the principal amount");
		double principal = Double.parseDouble(args[0]);
		System.out.println(principal);
		System.out.println("Enter the year ");
		double year = Double.parseDouble(args[1]);
		System.out.println(year);
		System.out.println("Enter the interest rate");
		double rate = Double.parseDouble(args[2]);
		System.out.println(rate);
		Utility.monthlyPayment(principal, year, rate);

	}

}
