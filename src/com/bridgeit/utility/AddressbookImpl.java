package com.bridgeit.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class AddressbookImpl 
{
	Utility utility = new Utility();
	
	public void display(String filePath) {
		JSONArray jsonArray = new JSONArray();
		jsonArray = jsonFileReader(filePath);
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			String name = (String) jsonObject.get("Fname");
			String lastName = (String) jsonObject.get("Lname");
			String zip = (String) jsonObject.get("Zip");
			String address = (String) jsonObject.get("Address");
			String state = (String) jsonObject.get("State");
			String number = (String) jsonObject.get("PhoneNumber");
			String city = (String) jsonObject.get("City");
			System.out.println("<<<<<<<<<<<" + name
					+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Candidte Name " + name + " " + lastName);
			System.out.println("Candidate Contact " + number);
			System.out.println("Candidate Address " + address);
			System.out.println("City :" + city);
			System.out.println("Satate :" + state);
			System.out.println("Pin Code :" + zip);
			System.out.println(">>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
		}
	}

	/**
	 * @param filePath
	 * 
	 * @Description it will write the jsonObject into the file.
	 */
	@SuppressWarnings("unchecked")
	public void addObject(String filePath) {

		JSONArray jsonArray = new JSONArray();
		jsonArray = jsonFileReader("Addressbook.json");
		JSONObject jsonObjectaddressbook = new JSONObject();
		System.out.println("\nEnter your first name : ");
		String fname = utility.inputString();
		System.out.println("\nEnter your last name : ");
		String lname = utility.inputString();
		System.out.println("Enter your address : ");
		String address = utility.inputString();
		System.out.println("Enter your city : ");
		String city =   utility.inputString();
		System.out.println("Enter your state : ");
		String state = utility.inputString();
		System.out.println("Enter the zip : ");
		Long zip = utility.inputLong();
		System.out.println("Enter your phone number : ");
	    Long phoneNumber = utility.inputLong();

		// Puting the value into the object.
	    jsonObjectaddressbook.put("Fname", fname);
	    jsonObjectaddressbook.put("Lname", lname);
	    jsonObjectaddressbook.put("Address", address);
	    jsonObjectaddressbook.put("City", city);
	    jsonObjectaddressbook.put("State", state);
	    jsonObjectaddressbook.put("Zip", zip);
	    jsonObjectaddressbook.put("PhoneNumber", phoneNumber);
		jsonArray.add(jsonObjectaddressbook);

		// writing the jsonArray into the file.
	     jsonFileWriter(filePath, jsonArray);
		System.out.println("Object is Added");
	}

	/**
	 * @param filePath
	 */
		public void edit(String filePath) {

		JSONArray jsonArrayaddressbook = new JSONArray();
		jsonArrayaddressbook = jsonFileReader("Addressbook.json");
		Iterator<?> iterator = jsonArrayaddressbook.iterator();
		JSONObject jsonObjectaddressbook = new JSONObject();

		System.out.println("Enter the name of person, whos data you want to update : ");
		String person = utility.inputString();
		utility.inputString();
		boolean found = true;
		while (iterator.hasNext()) {
			jsonObjectaddressbook = (JSONObject) iterator.next();

			if (person.equals(jsonObjectaddressbook.get("Fname"))) {
				
				Set<String> keys = jsonObjectaddressbook.keySet();
				String keyArray[] = keys.toArray(new String[keys.size()]);
				for (int i = 0; i < keyArray.length; i++) {
					System.out.println("Enter " + (i + 1) + " to "
							+ keyArray[i]);
				}
				System.out.println("Enter what you want to do edit : ");
				Long key = utility.inputLong();
				System.out.println("Enter new value : ");
				utility.inputString();
				String value = utility.inputString();
				jsonObjectaddressbook.put(keyArray[(int) (key - 1)], value);
				jsonFileWriter(filePath, jsonArrayaddressbook);
				System.out.println("Object is updated.");
				found = false;
			}
		}
		if (found) {
			System.out.println("Persons name is not found.");
		}

	}
	
	
	
	public static void displayAddressbook(String filePath) throws IOException, ParseException
    {
	   
		
		
    }
    

	/**
	 * @param filePath
	 *            @ this method using for delete the address
	 */
	public void delete(String filePath) {
		JSONArray jsonArrayaddressbook = new JSONArray();
		jsonArrayaddressbook = jsonFileReader(filePath);
		Iterator<?> iterator = jsonArrayaddressbook.iterator();
		JSONObject jsonObject = new JSONObject();
		System.out.println("Enter the name of person to delete : ");
		String person2 = utility.inputString();
		boolean found2 = true;
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			if (person2.equals(jsonObject.get("Fname"))) {
				jsonArrayaddressbook.remove(jsonObject);
				found2 = false;
				System.out.println("Removed");
				break;
			}
		}
		if (found2) {
			System.out.println("Person not found.");
		}
	jsonFileWriter(filePath, jsonArrayaddressbook);
	}

	/**
	 * @param filePath
	 *            @ this method using for Sorting address by name....
	 */
	public void sortByName(String filePath) {
		JSONArray jsonArrayaddressbook = new JSONArray();
		jsonArrayaddressbook = jsonFileReader(filePath);
		Iterator<?> iterator = jsonArrayaddressbook.iterator();
		JSONObject jsonObject = new JSONObject();

		String[] name = new String[jsonArrayaddressbook.size()];
		int index = 0;
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			name[index] = (String) jsonObject.get("Fname");
			index++;
		}
		Arrays.sort(name);

		for (int i = 0; i < name.length; i++) {
			Iterator<?> iterator2 = jsonArrayaddressbook.iterator();
			JSONObject jsobject = new JSONObject();
			while (iterator2.hasNext()) {
				jsobject = (JSONObject) iterator2.next();
				if (name[i].equals(jsobject.get("Fname"))) {
					System.out.println(jsobject);
					System.out
							.println("-------------------------------------------------------------------------------------------------------------------------");
				}

			}
		}
	}

	/**
	 * @param filePath
	 * 
	 * @Description it will give you sorted list of objects by zip
	 */
	public void sortByZip(String filePath) {
		JSONArray jsonArrayaddressbook = new JSONArray();
		jsonArrayaddressbook =jsonFileReader(filePath);
		Iterator<?> iterator = jsonArrayaddressbook.iterator();
		JSONObject jsonObject = new JSONObject();

		Long[] name = new Long[jsonArrayaddressbook.size()];
		int index = 0;
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			name[index] = (Long) jsonObject.get("Zip");
			index++;
		}
		Arrays.sort(name);

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		for (int i = 0; i < name.length; i++) {
			Iterator<?> iterator2 = jsonArrayaddressbook.iterator();
			JSONObject jsobject = new JSONObject();
			while (iterator2.hasNext()) {
				jsobject = (JSONObject) iterator2.next();
				if (name[i].equals(jsobject.get("Zip"))) {
					System.out.println(jsobject);
					System.out
							.println("-------------------------------------------------------------------------------------------------------------------------");
					break;
				}
			}
		}
	}
	
	public  static  JSONArray jsonFileReader(String filePath)  {
		File file=new File("Addressbook.json");
		JSONArray jSonArray=null;
		try {
			FileReader fileReader=new FileReader(file);
			JSONParser jSonParser=new JSONParser();
			jSonArray=new JSONArray();
			jSonArray=(JSONArray) jSonParser.parse(fileReader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jSonArray;
	}

	
	public static void jsonFileWriter(String filePath, JSONArray jsonArray) {
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter(filePath);
			fileWriter.write(JSONValue.toJSONString(jsonArray));
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	
		

}


