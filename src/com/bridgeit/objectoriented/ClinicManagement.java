package com.bridgeit.objectoriented;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class ClinicManagement
{
  public static void main(String[] args) throws IOException, ParseException
  {
	Utility utility = new Utility();
	
		boolean check = true;
	do
	{
		
		System.out.println("Enter 1 to add doctor to the file.");
		System.out.println("Enter 2 to add patient to the file");
		System.out.println("Enter 3 to take appointment");
		System.out.println("Enter 4 to check doctor availibility");
		System.out.println("ENTER 5 to print appointment report");
		System.out.println(" Enter 6 to Add doctor");
		System.out.println("Enter 7 to display patients");
		System.out.println("enter 8 to Display doctor");
		System.out.println("enter 9 to exit");
		System.out.println("Enter any option from user");
		int option = utility.inputInteger();
		utility.inputString();
		switch(option)
		{
		case 1:
			Utility.addDoctor();
		break;	
		case 2 :
			Utility.addPatient("Patient.json");
		break;
		case 3 :
			Utility.searchdoctor("Doctorfile.json");
		break;
		case 4 :
			Utility.searchPatient("Patient.json");
		break;
		case 5:
			
		break;
		case 6:
			
		break;
		case 7:
			
		break;
		case 8:
			
		break;
		case 9:
			
			
		break;
		}
	}while(check);
  }
}
