package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class Questionprogram
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("enter number");
		int number = utility.inputInteger();
		int power = (int) Math.pow(2, number) - 1;
		int low = 0;
		System.out.println("assume the number between " + low + " to " + power);

		int value = Utility.questionNumber(low, power);
		System.out.println("your asumed number is " + value);

	}
}


