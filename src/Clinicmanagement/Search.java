package Clinicmanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface Search 
{
	Doctor searchDoctorByName() throws JsonParseException, JsonMappingException, IOException;
	boolean  searchDoctorById() throws JsonParseException, JsonMappingException, IOException;
	boolean  searchDoctorBySpecialization() throws JsonParseException, JsonMappingException, IOException;
	Patient  searchPatientByName() throws JsonParseException, JsonMappingException, IOException;
	boolean  searchPatientById() throws JsonParseException, JsonMappingException, IOException;
	

}
