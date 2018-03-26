/******************************************************************************
  
 *  Purpose: Determines  Create a Program which creates Banking Cash Counter 
 *  where people come in to deposit Cash and withdraw Cash by using queue
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/

package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BankingCashCounter {
	public static void main(String args[]) {
		LinkedQueue ll = new LinkedQueue();
		Utility utility = new Utility();
		int amount = 0;
		int choice1;
		do {
			System.out.println("1 for adding into queue");
			System.out.println("2 for deposit ");
			System.out.println("3 for withdraw");
			System.out.println("Enter the correct choice");
			choice1 = utility.inputInteger();

			switch (choice1) {
			case 1:
				System.out.println("Enter any number for insert into the queue");
				int number = utility.inputInteger();
				ll.insert(number);
				System.out.println("The size is" + ll.size());
				break;

			case 2:
				if (ll.size() != 0) {

					System.out.println("Enter the deposited amount");
					int depositedamount = utility.inputInteger();
					amount = amount + depositedamount;
					System.out.println("The total deposited amount is" + amount);
					ll.delete();
				} else {
					System.out.println("Enter the person in the queue");
				}
				break;

			case 3:
				if(ll.size() !=0)
				{
					
				
				System.out.println("Enter the deposited amount");
				int withdrawamount = utility.inputInteger();
				amount = amount - withdrawamount;
				System.out.println("The total deposited amount is" + amount);
				ll.delete();
				break;
				}
				else
				{
					System.out.println("Enter the person in the queue");
				}
			}

		} while (choice1 > 0);
	}
}
