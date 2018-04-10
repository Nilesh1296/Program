package Addressbookfile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookManagerMethod implements AddressBookManager {
	Addressbookmethod addressmethod = new Addressbookmethod();
	Scanner scanner = new Scanner(System.in);

	@Override
	public void newAddressBook() throws IOException {

		    System.out.println("The list of files is given below ");
			File directory1 = new File("/home/bridgeit/Documents/Addressbookfiles");
			// get all the files from a directory
			File[] fList1 = directory1.listFiles();
			for (File file : fList1) {
				System.out.println(file.getName());

			}

			System.out.println("Enter the filename from the user");
			String filename1 = scanner.nextLine();
			File file1 = new File("/home/bridgeit/Documents/Addressbookfiles/" + filename1 + ".json");
			file1.createNewFile();
			

		

	}

	@Override
	public void open() {
		System.out.println("Enter 1 for adding the book");
		System.out.println("Enter 2 for edit the book");
		System.out.println("Enter 3 for delete the addressbook");
		System.out.println("Enter 4 for sort by last name");
		System.out.println("Enter 5 for sort by zip");
		System.out.println("Enter 6 for print");
		System.out.println("Enter 7 for back");
		System.out.println("Enter the user choice");
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
		case 1:

			addressmethod.addPerson();
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
		case 7 :
			
			break;
		}

	}

	@Override
	public void delete() {

		System.out.println("Enter the filename from the user");
		String filename1 = scanner.nextLine();
		File file1 = new File("/home/bridgeit/Documents/Addressbookfiles/" + filename1 + ".json");
		file1.delete();

	}

	@Override
	public void save() {
        
		
		
		
	}

	@Override
	public void saveAs() {

	}

	@Override
	public void quit() {

	}

}
