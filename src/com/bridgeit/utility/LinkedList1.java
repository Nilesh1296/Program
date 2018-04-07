package com.bridgeit.utility;

class Node<T>
{
	Node<T> ref;
	T data;
	int date ;
	char day1;
	Node<T> next;
	Node(T data1)
	{
		this.data = (T) data1;
	}
	
	
}
public class LinkedList1<T>
{
	Node<T> first;
	Node<T> last;
	public  void add(T data)
	{
		Node<T> element = new Node<T>(data);
		if(first == null)
		{
			first =   element;
		}
		else
		{
			last.ref = element;
		}
		last = element;
	}
	
	void iterate()
	{
		Node<T> current = first;
		while(current != null)
		{
			System.out.println(current.data);
			current = current.ref;
		}
	}
	public boolean remove(T data)
	{
		boolean status = false;
		if(first.data.equals(data))
		{
			first = first.ref;
			status = true;
		}
		else if(last.data.equals(data))
		{
			Node<T> prev= null;
			Node<T> current = first;
			while(current.ref != null)
			{
				prev = current;
				current = current.ref;
			}
			last = prev;
			last.ref = null;
			status = true;
		}
		else
		{
			Node<T> prev= null;
			Node<T> current = first;
			while(current != null && !(status = (current.data.equals(data))))
			{
				prev = current;
				current = current.ref;
			}
			
			if(status)
			{
				prev.ref = current.ref;
			}
		}
		return status;
	}
	

	public boolean search(T searchWord)
	{
		Node<T> current = first;
		while(current!=null)
		{ 
			System.out.println();
	      if(searchWord.equals(current.data))
	      { 
	    	  return true;
	      }
			current = current.ref;
			
		}
		
		return false;
		
	}
	

	public String display()
	{
		String str=" ";
		Node<T> current = first;
		while(current != null)
		{
			System.out.print(current.data+" ");
			str=str+current.data;
			current = current.ref;
		}
		return str;
	}
	
	public int length()
	{
		 int count=0;
	Node<T> current = first;
	
	while(current != null)
	{ 
		count++; 
		current=current.ref; 
	} 
	return  count;
	}
	
	public  T dataAtPosition(int data)
	{
		int location = 0;
		if(data >= this.length())
		{
			return null;
		}
		else
		{
			Node<T> currentNode = first;
			while(location != data)
			{
			
				currentNode = currentNode.ref;
				location++;
			}
			
			return  (T) currentNode.data;
		}
	}
	
	public void displayweekday(int data)
	{
		int location = 1;
		
			Node<T> currentNode = first;
			while(location != data)
			{
			
				currentNode = currentNode.ref;
				location++;
			}
			if(data<10)
			{
				System.out.print("0"+currentNode.data+" ");
			}
			else
			{
				System.out.print(currentNode.data+" ");
			}
			
		}
	
	
	

	 public void sort()
	 {
		 for(int i=1;i<this.length();i++)
		 {
			 for(int j=i+1;j<this.length()+1;j++)
			 {
				 if((Integer)this.dataAtPosition(i)>(Integer)this.dataAtPosition(j))
				 {
					 
				 }
			 }
		 }
	 }
}
	
	


