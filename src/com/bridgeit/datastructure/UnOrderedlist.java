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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.bridgeit.utility.Utility;

public class UnOrderedlist {
	
	public static void main(String args[]) throws IOException {

		Utility utility = new Utility();
		LinkedList1 ll = new LinkedList1();
		FileReader fileReader = new FileReader("abc.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		String array[] = line.split(" ");
		for (int i = 0; i < array.length; i++) {
			ll.add(array[i]);
		}
		System.out.println("Enter the searchword to be found");
		String searchWord = utility.inputString();
		boolean status = ll.search(searchWord);
		LinkedList1 l3 = new LinkedList1();
		l3=Utility.addRemove(status, searchWord, ll);
		
		l3.display();
	    Utility.readFile(l3, searchWord, status, line);
		bufferedReader.close();
	}
}
