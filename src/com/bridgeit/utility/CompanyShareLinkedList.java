package com.bridgeit.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CompanyShareLinkedList {
	Utility utility = new Utility();
	public static JSONObject readFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Stockaccount.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}
	    public void displayShares(String filePath) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Stockaccount.json");
		JSONArray jsonArray = (JSONArray) jsonObject2.get("stock");
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		LinkedList linkedList = new LinkedList();
		while (iterator.hasNext()) {
			jsonObject=(JSONObject)iterator.next();
    		long share = (long)jsonObject.get("noofshare");
    		
    		long amount = (long)jsonObject.get("Shareprice");
    		String name = (String)jsonObject.get("Name");
    		
    		String date = (String) jsonObject.get("date");
    		String time = (String) jsonObject.get("time");
    		System.out.println("  Account Holder name- "+name);
    		System.out.print("  Total Share -"+share);
    		System.out.print("  Available amount -"+amount);
    		System.out.print("  Date- "+date);
    		System.out.print("  Time - "+time);
    		System.out.println(" ");
    		linkedList.add(jsonObject);
					
		}
		Object list = new LinkedList<>();
		System.out.print("Companies shares => ");
		for (int i = 0; i < linkedList.size(); i++) 
		{
            list =linkedList.get(i);
            System.out.println(list);
						i++;
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}

	public void addShares(String filePath) {
		JSONArray jsonArray = new JSONArray();
		jsonArray = utility.jsonFileReader(filePath);
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		boolean check = true;
		System.out.println("Enter the company name : ");
		String companyName = utility.inputString();
		System.out.println("Enter the number of shares to add : ");
		long numberOfShare = utility.inputLong();
		;

		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			if (companyName.equals(jsonObject.get("company"))) {
				long finalShares = (numberOfShare + (long) jsonObject.get("share"));
				jsonObject.put("share", finalShares);
				System.out.println(numberOfShare + " shares added.");
				check = false;
			}
		}
		if (!check) {
			utility.jsonFileWriter(filePath, jsonArray);
		} else if (check) {
			System.out.println(companyName + " Company not found.");
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}

	public void removeShare(String filePath) {
		JSONArray jsonArray = new JSONArray();
		jsonArray = utility.jsonFileReader(filePath);
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		boolean check = true;
		System.out.println("Enter the company name : ");
		String companyName = utility.inputString();
		System.out.println("Enter the number of shares to remove : ");
		long numberOfShare = utility.inputLong();

		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			if (companyName.equals(jsonObject.get("company"))) {
				long finalShares = ((long) jsonObject.get("share") - numberOfShare);
				jsonObject.put("share", finalShares);
				System.out.println(numberOfShare + " shares removed.");
				check = false;
			}
		}
		if (!check) {
			utility.jsonFileWriter(filePath, jsonArray);
		} else if (check) {
			System.out.println(companyName + " Company not found.");
		}
		System.out.println("\n---------------------------------------------------------------------------");
	}
}
