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

	Utility utility = new Utility();
	Scanner scanner = new Scanner(System.in);
	Search search = new SearchImpl();
	Display display = new DisplayImpl();
	private ObjectMapper mapper = new ObjectMapper();
	private List<Doctor> listofdoctor = new LinkedList<Doctor>();
	private List<Patient> listofpatient = new LinkedList<Patient>();
	private List<Apointment> listofapointment = new LinkedList<Apointment>();
	// String filepathforapointment =
	// "/home/bridgeit/Documents/Apointmentfiles/apointment.json";
	Doctor doctor;
	Patient patient;

	@Override
	public void addDoctor() throws JsonGenerationException, JsonMappingException, IOException {

		newFileForDoctor();

		System.out.println("Enter the filename in which from want to get data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Doctorfiles/" + filename + ".json";

		listofdoctor = utility.fetchJsonFromFile(filepath, Doctor[].class);

		Doctor doctor = new Doctor();

		System.out.println("Enter the doctor name");
		doctor.setDoctorname(scanner.next());

		System.out.println("Enter the doctorid");
		doctor.setDoctorid(scanner.nextLong());

		System.out.println("Enter the specialization");
		doctor.setSpecialization(scanner.next());

		System.out.println("Enter the availability");
		doctor.setAvailibilty(scanner.next());

		System.out.println("Enter the apointment");
		doctor.setApointment(scanner.nextLong());

		listofdoctor.add(doctor);

		mapper.writeValue(new File("/home/bridgeit/Documents/Doctorfiles/" + filename + ".json"), listofdoctor);

		System.out.println("Doctor add successfully");

	}

	@Override
	public void addPatient() throws IOException {
		newFileForPatient();

		System.out.println("Enter the filename in which from want to get data");
		String filename = scanner.next();
		String filepath = "/home/bridgeit/Documents/Patientfiles/" + filename + ".json";

		listofpatient = utility.fetchJsonFromFile(filepath, Patient[].class);

		Patient patient = new Patient();

		System.out.println("Enter the patientid");
		patient.setPatientid(scanner.nextLong());

		System.out.println("Enter the patientname");
		patient.setPatientname(scanner.next());

		System.out.println("Enter the mobilenumber");
		patient.setMobilenumber(scanner.nextLong());

		System.out.println("Enter the age");
		patient.setAge(scanner.nextInt());

		listofpatient.add(patient);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("/home/bridgeit/Documents/Patientfiles/" + filename + ".json"), listofpatient);
	}

	@Override
	public void takeappointment() throws JsonParseException, JsonMappingException, IOException {
		Doctor appdoctor;
		Patient apppatient;
		display.printDoctorReport();
		display.printPatientReport();
		System.out.println("Enter the doctor name");
		String doctorname = scanner.next();
		System.out.println("Enter the Patient name");
		String patientname = scanner.next();
		boolean statusofdoctor = searchbydoctorname(doctorname);
		boolean statusofpatient = searchbypatientname(patientname);
		if (statusofdoctor && statusofpatient) {
			
			appdoctor = search.searchDoctorByName();
			apppatient = search.searchPatientByName();
			appdoctor.getDoctorname();
			appdoctor.getApointment();
			apppatient.getMobilenumber();
			apppatient.getPatientname();
			if (appdoctor.getApointment() > 5) {
				System.out.println("Apointment cannot ne done");
			} else {
				newFileForAppointment();
				System.out.println("Enter the filename");
				String filenameforapointment = scanner.next();
				String filepathforapointment = "/home/bridgeit/Documents/Apointmentfiles/" + filenameforapointment
						+ ".json";
				listofapointment = utility.fetchJsonFromFile(filepathforapointment, Apointment[].class);
				Apointment appointment = new Apointment(appdoctor.getDoctorname(), appdoctor.getApointment(),
						apppatient.getPatientname(), apppatient.getMobilenumber());
				listofapointment.add(appointment);
				System.out.println(listofapointment);
				System.out.println("Enter the file path");
				mapper.writeValue(new File("/home/bridgeit/Documents/Apointmentfiles/"+scanner.next()+".json"), listofapointment);

			}

		} else {
			System.out.println("The given doctorname or patient name is not present in the system ");
		}

	}

	public boolean searchbydoctorname(String doctorname) throws JsonParseException, JsonMappingException, IOException {
		boolean doctorfound = false;
		System.out.println("Enter the files name from you fetch the data");
		String filenamefordoctor = scanner.next();
		String filepathdoctor = "/home/bridgeit/Documents/Doctorfiles/" + filenamefordoctor + ".json";
		listofdoctor = utility.fetchJsonFromFile(filepathdoctor, Doctor[].class);
		for (int i = 0; i < listofdoctor.size(); i++) {
			doctor = listofdoctor.get(i);
			if (doctor.getDoctorname().equals(doctorname)) {
				doctorfound = true;
			}
		}
		return doctorfound;

	}

	public boolean searchbypatientname(String patientname)
			throws JsonParseException, JsonMappingException, IOException {
		boolean patientfound = false;
		System.out.println("Enter the files name from you fetch the data");
		String filenameforpatient = scanner.next();
		String filepathpatient = "/home/bridgeit/Documents/Patientfiles/" + filenameforpatient + ".json";
		listofpatient = utility.fetchJsonFromFile(filepathpatient, Patient[].class);
		for (int i = 0; i < listofpatient.size(); i++) {
			patient = listofpatient.get(i);
			if (patient.getPatientname().equals(patientname)) {
				patientfound = true;
			}
		}
		return patientfound;

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

			File[] fListoffiles = directoryforfiles.listFiles();
			for (File file : fListoffiles) {
				System.out.println(file.getName());
			}
			break;
		}

	}

	public void newFileForAppointment() throws IOException {
		System.out.println("Enter 1 for new files");
		System.out.println("Enter 2 for showing existing files");

		System.out.println("Enter your choice");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			List<Apointment> templist = new LinkedList<Apointment>();

			// ObjectMapper objectmapper = new ObjectMapper();

			System.out.println("Enter the filename from the user");
			String filenameforapointment = scanner.next();

			File fileforapointment = new File(
					"/home/bridgeit/Documents/Apointmentfiles/" + filenameforapointment + ".json");
			fileforapointment.createNewFile();

			mapper.writeValue(fileforapointment, templist);

			break;

		case 2:
			System.out.println("The list of files is given below ");

			File directoryforfiles = new File("/home/bridgeit/Documents/Apointmentfiles");

			File[] fListoffiles = directoryforfiles.listFiles();
			for (File file : fListoffiles) {
				System.out.println(file.getName());
			}
			break;
		}

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
			File[] fListoffiles = directoryforfiles.listFiles();
			for (File file : fListoffiles) {
				System.out.println(file.getName());

			}
			break;
		}

	}
}
