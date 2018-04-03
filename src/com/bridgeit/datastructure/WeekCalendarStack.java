package com.bridgeit.datastructure;

import com.bridgeit.utility.UsingStack;
import com.bridgeit.utility.Utility;

public class WeekCalendarStack
{
	static String month[]= {" ","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	 static int day[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	 static int months;
	 static int year;
   public static void main(String[] args) {
		System.out.println("Program Started");
		UsingStack<Integer> usin=new UsingStack<Integer>();
		UsingStack<String> usin1=new UsingStack<String>();
		Utility utility=new Utility();
		System.out.println("Please Enter the months");
		months =utility.inputInteger();
		System.out.println("Please Enter the year");
		year = utility.inputInteger();
		String  array[]= {"sun","mon","tue","wed","thu","fri","sat"};
		System.out.println("  "+month[months]+" "+year);
	    for(int k=0;k<array.length;k++)
	    	//for store the date
		usin1.push(array[k]);
	    // for display the date
		usin1.disp1();
		//this method use for odd day
		int value=Utility.dayCode(year, months);
		System.out.println();
		for(int i=1;i<=day[months];i++) 
			//for store the day 
			usin.push(i);
		//for display calender
		usin.disp(value,months);
		System.out.println();
		System.out.println("Program Ended");
	}
}
