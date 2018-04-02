package com.bridgeit.utility;

public class LinkList 
{
  Node head;
  public class Node
  {
	  int date;
	  char day1;
	  Node next;
	  public Node(int item,char day)
	  {
		  date=item;
		  day1=day;
		  next=null;
	  }
  }
  public void insert(int value,char arr)
  {
	Node node = new Node(value,arr);
	node.next=head;
	head=node;
  }
  public void display()
  {
	  Node temp = head;
	  while(temp!=null)
	  {
		
		  temp=temp.next;
	  }
  }
}
