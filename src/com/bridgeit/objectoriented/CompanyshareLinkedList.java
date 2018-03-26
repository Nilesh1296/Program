package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompanyshareLinkedList 
{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner=new Scanner(System.in);
		boolean check=true;
		
        
		do{

			System.out.println("Enter 1 to display all companies shares\n2 to remove shares\n3 "
					+ "to add the shares\n4 to exit.");

			int choise=scanner.nextInt();
			Linkedlistimplement companySharesInLinkedListFunctions=new Linkedlistimplement();
			switch (choise) {

			case 1:
				companySharesInLinkedListFunctions.displayShares("Companyshare.json");
				break;
			case 2:
				companySharesInLinkedListFunctions.removeShare("Companyshare.json");
				break;
			case 3:
				companySharesInLinkedListFunctions.addShares("Companyshare.json");
				break;
			case 4:
				check=false;
				break;
			default:
				System.out.println("You have entered wrong choise, please enter correct choise.");
				break;
			}
		}while(check);

	}
}
