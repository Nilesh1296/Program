package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class InsertionOrderInteger {
	public static void main(String args[]) {
		Utility utility = new Utility();
		System.out.println("enter the size");
		int size=utility.inputInteger();
		int arr[] = new int[size];
		System.out.println("enter array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = utility.inputInteger();
		}
		 Utility.insertionSortInteger(arr);
		

	}
}
