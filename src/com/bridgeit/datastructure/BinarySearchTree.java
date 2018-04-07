/******************************************************************************
  
 *  Purpose: Determines the number of possible arrangement  of a binary tree of
 *   node n
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/


package com.bridgeit.datastructure;
import com.bridgeit.utility.Utility;

public class BinarySearchTree 
{
  public static void main(String args[])
  {
	  Utility utility = new Utility();
		System.out.println("Enter the number of node: ");
		int numberofnode = utility.inputInteger();
		utility.NumberOfBinarySearchTree(numberofnode);
  }
}
