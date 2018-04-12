package Clinicmanagement;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Mainmethod {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Scanner scanner = new Scanner(System.in);
		Search search = new SearchImpl();
		Add addimpl = new AddImpl();
		Display displayimpl = new DisplayImpl();
		int choice = 0;
		do {
			System.out.println("Enter 1 to add the Doctor to file ");
			System.out.println("Enter 2 to add the patient to the file ");
			System.out.println("Enter 3 to search Doctor by name ");
			System.out.println("Enter 4 to search Doctor by id");
			System.out.println("Enter 5 to search Doctor by specialization");
			System.out.println("Enter 6 to search Patient By name");
			System.out.println("Enter 7 to search Patient by id ");
			System.out.println("Enter 8 for doctor report");
			System.out.println("Enter 9 for patient report");
			System.out.println("Enter 10 for apointment");
			System.out.println("Enter Enter any numer");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addimpl.addDoctor();
				break;
			case 2:
				addimpl.addPatient();
				break;

			case 3:
				search.searchDoctorByName();
				break;
			case 4:
				search.searchDoctorById();
				break;
			case 5:
				search.searchDoctorBySpecialization();
				break;
			case 6:
				search.searchPatientByName();
				break;
			case 7:
				search.searchPatientById();
				break;
			case 8:
                 displayimpl.printDoctorReport();
				break;
			case 9:
                 displayimpl.printPatientReport();
				break;
			case 10:
                addimpl.takeappointment();
				break;

			}
		} while (choice > 0);
		scanner.close();
	}
}
