package com.bridgeit.algorithm;

import java.util.LinkedList;

import com.bridgeit.utility.Utility;

public class Bubblesortinteger 
{
  public static void main(String[] args) 
  {
	Utility utility = new Utility();
    LinkedList<Integer> list = new LinkedList<>();
    System.out.println("Enter the number you want to add");
    int num=utility.inputInteger();
    for(int i=0;i<num;i++){
        System.out.print("Add Element: ");
        int element=utility.inputInteger();
        list.add(element);
    }
    System.out.println("The sorted elements is");
    Utility.Sorting(list);
  }
}
