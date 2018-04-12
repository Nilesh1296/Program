package Clinicmanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface Display 
{
  void printDoctorReport() throws JsonParseException, JsonMappingException, IOException;
  void printPatientReport() throws JsonParseException, JsonMappingException, IOException;
  void printAppointmentDetails();
  
}
