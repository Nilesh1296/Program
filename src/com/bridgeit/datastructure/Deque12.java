package com.bridgeit.datastructure;

import java.util.*;
import java.util.ArrayList;

public class Deque12 
{

	private List<Character> deque1 = new ArrayList<Character>();

	public void insertFront1(int item) {
		
		deque1.add((char) item);
		
	}

	/**
	 * @param i
	 * @return @ insert rear into
	 */
	public char insertRear(int i) 
	{
		deque1.add((char) i);
		return (char) i;
	}

	/**
	 * @return @ this method use to remove front
	 */
	public char removeFront() {
		if (deque1.isEmpty()) {
			System.out.println("Deque underflow!! unable to remove.");

			return 0;
		}
		char rem = deque1.remove(0);
		return rem;
	}

	/**
	 * @return this method is use to remove rear
	 */
	public char removeRear1() {
		if (deque1.isEmpty()) {
			System.out.println("Deque underflow!! unable to remove.");
			return 0;
		}
		char rem = deque1.remove(deque1.size() - 1);
		return rem;
	}

	/**
	 * @return @ show the front element
	 */
	public int peakFront1() {
		char item = deque1.get(0);
		System.out.println("Element at first: " + item);
		return item;
	}

	/**
	 * @return @ Store the data
	 */
	public int peakRear1() {
		char item = deque1.get(deque1.size() - 1);
		return item;
	}

	public int size1() {
		int size = deque1.size();
		return size;

	}

	
}