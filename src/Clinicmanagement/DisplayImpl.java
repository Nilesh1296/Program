package Clinicmanagement;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class DisplayImpl implements Display {

	Utility utility = new Utility();
	Scanner scanner = new Scanner(System.in);
	private List<Doctor> listofdoctor = new LinkedList<Doctor>();
	private List<Patient> listofpatient = new LinkedList<Patient>();
	Doctor doctor;
	Patient patient;
	@Override
	public void printDoctorReport() throws JsonParseException, JsonMappingException, IOException
	{
		System.out.println("Enter the filename in which from want to get data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Doctorfiles/" + filename + ".json";
		
		listofdoctor =utility.fetchJsonFromFile(filepath,Doctor[].class);
				
		for (int i = 0; i < listofdoctor.size(); i++) {
			
			System.out.print("Name of Doctor   " + listofdoctor.get(i).getDoctorname());
			
			System.out.print("  Id of Doctor    " + listofdoctor.get(i).getDoctorid());
			
			System.out.print("   Specialization of doctor " + listofdoctor.get(i).getSpecialization());
			
			System.out.print("  Availibility of doctor  " + listofdoctor.get(i).getAvailibilty());
			
			System.out.println("  Apointment of doctor " + listofdoctor.get(i).getApointment());
		}

	}

	@Override
	public void printPatientReport() throws JsonParseException, JsonMappingException, IOException 
	{
		System.out.println("Enter the filename in which from want to get data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Patientfiles/" + filename + ".json";
        listofpatient =utility.fetchJsonFromFile( filepath,Patient[].class);
        for (int i = 0; i < listofpatient.size(); i++) {
			System.out.print("Name of Patient  " + listofpatient.get(i).getPatientname());
			System.out.print("  Id of Patient   " + listofpatient.get(i).getPatientid());
			System.out.println("  Mobilenumber of patient " + listofpatient.get(i).getMobilenumber());
			System.out.println("  Age of patient  " + listofpatient.get(i).getAge());
			
		}
		
	}

	@Override
	public void printAppointmentDetails() {
		
		
	}

}
