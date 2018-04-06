package com.bridgeit.utility;

import java.util.NoSuchElementException;

class NodeDequeue {
	protected char data;
	protected NodeDequeue link;

	public NodeDequeue() {
		link = null;
		data = '\u0000';
	}

	public NodeDequeue(char ch, NodeDequeue n) {
		data = ch;
		link = n;
	}

	public void setLink(NodeDequeue n) {
		link = n;
	}

	public void setData(char d) {
		data = d;
	}

	public NodeDequeue getLink() {
		return link;
	}

	public char getData() {
		return data;

	}
}

public class Dequeue {
	private NodeDequeue front, rear;
	private int size;

	public Dequeue() {
		front = null;
		rear = null;
		size = 0;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int getSize() {
		return size;
	}

	public void clear() {
		front = null;
		rear = null;
		size = 0;
	}

	public void insertAtFront(char ch) {
		NodeDequeue nptr = new NodeDequeue(ch, null);
		size++;
		if (front == null) {
			front = nptr;
			rear = front;
		} else {
			nptr.setLink(front);
			front = nptr;
		}
	}

	public char insertAtRear(char ch) {
		NodeDequeue nptr = new NodeDequeue(ch, null);
		size++;
		if (rear == null) {
			rear = nptr;
			front = rear;
		} else {
			rear.setLink(nptr);
			rear = nptr;
		}
		return ch;
	}

	public char removeAtFront() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		NodeDequeue ptr = front;
		front = ptr.getLink();

		if (front == null)
			rear = null;
		size--;

		return ptr.getData();
	}

	public char removeAtRear() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		char ele = rear.getData();
		NodeDequeue s = front;
		NodeDequeue t = front;
		while (s != rear) {
			t = s;
			s = s.getLink();
		}
		rear = t;
		rear.setLink(null);
		size--;

		return ele;
	}

	public int size() {
		return size;
	}

	public char peekAtFront() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return front.getData();
	}

	public char peekAtRear() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return rear.getData();
	}

	public String display() {
		System.out.print("\nDequeue =");
		if (size == 0) {
			System.out.print("Empty\n");
			return null;
		}
		NodeDequeue ptr = front;
		while (ptr != rear.getLink()) {
			System.out.print(ptr.getData() + "");
			ptr = ptr.getLink();
		}
		System.out.println();
		return null;
	}

}