/******************************************************************************
  
 *  Purpose: Determines the arithmetic equation is balanced
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class ArithmeticExpression {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the arithematic expression=");
		String expression = utility.inputString();
		Utility.checkArithmeticExpression(expression);
	}
}
