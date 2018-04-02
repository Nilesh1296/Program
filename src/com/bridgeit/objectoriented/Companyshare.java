package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.CompanyShareLinkedList;
import com.bridgeit.utility.Utility;

public class Companyshare 
{
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		boolean check=true;
		CompanyShareLinkedList companyshare = new CompanyShareLinkedList();
		do{
             System.out.println("Enter 1 to display company details");
			System.out.println("Enter 2 to remove share");
			System.out.println("Enter 3 to add share");
			System.out.println("enter the choice");
			int choice = utility.inputInteger();
			switch(choice)
			{
			case 1:
				companyshare.displayShares("Stockaccount.json");
				break;
			case 2:
				
				break;
			case 3:
				
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
