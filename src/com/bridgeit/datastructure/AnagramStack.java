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
		LinkedList<Integer> list = new LinkedList<Integer>();
		list = Utility.primeNumber(start, end);
		LinkedList<String> list2 = new LinkedList<String>();

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) != null) {
					if (Utility.anagram(list.get(i), list.get(j))) {
						list2.add(list.get(i) + "-" + list.get(j));

					}
				}
			}
		}
		Stack1 stack = new Stack1();
		for (int i = 0; i < list2.size(); i++) {
			stack.push(list2.get(i));
		}
		String[] array = new String[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
		array[i] = (String) stack.get(i);
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i] + " ");
		}
	}
}
