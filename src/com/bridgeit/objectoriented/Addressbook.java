package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class Addressbook 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		System.out.println("Enter any positive number");
		int choice1 = utility.inputInteger();
       Addressbookmethod addressbook = new Addressbookmethod();
		while (choice1 > 0) {
            System.out.println("enter 1 to add addressbook to the file");
            System.out.println("enter 2 to delete the share from the file");
            System.out.println("enter 3 to display number of account");
            System.out.println("enter 4 to edit number of account");
            System.out.println("enter 5 to sort by name");
			System.out.println("Enter the choice");
			int choice = utility.inputInteger();
			utility.inputString();
			switch (choice) {
			case 1:

				Addressbookmethod.addobject("Addressbook.json");
				break;

			case 2:
				Addressbookmethod.delete("Addressbook.json");
				break;

			case 3:
				Addressbookmethod.display("Addressbook.json");

				break;

			case 4:
				
				Addressbookmethod.edit("Addressbook.json");
				break;
			case 5:
				Addressbookmethod.sortbyname("Addressbook.json");
				break;
			
			}

		}
	}
}
