package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Commercialdata
{
  public static void main(String[] args) throws IOException 
  {
			System.out.println("Program Started");
			Scanner scanner=new Scanner(System.in);
			
			String filePath="/home/bridgeit/Documents/Nilesh/Filesforjson/Commercial.json";
		    Utility.writeData2(filePath);
			boolean check=true;
			do{
				StockAccount stockAccount=new StockAccount();
				System.out.println("Enter The number  \n 1 : Number of Record\n 2 : Create account \n 3 : Sale shares \n 4:Purchase the shares \n 5: exit");
				int option=scanner.nextInt();
				
				switch (option) {
				case 1:
					int totalAccounts=stockAccount.numberofrecord(filePath);
					System.out.println("Total Number of Accounts : "+totalAccounts);
					stockAccount.display(filePath);
					break;
				case 2:
					stockAccount.createAccount(filePath);
					break;
				case 3:
					System.out.println("AIRTEL : @ \nVODAPHONE : # \nSONY : & \nSAMSUNG : $");
					System.out.println("Enter the Symbol of company : ");
					scanner.nextLine();
					String name=scanner.nextLine();
					System.out.println("Enter how much share you want to sell : ");
					long share=scanner.nextLong();
					stockAccount.sell(share, name);
					break;
				case 4:
					System.out.println("AIRTEL : @ \nVODAPHONE : # \nSONY : & \nSAMSUNG : $");
					System.out.println("Enter the Symbol of company : ");
					scanner.nextLine();
					String symbol2=scanner.nextLine();
					System.out.println("Enter how much share you want to buy : ");
					long shareToBuy=scanner.nextLong();
					stockAccount.buy(shareToBuy, symbol2);
					break;
				case 5:
					check=false;
					break;
				default:
					System.out.println("You have entered wrong ption, please enter correct option.");
					break;
				}
				
			}while(check);
			System.out.println("Program Ended ");
		}
  }

