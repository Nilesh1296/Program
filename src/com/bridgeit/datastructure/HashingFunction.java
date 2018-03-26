package com.bridgeit.datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import com.bridgeit.utility.Utility;

public class HashingFunction {
	public static void main(String[] args) throws IOException
	{
		Utility utility = new Utility();
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList1 ll1 = new LinkedList1();
		FileReader fileReader = new FileReader("abcde.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		System.out.println(line);
		String[] strarray = line.split("\\s+");
		int n=strarray.length;
		Integer arr[]=new Integer[strarray.length];
		for(int i=0;i<strarray.length;i++)
		{
			ll.add(strarray[i]);
			ll1.add(strarray[i]);
			arr[i]=Integer.parseInt(ll.get(i));
			
		}
		System.out.println();
		System.out.println("The sorted array are");
		Utility.sortArray(arr, n);
		Utility.put(arr);   
		System.out.println("Enter a number to be search");
		String search =utility.inputString();
		boolean status=ll1.search(search);
		Utility.addRemove2(status, search,ll1,line);
		ll1.display();
		Utility.readFile1(ll1, search, status, line);
		bufferedReader.close();
	}
}
