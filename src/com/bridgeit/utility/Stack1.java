/******************************************************************************
  
 *   Stack implementation using generic
 *   
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2017
 *
 ******************************************************************************/

package com.bridgeit.utility;

class Nodeclass<T>
{
	
	Nodeclass ref;
	T data;
	Nodeclass(T data1)
	{
		this.data = (T) data1;
	}
}
public class Stack1 
{
	Nodeclass  firstNode;
	Nodeclass lastNode;

	public <T> void add(T data)
	{
		Nodeclass newNode = new Nodeclass(data);
		if(firstNode==null)
		{
			firstNode = newNode;
		}
		else
		{
			lastNode.ref = newNode;
		}
		lastNode = newNode;
	}

	public <T> boolean search(T dataToBeSearched)
	{
		Nodeclass current = firstNode;
			while(current != null)
			{
				if(current.data.equals(dataToBeSearched))
				{
					return true;
				}
				current = current.ref;
			}
			return false;
	}

	public <T> boolean delete(T dataToBedeleted)
	{
		if(firstNode.data.equals(dataToBedeleted))
		{
			firstNode = firstNode.ref;
			return true;
		}
		else if(lastNode.data.equals(dataToBedeleted))
		{
			Nodeclass currentNode = firstNode;
			Nodeclass prevNode = null;
			while(currentNode != lastNode)
			{
				prevNode = currentNode;
				currentNode = currentNode.ref;
			}
			prevNode.ref = null;
			return true;
		}
		else
		{
			Nodeclass prevrefrence = null;
			boolean status  = false;
			Nodeclass current = firstNode;
			
			while(current != lastNode && !(status=(current.data.equals(dataToBedeleted))))
			{
				prevrefrence = current;
				current = current.ref;
			}
			if(status)
			{
				prevrefrence.ref = current.ref;
				return true;
			}
			
		}
		return false;
	}

	public void itirate()
	{
		Nodeclass currentNode = firstNode;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.ref;
		}
	}

	public int size()
	{
		int size = 0;
		Nodeclass currentNode = firstNode;
		while(currentNode != null)
		{
			size++;
			currentNode = currentNode.ref;
		}
		return size;
	}
	public <T> T dataAtPosition(int position)
	{
		int location = 0;
		if(position >= this.size())
		{
			return null;
		}
		else
		{
			Nodeclass currentNode = firstNode;
			while(location != position)
			{
				currentNode = currentNode.ref;
				location++;
			}
			
			return  (T) currentNode.data;
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void deletelast()
	{
		if(this.size()==1)
		{
			firstNode = null;
		}
		else
		{
			Nodeclass prevNode=null;
			Nodeclass currentNode = firstNode;
		while(currentNode.ref !=null)
		{
			prevNode = currentNode;
			currentNode = currentNode.ref;
		}
		lastNode = prevNode;
		lastNode.ref = null;
		}
	}
	public <T> void push(T data)
	{
		this.add(data);
	}

	public <T> T pop()
	{
		T data =(T) lastNode.data;
		this.deletelast();
		return data;
	}

public <T> T peek()
	{
		return (T) lastNode.data;
	}
	public boolean isEmpty()
	{
		if(this.size() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	public <T> T get(int i)
	{
		int position =0;
		Nodeclass current =firstNode;
		while(position!=i)
		{
			current=current.ref;
			position++;
			
		}
		
		return (T) current.data;
		
	}

}



