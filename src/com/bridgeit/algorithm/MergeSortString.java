package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class MergeSortString
{
  public static void main(String[] args)
  {
	Utility utility = new Utility();
	System.out.println("Enter the size of the stringarray");
	int size = utility.inputInteger();
	utility.inputString();
	String a[] = new String[size];
	for(int i=0;i<size;i++)
	{
		a[i]=utility.inputString();
		
	}
	int high = a.length;
	Utility.mergeSortString(a, 0, high-1);
	for(int i=0;i<size;i++)
	{
		System.out.print(a[i]+ " ");
		
	}
  }
}
