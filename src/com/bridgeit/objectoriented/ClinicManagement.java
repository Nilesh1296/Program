package com.bridgeit.objectoriented;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
		System.out.println("Enter 3 to search doctor");
		System.out.println("Enter 4 to search patient");
		System.out.println("ENTER 5 to search doctor by id");
		System.out.println(" Enter 6 to search patient by id");
		System.out.println("Enter 7 to book doctor");
		System.out.println("Enter 8 to exit");
		int option = utility.inputInteger();
		utility.inputString();
		switch(option)
		{
		case 1:
			Utility.addDoctor("Doctorfile.json");
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
			Utility.searchdoctorbyId("Doctorfile.json");
		break;
		case 6:
			Utility.searchPatientbyId("Patient.json");
		break;
		case 7:
			JSONObject patients = null;
			System.out.println("Enter the patient id");
			Long patientid =(Long)utility.inputLong();
			JSONObject jsonObjectpatient =Utility.readFromFilePatient("Patient.json");
			JSONArray jsonArraypatient = (JSONArray)jsonObjectpatient.get("patient");
			boolean patientpresent = false;
			for(int i=0;i<jsonArraypatient.size();i++)
			{
				patients = (JSONObject)jsonArraypatient.get(i);
				Long id =(Long)patients.get("id");
				if(id.equals(patientid))
				{
					patientpresent =true;
					break;
				}
			}
			if(patientpresent)
			{
				Utility.searchAndbookdoctor(patients);
			}
			else
			{
				System.out.println("you are not registered");
			}
		break;
		case 8 :
			System.exit(0);
			
		}
	}while(check);
  }
}
