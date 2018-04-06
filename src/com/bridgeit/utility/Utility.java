package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.objectoriented.StockQueue;

public class Utility {
	static Utility utility = new Utility();
	static Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);

	}

	// INPUT STRING
	/**
	 * @return
	 */

	public String inputString() {
		try {
			return scanner.nextLine();

		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT INTEGER
	/**
	 * @return
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// Double value
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	/**
	 * @return
	 */
	public static boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	/**
	 * @return
	 */
	public float inputFloat() {
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			System.out.println(e);
		}
		return (float) 0.0;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public long inputLong() {
		try {
			return scanner.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;

	}

	/**
	 * @param username
	 */
	public static void replaceUsername(String username) {
		String str = "Hello<<UserName>>, How are you?";

		if (username.length() > 3) {
			System.out.println("valid string");
			String replaceString = str.replace("<<UserName>>", username);
			System.out.println(replaceString);
		} else {
			System.out.println("Enter valid username greater than 3");
		}

	}


	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public static void distance(double x1, double y1, double x2, double y2) {
		double dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("distance between the points" + dis);
	}

	/**
	 * @param toss
	 */
	public static void percentage(int toss) {

		float b[] = new float[toss];
		int losecount = 0;
		int wincount = 0;

		for (int i = 0; i < toss; i++) {

			b[i] = (float) Math.random();
			System.out.println(b[i]);

		}
		for (int i = 0; i < toss; i++)

		{
			if (b[i] < 0.5) {
				losecount++;

			} else {
				wincount++;

			}

		}
		System.out.println("The number of head is" + losecount);
		System.out.println("The number of tails us" + wincount);
		int losingpercentage = losecount * 100 / toss;
		int winningpercentage = wincount * 100 / toss;
		System.out.println("The percentage of head is" + losingpercentage);
		System.out.println("The percentage of tail is" + winningpercentage);

	}

	/**
	 * @param leapyear
	 * @return
	 */
	public static void checkLeapyear(int leapyear)

	{
		if ((leapyear % 4 == 0) && (leapyear % 100 != 0)) {
			System.out.print("This is a Leap Year");
		} else if (leapyear % 100 == 0) {
			System.out.print("This is not a Leap Year");
		} else if (leapyear % 400 == 0) {
			System.out.print("This is a Leap Year");
		} else {
			System.out.print("This is not a Leap Year");
		}
	}

	/**
	 * @param power
	 */
	public static void powerOf2(int power) {
		int mul = 2;

		for (int i = 0; i <= power; i++) {
			if (i == 0) {
				System.out.println("2^0=1");
			} else {
				int j = 1;
				j = j * mul;

				System.out.println("2^" + i + "=" + j);
				mul = mul * 2;
			}
		}
	}

	/**
	 * @param nthNumber
	 */
	public static void harmonicuptoN(int nthNumber) {

		double sum = 0;
		for (int i = 1; i <= nthNumber; i++) {
			if (nthNumber == 0) {
				System.out.println("Enter nonzero number");
			} else {
				sum = sum + ((1.0 / i));
			}
		}
		System.out.println("The sum of " + nthNumber + "  harmonic number is  " + sum);

	}

	/**
	 * @param number
	 */
	public static void primeFactor(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0 && prime(i)) {
				System.out.println("The prime factors are" + i);
			}
		}
	}

	/**
	 * @param j
	 * @return
	 */
	public static boolean prime(int j) {
		boolean b = false;
		for (int i = 2; i < j; i++) {
			if (j % i == 0) {
				b = false;
				break;
			} else {
				b = true;
			}
		}
		if (j == 2) {
			b = true;
		}
		return b;
	}

	/**
	 * @param attempts
	 * @param goalamount
	 * @param amount
	 */
	public static void Gamblerwinsorloss(int attempts, int goalamount, int amount) {
		int loseCount = 0;
		int winCount = 0;
		float arr[] = new float[attempts];
		for (int i = 0; i < attempts; i++)

		{
			arr[i] = (float) Math.random();
			System.out.println(arr[i]);
			if (arr[i] < 0.5) {
				loseCount++;
				amount--;
				if (amount == 0) {
					System.out.println("player is lose");
					break;
				}

			} else {
				winCount++;
				amount++;
				if (amount == goalamount) {
					System.out.println("player win");
					break;
				}
			}

		}
		System.out.println("The number of times wins is" + winCount);
		System.out.println(winCount);
		int winpercentage = winCount * 100 / attempts;
		System.out.println("The wining percentage is=" + winpercentage);
		System.out.println("The number of times losing is" + loseCount);
		int losepercentage = loseCount * 100 / attempts;
		System.out.println("The losing percentage is=" + losepercentage);

	}

	/**
	 * @param totalcoupons
	 */
	public static void randomnonrepeating(int totalcoupon)

	{

		random1(totalcoupon);
		System.out.println();

	}

	/**
	 * @param totalcoupon
	 */
	public static void random1(int totalcoupon) {
		Random r = new Random();
		for (int k = 0; k < totalcoupon; k++) {
			System.out.print(" " + r.nextInt(9999) + " ");
		}
	}

	/**
	 * @param here we have print numbermatrix
	 */
	static public void numberMatrix()

	{

		Utility utility = new Utility();
		System.out.println("Enter the number of rows");
		int rows = utility.inputInteger();
		System.out.println("Enter the number of columns");
		int columns = utility.inputInteger();
		int a[][] = new int[rows][columns];
		System.out.println("Entered the values of matrix");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				a[i][j] = utility.inputInteger();
			}
		}
		System.out.println("The entered numbered matrix values are");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * @param here we have print floatmatrix
	 */
	static public void floatMatrix()

	{
		Utility utility = new Utility();
		float a[][] = new float[3][3];
		System.out.println("Enter the number of rows");
		int rows = utility.inputInteger();
		System.out.println("Enter the number of columns");
		int columns = utility.inputInteger();
		System.out.println("Enter the values of matrix");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				a[i][j] = utility.inputFloat();

			}
		}
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * @param here we have print booleanmatrix
	 */
	static public void booleanMatrix() {

		Utility utility = new Utility();
		boolean a[][] = new boolean[3][3];
		System.out.println("Enter the number of rows");
		int rows = utility.inputInteger();
		System.out.println("Enter the number of columns");
		int columns = utility.inputInteger();
		System.out.println("Enter the values of matrix");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				a[i][j] = utility.inputBoolean();

			}
		}
		System.out.println("The entered booleanmatrix vaues is");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * @param number
	 */
	public static void sumofThreeInteger(int number) {
		int zeroofThreeInteger = 0;
		Utility utility = new Utility();
		int a[] = new int[number];
		System.out.println("Enter array elements");

		for (int i = 0; i < number; i++)

		{
			a[i] = utility.inputInteger();
		}
		for (int i = 0; i < number; i++)

		{
			System.out.print("The array elements is" + a[i] + "  ");
		}
		boolean found = true;
		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.print(a[i]);
						System.out.print(" ");
						System.out.print(a[j]);
						System.out.print(" ");
						System.out.print(a[k]);
						System.out.print("\n");
						found = true;
						zeroofThreeInteger++;
					}
				}
			}
		}

		if (found == false) {
			System.out.println(" not exist ");
		}
		System.out.println("the number of triplets is " + zeroofThreeInteger);
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void rootsofQuadratic(int a, int b, int c) {
		int d = b * b - 4 * a * c;
		if (d > 0) {
			System.out.println("Roots of the equation are real and unequal");
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("First root is:" + root1);
			System.out.println("Second root is:" + root2);
		} else if (d == 0) {
			System.out.println("Roots of the equation are real and equal");
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("Root:" + root1);
		} else {
			System.out.println("Roots of the given equation are imaginary");
		}

	}

	/**
	 * @param temp
	 * @param speed
	 */
	public static void nationalWeatherService(int temp, int speed) {
		if ((temp > 50) && (speed > 3 && speed < 120)) {
			System.out.println("The temperature is" + temp + "The windspeed is" + speed);
			System.out.print("The speed to the power .16 is ");
			double speepow = Math.pow(speed, 0.16);
			System.out.println(speepow);
			double windchill = (float) (35.74 + 0.6125 * temp + (0.4275 * temp - 35.75) * speepow);
			System.out.println("The Weather Service" + windchill);
		} else {
			System.out.println("Enter correct temperature and windspeed");

		}

	}

	/**
	 * @return
	 */
	public static long start() {
		Utility utility = new Utility();
		System.out.println("print 1 to start the time");
		int start = utility.inputInteger();
		System.out.println(start);
		long time = System.currentTimeMillis();
		System.out.println(time);
		return time;
	}

	/**
	 * @return
	 */
	public static long end() {
		Utility utility = new Utility();
		System.out.println("print 2 to end the time");
		int end = utility.inputInteger();
		System.out.println(end);
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		return time1;
	}

	/**
	 * @param time1
	 * @param time
	 */
	public static void duration(long time1, long time) {

		System.out.println("difference");
		long time2 = time1 - time;
		System.out.println(time2);
	}

	/**
	 * @param str
	 * @param l
	 * @param r
	 */
	public static void permutation(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutation(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * @param str
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String str, int i, int j) {
		char temp;
		char charArray[] = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/**
	 * @param decimalNumber
	 */
	public static  void convertBinary(int decimalNumber) {
		int binary[] = new int[40];
		int index = 0;
		while (decimalNumber > 0) {
			binary[index++] = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	/**
	 * @param n
	 */
	static public void SqrtNew(double n) {
		double epsilon = 1e-15;
		double t = n;

		while (Math.abs(t - n / t) > epsilon * t) {
			t = (n / t + t) / 2.0;
		}

		System.out.println("The squareroot of a given number" + t);
	}

	/**
	 * @param month
	 * @param date
	 * @param year
	 */
	static public void calendarDay(int month, int date, int year) {
		int x = year + (year / 4) - (year / 100) + (year / 400);
		int mo = month + 12 * ((14 - month) / 12) - 2;

		int dateofday = (date + x + ((31 * mo) / 12)) % 7;
		System.out.println(dateofday);

	}

	/**
	 * @param elements
	 * @param low
	 * @param high
	 */
	public static void mergeSort(int[] elements, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(elements, low, mid);
			mergeSort(elements, mid + 1, high);
			merge(elements, low, mid, high);
		}
	}

	/**
	 * @param subset
	 * @param low
	 * @param mid
	 * @param high
	 */
	static void merge(int[] subset, int low, int mid, int high) {

		int n = high - low + 1;
		int[] Temp = new int[n];

		int i = low, j = mid + 1;
		int k = 0;

		while (i <= mid || j <= high) {
			if (i > mid)
				Temp[k++] = subset[j++];
			else if (j > high)
				Temp[k++] = subset[i++];
			else if (subset[i] < subset[j])
				Temp[k++] = subset[i++];
			else
				Temp[k++] = subset[j++];
		}

		for (j = 0; j < n; j++)
			subset[low + j] = Temp[j];
	}

	/**
	 * @param elements
	 * @param low
	 * @param high
	 */
	public static void mergeSortString(String[] elements, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSortString(elements, low, mid);
			mergeSortString(elements, mid + 1, high);
			mergeString(elements, low, mid, high);
		}
	}

	/**
	 * @param elements
	 * @param low
	 * @param mid
	 * @param high
	 */
	public static void mergeString(String[] elements, int low, int mid, int high) {

		int n = high - low + 1;
		String[] Temp = new String[n];

		int i = low, j = mid + 1;
		int k = 0;

		while (i <= mid || j <= high) {
			if (i > mid)
				Temp[k++] = elements[j++];
			else if (j > high)
				Temp[k++] = elements[i++];
			else if (elements[i].compareTo(elements[j]) < 0)
				Temp[k++] = elements[i++];
			else
				Temp[k++] = elements[j++];
		}

		for (j = 0; j < n; j++)
			elements[low + j] = Temp[j];
	}

	/**
	 * @param stringArray
	 */
	public static void insertion(String[] stringArray) {
		int i, j;
		String key;

		for (j = 1; j < stringArray.length; j++) {
			key = stringArray[j];

			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(stringArray[i]) > 0) {
					break;
				}
				stringArray[i + 1] = stringArray[i];

				i--;

			}
			stringArray[i + 1] = key;
			System.out.println(Arrays.toString(stringArray));
		}
	}

	/**
	 * @param celsius
	 * @param fahrenheit
	 */
	public static void celsiusFarhen(double celsius, double fahrenheit) {

		double celstoFah = (celsius * 9 / 5) + 32;
		System.out.println("The celsius to fahrenheit temperature is" + celstoFah);
		double fahtoCels = (fahrenheit - 32) * 5 / 9;
		System.out.println("The fahrenheit to celsius temperature is" + fahtoCels);

	}

	/**
	 * @param firststring
	 * @param secondstring
	 */
	public static void anagram(String firststring, String secondstring) {

		String Firstlowercase1 = "";
		String Firstlowercase = firststring.toLowerCase();
		for (int i = 0; i < Firstlowercase.length(); i++) {
			if (Firstlowercase.charAt(i) != ' ') {
				Firstlowercase1 = Firstlowercase1 + Firstlowercase.charAt(i);
			}

		}
		String Secondlowercase1 = "";
		String Secondlowercase = secondstring.toLowerCase();
		for (int i = 0; i < Secondlowercase.length(); i++) {
			if (Secondlowercase.charAt(i) != ' ') {
				Secondlowercase1 = Secondlowercase1 + Secondlowercase.charAt(i);
			}

		}
		char s5;
		String s6 = "";
		char s7;
		String s8 = "";
		char[] s1 = Firstlowercase1.toCharArray();
		char[] s2 = Secondlowercase1.toCharArray();
		for (int i = 0; i <= s1.length - 1; i++) {
			for (int j = i + 1; j <= s1.length - 1; j++) {
				if (s1[i] > s1[j]) {
					s5 = s1[j];
					s1[j] = s1[i];
					s1[i] = s5;
				}
			}
			s6 = s6 + s1[i];
		}
		System.out.println(s6);
		for (int i = 0; i <= s2.length - 1; i++) {
			for (int j = i + 1; j <= s2.length - 1; j++) {
				if (s2[i] > s2[j]) {
					s7 = s2[j];
					s2[j] = s2[i];
					s2[i] = s7;
				}
			}
			s8 = s8 + s2[i];
		}
		System.out.println(s8);

		if (s6.equalsIgnoreCase(s8)) {
			System.out.println("entered string is anagram string");
		} else {
			System.out.println("entered string is not a anagram string");
		}
	}

	
	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	public static int[] PrimeRange() {

		int a[] = new int[1000];
		for (int i = 3; i < 1000; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}

			}
			if (k == 0) {
				for (int l = 0; l < 1000; l++) {
					a[l] = i;

					System.out.print(i + " ");
					break;
				}
			}

		}
		return a;

	}

	/**
	 * @param n
	 * @return
	 */
	public static int[] firstNPrimes(int n) {
		int[] primes = new int[n];
		int ncounter = 0;
		int isPrime = 2;
		for (int i = 0; ncounter < n; i++) {
			boolean prime = true;
			for (int j = 2; j < isPrime; j++) {
				if (isPrime % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				primes[i] = isPrime;
				ncounter++;
			}
			isPrime++;
		}
		return primes;
	}

	/**
	 * @param here we have find out prime number between the ranges
	 */
	public static void primepalindrome()

	{
		boolean isPrime;
		int rem, temp, reversed;
		for (int number = 1; number <= 1000; number++) {
			isPrime = true;
			if (number >= 2) {
				for (int i = 2; i <= (number / 2); i++) {
					if ((number % i) == 0)
						isPrime = false;
				}
				if (isPrime) {
					temp = number;
					reversed = 0;
					while (temp != 0) {
						rem = temp % 10;
						reversed = (reversed * 10) + rem;
						temp /= 10;
					}
					if (reversed == number) {
						System.out.print(number + " ");
					}
				}
			}
		}
		System.out.println();
	}

	/**
	 * @param searchWord1
	 * @param list
	 * @return
	 */
	public static String wordsearch1(String searchWord1, List<String> list) {
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int start = 0;
			int end = list.size() - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (searchWord1.equals(list.get(mid))) {
					System.out.println("word is found");
					return "Yes";

				}
				if (searchWord1.compareToIgnoreCase(list.get(mid)) < 0) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return searchWord1;
	}

	/**
	 * @param principal
	 * @param year
	 * @param rate
	 */
	public static void monthlyPayment(double principal, double year, double rate) {
		double interestRate = rate / (12 * 100);
		System.out.println(interestRate);
		double c = 1 + interestRate;
		System.out.println(c);
		double month = 12 * year;
		System.out.println(month);
		double d = Math.pow(c, month);
		System.out.println(d);
		double monthlyPayment = ((principal * interestRate) / (1 - 1 / d));
		System.out.println("The monthly payment is" + monthlyPayment);
	}

	/**
	 * @param amount
	 */
	public static void vendingMachine(int amount) {
		int count = 0;
		int count1000 = 0;
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		if (amount > 0) {

			while (amount >= 1000) {
				count++;
				count1000++;
				amount = amount - 1000;

			}
			while (amount >= 500) {
				count500++;
				count++;
				amount = amount - 500;

			}
			while (amount >= 100) {
				count100++;
				count++;
				amount = amount - 100;

			}
			while (amount >= 50) {
				count50++;
				count++;
				amount = amount - 50;
				System.out.println("50");
			}
			while (amount >= 10) {
				count++;
				count10++;
				amount = amount - 10;

			}
			while (amount >= 5) {
				count++;
				count5++;
				amount = amount - 5;

			}
			while (amount >= 2) {
				count++;
				count2++;
				amount = amount - 2;
				;
			}
			while (amount >= 1) {
				count++;
				count1++;
				amount = amount - 1;

			}
		} else {
			System.out.println("please input right amount:" + count);
		}
		System.out.println();
		if (count > 0) {
			System.out.println("number of note:" + count);
		}
		System.out.println("The number of 1000 rupees notes is " + count1000);
		System.out.println("The number of 500 rupees notes is " + count500);
		System.out.println("The number of 100 rupees notes is " + count100);
		System.out.println("the number of 50rupees notes is" + count50);
		System.out.println("The number of 10 rupees notes is " + count10);
		System.out.println("THE number of 5 rupees notes is " + count5);
		System.out.println("The number of 2 rupees notes is " + count2);
		System.out.println("The number of 1 rupees notes is " + count1);
	}

	/**
	 * @param arr
	 * @param search
	 * @param size
	 */
	public static void binarySearchInteger(int[] arr, int search, int size) {
		Utility utility = new Utility();
		System.out.println("Enter the array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = utility.inputInteger();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid] < search) {
				first = mid + 1;
			} else if (arr[mid] == search) {
				System.out.println("Element is found at index:" + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("element is not found");
		}
	}

	/**
	 * @param search
	 * @param words
	 * @param low
	 * @param high
	 * @return
	 */
	public static int binarysearchstring(String search, String[] words, int low, int high) {

		if (high <= low) {
			return -1;
		}
		if (low <= high) {
			int mid = (low + high) / 2;
			if (search.compareTo(words[mid]) == 0) {
				return mid;
			} else if (search.compareTo(words[mid]) > 0) {
				return binarysearchstring(search, words, mid + 1, high);
			} else {
				return binarysearchstring(search, words, low, mid - 1);
			}
		}
		return -1;
	}

	/**
	 * @param arr
	 * @return
	 */
	public static int[] insertionSortInteger(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return arr;

	}

	/**
	 * @param arr
	 * @return
	 */
	public static String[] insertionSortString1(String arr[]) {
		String temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].compareToIgnoreCase(arr[j - 1]) < 0) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}
		}

		return arr;

	}

	/**
	 * @param bubble
	 * @return
	 */
	public static int[] bubbleSortInt(int bubble[]) {
		for (int i = 0; i < bubble.length; i++) {
			for (int j = i + 1; j < bubble.length; j++) {
				if (bubble[i] > bubble[j]) {
					int temp = bubble[i];
					bubble[i] = bubble[j];
					bubble[j] = temp;
				}
			}
		}
		for (int i = 0; i < bubble.length; i++) {
			System.out.println(bubble[i]);
		}

		return bubble;
	}

	/**
	 * @param input
	 */
	public static void bubblesortString(String input[]) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].compareToIgnoreCase(input[j]) > 0) {
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			System.out.println(input[i]);
		}
	}

	/**
	 * @param number
	 * @return
	 */
	public static String convertBinary1(int number) {

		String newnumber = "";
		int binary[] = new int[40];
		int index = 0;
		int count = 8;
		while (number > 0 || count != 0) {
			binary[index++] = number % 2;
			number = number / 2;
			count--;
		}
		for (int i = index - 1; i >= 0; i--) {

			newnumber = newnumber + binary[i];
		}
		return newnumber;

	}

	/**
	 * @param s2
	 * @return
	 */
	public static String newNibble(String s2) {

		String lowerNibble = s2.substring(0, 4);
		String upperNibble = s2.substring(4, 8);
		String swappedBinary = upperNibble + lowerNibble;
		return swappedBinary;

	}

	/**
	 * @param binaryNumber
	 * @return
	 */
	public int BinaryToDecimal(int binaryNumber) {

		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		return decimal;
	}

	/**
	 * @param number
	 * @return
	 */
	public static int[] primerange(int number) {
		for (int i = 3; i < number; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}

			}
			if (k == 0) {
				System.out.print(" " + i);
			}
		}
		return null;

	}

	/**
	 * @param searchWord
	 * @return
	 * @throws IOException
	 */
	public static List<String> readFile(String searchWord) throws IOException {
		String temp;
		String temp1;
		List<String> list = new ArrayList<String>();
		FileReader fileReader = new FileReader("abc.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line = bufferedReader.readLine();
		System.out.println(line);
		while (line != null) {
			String[] stringArray = line.split(" ");
			for (String s11 : stringArray) {
				list.add(s11);
			}

			line = bufferedReader.readLine();
		}

		for (int i = 0; i <= list.size() - 1; i++) {
			for (int j = i + 1; j <= list.size() - 1; j++) {
				if (list.get(i).compareToIgnoreCase(list.get(j)) > 0) {
					temp = list.get(j);
					temp1 = list.get(i);
					list.set(j, temp1);
					list.set(i, temp);

				}
			}
		}
		for (int i = 0; i <= list.size() - 1; i++)

		{
			System.out.print(list.get(i));
			System.out.println(" ");
		}
		bufferedReader.close();
		wordsearch1(searchWord, list);
		return list;

	}

	/**
	 * @param status
	 * @param searchWord
	 * @param ll2
	 * @param line
	 * @return
	 * @throws IOException
	 */
	public static LinkedList1<String> addRemove2(boolean status, String searchWord, LinkedList1<String> linkedhashmap, String line)
			throws IOException {
		FileWriter writer = new FileWriter("Hashing.text", false);
		BufferedWriter write = new BufferedWriter(writer);
		if (status != true) {
			linkedhashmap.add(searchWord);
			String str = " ";
			line = line + str + searchWord;
			write.write(line);
			write.close();
		} else {

			linkedhashmap.remove(searchWord);
			String replace = line.replace(searchWord, "");
			write.write(replace);
			write.close();

		}
		return linkedhashmap;
	}

	/**
	 * @param status
	 * @param searchWord
	 * @param ll2
	 * @return
	 */
	public static LinkedList1<String> addRemove(boolean status, String searchWord, LinkedList1<String> listorder) {

		if (status != true) {

			listorder.add(searchWord);

		} else {

			listorder.remove(searchWord);

		}
		return listorder;
	}

	

	/**
	 * @param ll
	 * @return
	 */
	public static List<Integer> Sorting(LinkedList<Integer> ll) {
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		for (int i = 0; i <= ll.size() - 1; i++) {
			for (int j = i + 1; j <= ll.size() - 1; j++) {
				if (ll.get(i) > ll.get(j)) {
					int temp = ll.get(i);
					int temp1 = ll.get(i);
					ll.set(j, temp1);
					ll.set(i, temp);

				}

			}
			System.out.println(ll.get(i));
		}

		ll1 = ll;
		return ll1;

	}

	/**
	 * @param ins
	 * @param searchWord
	 * @param status
	 * @param line
	 */
	public static void readFile(LinkedList1<String> ins, String searchWord, boolean status, String line) {

		try {
			FileWriter writer = new FileWriter("Unorderlist.text", false);
			BufferedWriter write = new BufferedWriter(writer);
			if (status == true) {
				String replace = line.replace(searchWord, "");
				write.write(replace);
				write.close();
			} else {
				String str = " ";
				line = line + str + searchWord;
				write.write(line);
				write.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	
	/**
	 * @param Linkedlistsort
	 * @throws IOException
	 */
	public void fileWriterorder(int Linkedlistsort[]) throws IOException
	{
		
		String replace="";
		FileWriter writer = new FileWriter("Orderlist.text",false);
		BufferedWriter write = new BufferedWriter(writer);
		for(int i=0;i<Linkedlistsort.length;i++)
		{
			String space =" ";
			
			 replace = replace + Integer.toString(Linkedlistsort[i])+space;
			 
			  if(i==Linkedlistsort.length-1)
			  {
				  write.write(replace);
				  write.close();
			  }
		}
	}
	/**
	 * @param ll3
	 * @param searchWord
	 * @param status
	 * @param line
	 */
	public static void readFile1(LinkedList1<String> listofnumber , String searchWord, boolean status, String line) {

		try {
			FileWriter writer = new FileWriter("Hashing.text", false);
			BufferedWriter write = new BufferedWriter(writer);
			if (status == true) {
				String replace = line.replace(searchWord, "");
				write.write(replace);
				write.close();
			} else {
				String str = " ";
				line = line + str + searchWord;
				write.write(line);
				write.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	

	

	/**
	 * @param arr
	 * @param n
	 * @return
	 */
	public  Integer[] sortArray(Integer[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}
		}
		return arr;
	}

	/**
	 * @param arr
	 */
	public static void put(Integer[] arr) {
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		LinkedList<Integer> l3 = new LinkedList<Integer>();
		LinkedList<Integer> l4 = new LinkedList<Integer>();
		LinkedList<Integer> l5 = new LinkedList<Integer>();
		LinkedList<Integer> l6 = new LinkedList<Integer>();
		LinkedList<Integer> l7 = new LinkedList<Integer>();
		LinkedList<Integer> l8 = new LinkedList<Integer>();
		LinkedList<Integer> l9 = new LinkedList<Integer>();
		LinkedList<Integer> l10 = new LinkedList<Integer>();
		LinkedList<Integer> l11 = new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int k = Integer.valueOf(arr[i] % 11);
			if (k == 0) {
				l1.add(arr[i]);
				map.put(0, l1);
			}
			if (k == 1) {
				l2.add(arr[i]);
				map.put(1, l2);
			}
			if (k == 2) {
				l3.add(arr[i]);

				map.put(2, l3);
			}
			if (k == 3) {
				l4.add(arr[i]);

				map.put(3, l4);
			}
			if (k == 4) {
				l5.add(arr[i]);

				map.put(4, l5);
			}
			if (k == 5) {
				l6.add(arr[i]);

				map.put(5, l6);
			}
			if (k == 6) {
				l7.add(arr[i]);

				map.put(6, l7);
			}
			if (k == 7) {
				l8.add(arr[i]);

				map.put(7, l8);
			}
			if (k == 8) {
				l9.add(arr[i]);

				map.put(8, l9);
			}
			if (k == 9) {
				l10.add(arr[i]);

				map.put(9, l10);
			}
			if (k == 10) {
				l11.add(arr[i]);

				map.put(10, l11);
			}

		}
		for (Integer key : map.keySet()) {
			System.out.println("Key = " + key);
		}

		for (LinkedList<Integer> value : map.values()) {
			System.out.println("Value = " + value);
		}

	}

	/**
	 * @param node
	 */
	public static void NumberOfBinarySearchTree(int node) {
		long fact1 = 0, fact2 = 0, fact3 = 0, counter = 0;

		fact1 = factorial((2) * (node));
		fact2 = factorial((node + 1));
		fact3 = factorial(node);

		try {
			counter = fact1 / (fact2 * fact3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The number of possible arrangement is "+counter);
	}

	/**
	 * @param number
	 * @return
	 */
	public static int factorial(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		return fact;

	}

	/**
	 * @param n
	 */
	public static void dispPrimeAngram(int n) {
		int num = n;
		Utility file = new Utility();
		boolean status2, status, status1;
		int k = 1;
		for (int i = 2; i < n; i++) {
			for (int j = i + 1; j < num - 1; j++) {
				status2 = file.anagramNum(i, j);
				status1 = file.primeNum(i);
				status = file.primeNum(j);
				if (status2 && status && status1) {

					while (i > 100 && j > 100 && k == 1) {
						System.out.println();
						k = 0;
					}
					while (i > 200 && j > 200 && k == 0) {
						System.out.println();
						k = 2;
					}
					while (i > 300 && j > 300 && k == 2) {
						System.out.println();
						k = 3;
					}
					while (i > 400 && j > 400 && k == 3) {
						System.out.println();
						k = 4;
					}
					while (i > 500 && j > 500 && k == 4) {
						System.out.println();
						k = 5;
					}
					while (i > 600 && j > 600 && k == 5) {
						System.out.println();
						k = 6;
					}
					while (i > 700 && j > 700 && k == 6) {
						System.out.println();
						k = 7;
					}
					while (i > 800 && j > 800 && k == 7) {
						System.out.println();
						k = 8;
					}
					while (i > 900 && j > 900 && k == 8) {
						System.out.println();
						k = 9;
					}
					System.out.print(" " + i + " ");
					System.out.print(" " + j + " ");
				}

			}
		}
		System.out.println();
	}

	/**
	 * @param num
	 * @param num1
	 * @return
	 */
	public boolean anagramNum(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}

	/**
	 * @param num
	 * @return
	 */
	public boolean primeNum(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	/**
	 * @param filepath
	 */
	@SuppressWarnings({ "unused", "unchecked" })
	public static void writeData2(String filepath) {

		JSONArray jsonArray = new JSONArray();
		Utility utility = new Utility();
		System.out.println("Enter the number of company");
		int number = utility.inputInteger();
		utility.inputString();
		String[] array = new String[number];
		int share[] = new int[number];
		int amount[] = new int[number];
		String name[] = new String[number];
		for (int k = 0; k < number; k++) {
			System.out.println(" number of shares for company and share amount");
			share[k] = utility.inputInteger();
			amount[k] = utility.inputInteger();

		}
		utility.inputString();
		for (int i = 0; i < number; i++) {
			System.out.println("Name of the share");
			array[i] = utility.inputString();
		}
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("/home/bridgeit/Documents/Nilesh/Filesforjson/Commercial.json");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int l = 0; l < number; l++) {
			System.out.println("  " + array[l] + "        " + share[l] + "       " + amount[l] + "/-");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", array[l]);
			jsonObject.put("Share", share[l]);
			jsonObject.put("amount", amount[l]);

			jsonArray.add(jsonObject);

		}
		printWriter.write(jsonArray.toJSONString());
		printWriter.flush();
		printWriter.close();

	}
	
	
	/**
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public static void writeInventoryJsonFile() throws FileNotFoundException 
	{
		Map<Object,Object> map;
		Utility utility = new Utility();
		PrintWriter printwriter = new PrintWriter("Inventory.json");
		JSONObject jsonobject = new JSONObject();
		JSONArray jsonArrayOfRice = new JSONArray();
		JSONArray jsonArrayOfPulse = new JSONArray();
		JSONArray jsonArrayOfWheat = new JSONArray();
		System.out.println("enter number of variety you want to add to enter in inventory");
		int numberofRice = utility.inputInteger();
		utility.inputString();
		for(int i=1;i<=numberofRice;i++)
		{
			map =new LinkedHashMap<>();
			System.out.println("enter the name of rice " +i);
			String ricename = utility.inputString();
			System.out.println("enter weight of rice"  +i);
			double weight = utility.inputDouble();
			System.out.println("enter the price of rice "+i);
			double price = utility.inputDouble();
			utility.inputString();
			map.put("name", ricename);
			map.put("weight", weight);
			map.put("price",price);
			jsonArrayOfRice.add(map);
			
			
			
		}
		
		System.out.println("enter number of variety you want to add to enter in inventory");
		int numberofPulse = utility.inputInteger();
		utility.inputString();
		for(int i=1;i<=numberofPulse;i++)
		{
			map =new LinkedHashMap<>();
			System.out.println("enter the name of pulse " +i);
			String pulsename = utility.inputString();
			System.out.println("enter weight of pulse"  +i);
			double weight = utility.inputDouble();
			System.out.println("enter the price of pulse "+i);
			double price = utility.inputDouble();
			utility.inputString();
			map.put("name", pulsename);
			map.put("weight", weight);
			map.put("price",price);
			jsonArrayOfPulse.add(map);
			
			
		}
	   
		
		System.out.println("enter number of variety you want to add to enter in inventory");
		int numberofWheat = utility.inputInteger();
		utility.inputString();
		for(int i=1;i<=numberofWheat;i++)
		{
			map =new LinkedHashMap<>();
			System.out.println("enter the name of wheat " +i);
			String wheatname = utility.inputString();
			System.out.println("enter weight of wheat"  +i);
			double weight = utility.inputDouble();
			System.out.println("enter the price of wheat "+i);
			double price = utility.inputDouble();
			utility.inputString();
			map.put("name", wheatname);
			map.put("weight", weight);
			map.put("price",price);
			jsonArrayOfWheat.add(map);
			
			
		}
		jsonobject.put("rice",jsonArrayOfRice);
		jsonobject.put("pulse",jsonArrayOfPulse);
		jsonobject.put("wheat",jsonArrayOfWheat);
		printwriter.write(jsonobject.toString());
		printwriter.flush();
		printwriter.close();
	}
	
	/**
	 * @param filepath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public JSONObject readFromInventoryFile(String filepath) throws FileNotFoundException, IOException, ParseException
	{
		Object obj = new JSONParser().parse(new FileReader(filepath));
		JSONObject jo = (JSONObject) obj;
		return jo;
	}

	
	/**
	 * @param jsonObject
	 */
	@SuppressWarnings("rawtypes")
	public static void inventoryData(JSONObject jsonObject)
	{
		JSONArray rice = (JSONArray) jsonObject.get("rice");
		JSONArray wheat = (JSONArray) jsonObject.get("wheat");
		JSONArray pulse = (JSONArray) jsonObject.get("pulse");
		for(int i=0;i<rice.size();i++)
		{
			Map map = (Map) rice.get(i);
			String  name = (String)map.get("name");
			double weight = (double)map.get("weight");
			double price = (double)map.get("price");
			double sum = weight * price;
			System.out.println("total price for rice of variety  " +name+ "is" +sum);
		}
		System.out.println();
		
		for(int i=0;i<pulse.size();i++)
		{
			Map map = (Map) pulse.get(i);
			String  name = (String)map.get("name");
			double weight = (double)map.get("weight");
			double price = (double)map.get("price");
			double sum = weight * price;
			System.out.println("total price for pulse of variety  " +name+ "is" +sum);
		}
		System.out.println();
		

		for(int i=0;i<wheat.size();i++)
		{
			Map map = (Map) wheat.get(i);
			String  name = (String)map.get("name");
			double weight = (double)map.get("weight");
			double price = (double)map.get("price");
			double sum = weight * price;
			System.out.println("total price for wheat of variety  " +name+ "is" +sum);
		}
		
	}
	

	
	

	/**
	 * @param Sentence
	 * @return
	 */
	public static String replaceNameFullname(String Sentence) {
		Utility utility = new Utility();
		System.out.println("Enter new name");
		String newname = utility.inputString();
		System.out.println("Enter full name");
		String fullname = utility.inputString();
		String replacename = Sentence.replaceAll("<<name>>", newname);
		String replacenamefullname = replacename.replaceAll("<<fullname>>", fullname);

		return replacenamefullname;
	}

	/**
	 * @param Sentence1
	 * @return
	 */
	public static String replaceMobilenumber(String Sentence1) {
		Utility utility = new Utility();
		System.out.println("Enter Mobilenumber");
		String Mobilenumber = utility.inputString();
		String replacemobilenumber = Sentence1.replaceAll("91-xxxxxxxxxx", Mobilenumber);

		return replacemobilenumber;
	}

	/**
	 * @param Sentence2
	 * @return
	 */
	public static String replaceDate(String Sentence2) {
		Utility utility = new Utility();
		System.out.println("Enter new date");
		String newdate = utility.inputString();
		String replacedate = Sentence2.replaceAll("01/01/2016", newdate);

		return replacedate;

	}

	@SuppressWarnings("unchecked")
	public static void stockReport() throws FileNotFoundException {
		JSONArray jsonArray = new JSONArray();
		Utility utility = new Utility();
		System.out.println("Enter the number of company");
		int number = utility.inputInteger();
		utility.inputString();
		utility.inputString();
		String[] array = new String[number];
		int share[] = new int[number];
		int amount[] = new int[number];
		int total[] = new int[number];
		System.out.println("Enter Company Names: ");
		int totalStock = 0;
		for (int i = 0; i < number; i++) {

			array[i] = utility.inputString();
		}

		for (int k = 0; k < number; k++) {
			System.out.println(" number of shares for company and share amount");
			share[k] = utility.inputInteger();
			amount[k] = utility.inputInteger();
			total[k] = share[k] * amount[k];
		}

		System.out.println("*******************Stock Report**************************");
		System.out.println();
		System.out.println("  Company Name   Shares   Price   total of each");
		System.out.println();
         for (int l = 0; l < number; l++) {
			System.out.println("      " + array[l] + "         "+ share[l]+"        "+amount[l]+"       "+total[l]+"/-");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Company Name", array[l]);
			jsonObject.put("Shares", share[l]);
			jsonObject.put("Price", amount[l]);
			jsonObject.put("total", total[l]);
			jsonArray.add(jsonObject);

		}
		PrintWriter	printWriter = new PrintWriter("StockReport.json");
		printWriter.write(jsonArray.toJSONString());
		printWriter.flush();
		printWriter.close();
		System.out.println();
		for (int m = 0; m < number; m++) {

			totalStock = totalStock + share[m] * amount[m];
		}
		System.out.println("Total stock is: " + totalStock);

	}

	/**
	 * @param number
	 * @param number2
	 * @return
	 */
	public static boolean anagramm(int number, int number2) {
		String string = Integer.toString(number);
		char[] charArray = string.toCharArray();
		String string2 = Integer.toString(number2);
		char[] charArray2 = string2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		string = new String(charArray);
		string2 = new String(charArray2);
		if (string.length() == string2.length()) {
			if (string.equals(string2)) {
				return true;

			}
		}
		return false;
	}

	/**
	 * @param start
	 * @param end
	 * @return
	 */
	public  LinkedList1<Integer> primeNumber(int start, int end) {

		LinkedList1<Integer> list = new LinkedList1<Integer>();
		for (int a = start; a < end; a++) {
			int number = a;
			int count = 0;
			for (int i = 1; i <= number; i++) {
				count = 0;
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
			}
			if (count == 0) {
				list.add(a);
			}
		}
		return list;

	}

	

	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public  int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	/**
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		}
		if (year % 400 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * @param string
	 * @return
	 */
	public static boolean checkPalindrome(String string) {
		Dequeue que = new Dequeue();
		char first, last, c;
		boolean status = true;

		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			que.insertAtFront(c);;
		}
		while (que.getSize() > 1) {
			first = que.removeAtFront();
			last = que.removeAtRear();
			if (first != last) {
				status = false;
				break;
			}

		}

		return status;

	}
 
	
	/**
	 * @param year
	 */
	public static void leapYear(int year) {
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			day[2] = 29;
		}
	}

	/**
	 * @param year
	 * @param months
	 * @return
	 */
	public int dayCode(int year, int months) {
		int m, x, d, y;
		int day = 1;
		y = year - (14 - months) / 12;
		x = y + y / 4 - y / 100 + y / 400;
		m = months + 12 * ((14 - months) / 12) - 2;
		d = (day + x + (31 * m) / 12) % 7;

		return d;
	}

	/**
	 * @param daycode
	 * @param months
	 * @param year
	 */
	public <T> void store(int daycode, int months,int year) {
		LinkedList1<Integer> weeklist = new LinkedList1<Integer>();
		String month[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("     " + month[months] + " " + year);
		System.out.println("su mo tu we th fr sat");
		for (int i = 1; i <= day[months]; i++)
		{
			weeklist.add(i);
		}
		for (int i = 0; i < daycode; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= day[months]; i++) {
		   
			weeklist.displayweekday(i);			
			if ((i + daycode) % 7 == 0 || i == day[months]) {
				System.out.println();
			}
		}
		
	}

	/**
	 * @param year
	 * @param d
	 * @param months
	 */
	public void print(int year, int d, int months) {
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String month[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		System.out.println("     " + month[months] + " " + year);
		System.out.println("su mo tu we th fr sat");
		for (int i = 0; i < d; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= day[months]; i++) {
			System.out.printf("%2d ", i);

			if (((i + d) % 7 == 0) || (i == day[months])) {
				System.out.println();
			}
		}
	}

	/**
	 * @param d
	 * @param months
	 * @param year
	 */
	public  void print1(int d, int months, int year) {
		int day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				for (int i = 0; i < d; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= day[months]; i++) {
			System.out.printf("%2d ", i);

			if (((i + d) % 7 == 0) || (i == day[months])) {
				System.out.println();
			}
		}
	}

	/**
	 * @param low
	 * @param power
	 * @return
	 */
	public static int questionNumber(int low, int power) {
		if (low > power) {
			return -1;

		}
		if (power == low) {
			return low;
		}

		int middle = (low + power) / 2;
		System.out.println("your number in between " + low + " to " + middle);
		System.out.println("if yes then type true if no then type false ");
		boolean flag = true;

		if (flag != inputBoolean()) {
			low = middle + 1;
		} else {
			power = middle;
		}
		return questionNumber(low, power);
	}

	/**
	 * @param suits
	 * @param cards
	 * @return
	 */
	public String[] Deck(String[] suits, String[] cards) {
		String[] deck = new String[suits.length * cards.length];

		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = cards[i] + "=>" + suits[j];
			}
		}

		// shuffle
		for (int i = 0; i < deck.length; i++) {
			int r = i + (int) (Math.random() * (deck.length - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;
	}

	/**
	 * @param deck
	 * 
	 * @description This method will distribute the deck of cards into four player.
	 */
	public void distribute(String[] deck) {
		int indexOfDeck = 0;
		String[][] deckOfcard = new String[4][9];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				deckOfcard[i][j] = deck[indexOfDeck];
				indexOfDeck++;
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.print("\nPlayer " + (i + 1) + " : ");
			for (int j = 0; j < 9; j++) {
				System.out.print(deckOfcard[i][j] + ", ");
			}
			System.out.print(
					"\n----------------------------------------------------------------------------------------------------------------------");
		}
	}

	
	
	/**
	 * @param listprime
	 */
	public  <T> void anagramstatck(LinkedList1<T> listprime) {
		LinkedList1<T> listanagram = new LinkedList1<T>();

		for (int i = 0; i < listprime.length() - 1; i++) {
			for (int j = i + 1; j < listprime.length(); j++) {
				if (listprime.dataAtPosition(i) != null) {
					if (Utility.anagramm((Integer) listprime.dataAtPosition(i), (Integer) listprime.dataAtPosition(j))) {
						listanagram.add((listprime.dataAtPosition(i))); 
                        listanagram.add((listprime.dataAtPosition(j)));
					}
				}
			}
		}
		Stack1<T> stack = new Stack1<T>();
		for (int i = 0; i < listanagram.length(); i++) {
			stack.push(listanagram.dataAtPosition(i));
		}
		int[] array = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			array[i] =  (int) stack.get(i);
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

	/**
	 * @param expression
	 */
	public static <T> void checkArithmeticExpression(String expression) {
		char chararray[] = expression.toCharArray();
		Stack1<String> stack = new Stack1<String>();
		for (int i = 0; i < chararray.length; i++) {
			if (chararray[i] == '(') {
				stack.push("(");
			} else if (chararray[i] == ')') {
				stack.pop();
			}
		}
		boolean flag = stack.isEmpty();
		if (flag == true) {
			System.out.println("Arithematic Expression is Balanced.");
		} else {
			System.out.println("Arithematic Expression is not Balanced.");
		}

	}

	/**
	 * @param month
	 * @param year
	 */
	public  void printmonthofcalendar(int month, int year)

	{
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean status = Utility.isLeapYear(year);
		if (month == 2 && status) {
			days[month] = 29;
		}

		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");

		int d = utility.day(month, 1, year);

		utility.print1(d, month, year);
	}

	/**
	 * @param Print the primeanagram number using queue
	 */
	public  <T> void primeAnagramQueueController() {
		int start = 1;
		int end = 1000;
		LinkedList1<Integer> list = new LinkedList1<Integer>();
		list =  utility.primeNumber(start, end);
		QueueImpl<Integer> queue = new QueueImpl<Integer>();
		for (int i = 0; i < list.length(); i++) {
			for (int j = i + 1; j < list.length(); j++) {
				if (list.dataAtPosition(i) != null) {
					if (Utility.anagramm((Integer) list.dataAtPosition(i), (Integer) list.dataAtPosition(j))) {
						queue.enqueue(((list.dataAtPosition(i)))); 
                        System.out.print(" ");
                        queue.enqueue(((list.dataAtPosition(j)))); 

					}
				}
			}
		}
				
		queue.getelement();
	}

	
	
	/**
	 * @param num
	 * @param n
	 */
	public void printPrime2D(int num,int n)
	{
		Utility utility =new Utility();
		boolean status;
		int i=1;
		for(num=2;num<=n;num++)
		{
			status=utility.primeNum(num);
			if(status)
			{
				if(num>100 && i==1)
				{
					System.out.println();
					i=0;
				}
				if(num>200 && i==0)
				{
					System.out.println();
					i=2;
				}
				if(num>300 && i==2)
				{
					System.out.println();
					i=3;
				}
				if(num>400 && i==3)
				{
					System.out.println();
					i=4;
				}
				if(num>500 && i==4)
				{
					System.out.println();
					i=5;
				}
				if(num>600 && i==5)
				{
					System.out.println();
					i=6;
				}
				if(num>700 && i==6)
				{
					System.out.println();
					i=7;
				}
				if(num>800 && i==7)
				{
					System.out.println();
					i=8;
				}
				if(num>900 && i==8)
				{
					System.out.println();
					i=9;
				}
				System.out.print(num+" ");
			}
		}
		System.out.println();
	}

	/**
	 * @return
	 * @throws IOException
	 */
	public  String fileReader() throws IOException {

		LinkedList1<String> linkedlistorder = new LinkedList1<String>();
		FileReader fileReader = new FileReader("Unorderlist.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		String array[] = line.split(" ");
		for (int i = 0; i < array.length; i++) {
			linkedlistorder.add(array[i]);
		}
        bufferedReader.close();
		return line;

	}

	/**
	 * @return
	 * @throws IOException
	 */
	public  String fileReaderfororderlist() throws IOException {

		
		FileReader fileReader = new FileReader("Orderlist.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		bufferedReader.close();
		return line;

	}

	
	/**
	 * @param sortlist
	 * @return
	 */
	public  int[] sort(LinkedList1<Integer> sortlist)
	{
		int a[]=new int[sortlist.length()];
		for(int i=0;i<sortlist.length();i++)
		{
			a[i]=sortlist.dataAtPosition(i);
		}
		return a;
	}
	/**
	 * @param status
	 * @param searchNumber
	 * @param sortorder
	 * @return
	 */
	public LinkedList1<Integer>  addRemoveorderlist(boolean status,int searchNumber,LinkedList1<Integer> sortorder)
	
	{
		if(status!=true)
		{
			sortorder.add(searchNumber);
		}
		else
		{
			sortorder.remove(searchNumber);
		}
		return sortorder;
	}
	/**
	 * @param b
	 * @return
	 */
	public int[] sortasc(int b[])
	
	{
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>b[j])
				{
					int temp =b[j];
					b[j]=b[i];
					b[i]=temp;
				}
			}
		}
		return b;
	}
	
	/**
	 * @param searchWord
	 * @param linkedlistunorder
	 * @param line
	 */
	public void fileWriter(String searchWord, LinkedList1<String> linkedlistunorder, String line)

	{
		boolean status = linkedlistunorder.search(searchWord);
		LinkedList1<String> insertionlinkedlist = new LinkedList1<String>();
		insertionlinkedlist = Utility.addRemove(status, searchWord, linkedlistunorder);

		insertionlinkedlist.display();
		Utility.readFile(insertionlinkedlist, searchWord, status, line);

	}


	/**
	 * @return
	 * @throws IOException
	 */
	public static String hashmapFileReader() throws IOException
	{
		FileReader fileReader = new FileReader("Hashing.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String sentence = bufferedReader.readLine();
		System.out.println(sentence);
		;
		bufferedReader.close();
		return sentence;
	}
	
	public static JSONObject readFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Stockaccount.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}
	public static JSONObject readFromFileDoctor(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Doctorfile.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}

	@SuppressWarnings("unchecked")
	public static void addtoFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject = readFromFile("Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
		JSONObject jsonObject2 = new JSONObject();
		System.out.println("Enter the name of the share");
		String name = utility.inputString();
		System.out.println("Enter the number of share");
		int noofshare = utility.inputInteger();
		utility.inputString();
		System.out.println("Enter the shareprice");
		int shareprice = utility.inputInteger();
		utility.inputString();
		String time = Utility.getCurrentTime();
		String date =Utility.getCurrentDate();
		jsonObject2.put("Name", name);
		jsonObject2.put("noofshare", noofshare);
		jsonObject2.put("Shareprice", shareprice);
		jsonObject2.put("time", time);
		jsonObject2.put("date",date);
		jsonArray.add(jsonObject2);
		jsonObject.put("stock", jsonArray);

		PrintWriter pw = new PrintWriter("Stockaccount.json");
		pw.write(jsonObject.toJSONString());
		pw.flush();
		pw.close();

	}

	@SuppressWarnings("unchecked")
	public static void deletetoFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject = readFromFile("Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
		JSONObject jsonObject3 = new JSONObject();

		System.out.println("Enter the name from user");
		String name1 = utility.inputString();

		for (int i = 0; i < jsonArray.size(); i++) {

			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name = (String) jsonObject3.get("Name");
			if (name.equalsIgnoreCase(name1)) {
				jsonArray.remove(i);
				jsonObject.put("stock", jsonArray);
				PrintWriter pw = new PrintWriter("Stockaccount.json");
				pw.write(jsonObject.toJSONString());
				pw.flush();
				pw.close();
				break;
			}
		}

	}

	/**
	 * @param filePath
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unused")
	public static int numberofrecordofpersons(String filePath) throws IOException, ParseException {
		int count = 0;
		JSONObject jsonObject = readFromFile("Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
		
		JSONObject jsonObject3 = new JSONObject();
		Iterator<?> iterator = jsonArray.iterator();

		while (iterator.hasNext()) {
			jsonObject3 = (JSONObject) iterator.next();
			count++;
		}
		return count;

	}

	/**
	 * @param shareToSell
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public static void sell(long shareToSell) throws IOException, ParseException {
	
		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Stockaccount.json");
		JSONArray jsonArray =  (JSONArray) jsonObject2.get("stock");
		JSONObject jsonObject3 = new JSONObject();
		System.out.println("Enter the name from user");
		String name1 = utility.inputString();

		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name2 = (String) jsonObject3.get("Name");
			if (name1.equalsIgnoreCase(name2)) {
				System.out.println("hi");
				long totalshare = (long) jsonObject3.get("noofshare");
				String time = (String) jsonObject3.get("time");
				String date = (String) jsonObject3.get("date");
				long remainingshare = totalshare - shareToSell;
				jsonObject3.put("noofshare", remainingshare);
				jsonObject3.put("time", time);
				jsonObject3.put("date", date);
				jsonArray.set(i,jsonObject3);
				jsonObject2.put("stock", jsonArray);
				PrintWriter pw = new PrintWriter("Stockaccount.json");
				pw.write(jsonObject2.toJSONString());
				pw.flush();
				pw.close();
				break;

			}

		}
	}

	
	/**
	 * @param sharetoBuy
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public static void buy(long sharetoBuy) throws FileNotFoundException, IOException, ParseException
	{
		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Stockaccount.json");
		JSONArray jsonArray =  (JSONArray) jsonObject2.get("stock");
		JSONObject jsonObject3 = new JSONObject();
		System.out.println("Enter the name from user");
		String name1 = utility.inputString();

		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name2 = (String) jsonObject3.get("Name");
			if (name1.equalsIgnoreCase(name2)) {
				System.out.println("hi");
				long totalshare = (long) jsonObject3.get("noofshare");
				String time = (String) jsonObject3.get("time");
				String date = (String) jsonObject3.get("date");
				long finalshare = totalshare + sharetoBuy;
				
				
				jsonObject3.put("noofshare", finalshare);
				jsonObject3.put("time", time);
				jsonObject3.put("date", date);
				jsonArray.set(i,jsonObject3);
				jsonObject2.put("stock", jsonArray);
				PrintWriter pw = new PrintWriter("Stockaccount.json");
				pw.write(jsonObject2.toJSONString());
				pw.flush();
				pw.close();
				break;

			}

		}
		
	}
	  /**
	 * @param filePath
	 * @throws IOException
	 * @throws ParseException
	 */
	public static void displaynoshare(String filePath) throws IOException, ParseException
	    {
		    
			JSONObject jsonObject2 = readFromFile("Stockaccount.json");
			JSONArray jsonArray =  (JSONArray) jsonObject2.get("stock");
	    	Iterator<?> iterator =  jsonArray.iterator();
	    	JSONObject jsonObject = new JSONObject();
	    	while(iterator.hasNext())
	    	{
	    		jsonObject=(JSONObject)iterator.next();
	    		long share = (long)jsonObject.get("noofshare");
	    		long amount = (long)jsonObject.get("Shareprice");
	    		String name = (String)jsonObject.get("Name");
	    		String date = (String) jsonObject.get("date");
	    		String time = (String) jsonObject.get("time");
	    		System.out.println("  Account Holder name- "+name);
	    		System.out.print("  Total Share -"+share);
	    		System.out.print("  Available amount -"+amount);
	    		System.out.print("  Date- "+date);
	    		System.out.print("  Time - "+time);
	    		System.out.println(" ");
	    	}
	    }

	  
	  /**
	 * @return
	 */
	public static String getCurrentTime()
	  {
		    Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	         String time = sdf.format(cal.getTime());
			return time;
	  }
	  
	  
	  /**
	 * @return
	 */
	public static String getCurrentDate()
	  {
		  Date dNow = new Date( );
		  SimpleDateFormat ft1 = new SimpleDateFormat ("dd/MM/yyyy");
          String date =ft1.format(dNow);
		return date;
	  }


	  
	  public void display(String filePath) {
			JSONArray jsonArray = new JSONArray();
			jsonArray = jsonFileReader(filePath);
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject = new JSONObject();
			while (iterator.hasNext()) {
				jsonObject = (JSONObject) iterator.next();
				String name = (String) jsonObject.get("Fname");
				String lastName = (String) jsonObject.get("Lname");
				String zip = (String) jsonObject.get("Zip");
				String address = (String) jsonObject.get("Address");
				String state = (String) jsonObject.get("State");
				String number = (String) jsonObject.get("PhoneNumber");
				String city = (String) jsonObject.get("City");
				System.out.println("<<<<<<<<<<<" + name
						+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Candidte Name " + name + " " + lastName);
				System.out.println("Candidate Contact " + number);
				System.out.println("Candidate Address " + address);
				System.out.println("City :" + city);
				System.out.println("Satate :" + state);
				System.out.println("Pin Code :" + zip);
				System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
			}
		}

		/**
		 * @param filePath
		 * 
		 * @Description it will write the jsonObject into the file.
		 */
		@SuppressWarnings("unchecked")
		public void addObject(String filePath) {

			JSONArray jsonArray = new JSONArray();
			jsonArray = jsonFileReader("Addressbook.json");
			JSONObject jsonObject = new JSONObject();

			// Accepting the values from user.
			System.out.println("\nEnter your first name : ");
			String fname = scanner.next();
			System.out.println("\nEnter your last name : ");
			String lname = scanner.next();
			System.out.println("Enter your address : ");
			String address = scanner.next();
			System.out.println("Enter your city : ");
			String city = scanner.next();
			System.out.println("Enter your state : ");
			String state = scanner.next();
			System.out.println("Enter the zip : ");
			String zip = scanner.next();
			System.out.println("Enter your phone number : ");
			String phoneNumber = scanner.next();

			// Puting the value into the object.
			jsonObject.put("Fname", fname);
			jsonObject.put("Lname", lname);
			jsonObject.put("Address", address);
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("Zip", zip);
			jsonObject.put("PhoneNumber", phoneNumber);
			jsonArray.add(jsonObject);

			// writing the jsonArray into the file.
		     jsonFileWriter(filePath, jsonArray);
			System.out.println("Object is Added");
		}

		/**
		 * @param filePath
		 */
		@SuppressWarnings("unchecked")
		public void edit(String filePath) {

			JSONArray jsonArray = new JSONArray();
			jsonArray = jsonFileReader("Addressbook.json");
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject = new JSONObject();

			System.out.println("Enter the name of person, whos data you want to update : ");
			String person = scanner.next();
			scanner.nextLine();
			boolean found = true;
			while (iterator.hasNext()) {
				jsonObject = (JSONObject) iterator.next();

				if (person.equals((String) jsonObject.get("Fname"))) {
					
					Set<String> keys = jsonObject.keySet();
					String keyArray[] = (String[]) keys.toArray(new String[keys
							.size()]);
					for (int i = 0; i < keyArray.length; i++) {
						System.out.println("Enter " + (i + 1) + " to "
								+ keyArray[i]);
					}
					System.out.println("Enter what you want to do edit : ");
					int key = scanner.nextInt();
					System.out.println("Enter new value : ");
					scanner.nextLine();
					String value = scanner.nextLine();
					jsonObject.put(keyArray[key - 1], value);
					jsonFileWriter(filePath, jsonArray);
					System.out.println("Object is updated.");
					found = false;
				}
			}
			if (found) {
				System.out.println("Persons name is not found.");
			}

		}

		/**
		 * @param filePath
		 *            @ this method using for delete the address
		 */
		public void delete(String filePath) {
			JSONArray jsonArray = new JSONArray();
			jsonArray = jsonFileReader(filePath);
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject = new JSONObject();
			System.out.println("Enter the name of person to delete : ");
			String person2 = scanner.next();
			boolean found2 = true;
			while (iterator.hasNext()) {
				jsonObject = (JSONObject) iterator.next();
				if (person2.equals(jsonObject.get("Fname"))) {
					jsonArray.remove(jsonObject);
					found2 = false;
					System.out.println("Removed");
					break;
				}
			}
			if (found2) {
				System.out.println("Person not found.");
			}
		jsonFileWriter(filePath, jsonArray);
		}

		/**
		 * @param filePath
		 *            @ this method using for Sorting address by name....
		 */
		public void sortByName(String filePath) {
			JSONArray jsonArray = new JSONArray();
			jsonArray = jsonFileReader(filePath);
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject = new JSONObject();

			String[] name = new String[jsonArray.size()];
			int index = 0;
			while (iterator.hasNext()) {
				jsonObject = (JSONObject) iterator.next();
				name[index] = (String) jsonObject.get("Fname");
				index++;
			}
			Arrays.sort(name);

			for (int i = 0; i < name.length; i++) {
				Iterator<?> iterator2 = jsonArray.iterator();
				JSONObject jsobject = new JSONObject();
				while (iterator2.hasNext()) {
					jsobject = (JSONObject) iterator2.next();
					if (name[i].equals(jsobject.get("Fname"))) {
						System.out.println(jsobject);
						System.out
								.println("-------------------------------------------------------------------------------------------------------------------------");
					}

				}
			}
		}

		/**
		 * @param filePath
		 * 
		 * @Description it will give you sorted list of objects by zip
		 */
		public void sortByZip(String filePath) {
			JSONArray jsonArray = new JSONArray();
			jsonArray =jsonFileReader(filePath);
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject = new JSONObject();

			String[] name = new String[jsonArray.size()];
			int index = 0;
			while (iterator.hasNext()) {
				jsonObject = (JSONObject) iterator.next();
				name[index] = (String) jsonObject.get("Zip");
				index++;
			}
			Arrays.sort(name);

			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
			}
			for (int i = 0; i < name.length; i++) {
				Iterator<?> iterator2 = jsonArray.iterator();
				JSONObject jsobject = new JSONObject();
				while (iterator2.hasNext()) {
					jsobject = (JSONObject) iterator2.next();
					if (name[i].equals(jsobject.get("Zip"))) {
						System.out.println(jsobject);
						System.out
								.println("-------------------------------------------------------------------------------------------------------------------------");
						break;
					}
				}
			}
		}
		
		/**
		 * @param filePath
		 * @return
		 */
		public    JSONArray jsonFileReader(String filePath)  {
			File file=new File("Addressbook.json");
			JSONArray jSonArray=null;
			try {
				FileReader fileReader=new FileReader(file);
				JSONParser jSonParser=new JSONParser();
				jSonArray=new JSONArray();
				jSonArray=(JSONArray) jSonParser.parse(fileReader);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return jSonArray;
		}

		public  static  JSONArray jsonFileReaderfordocpat(String filePath)  {
			File file=new File(filePath);
			JSONArray jSonArray=null;
			try {
				FileReader fileReader=new FileReader(file);
				JSONParser jSonParser=new JSONParser();
				jSonArray=new JSONArray();
				jSonArray=(JSONArray) jSonParser.parse(fileReader);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return jSonArray;
		}
		/**
		 * @author GulabThakur
		 * @param filePath
		 * @param jsonArray
		 * @ using writing json file 
		 */
		public static void jsonFileWriter(String filePath, JSONArray jsonArray) {
			FileWriter fileWriter=null;
			try {
				fileWriter=new FileWriter(filePath);
				fileWriter.write(JSONValue.toJSONString(jsonArray));
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					fileWriter.flush();
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		/**
		 * @param filename
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static JSONObject readFromFile1(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = new JSONParser().parse(new FileReader("Doctorfile.json"));
			JSONObject jo = (JSONObject) obj;
			return jo;

		}
		
		/**
		 * @param filename
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static JSONObject readFromFilePatient(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = new JSONParser().parse(new FileReader("Patient.json"));
			JSONObject jo = (JSONObject) obj;
			return jo;

		}
		/**
		 * @param filename
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static JSONObject readFromFileApointment(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = new JSONParser().parse(new FileReader("Apointment.json"));
			JSONObject jo = (JSONObject) obj;
			return jo;

		}
		
    
		
		
		
		
		/**
		 * @param filename
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		@SuppressWarnings("unchecked")
		public static void addDoctor(String filename) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			JSONObject jsonObjectDoctor = readFromFileDoctor("Doctorfile.json");
			JSONArray jsonArrayforDoctor = (JSONArray) jsonObjectDoctor.get("doctor");
			JSONObject jsonObjectStoreDoctor = new JSONObject();
			System.out.println("Enter your doctor name");
			String name = utility.inputString();
			System.out.println("Enter your doctor id");
			long id = utility.inputLong();
	        utility.inputString();
	        System.out.println("Enter the apointment");
	        long apointment = utility.inputLong();
	        utility.inputString();
			System.out.println("Enter the availabilty");
			String availabilty = utility.inputString();
			System.out.println("enter the speciliazation");
			String speciliazation = utility.inputString();
			jsonObjectStoreDoctor.put("nameofdoctor",name);
			jsonObjectStoreDoctor.put("id", id);
			jsonObjectStoreDoctor.put("apointment", apointment);
			jsonObjectStoreDoctor.put("availabilty",availabilty);
			jsonObjectStoreDoctor.put("speciliaz", speciliazation);
			jsonArrayforDoctor.add(jsonObjectStoreDoctor);
			jsonObjectDoctor.put("doctor", jsonArrayforDoctor);
			PrintWriter pw = new PrintWriter("Doctorfile.json");
			pw.write(jsonObjectDoctor.toJSONString());
			pw.flush();
			pw.close();

		}
		/**
		 * @param filename
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static JSONObject readFromFile11(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = new JSONParser().parse(new FileReader("Patient.json"));
			JSONObject jo = (JSONObject) obj;
			return jo;
	       }
		
		/**
		 * @param filepath
		 * @throws IOException
		 * @throws ParseException
		 */
		@SuppressWarnings("unchecked")
		public static void addPatient(String filepath) throws IOException, ParseException {
			Utility utility = new Utility();
			JSONObject jsonObjectPatient = readFromFilePatient("Patient.json");
			JSONArray jsonArrayforPatient = (JSONArray) jsonObjectPatient.get("patient");
			JSONObject jsonObjectStorePatient = new JSONObject();
			System.out.println("Enter your patient name");
			String name = utility.inputString();
			System.out.println("Enter your patient id");
			long id = utility.inputLong();
	        utility.inputString();
			System.out.println("Enter the mobile number");
			String mobilenumber = utility.inputString();
			System.out.println("enter the age");
			long age = utility.inputInteger();
			jsonObjectStorePatient.put("nameofpatient",name);
			jsonObjectStorePatient.put("id", id);
			jsonObjectStorePatient.put("mobilenumber",mobilenumber);
			jsonObjectStorePatient.put("age", age);
			jsonArrayforPatient.add(jsonObjectStorePatient);
			jsonObjectPatient.put("patient", jsonArrayforPatient);
			PrintWriter pw = new PrintWriter("Patient.json");
			pw.write(jsonObjectPatient.toJSONString());
			pw.flush();
			pw.close();
			
		}
		
		/**
		 * @param filename
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static void searchdoctor(String filename) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			JSONObject jsonObjectDoctor = readFromFileDoctor("Doctorfile.json");
			JSONArray jsonArray = (JSONArray) jsonObjectDoctor.get("doctor");
			System.out.println("Enter your doctor name");
			String name = utility.inputString();
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonSearchObject = new JSONObject();
			boolean check =true;
			while(iterator.hasNext())
			{
				jsonSearchObject =(JSONObject)iterator.next();
				if(name.equalsIgnoreCase((String) jsonSearchObject.get("nameofdoctor")))
				{
					System.out.print(" Doctor name :  "+jsonSearchObject.get("nameofdoctor")+" ");
					System.out.print("Id  :  "+jsonSearchObject.get("id")+" ");
					System.out.print("apointment:"+jsonSearchObject.get("apointment")+" ");
					System.out.print("availibility :"+jsonSearchObject.get("availabilty")+" ");
					System.out.print("Specialization :"+jsonSearchObject.get("speciliaz")+" ");
					check =false;
					break;
					
				}
			}
			if(check)
			{
				System.out.println("Doctor not found");
			}
		}

		/**
		 * @param filename
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static void searchPatient(String filename) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			JSONObject jsonObjectPatient = readFromFilePatient("Patient.json");
			JSONArray jsonArray = (JSONArray) jsonObjectPatient.get("patient");
			System.out.println("Enter your patient name");
			String name = utility.inputString();
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject newJsonObjectSearch = new JSONObject();
			boolean check =true;
			while(iterator.hasNext())
			{
				newJsonObjectSearch =(JSONObject)iterator.next();
				if(name.equalsIgnoreCase((String) newJsonObjectSearch.get("nameofpatient")))
				{
					System.out.print(" patient name :"+newJsonObjectSearch.get("nameofpatient"));
					System.out.print("Id  :"+newJsonObjectSearch.get("id"));
					System.out.println("mobilenumber :"+newJsonObjectSearch.get("mobilenumber"));
					System.out.println("age :"+newJsonObjectSearch.get("age"));
					check =false;
					break;
					
				}
			}
			if(check)
			{
				System.out.println("Patient not found");
			}
		}
		
		/**
		 * @param fileForPatients
		 * @param fileAddress
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		@SuppressWarnings({ "unused", "unchecked" })
		public static void takeAppointment(String fileForPatients, String fileAddress) throws FileNotFoundException, IOException, ParseException {
			Utility utility = new Utility();
		
			JSONObject jsonObject = readFromFile1("Patient.json");
			JSONArray jsonArray = (JSONArray) jsonObject.get("patient");
			JSONObject jsonObject2 = new JSONObject();
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject3 = readFromFile("Doctorfile.json");
			JSONArray jsonArray1 = (JSONArray) jsonObject.get("doctor");
			JSONObject jsonObject4 = new JSONObject();
			Iterator<?> iterator1 = jsonArray1.iterator();
			System.out.println("Please Enter the Name of Pesient ");
			String name = utility.inputString();
			System.out.println("Please Enter the name of Doctore ");
			String doctorname = utility.inputString();
			boolean check=false;
			while(iterator.hasNext())
			{
				jsonObject2=(JSONObject) iterator.next();
				if(name.equalsIgnoreCase((String) jsonObject2.get("name")))
				{
					while(iterator1.hasNext())
					{
						jsonObject4=(JSONObject) iterator1.next();
						
						JSONArray jsonArray3 =(JSONArray) jsonObject.get("patient");
						if(doctorname.equalsIgnoreCase((String) jsonObject.get("nameofdoctor")))
						{
							if(jsonArray3.size()<5)
							{
							jsonArray3.add(jsonObject2);
							System.out.println("Appointment done.");
							check=true;
	                        break;
							}
							else
							{
								System.out.println("Apointment is Full");
							}
						}
					}
					if(check)
					{
						System.out.println("DOctor is available");
						break;
					}
					else if(!check)
					{
						System.out.println("Invailid doctor name.");
	                }
				}
}
}
		
		/**
		 * @param filename
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static JSONObject readFromFilestockaccount(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = new JSONParser().parse(new FileReader("Stockaccount.json"));
			JSONObject jo = (JSONObject) obj;
			return jo;

		}

		/**
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		
		public static Queue<JSONObject> shareTransaction()
				throws FileNotFoundException, IOException, ParseException {
			Queue<JSONObject> queue = new java.util.LinkedList();
			JSONObject jsonObject = Utility.readFromFilestockaccount("Stockaccount.json");
			JSONArray stock = (JSONArray) jsonObject.get("stock");
			for (int i = 0; i < stock.size(); i++) {
				JSONObject transaction = (JSONObject) stock.get(i);
				queue.add(transaction);
			}
			return queue;
		}
		
		/**
		 * @return
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static Stack<JSONObject> shareTransactionusingStack()
				throws FileNotFoundException, IOException, ParseException {
			Stack<JSONObject> stack = new Stack<JSONObject> ();
			JSONObject jsonObject = Utility.readFromFilestockaccount("Stockaccount.json");
			JSONArray stock = (JSONArray) jsonObject.get("stock");
			for (int i = 0; i < stock.size(); i++) {
				JSONObject transaction = (JSONObject) stock.get(i);
				stack.add(transaction);
			}
			return  stack;
		}
		
		/**
		 * @param filename
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static void searchdoctorbyId(String filename) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			JSONObject jsonObject = readFromFileDoctor("Doctorfile.json");
			JSONArray jsonArray = (JSONArray) jsonObject.get("doctor");
			System.out.println("Enter your doctor id");
			long id = utility.inputLong();
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject3 = new JSONObject();
			boolean check =true;
			while(iterator.hasNext())
			{
				jsonObject3 =(JSONObject)iterator.next();
				if(id==(Long)jsonObject3.get("id"))
				{
					System.out.print(" Doctor name :"+jsonObject3.get("nameofdoctor"));
					System.out.print("Id  :"+jsonObject3.get("id"));
					System.out.println("apointment:"+jsonObject3.get("apointment"));
					System.out.print("availibility :"+jsonObject3.get("availabilty"));
					System.out.println("Specialization :"+jsonObject3.get("speciliaz"));
					check =false;
					break;
					
				}
			}
			if(check)
			{
				System.out.println("Doctor not found");
			}
		}
		
		/**
		 * @param filename
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		public static void searchPatientbyId(String filename) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			JSONObject jsonObject = readFromFilePatient("Patient.json");
			JSONArray jsonArray = (JSONArray) jsonObject.get("patient");
			System.out.println("Enter your patient id");
			long id = utility.inputLong();
			Iterator<?> iterator = jsonArray.iterator();
			JSONObject jsonObject3 = new JSONObject();
			boolean check =true;
			while(iterator.hasNext())
			{
				jsonObject3 =(JSONObject)iterator.next();
				if(id==(Long)jsonObject3.get("id"))
				{
					System.out.print(" patient name :"+jsonObject3.get("nameofpatient"));
					System.out.print("Id  :"+jsonObject3.get("id"));
					System.out.println("mobilenumber :"+jsonObject3.get("mobilenumber"));
					System.out.println("age :"+jsonObject3.get("age"));
					check =false;
					break;
					
				}
			}
			if(check)
			{
				System.out.println("Patient not found");
			}
		}
		
	
		/**
		 * @param patients
		 * @throws FileNotFoundException
		 * @throws IOException
		 * @throws ParseException
		 */
		@SuppressWarnings("unchecked")
		public static void searchAndbookdoctor(JSONObject patients) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			System.out.println("Enter the doctor name");
			String doctorname = utility.inputString();
			JSONObject doctor = null;
			
		
			JSONObject jsonObjectDOctor = readFromFileDoctor("Doctorfile.json");
			
			JSONArray jsonArraydoctor = (JSONArray) jsonObjectDOctor.get("doctor");
			for(int i=0;i<jsonArraydoctor.size();i++)
			{
				 doctor =(JSONObject)jsonArraydoctor.get(i);
				String name = (String)doctor.get("nameofdoctor");
				if(name.equals(doctorname))
				{
					JSONObject jsonObject = readFromFileApointment("Apointment.json");
					JSONArray jsonArrayforapointment= (JSONArray) jsonObject.get("apointment");				
					JSONObject jsonObjectapointment = new JSONObject();
					String time = Utility.getCurrentTime();
					String date =Utility.getCurrentDate();
					Long id = (Long)patients.get("id");
					jsonObjectapointment.put("patientid",id);
					jsonObjectapointment.put("doctorname",name);
					jsonObjectapointment.put("Time", time);
					jsonObjectapointment.put("date", date);
					System.out.println(jsonObjectapointment);
					jsonArrayforapointment.add(jsonObjectapointment);
					jsonObject.put("apointment",jsonArrayforapointment);
					PrintWriter pw = new PrintWriter("Apointment.json");
					pw.write(jsonObject.toString());
					pw.flush();
					pw.close();
					
				}
				
			}
		}
			
		/*public void numberInslotController() throws IOException
		
		{
			PrintWriter printWriter = new PrintWriter("Hashing.text");
			LinkedList1<Integer> linkedlist = new LinkedList1<Integer>();
			HashMap<Integer,LinkedList1> hashmap = new HashMap<>();
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Hashing.text"));
			String line = bufferedReader.readLine();
			while(line!=null)
			{
				String[] array = line.split(" ");
				for(String words :array)
				{
					linkedlist.add(Integer.parseInt(words));
				}
				line = bufferedReader.readLine();
				
			}
			for(int i=0;i<linkedlist.length();i++)
			{
				int number = linkedlist.dataAtPosition(i);
				int slot = number%11;
				if(hashmap.containsKey(slot))
				{
					hashmap.get(slot).add(number);
				}
				else
				{
					hashmap.put(slot, new LinkedList1<>());
					hashmap.get(slot).add(number);
				}
			}
			System.out.println("Enter the digits to be searched");
			Utility utility = new Utility();
			int search = utility.inputInteger();
			int slot = search%11;
			if(hashmap.containsKey(slot))
				
			{
				if(hashmap.get(slot).search(search))
				{
					hashmap.get(slot).remove(search);
				}
				else
				{
					hashmap.get(slot).add(search);
					
				}
			}
			else
			{
				hashmap.put(slot,new LinkedList1());
				hashmap.get(slot).add(search);
				
			}
			for(int i=0;i<11;i++)
			{
				if(hashmap.containsKey(i))
				{
					printWriter.println("\n["+i+"] ");
					LinkedList1 listmap = hashmap.get(i);
					for(int j=0;j<listmap.length();j++)
					{
						printWriter.print(listmap.dataAtPosition(j)+" ");
					}
					printWriter.println("\n");
				}
			}
			printWriter.flush();
			printWriter.close();
			bufferedReader.close();
		}
}		
		*/


}




