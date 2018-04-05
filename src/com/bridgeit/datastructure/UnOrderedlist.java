/******************************************************************************
  
 *  Purpose: Read the Text from a file, split it into words and arrange it as 
 *  Linked List. Take a user input to search a Word in the List. If the Word 
 *  is not found then add it to the list, and if it found then remove the word
 *  from the List. In the end save the list into a file

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

public class UnOrderedlist {

	public static void main(String args[]) throws IOException {
		LinkedList1<String> linkedlistunorder = new LinkedList1<String>();
		Utility utility = new Utility();
		String sentence = utility.fileReader();
		String line = sentence.trim();
		String array[] = line.split("\\s+");
		for (int i = 0; i < array.length; i++) {
			linkedlistunorder.add(array[i]);
		}
		System.out.println("Enter the searchword to be found");
		String searchWord = utility.inputString();
		Utility.fileWriter(searchWord, linkedlistunorder, line);

	}
}
