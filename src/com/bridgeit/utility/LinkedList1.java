package com.bridgeit.utility;

class Node
{
	String i;
	int j;
	Node ref;
	Node(int j)
	{
		this.j = j;
		ref=null;
	}
	Node(String i)
	{
		this.i = i;
		ref=null;
	}
	Node(String i,Node ref)
	{
		this.i=i;
		this.ref=null;
	}
}
public class LinkedList1
{
	Node first;
	Node last;
	public void add(String i)
	{
		Node element = new Node(i);
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.ref = element;
		}
		last = element;
	}
	
	public void add(int j)
	{
		Node element = new Node(j);
		if(first == null)
		{
			first = element;
		}
		else
		{
			last.ref = element;
		}
		last = element;
	}
	
	void iterate()
	{
		Node current = first;
		while(current != null)
		{
			System.out.println(current.i);
			current = current.ref;
		}
	}
	public boolean remove(String data)
	{
		boolean status = false;
		if(first.i.equals(data))
		{
			first = first.ref;
			status = true;
		}
		else if(last.i.equals(data))
		{
			Node prev= null;
			Node current = first;
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
			Node prev= null;
			Node current = first;
			while(current != null && !(status = (current.i.equals(data))))
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
	

	public boolean search(String searchWord)
	{
		Node current = first;
		while(current!=null)
		{ 
			System.out.println();
	      if(searchWord.equals(current.i))
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
		Node current = first;
		while(current != null)
		{
			System.out.print(current.i+" ");
			str=str+current.i;
			current = current.ref;
		}
		return str;
	}
	
	public int length()
	{
		int count=0;
	Node current = first;
	
	while(current != null)
	{ 
		count++; 
		current=current.ref; 
	} 
	return count;
	}
	
	
	}
	
	


