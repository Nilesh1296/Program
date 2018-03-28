/******************************************************************************
  
 *  Purpose: Replace the given sentence and relace with your name fullname  and
 *   contact number and current date in the sentence
 *  
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import com.bridgeit.utility.Utility;

public class RegularExpression {
	public static void main(String args[]) {
		String Sentence = "Hello <<name>>, We have your full name as <<fullname>> in our system.";
		String Sentence1 = "your contact number is 91-xxxxxxxxxx.";
		String Sentence2 = "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		String fullname = Utility.replaceNameFullname(Sentence);
		String replacemobilenumber = Utility.replaceMobilenumber(Sentence1);
		String replacedate = Utility.replaceDate(Sentence2);
		String completeSentence = fullname + replacemobilenumber + replacedate;
		System.out.println(completeSentence);
	}
}
