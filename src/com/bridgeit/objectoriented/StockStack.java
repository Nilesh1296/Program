/******************************************************************************
  
 *  Purpose: Display the contents of Stock using Stack
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class StockStack {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Stack<JSONObject> stack = Utility.shareTransactionusingStack();
		System.out.println(stack.toString());
	}
}
