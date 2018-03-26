package com.bridgeit.datastructure;


	public class Queue1<T> {
		int count=0;
		@SuppressWarnings("rawtypes")
		Node front=null, temp;
		
		public Queue1()
		{
			
		}
		public Queue1(int num)
		{
			@SuppressWarnings("unused")
			int[] array=new int[num];
			for(int i=0; i<num; i++)
			{
				enqueue(i);
			}
		}
		@SuppressWarnings("hiding")
		public class Node<T>
		{
			T data;
			@SuppressWarnings("rawtypes")
			Node next;
			
			public T getData() {
				return data;
			}

			public void setData(T data) {
				this.data = data;
			}

			@SuppressWarnings("rawtypes")
			public Node getNext() {
				return next;
			}

			public void setNext(@SuppressWarnings("rawtypes") Node next) {
				this.next = next;
			}

			public Node(T data)
			{
				this.data=data;
				next=null;
			}
		}
		
		@SuppressWarnings({ "hiding", "unchecked" })
		public <T> void enqueue(T element)
		{
			@SuppressWarnings("rawtypes")
			Node new_Node=new Node<T>(element);
			if(front==null)
			{
				front=new_Node;
				temp=new_Node;
				count++;
			}
			else
			{
				temp.next=new_Node;
				temp=temp.next;
				count++;
			}
		}
		
		public void deueue()
		{
			if(front==null)
			{
				System.out.println("List is Empty.");
			}
			else if(front!=null)
			{
				front=front.next;
				count--;
			}
		}
		
		public boolean isEmpty()
		{
			if(count==0)
				return true;
			else
				return false;
		}
		
		
		public int size()
		{
			return count;
		}
		
		public void getelement()
		{
			temp=front;
			for(int i=0; i<size(); i++)
			{
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
	}
	}

