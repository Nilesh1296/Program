package com.bridgeit.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class OrderList2
{
	public static void main(String[] args) throws IOException {
		LinkedListviasort orderedListMetods=new LinkedListviasort();
		LinkedListviasort l3 =new LinkedListviasort();
		Utility utility = new Utility();
		System.out.println("Program Started.");
		File file = new File("pqrst.text");
		file.createNewFile();
		FileReader fileReader = new FileReader(file);
	
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		String array[] = line.split(" ");
		int[] arr=new int[array.length];
		for(int i=0; i<array.length; i++)
		{
			arr[i]=Integer.parseInt(array[i]);
		}
		
		for(int i=0; i<array.length; i++)
		{
			orderedListMetods.push(arr[i]);
		}
		System.out.println("Size of Lis : "+orderedListMetods.size());
		orderedListMetods.printList(l3);
		System.out.print("\nEnter a number to search : ");
		int search=utility.inputInteger();
		
		orderedListMetods.search(search);
		
		System.out.println("Size of Lis : "+orderedListMetods.size());
		l3=orderedListMetods.printList(l3);
		
		orderedListMetods.fileWriter1();
}
}