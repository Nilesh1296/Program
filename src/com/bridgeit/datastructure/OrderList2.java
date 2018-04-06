
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
		String sentence  = utility.fileReaderfororderlist();
		String line = sentence.trim();
		String array[] = line.split("\\s+");
		for (int i = 0; i < array.length; i++) {
			sortorderlist.add(Integer.parseInt(array[i]));
		}
		System.out.println("Enter the searchNumber ");
		int searchNumber = utility.inputInteger();
		boolean status =sortorderlist.search(searchNumber);
		LinkedList1<Integer> sortlist = new LinkedList1<Integer>();
		sortlist = utility.addRemoveorderlist(status,searchNumber,sortorderlist);
		int linkedlistarray[]=new int[sortlist.length()];
		linkedlistarray =utility.sort(sortlist);
		int sortlinkedarray[] = new int[linkedlistarray.length];
		sortlinkedarray =utility.sortasc(linkedlistarray);
		System.out.println("The sorted elements are");
		for(int i=0;i<sortlinkedarray.length;i++)
		{
			System.out.println(sortlinkedarray[i]);
		}
		
		utility.fileWriterorder(sortlinkedarray);
			
	}
}