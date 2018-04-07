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

import com.bridgeit.utility.QueueImpl;
import com.bridgeit.utility.Utility;

public class BankingCashCounter {
	public static <T> void main(String args[]) {

		Utility utility = new Utility();
		QueueImpl<Integer> queue = new QueueImpl<Integer>();
		int amountinbank = 50000;
		int choice1;
		do {
			System.out.println("1 for adding into queue");
			System.out.println("2 for deposit ");
			System.out.println("3 for withdraw");
			System.out.println("4 for size for queue");
			System.out.println("Enter the correct choice");
			choice1 = utility.inputInteger();

			switch (choice1) {
			case 1:
				System.out.println("Enter any number for insert into the queue");
				int number = utility.inputInteger();
				queue.enqueue(number);
				System.out.println("The size is   " + queue.size());
				break;

			case 2:
				if (queue.size() != 0) {

					System.out.println("Enter the deposited amount");
					int depositedamount = utility.inputInteger();
					amountinbank = amountinbank + depositedamount;
					System.out.println("The total deposited amount is" + amountinbank);
					queue.delete();
				} else {
					System.out.println("Enter the person in the queue");
				}
				break;

			case 3:
				if (queue.size() != 0) {

					System.out.println("Enter the withdraw amount");
					int withdrawamount = utility.inputInteger();
					if (withdrawamount < amountinbank) {
						amountinbank = amountinbank - withdrawamount;
						System.out.println("The total amount in bank is: " + amountinbank);
						queue.delete();
						break;
					} else {
						System.out.println("Insufficient balance please first deposit");
						queue.delete();
						break;
					}
				} else {
					System.out.println("Enter the person in the queue");
				}

			case 4: {
				int length = queue.size();
				System.out.println("The length of the " + length);
			}

			}

		} while (choice1 > 0);
	}
}
