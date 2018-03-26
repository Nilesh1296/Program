/******************************************************************************
  
 *  Purpose: Print the temperature into celsius and fahrenheit
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Temperatureconversion {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter the temperature in celsius");
		double celsius = utility.inputDouble();
		System.out.println("Enter the temperature in fahrenheit ");
		double fahrenheit = utility.inputDouble();
		Utility.celsiusFarhen(celsius, fahrenheit);
	}
}
