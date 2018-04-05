/******************************************************************************
  
 *  Purpose :Stack implementation using generic method
 *   
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   08-03-2017
 *
 ******************************************************************************/

package com.bridgeit.utility;

class Nodeclass<T>
{
	
	Nodeclass<T> ref;
	T data;
	Nodeclass(T data1)
	{
		this.data = (T) data1;
	}
}
public class Stack1<T> 
{
	Nodeclass<T>  firstNode;
	Nodeclass<T> lastNode;

	public T add(T data)
	{
		Nodeclass<T> newNode = new Nodeclass<T>(data);
		if(firstNode==null)
		{
			firstNode = newNode;
		}
		else
		{
			lastNode.ref = newNode;
		}
		lastNode = newNode;
		return data;
	}

	public  boolean search(T dataToBeSearched)
	{
		Nodeclass<T> current = firstNode;
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

	public boolean delete(T dataToBedeleted)
	{
		if(firstNode.data.equals(dataToBedeleted))
		{
			firstNode = firstNode.ref;
			return true;
		}
		else if(lastNode.data.equals(dataToBedeleted))
		{
			Nodeclass<T> currentNode = firstNode;
			Nodeclass<T> prevNode = null;
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
			Nodeclass<T> prevrefrence = null;
			boolean status  = false;
			Nodeclass<T> current = firstNode;
			
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
		Nodeclass<T> currentNode = firstNode;
		while(currentNode != null)
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.ref;
		}
	}

	public int size()
	{
		int size = 0;
		Nodeclass<T> currentNode = firstNode;
		while(currentNode != null)
		{
			size++;
			currentNode = currentNode.ref;
		}
		return size;
	}
	public  T dataAtPosition(int position)
	{
		int location = 0;
		if(position >= this.size())
		{
			return null;
		}
		else
		{
			Nodeclass<T> currentNode = firstNode;
			while(location != position)
			{
				currentNode = currentNode.ref;
				location++;
			}
			
			return  (T) currentNode.data;
		}
	}
	
	public void deletelast()
	{
		if(this.size()==1)
		{
			firstNode = null;
		}
		else
		{
			Nodeclass<T> prevNode=null;
			Nodeclass<T> currentNode = firstNode;
		while(currentNode.ref !=null)
		{
			prevNode = currentNode;
			currentNode = currentNode.ref;
		}
		lastNode = prevNode;
		lastNode.ref = null;
		}
	}
	public  void push(T data)
	{
		this.add((T) data);
	}
	
	public T pushdata(T data)
	{
		firstNode.data= data;
		this.add((T) data);
		return data;
		
	}

	public  T pop()
	{
		T data =(T) lastNode.data;
		this.deletelast();
		return data;
	}

    public  T peek()
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
	
	public  T get(int i)
	{
		int position =0;
		Nodeclass<T> current =firstNode;
		while(position!=i)
		{
			current=current.ref;
			position++;
			
		}
		
		return (T) current.data;
		
	}

}



