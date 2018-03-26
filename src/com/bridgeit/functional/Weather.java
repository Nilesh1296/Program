/******************************************************************************
  
 *  Purpose: Print the Effective Weather Service by using temp,speed
 *  
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2017
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Weather {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter the temperature greater than 50");
		int temp = utility.inputInteger();
		System.out.println("Enter the wind speed which is in between 3 and 120");
		int speed = utility.inputInteger();
		Utility.nationalWeatherService(temp, speed);

	}
}
