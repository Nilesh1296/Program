package com.bridgeit.datastructure;
class LinkedQueue  
{
  private Node front, rear; //begin and end nodes
  int size; // number of items
 
  //nested class to define node
  private class Node
  { 
    int item;
    Node next;
  }
 
  //Zero argument constructor
  public LinkedQueue()
  {
    front = null;
	rear = null;
    size = 0;
  }
 
  public boolean isEmpty()
  {
    return (size == 0);
  }
 
  //Remove item from the beginning of the list.
  public int delete()
  {
    int item = front.item;
    front = front.next;
    if (isEmpty()) 
    {
      rear = null;
    }
    size--;
    return item;
  }
 
  //Add item to the end of the list.
  public int insert(int item)
  {
    Node oldRear = rear;
    rear = new Node();
    rear.item = item;
    rear.next = null;
    if (isEmpty()) 
    {
      front = rear;
    }
    else 
    {
      oldRear.next = rear;
    }
    size++;
	return item;
  }
 
  public int size()
  {
    return size;
  }
}