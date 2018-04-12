package Clinicmanagement;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class SearchImpl implements Search {
      
	Utility utility = new Utility();
	Scanner scanner = new Scanner(System.in);
	private List<Doctor> listofdoctor = new LinkedList<Doctor>();
	private List<Patient> listofpatient = new LinkedList<Patient>();
	Doctor doctor,tempdoctor;
	Patient patient,temppatient;
	
		@Override
	public Doctor searchDoctorByName() throws JsonParseException, JsonMappingException, IOException
	{
	
		System.out.println("Enter the file name from which you want to fetch data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Doctorfiles/" + filename + ".json";
		
		listofdoctor = utility.fetchJsonFromFile(filepath, Doctor[].class);
		
		System.out.println("Enter the name of the doctor");
		String doctorname = scanner.next();
		
		for(int i=0;i<listofdoctor.size();i++)
		{
			
			doctor =   listofdoctor.get(i);
			
			if(doctor.getDoctorname().equals(doctorname))
			{
			
				 tempdoctor = doctor;
				System.out.print("Doctor name is  "+doctor.getDoctorname());
				
				System.out.print("  Doctor id is  "+doctor.getDoctorid());
				
				System.out.print("  Doctor specialization is  "+doctor.getSpecialization());
				
				System.out.print("  Doctor availibilty is  "+doctor.getAvailibilty());
				
				System.out.println(" Doctor apointment is "+doctor.getApointment());
				
			}
			
		}
		return tempdoctor;
		 
	}

	@Override
	public boolean searchDoctorById() throws JsonParseException, JsonMappingException, IOException
	{
		boolean doctorfoundbyid =false;
		System.out.println("Enter the file name from which you want to fetch data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Doctorfiles/" + filename + ".json";
		
		listofdoctor = utility.fetchJsonFromFile(filepath, Doctor[].class);
		
		System.out.println("Enter the id of the doctor");
		Long doctorid = scanner.nextLong();
		
		for(int i=0;i<listofdoctor.size();i++)
		{
			doctor =   listofdoctor.get(i);
			if(doctor.getDoctorid().equals(doctorid))
			{
				 doctorfoundbyid =true;
				System.out.println("Doctor name is  "+doctor.getDoctorname()); 
				
				System.out.println("  Doctor id is  "+doctor.getDoctorid()); 
				
				System.out.println("  Doctor specialization is"+doctor.getSpecialization());
				
				System.out.println("  Doctor availibilty is"+doctor.getAvailibilty());
				
				System.out.println("  Doctor apointment is "+doctor.getApointment());
			}
		}
		return doctorfoundbyid;
		
	}

	@Override
	public boolean searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException 
	{
		boolean doctorbyspecilaization = false;
		System.out.println("Enter the file name from which you want to fetch data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Doctorfiles/" + filename + ".json";
		listofdoctor = utility.fetchJsonFromFile(filepath, Doctor[].class);
		
		System.out.println("Enter the specilization of the doctor");
		String doctorspecialization = scanner.next();
		
		for(int i=0;i<listofdoctor.size();i++)
		{
			doctor =   listofdoctor.get(i);
			
			if(doctor.getSpecialization().equals(doctorspecialization))
			{
				
                System.out.println("Doctor name is  "+doctor.getDoctorname()); 
				
				System.out.println("  Doctor id is  "+doctor.getDoctorid()); 
				
				System.out.println("  Doctor specialization is"+doctor.getSpecialization());
				
				System.out.println("  Doctor availibilty is"+doctor.getAvailibilty());
				
				System.out.println("  Doctor apointment is "+doctor.getApointment());
			}
		}
		return doctorbyspecilaization;
		
	}

	@Override
	public Patient searchPatientByName() throws JsonParseException, JsonMappingException, IOException
	{
		
		System.out.println("Enter the filename from which you want to fetch data");
		String filename =scanner.next();
		String filepath = "/home/bridgeit/Documents/Patientfiles/" + filename + ".json";
		
		listofpatient = utility.fetchJsonFromFile(filepath, Patient[].class);
		
		System.out.println("Enter the name of the doctor");
		String patientname = scanner.next();
		
		for(int i=0;i<listofpatient.size();i++)
		{
			patient =   listofpatient.get(i);
			
			if(patient.getPatientname().equals(patientname))
			{
				temppatient = patient;
				System.out.println("Patient name is "+patient.getPatientname());
				
				System.out.println("  Patient id is  "+patient.getPatientid());
				
				System.out.println("  Patient specialization is"+patient.getMobilenumber());
				
				System.out.println("  Patient age is"+patient.getAge());
				
			}
		}
		return temppatient;
	}

	@Override
	public boolean searchPatientById() throws JsonParseException, JsonMappingException, IOException 
	{
		boolean patientbyid =false;
		System.out.println("Enter the filename from which you want to fetch data");
		String filename =scanner.next();
		String filepath = "/home/bridgeit/Documents/Patientfiles/" + filename + ".json";
		
		listofpatient = utility.fetchJsonFromFile(filepath, Patient[].class);
		
		System.out.println("Enter the id of the patient");
		Long patientid = scanner.nextLong();
		
		for(int i=0;i<listofpatient.size();i++)
		{
			patient =   listofpatient.get(i);
			if(patient.getPatientid().equals(patientid))
			{
				patientbyid = true;
				System.out.println("Patient name is "+patient.getPatientname());
				
				System.out.println("  Patient id is  "+patient.getPatientid());
				
				System.out.println("  Patient specialization is"+patient.getMobilenumber());
				
				System.out.println("  Patient age is"+patient.getAge());
				
			}
		}
		return patientbyid;
		
	}

}
