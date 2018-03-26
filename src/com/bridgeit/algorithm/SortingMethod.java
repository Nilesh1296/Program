package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class SortingMethod 
{
 public static void main(String args[])
 {
	
	 Utility utility = new Utility();
	 System.out.println("Enter any positive number");
	 int choice=utility.inputInteger();
	while(choice>0) 
	{
	 System.out.println("1.Binary sort for integer");
	 System.out.println("2.Binary sort for string");
	 System.out.println("3.Insertion sort for integer");
	 System.out.println("4.Insertion sort for string");
	 System.out.println("5.Bubblesort for integer");
	 System.out.println("6.Bubblesort for string");
     System.out.println("enter the choice");
     int choice1=utility.inputInteger();
     utility.inputString();
		 switch(choice1)
		 {
		 case 1:
		
			 System.out.println("Enter the size of the array");
			 int size=utility.inputInteger();
			 System.out.println("enter the search element");
			 int search = utility.inputInteger();
			int  arr[]=new int[size];
			 Utility.binarySearchInteger(arr,search, size);
			 break;
			 
		 case 2 :
			 
			 
			  System.out.println("Enter a string ");
			  String sentence =utility.inputString();
			  System.out.println("Enter a search string");
			  String searchstring =utility.inputString();
			  System.out.println(searchstring);
			  String words[]=sentence.split(" ");
			  int high =words.length-1;
			  int low =0;
		      int position = Utility.binarysearchstring(searchstring, words, low, high);
		      System.out.println(position);
			   if(position==-1)
			   {
				   System.out.println("String is not found");
			   }
			   else
			   {
				   System.out.println("String is found at position " +position);
			   }
		        
			   break;
		 case 3 :
			 
			
				System.out.println("enter the size");
				int size1=utility.inputInteger();
				int[] arr2 = new int[size1];
				System.out.println("enter array elements");
				for (int i = 0; i < size1; i++) {
					arr2[i] = utility.inputInteger();
				}
				 Utility.insertionSortInteger(arr2);
				break;
			 
		 case 4 :
			 
			
				System.out.println("Enter the size of the array");
				int size5 = utility.inputInteger();
				utility.inputString();
				 String arr1[]= new String[size5];
				 System.out.println("Enter the string element");
				for (int i = 0; i < size5; i++) 
				{
					arr1[i] = utility.inputString();
				}
				String arr3[] = Utility.insertionSortString1(arr1);
				for (int i = 0; i < arr3.length; i++) {
					System.out.println(arr3[i]);
				}
			    break;
		 case 5 :
			  
			  
				System.out.println("Enter the size of array");
				int length = utility.inputInteger();
				int bubble[]=new int[length];
				System.out.println("Enter the matrix value");
				for(int i=0;i<length;i++)
				{
					bubble[i]=utility.inputInteger();
				}
				Utility.bubbleSortInt(bubble);
			     break;
		 case 6 :
			   
			    String input[] = { "nilesh", "monu", "geeta", "savita" };
				Utility.bubblesortString(input);
                break;
		 }
	 }
 }
	
}
