/******************************************************************************
  
 *  Purpose: From a stock of company we have to add stock,delete stock update 
 *  date,sell share,buy share of a stack
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import com.bridgeit.utility.Utility;

public class Commercialdata {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
		Utility utility = new Utility();
		System.out.println("Enter any positive number");
		int choice1 = utility.inputInteger();
		utility.inputString();
		while (choice1 > 0) {
			System.out.println("enter 1 to add share details to the file");
			System.out.println("enter 2 to delete the share from the file");
			System.out.println("enter 3 to count number of account");
			System.out.println("enter 4 to sell number of share");
			System.out.println("enter 5 to buy number of share ");
			System.out.println("enter 6 to display the json file");
			System.out.println("Enter the choice");
			int choice = utility.inputInteger();
			utility.inputString();
			switch (choice) {
			case 1:

				utility.addtoFile("Stockaccount.json");
				break;

			case 2:
				utility.deletetoFile("Stockaccount.json");
				break;

			case 3:
				int count1 = utility.numberofrecordofpersons("Stockaccount.json");
				System.out.println("The number of account is"+count1);

				break;

			case 4:
				System.out.println("enter the number of share to sell");
				long shareToSell = utility.inputLong();

				utility.sell(shareToSell);
				break;
			case 5:
				System.out.println("enter the number of share to buy");
				long sharetoBuy = utility.inputLong();
				utility.buy(sharetoBuy);
				break;
			case 6:
				System.out.println("display the json file");
				utility.displaynoshare("Stockaccount.json");
				break;
			}

		}
	}
}
