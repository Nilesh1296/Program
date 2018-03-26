/******************************************************************************
  
 *  Purpose:Sort the String using insertionsort
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   28-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class InsertionSortString {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("Enter the size of the array");
		int size = utility.inputInteger();
		String arr[] = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = utility.inputString();
		}
		String arr1[] = Utility.insertionSortString1(arr);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
