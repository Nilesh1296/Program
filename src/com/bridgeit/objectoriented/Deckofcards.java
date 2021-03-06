/******************************************************************************
  
 *  Purpose: Determines the 4 cards distributed to 9 player
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import com.bridgeit.utility.Utility;

public class Deckofcards {
	public static void main(String[] args) {

		Utility utility = new Utility();
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] deck = utility.Deck(suits, cards);
		System.out.println("Deck OF Cards : ");
		System.out.println("_______________\n");
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");
		}
		
		utility.distribute(deck);
	}
}
