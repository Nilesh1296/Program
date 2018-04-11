package Clinicmanagement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class AddImpl implements Add {

	Scanner scanner = new Scanner(System.in);

	List<Doctor> listofdoctor = new LinkedList<Doctor>();
	List<Patient> listofpatient = new LinkedList<Patient>();

	@Override
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {

		newFileForDoctor();
		System.out.println("Enter the filename in which from want to get data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Doctorfiles/" + filename + ".json";
		listofdoctor = fetchjson(filepath);
		System.out.println(listofdoctor);
		Doctor doctor = new Doctor();
		System.out.println("Enter the doctor name");
		String doctorname = scanner.next();
		doctor.setDoctorname(doctorname);
		System.out.println("Enter the doctorid");
		Long doctorid = scanner.nextLong();
		doctor.setDoctorid(doctorid);
		System.out.println("Enter the specialization");
		String specialization = scanner.next();
		doctor.setSpecialization(specialization);
		System.out.println("Enter the availability");
		String availibility = scanner.next();
		doctor.setAvailibilty(availibility);
		System.out.println("Enter the apointment");
		long apointment = scanner.nextLong();
		doctor.setApointment(apointment);
		listofdoctor.add(doctor);
		for (int i = 0; i < listofdoctor.size(); i++) {
			System.out.print("Name of Doctor   " + listofdoctor.get(i).getDoctorname());
			System.out.print("Id of Doctor    " + listofdoctor.get(i).getDoctorid());
			System.out.println("Specialization of doctor " + listofdoctor.get(i).getSpecialization());
			System.out.println("Availibility of doctor  " + listofdoctor.get(i).getAvailibilty());
			System.out.println("Apointment of doctor " + listofdoctor.get(i).getApointment());
		}
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("/home/bridgeit/Documents/Doctorfiles/" + filename + ".json"), listofdoctor);

	}

	@Override
	public void addPatient() throws IOException
	{
		newFileForPatient();
		System.out.println("Enter the filename in which from want to get data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Patientfiles/" + filename + ".json";
        listofpatient =fetchJsonFromPatient(filepath);
        Patient patient = new Patient();
        System.out.println("Enter the patientid");
        long patientid = scanner.nextLong();
        patient.setPatientid(patientid);
        System.out.println("Enter the patientname");
        String patientname = scanner.next();
        patient.setPatientname(patientname);
        System.out.println("Enter the mobilenumber");
        long mobilenumber = scanner.nextLong();
        patient.setMobilenumber(mobilenumber);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        patient.setAge(age);
          
	}

	@Override
	public void takeappointment() {

	}

	public List<Doctor> fetchjson(String filepath) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectmapper = new ObjectMapper();

		File file = new File(filepath);
		listofdoctor = new LinkedList<Doctor>(Arrays.asList(objectmapper.readValue(file, Doctor[].class)));

		return listofdoctor;

	}

	public void newFileForDoctor() throws IOException {
		System.out.println("Enter 1 for new files");
		System.out.println("Enter 2 for showing existing files");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			List<Doctor> templist = new LinkedList<Doctor>();
			ObjectMapper objectmapper = new ObjectMapper();
			System.out.println("Enter the filename from the user");
			String filenamefordoctor = scanner.next();
			File filefordoctor = new File("/home/bridgeit/Documents/Doctorfiles/" + filenamefordoctor + ".json");
			filefordoctor.createNewFile();
			objectmapper.writeValue(filefordoctor, templist);

			break;

		case 2:
			System.out.println("The list of files is given below ");
			File directoryforfiles = new File("/home/bridgeit/Documents/Doctorfiles");
			// get all the files from a directory
			File[] fList1 = directoryforfiles.listFiles();
			for (File file : fList1) {
				System.out.println(file.getName());

			}
			break;
		}

	}

	public List<Patient> fetchJsonFromPatient(String filepath)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectmapper = new ObjectMapper();

		File file = new File(filepath);
		listofpatient = new LinkedList<Patient>(Arrays.asList(objectmapper.readValue(file, Patient[].class)));

		return listofpatient;

	}

	public void newFileForPatient() throws IOException {
		System.out.println("Enter 1 for new files");
		System.out.println("Enter 2 for showing existing files");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			List<Patient> templist = new LinkedList<Patient>();
			ObjectMapper objectmapper = new ObjectMapper();
			System.out.println("Enter the filename from the user");
			String filenameforpatient = scanner.next();
			File fileforpatient = new File("/home/bridgeit/Documents/Patientfiles/" + filenameforpatient + ".json");
			fileforpatient.createNewFile();
			objectmapper.writeValue(fileforpatient, templist);
			break;

		case 2:
			System.out.println("The list of files is given below ");
			File directoryforfiles = new File("/home/bridgeit/Documents/Patientfiles");
			// get all the files from a directory
			File[] fList1 = directoryforfiles.listFiles();
			for (File file : fList1) {
				System.out.println(file.getName());

			}
			break;
		}

	}
}
