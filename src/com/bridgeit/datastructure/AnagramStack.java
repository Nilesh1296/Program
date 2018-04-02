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

import java.util.LinkedList;
import com.bridgeit.utility.Utility;

public class AnagramStack {
	public static void main(String[] args) {

		int start = 1;
		int end = 1000;
		LinkedList<Integer> listprime = new LinkedList<Integer>();
		listprime = Utility.primeNumber(start, end);
		Utility.anagramstatck(listprime);

	}
}
