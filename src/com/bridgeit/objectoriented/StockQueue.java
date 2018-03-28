/******************************************************************************
  
 *  Purpose: Display the contents of the jsonfile using queue
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Queue;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class StockQueue {

	Utility utility = new Utility();

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Queue<JSONObject> queue = Utility.shareTransaction();
		System.out.println(queue.toString());

	}
}
