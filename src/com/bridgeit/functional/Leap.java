/******************************************************************************
  
 *  Purpose: Determines the entered year is leapyear or not.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.functional;
import com.bridgeit.utility.Utility;

public class Leap
{
   public static void main(String args[])
   
   {
	   Utility utility = new Utility();
	   System.out.println("Enter the year which you want");
	   int leapyear =utility.inputInteger();
	   Utility.checkLeapyear(leapyear);
   }  
}
