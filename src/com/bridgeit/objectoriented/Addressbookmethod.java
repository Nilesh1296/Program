package com.bridgeit.objectoriented;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Sort;
import com.bridgeit.utility.Utility;

public class Addressbookmethod {
	Utility utility = new Utility();

	public static JSONObject readFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Addressbook.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}

	public static void addobject(String filepath) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();

		JSONObject jsonObject = readFromFile("Addressbook.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("address");
		JSONObject jsonObject2 = new JSONObject();
		Iterator<?> iterator = jsonArray.iterator();
		System.out.println("Enter your first name");
		String name = utility.inputString();
		System.out.println("Enter your last name");
		String lname = utility.inputString();

		System.out.println("Enter your address");
		String address = utility.inputString();
		System.out.println("Enter your city");
		String city = utility.inputString();
		System.out.println("Enter your state");
		String state = utility.inputString();
		System.out.println("Enter the zip");
		String zip = utility.inputString();
		System.out.println("Enter the phone number");
		String phonenumber = utility.inputString();
		jsonObject2.put("Fname", name);
		jsonObject2.put("Lname", lname);
		jsonObject2.put("Address", address);
		jsonObject2.put("City", city);
		jsonObject2.put("State", state);
		jsonObject2.put("Zip", zip);
		jsonObject2.put("Phonenumber", phonenumber);
		jsonArray.add(jsonObject2);
		jsonObject.put("address", jsonArray);
		PrintWriter pw = new PrintWriter("Addressbook.json");
		pw.write(jsonObject.toJSONString());
		pw.flush();
		pw.close();
	}

	public static void delete(String filepath) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject = readFromFile("Addressbook.json");
		JSONArray jsonArray = (JSONArray) jsonObject.get("address");
		JSONObject jsonObject3 = new JSONObject();
		Iterator<?> iterator = jsonArray.iterator();
		System.out.println("Enter the first name of the person");
		String person2 = utility.inputString();
		for (int i = 0; i < jsonArray.size(); i++) {

			jsonObject3 = (JSONObject) jsonArray.get(i);
			String name = (String) jsonObject3.get("Fname");
			if (name.equalsIgnoreCase(person2)) {
				jsonArray.remove(i);
				jsonObject.put("address", jsonArray);
				PrintWriter pw = new PrintWriter("Addressbook.json");
				pw.write(jsonObject.toJSONString());
				pw.flush();
				pw.close();
				break;
			}
		}
	}

	public static void display(String filePath) throws IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Addressbook.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("address");
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			String zip = (String) jsonObject.get("Zip");
			String address = (String) jsonObject.get("Address");
			String lname = (String) jsonObject.get("Lname");
			String fname = (String) jsonObject.get("Fname");
			String state = (String) jsonObject.get("State");
			String city = (String) jsonObject.get("City");
			String phonenumber = (String) jsonObject.get("Phonenumber");
			System.out.println("Zip code " + zip);
			System.out.println("address" + address);
			System.out.println("Last name " + lname);
			System.out.println("first name" + fname);
			System.out.println("state " + state);
			System.out.println("city " + city);
			System.out.println("phonenumber " + phonenumber);

		}
	}

	public static void sortbyname(String filename) throws FileNotFoundException, IOException, ParseException {

		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Addressbook.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("address");
		System.out.println("Enter the column to sort the name");
		String columnname = utility.inputString();
             Collections.sort(jsonArray, new Sort(columnname));
        Iterator<?> iterator = jsonArray.iterator();
		while(iterator.hasNext())
		{
			JSONObject jsonobject2 = (JSONObject)iterator.next();
			System.out.print("  Firstname"+jsonobject2.get("Fname")+"Lastname" +jsonobject2.get("Lname")+ "City"+jsonobject2.get("City"));
			System.out.print("State"+jsonobject2.get("State")+"Zip"+jsonobject2.get("Zip")+"Phonenumber"+jsonobject2.get("Phonenumber"));
			System.out.print("Address"+jsonobject2.get("Address"));
			
		}
		PrintWriter pw = new PrintWriter("Addressbook.json");
		pw.write(jsonArray.toJSONString(jsonArray));
		pw.flush();
		pw.close();
		
		
	}

	public static void edit(String filePath) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Addressbook.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("address");
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		System.out.println("ENter the name of person,whose data you want to update");
		String person = utility.inputString();
		boolean found = true;
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			if (person.equals(jsonObject.get("Fname"))) {

				Set<String> keys = jsonObject.keySet();
				String keyArray[] = (String[]) keys.toArray(new String[keys.size()]);
				for (int i = 0; i < keyArray.length; i++) {
					System.out.println("Enter " + (i + 1) + "to" + keyArray[i]);
				}
				System.out.println("ENter what you want to edit");
				int key = utility.inputInteger();
				System.out.println("ENter the new value");
				utility.inputString();
				String value = utility.inputString();
				jsonObject.put(keyArray[key - 1], value);
				jsonObject2.put("address", jsonObject);
				PrintWriter pw = new PrintWriter("Addressbook.json");
				pw.write(jsonObject2.toJSONString());
				pw.flush();
				pw.close();
				break;

			}
		}

	}

}
