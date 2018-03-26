/******************************************************************************
  
 *  Purpose: Determines the arithmetic equation is balanced
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import java.util.Stack;
import com.bridgeit.utility.Utility;

public class ArithmeticExpression {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the arithematic expression=");
		String expression = utility.inputString();
		char chararray[] = expression.toCharArray();
		Stack1 stack = new Stack1();
		for (int i = 0; i < chararray.length; i++) {
			if (chararray[i] == '(') {
				stack.push("(");
			} else if (chararray[i] == ')') {
				stack.pop();
			}
		}
		boolean flag = stack.isEmpty();
		if (flag == true) 
		{
			System.out.println("Arithematic Expression is Balanced.");
		} else {
			System.out.println("Arithematic Expression is not Balanced.");
		}

	}
}
