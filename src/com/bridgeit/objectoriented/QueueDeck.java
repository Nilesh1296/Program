
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
import com.bridgeit.utility.QueueImpl;
import com.bridgeit.utility.Utility;

public class QueueDeck {
	public static  <T> void main(String[] args) {

		Utility utility = new Utility();
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] deck = utility.Deck(suits, cards);
		QueueImpl<String> queue = new QueueImpl<String>();
		int indexOfDeck = 0;
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 9; j++) {
				queue.enqueue((( deck[indexOfDeck])));
				indexOfDeck++;
			}
			
		}
         queue.getelement();
		
	}
}
