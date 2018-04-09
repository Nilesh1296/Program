package Addressbookfile;

import java.io.IOException;
import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) throws IOException {
		AddressBookManagerMethod bookmethod = new AddressBookManagerMethod();
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number");
		int choice1 =sc.nextInt();
		sc.nextLine();
        while(choice1>0)
        {
		System.out.println("Enter 1 for a new addressbook");
		System.out.println("Enter 2 to open a addressbook");
		System.out.println("Enter 3 to close a addressbook");
		System.out.println("Enter 4 to delete a addressbook");
		System.out.println("Enter 5 to save the addressbook");
		System.out.println("Enter 6 to saveAs the addressbook");
		System.out.println("Enter 7 to quit the addressbook");
		System.out.println("Enter 8 to break from loop");
		System.out.println("Enter the choice from user");
		int choice = sc.nextInt();
	
		switch (choice) {
		case 1:
			sc.nextLine();
			bookmethod.newAddressBook();
			break;
		case 2:
            
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:
             
			break;
		case 8 :
		 default :
			 utility.callback();
			 break;

		}
		}
	}
}
