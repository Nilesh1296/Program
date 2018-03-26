package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Binaryconversion 
{
  public static void main(String[] args)
  {
	Utility utility = new Utility();
	System.out.println("Enter any number from user");
	int decimalnumber = utility.inputInteger();
	System.out.println("THe number to binary conversion is :");
	String s2 = Utility.convertBinary1(decimalnumber);
	System.out.println(s2);
  }
}
