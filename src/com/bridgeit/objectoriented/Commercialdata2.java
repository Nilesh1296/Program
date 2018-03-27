package com.bridgeit.objectoriented;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class Commercialdata2 {
	
		
		public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
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

					Utility.addtoFile("Stockaccount.json");
					break;

				case 2:
					Utility.deletetoFile("Stockaccount.json");
					break;

				case 3:
					int count1 = Utility.numberofrecordofpersons("Stockaccount.json");
					System.out.println(count1);

					break;

				case 4:
					System.out.println("enter the number of share to sell");
					long shareToSell = utility.inputLong();
					
					Utility.sell(shareToSell);
					break;
				case 5:
					System.out.println("enter the number of share to buy");
					long sharetoBuy = utility.inputLong();
					Utility.buy(sharetoBuy);
					break;
				case 6 :
					System.out.println("display the json file");
					Utility.displaynoshare("Stockaccount.json");
					break;
				}

			}
		}
	}
	

	