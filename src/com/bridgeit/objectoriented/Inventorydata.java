/******************************************************************************
  
 *  Purpose: Determine to write data in json file for wheat rice and pulse and
 *  fetch the data from json file and total price of all the three items
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Inventorydata {
	public static void main(String args[]) throws IOException {

		Utility.writeData();
		Utility.readData();
	}
}
