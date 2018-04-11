package Clinicmanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface Add 
{
void addDoctor() throws JsonGenerationException, JsonMappingException, IOException;
void addPatient();
void takeappointment();

}
