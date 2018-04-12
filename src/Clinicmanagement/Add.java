package Clinicmanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface Add 
{
void addDoctor() throws JsonGenerationException, JsonMappingException, IOException;
void addPatient() throws IOException;
void takeappointment() throws JsonParseException, JsonMappingException, IOException;

}
