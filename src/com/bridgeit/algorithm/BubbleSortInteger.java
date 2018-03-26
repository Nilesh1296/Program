
/******************************************************************************
  
 *  Purpose: Determines the search of number by  using Bubblesort
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class BubbleSortInteger 
{

	public static void main(String args[])
	{
		Utility utility = new Utility();
		System.out.println("Enter the size of array");
		int size = utility.inputInteger();
		int bubble[]=new int[size];
		System.out.println("Enter the matrix value");
		for(int i=0;i<size;i++)
		{
			bubble[i]=utility.inputInteger();
		}
		int sortbubble[]=Utility.bubbleSortInt(bubble);
		System.out.println("The sorted matrix is");
		for(int i=0;i<size;i++)
		{
			System.out.println(sortbubble[i]);
		}
	}
}
