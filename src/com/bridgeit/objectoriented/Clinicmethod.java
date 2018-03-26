package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class Clinicmethod {
	Utility utility = new Utility();

	public static JSONObject readFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Doctorfile.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}

	public void addDoctor(String filepath) throws IOException, ParseException {
		JSONObject jsonObject = readFromFile("Doctorfile.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("doctor");
		JSONObject jsonObject2 = new JSONObject();
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
		jsonObject2.put("nameofdoctor",name);
		jsonObject2.put("id", id);
		jsonObject2.put("apointment", apointment);
		jsonObject2.put("availabilty",availabilty);
		jsonObject2.put("speciliaz", speciliazation);
		jsonArray.add(jsonObject2);
		jsonObject.put("doctor", jsonArray);
		PrintWriter pw = new PrintWriter("Doctorfile.json");
		pw.write(jsonObject.toJSONString());
		pw.flush();
		pw.close();
		
	}
	
	public static JSONObject readFromFile1(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Patient.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;
       }
	
	public void addPatient(String filepath) throws IOException, ParseException {
		JSONObject jsonObject = readFromFile1("Patient.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("patient");
		JSONObject jsonObject2 = new JSONObject();
		System.out.println("Enter your patient name");
		String name = utility.inputString();
		System.out.println("Enter your patient id");
		long id = utility.inputLong();
        utility.inputString();
		System.out.println("Enter the mobile number");
		String mobilenumber = utility.inputString();
		System.out.println("enter the age");
		long age = utility.inputInteger();
		jsonObject2.put("nameofpatient",name);
		jsonObject2.put("id", id);
		jsonObject2.put("mobilenumber",mobilenumber);
		jsonObject2.put("age", age);
		jsonArray.add(jsonObject2);
		jsonObject.put("patient", jsonArray);
		PrintWriter pw = new PrintWriter("Patient.json");
		pw.write(jsonObject.toJSONString());
		pw.flush();
		pw.close();
		
	}
	
	public void searchdoctor(String filename) throws FileNotFoundException, IOException, ParseException
	{
		JSONObject jsonObject = readFromFile("Doctorfile.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("doctor");
		JSONObject jsonObject2 = new JSONObject();
		System.out.println("Enter your doctor name");
		String name = utility.inputString();
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject3 = new JSONObject();
		boolean check =true;
		while(iterator.hasNext())
		{
			jsonObject3 =(JSONObject)iterator.next();
			if(name.equalsIgnoreCase((String) jsonObject3.get("nameofdoctor")))
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

	public void searchPatient(String filename) throws FileNotFoundException, IOException, ParseException
	{
		JSONObject jsonObject = readFromFile1("Patient.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("patient");
		JSONObject jsonObject2 = new JSONObject();
		System.out.println("Enter your patient name");
		String name = utility.inputString();
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject3 = new JSONObject();
		boolean check =true;
		while(iterator.hasNext())
		{
			jsonObject3 =(JSONObject)iterator.next();
			if(name.equalsIgnoreCase((String) jsonObject3.get("nameofpatient")))
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
	
	public void takeAppointment(String fileForPatients, String fileAddress) throws FileNotFoundException, IOException, ParseException {
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
	

	
	
	
	
	
	
	
	
	
	
	
}
