package com.bridgeit.functional;
/******************************************************************************

 *  Purpose: Print the Matrix in Integer,Boolean and Double
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   24-02-2018
 *
 ******************************************************************************/

import com.bridgeit.utility.Utility;

public class Matrix {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter any choice 1 for integer, 2 for float, 3 for boolean : ");
		int choice = utility.inputInteger();
		switch (choice) {
		case 1:
			Utility.numberMatrix();
			break;
		case 2:
			Utility.floatMatrix();
			break;
		case 3:
			Utility.booleanMatrix();
			break;
		}
	}

}
