package Clinicmanagement;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Mainmethod 
{
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException 
{
	AddImpl addimpl = new AddImpl();
	addimpl.addDoctor();
}
}
