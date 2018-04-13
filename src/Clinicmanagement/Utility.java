package Clinicmanagement;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Utility 
{
	List<Doctor> listofdoctor  = new LinkedList<Doctor>();
	List<Patient> listofpatient = new LinkedList<Patient>();
	List<Apointment> listofapointment = new LinkedList<Apointment>();
	public <T> List<T> fetchJsonFromFile(String filepath, Class<T[]> clazz)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectmapper = new ObjectMapper();

		File file = new File(filepath);
		List<T> list = new LinkedList<T>(Arrays.asList(objectmapper.readValue(file, clazz)));
         
		return list;

	}
}
