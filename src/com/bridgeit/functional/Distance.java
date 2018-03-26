/******************************************************************************
  
 *  Purpose: Determines the distance between two points in two coordinate 
 *  geometry by using math.sqrt function.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2017
 *
 ******************************************************************************/
package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

class Distance {
	public static void main(String args[]) {
		System.out.println("enter x1 point");
		Utility utility = new Utility();
		double x1 = utility.inputDouble();
		System.out.println("enter y1 point");
		double y1 = utility.inputDouble();
		System.out.println("enter x2point");
		double x2 = utility.inputDouble();
		System.out.println("enter y2 point");
		double y2 = utility.inputDouble();
		Utility.distance(x1, y1, x2, y2);

	}

}
