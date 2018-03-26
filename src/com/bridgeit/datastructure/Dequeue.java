package com.bridgeit.datastructure;
import java.util.NoSuchElementException;

	class Node10
	{
	    protected char data;
	    protected Node10 link;
	 
	    
	    public Node10()
	    {
	        link = null;
	        data ='\u0000';
	    }    
	  
	    public Node10(char ch,Node10 n)
	    {
	        data = ch;
	        link = n;
	    }    
	   
	    public void setLink(Node10 n)
	    {
	        link = n;
	    }    
	   
	    public void setData(char d)
	    {
	        data = d;
	    }    
	 
	    public Node10 getLink()
	    {
	        return link;
	    }    
	   
	    public char getData()
	    {
			return data;
	        
	    }
	}    

class Dequeue
{
    private Node10 front, rear;
    private int size;
 
    
    public Dequeue()
    {
        front = null;
        rear = null;
        size = 0;
    }    
   
    public boolean isEmpty()
    {
        return front == null;
    }    
   
    public int getSize()
    {
        return size;
    }
    
    public void clear()
    {
        front = null;
        rear = null;
        size = 0;
    }
   
    public void insertAtFront(char ch)
    {
        Node10 nptr = new Node10(ch, null);    
        size++ ;    
        if (front == null) 
        {
            front = nptr;
            rear = front;
        }
        else 
        {
            nptr.setLink(front);
            front = nptr;
        }
    }
    
    public char insertAtRear(char ch)
    {
        Node10 nptr = new Node10(ch,null);    
        size++ ;    
        if (rear == null) 
        {
            rear = nptr;
            front = rear;
        }
        else 
        {
            rear.setLink(nptr);
            rear = nptr;
        }
		return ch;
    }    
   
    public char removeAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        Node10 ptr = front;
        front = ptr.getLink();
 
        if (front == null)
            rear = null;
        size-- ;
 
        return ptr.getData();
    }
    
    public char removeAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        char ele = rear.getData();
        Node10 s = front;
        Node10 t = front;
        while (s != rear)
        {
            t = s;
            s = s.getLink();
        }
        rear = t;
        rear.setLink(null);
        size --;
 
        return ele;
    }  
    public int size()
    {
    	return size;
    }
    
    public char peekAtFront()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }
   
    public char peekAtRear()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return rear.getData();
    }    
   
    public String display()
    {
        System.out.print("\nDequeue =");
        if (size == 0)
        {
            System.out.print("Empty\n");
            return null ;
        }
        Node10 ptr = front;
        while (ptr != rear.getLink() )
        {
            System.out.print(ptr.getData()+"");
            ptr = ptr.getLink();
        }
        System.out.println();
		return null;        
    }
	
}