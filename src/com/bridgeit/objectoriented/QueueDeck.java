/******************************************************************************
  
 *  Purpose: Distribute the 52 cards into 4 player such that each player will 
 *  receive 9 cards at max  
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import java.util.LinkedList;

import com.bridgeit.utility.Queue;
import com.bridgeit.utility.Utility;

public class QueueDeck {
	public static void main(String[] args) {

		Utility utility = new Utility();
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] deck = utility.Deck(suits, cards);
		Queue queue = new Queue();
		int indexOfDeck = 0;
		for (int i = 0; i < 4; i++) {
			LinkedList linkList = new LinkedList();
			for (int j = 0; j < 9; j++) {
				linkList.add(deck[indexOfDeck]);
				indexOfDeck++;
			}
			queue.enqueue(linkList);
		}

		queue.getelement();
	}
}
