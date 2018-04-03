/******************************************************************************
  
 *  Purpose: Add,delete,update,sort by name and sort by zip of a address book 
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import com.bridgeit.utility.AddressbookImpl;
import com.bridgeit.utility.Utility;

public class Addressbookmain {
	public static void main(String[] args) {

		Utility utility = new Utility();
		AddressbookImpl addressbook = new AddressbookImpl();

		boolean check = true;

		do {
			System.out.println("Enter 1 to add the addressbook");
			System.out.println("Enter 2 to edit the addressbook");
			System.out.println("Enter 3 to delete the addressbook");
			System.out.println("Enter 4 to sort by name the addressbook");
			System.out.println("Enter 5 to sort by zip the addressbook");
			System.out.println("Enter any choice");
			int choise = utility.inputInteger();
			utility.inputString();
			switch (choise) {
			case 1:
				addressbook.addObject("Addressbook.json");
				break;
			case 2:
				addressbook.edit("Addressbook.json");
				break;
			case 3:
				addressbook.delete("Addressbook.json");
				break;
			case 4:
				addressbook.sortByName("Addressbook.json");
				break;
			case 5:
				addressbook.sortByZip("Addressbook.json");
				break;
			case 6:
				check = false;
				break;
			default:
				System.out.println("you have entered wrong choise, please entered once again.");
				break;
			}
		} while (check);
		System.out.println("Program Ended ");
	}
}
