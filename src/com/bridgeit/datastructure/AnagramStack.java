/******************************************************************************
  
 *  Purpose: Determines the PrimeAnagram from the range and print in the reverse
 *  order
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import com.bridgeit.utility.LinkedList1;
import com.bridgeit.utility.Utility;

public class AnagramStack {
	public static void main(String[] args) {

		int start = 1;
		int end = 1000;
		LinkedList1<Integer> listprime = new LinkedList1<Integer>();
		listprime = Utility.primeNumber(start, end);
		Utility.anagramstatck(listprime);

	}
}
