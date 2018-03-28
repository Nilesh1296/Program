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
			System.out.print(
					"Enter 1 to Add , 2 to Update, 3 to delete , 4 Sort By name , 5 to sort by zip , 6 to exit : ");
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
