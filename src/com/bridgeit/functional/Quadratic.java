/******************************************************************************
  
 *  Purpose: Determines 
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   25-02-2018
 *
 ******************************************************************************/
package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int a, b, c;

		System.out.println("Given quadratic equation:ax^2 + bx + c");
		System.out.print("Enter a");
		a = utility.inputInteger();
		System.out.print("Enter b");
		b = utility.inputInteger();
		System.out.print("Enter c");
		c = utility.inputInteger();
		System.out.println("Given quadratic equation:" + a + "x^2 + " + b + "x + " + c);
		Utility.rootsofQuadratic(a, b, c);
	}
}
