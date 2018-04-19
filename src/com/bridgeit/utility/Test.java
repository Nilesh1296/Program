package com.bridgeit.utility;

 class Test {
public void print()
{
	int x=5/0;
	System.out.println("hello this is superclass");
	System.out.println("");
}

 class Test2 throws Exception 
 {
	public void print() 
	{
		int y=6/0;
		System.out.println("hello this is subclass");
	}
}

 
