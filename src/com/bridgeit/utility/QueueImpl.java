/******************************************************************************
  
 *  Purpose: Queue implementation by using generic ways
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.utility;

class NodeQueue<T> {
	NodeQueue<T> ref;
	T data;

	NodeQueue(T data1) {
		this.data = (T) data1;
	}

}

public class QueueImpl<T> {
	NodeQueue<T> first;
	NodeQueue<T> last;
	int size = 0;

	public void enqueue(T data) {
		NodeQueue<T> element = new NodeQueue<T>(data);
		if (first == null) {
			first = element;
		} else {
			last.ref = element;
		}
		last = element;
		size++;
	}

	public T delete() {
		T item = first.data;
		first = first.ref;
		if (isEmpty()) {
			last = null;
		}
		size--;
		return item;
	}

	public int length() {
		int count = 0;
		NodeQueue<T> current = first;

		while (current != null) {
			count++;
			current = current.ref;
		}
		return count;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void getelement() {
		NodeQueue<T> temp = first;
		for (int i = 0; i < length(); i++) {
			System.out.println(temp.data);
			temp = temp.ref;
		}
	}
}
