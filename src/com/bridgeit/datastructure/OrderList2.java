
/******************************************************************************

 *  Purpose: Read the Text from a file, split it into number and arrange it as 
 *  Linked List. Take a user input to search a Word in the List. If the number
 *  is not found then add it to the list, and if it found then remove the word
 *  from the List. In the end save the list into a file use order linkedlist

 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2017
 *
 ******************************************************************************/
package com.bridgeit.datastructure;

import java.io.IOException;

import com.bridgeit.utility.LinkedList1;
import com.bridgeit.utility.Utility;

public class OrderList2 {
	public static void main(String[] args) throws IOException {

		LinkedList1<Integer> sortorderlist = new LinkedList1<Integer>();
		Utility utility = new Utility();
		sortorderlist = Utility.orderListFileReader();
		System.out.println("Size of Lis : " + sortorderlist.length());
		sortorderlist.display();
		System.out.print("\nEnter a number to search : ");
		int search = utility.inputInteger();
		sortorderlist.search(search);
		System.out.println("Size of Lis : " + sortorderlist.length());
	/*	sortorderlist = sortorderlist.printList(sortorderlist);
		sortorderlist.fileWriter1();*/

	}
}