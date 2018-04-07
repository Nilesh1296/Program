/******************************************************************************

 *  Purpose: Create a Slot of 10 to store Chain of Numbers that belong to each
 *   Slot to efficiently search a number from a given set of number
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   18-03-2017
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import java.io.IOException;
import com.bridgeit.utility.LinkedList1;
import com.bridgeit.utility.Utility;

public class HashingFunction {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		LinkedList1<String> listofnumber = new LinkedList1<String>();
	
		String sentence = utility.hashmapFileReader();
		String line = sentence.trim();
		String[] strarray = line.split("\\s+");
		int n = strarray.length;
		Integer arr[] = new Integer[strarray.length];
		for (int i = 0; i < strarray.length; i++) {
			listofnumber.add(strarray[i]);
			arr[i] =Integer.parseInt(listofnumber.dataAtPosition(i));
		}
		System.out.println();
		System.out.println("The sorted array are");
		Integer[] sortarray=new Integer[strarray.length];
		sortarray =utility.sortArray(arr, n);
		utility.put(sortarray);
		System.out.println("Enter a number to be search");
		String searchnumber = utility.inputString();
		boolean status = listofnumber.search(searchnumber);
		Utility.addRemoveSlotWise(status, searchnumber, listofnumber, line);
		listofnumber.display();
		utility.writeFileHashmap(listofnumber, searchnumber, status, line);

	}
}
