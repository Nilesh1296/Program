/******************************************************************************
  
 *  Purpose: Print the calender of the given month  by using month and year by 
 *  using stack
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.utility;

class NodeStack<T> {
	T data;
	NodeStack<T> next;

}

public class UsingStack<T> {
	NodeStack<T> head;
	NodeStack<T> temp;

	public void push(T value) {
		NodeStack<T> temp = new NodeStack<T>();
		temp.data = value;
		temp.next = null;

		if (head == null) {
			head = temp;
			return;
		}
		NodeStack<T> temp1 = head;
		while (temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = temp;
	}

	public void disp(int i, int months) {
		for (int j = 1; j <= i; j++) {
			if (i == 0) {
				System.out.println("");
			} else {
				System.out.print("       ");
			}
		}
		NodeStack<T> temp = head;
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int l = 0; l < day[months]; l++) {

			if (l < 9) {
				System.out.print("0" + temp.data + "     ");
				temp = temp.next;
				i++;
				if (i % 7 == 0) {
					System.out.println();
				}
			} else {
				System.out.print(temp.data + "     ");
				temp = temp.next;
				i++;
				if (i % 7 == 0) {
					System.out.println();
				}
			}

		}
	}

	public void disp1() {
		NodeStack<T> temp = head;

		while (temp != null) {
			System.out.print(temp.data + "    ");
			temp = temp.next;
		}
	}
}
