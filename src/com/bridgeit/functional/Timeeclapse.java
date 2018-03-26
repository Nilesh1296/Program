/******************************************************************************
  
 *  Purpose: Print the time difference between two function
 *  geometry by using math.sqrt function.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2017
 *
 ******************************************************************************/

package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Timeeclapse {

	public static void main(String[] args)

	{
		long Starttime = Utility.start();
		long EndTime = Utility.end();
		Utility.duration(EndTime, Starttime);

	}
}
