/******************************************************************************
  
 *  Purpose: Sort the number using Merg Sort Algorithm
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   23-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {

		int[] num = { 3, 6, 1, 7, 2, 8, 10, 4, 9, 5 };
		int n = num.length;

		Utility.mergeSort(num, 0, n - 1);

		for (int h = 0; h < n; h++) {
			System.out.print(num[h] + " ");
		}
	}

}
