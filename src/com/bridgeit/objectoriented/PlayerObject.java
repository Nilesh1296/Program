/******************************************************************************
  
 *  Purpose: Print how the 52 cards will distributed to 4 players using Queue
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2018
 *
 ******************************************************************************/

package com.bridgeit.objectoriented;

import java.util.Collections;
import java.util.LinkedList;

import com.bridgeit.datastructure.Queue1;
import com.bridgeit.utility.Utility;

public class PlayerObject 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		String[] suits={"Clubs","Diamonds","Hearts","Spades"};
		String [] cards={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		String[] deck=utility.Deck(suits, cards);
		Queue1 queue = new Queue1();
		int indexOfDeck=0;
		for(int i=0; i<4; i++)
		{
			LinkedList<String> list2=new LinkedList<>();
			for(int j=0; j<9; j++)
			{
			
				list2.add(deck[indexOfDeck]);
				indexOfDeck++;
			}
			
			Collections.sort(list2);
			queue.enqueue(list2);
		}
		System.out.println("-------------------------------------------");
		queue.getelement();
}
}