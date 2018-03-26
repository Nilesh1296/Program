package com.bridgeit.functional;

import com.bridgeit.utility.Utility;

public class Tictak {
	int b[] = new int[9];
	String arr[][] = new String[3][3];
	int count = 0;
	static String s;

	public void disp() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == null) {
					arr[i][j] = " ";
				} else {
					System.out.print(arr[i][j] + " " + "|");
				}
			}
			System.out.println();
		}
	}

	public void validate(String s) {
		if (!(s.equals("0") || s.equals("x"))) {

			System.out.println("Enter valid char");
			System.exit(0);
		}
	}

	public void result() {
		while (true) {
			if (arr[0][0].equals(s) && arr[0][1].equals(s) && arr[0][2].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[1][0].equals(s) && arr[1][1].equals(s) && arr[1][2].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[2][0].equals(s) && arr[2][1].equals(s) && arr[2][2].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[0][0].equals(s) && arr[1][0].equals(s) && arr[2][0].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[0][1].equals(s) && arr[1][1].equals(s) && arr[2][1].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[0][2].equals(s) && arr[1][2].equals(s) && arr[2][2].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[0][0].equals(s) && arr[1][1].equals(s) && arr[2][2].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}
			if (arr[0][2].equals(s) && arr[1][1].equals(s) && arr[2][0].equals(s)) {
				System.out.println(s + "is won");
				System.exit(0);
			}

			break;
		}
	}

	public static void main(String args[]) {

		Tictak tictak = new Tictak();
		Utility utility = new Utility();
		System.out.println("Enter values 0 or x");
		System.out.println("position are");
		System.out.println("1" + "2" + "3");
		System.out.println("4" + "5" + "6");
		System.out.println("7" + "8" + "9");
		while (true) {
			System.out.println("select your position");
			int choice = utility.inputInteger();
            utility.inputString();
			switch (choice) {
			case 1:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[0][0] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 2:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[0][1] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 3:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[0][2] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 4:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[1][0] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 5:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[1][1] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 6:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[1][2] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 7:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[2][0] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 8:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[2][1] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;
			case 9:
				System.out.println("enter");
				s = utility.inputString();
				tictak.arr[2][2] = s;
				tictak.validate(s);
				tictak.disp();
				tictak.result();
				break;

			}
		}
	}

}