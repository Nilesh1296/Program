package com.bridgeit.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
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
}
	/*public static void addShares(String filePath) throws FileNotFoundException, IOException, ParseException {
		Utility utility = new Utility();
		JSONObject jsonObject2 = readFromFile("Stockaccount.json");
		System.out.println(jsonObject2);
		JSONArray jsonArray = (JSONArray) jsonObject2.get("stock");
		System.out.println(jsonArray);
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		System.out.println("Enter the company name");
		String name = utility.inputString();
		boolean companystatus = true;
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			if (name.equals(jsonObject.get("Name"))) {
				System.out.println("company already have");
				companystatus = false;
				break;
			}
		
		if(companystatus=true)
		{
			JSONObject jsonaddshare = new JSONObject();
			System.out.println("Enter the number of share");
			int noofshare = utility.inputInteger();
			utility.inputString();
			System.out.println("Enter the shareprice");
			int shareprice = utility.inputInteger();
			utility.inputString();
			String time = Utility.getCurrentTime();
			String date =Utility.getCurrentDate();
			jsonaddshare.put("Name", name);
			jsonaddshare.put("noofshare", noofshare);
			jsonaddshare.put("Shareprice", shareprice);
			jsonaddshare.put("time", time);
			jsonaddshare.put("date",date);
			jsonArray.add(jsonaddshare);
			System.out.println(jsonArray);
			jsonObject2.put("stock", jsonArray);
			System.out.println(jsonObject2);
			PrintWriter pw = new PrintWriter("Stockaccount.json");
			pw.write(jsonObject2.toJSONString());
			pw.flush();
			pw.close();
		}
		}
		JSONObject jsonObjectforstock = readFromFile("Stockaccount.json");
		JSONArray jsonArraystock = (JSONArray) jsonObject2.get("stock");
		Iterator<?> iterator1 = jsonArraystock.iterator();
		JSONObject jsonaddObject = new JSONObject();
		LinkedList linkedList = new LinkedList();
		while (iterator1.hasNext()) {
			jsonaddObject = (JSONObject) iterator.next();
			long share = (long) jsonaddObject.get("noofshare");

			long amount = (long) jsonaddObject.get("Shareprice");
			String nameofperson = (String) jsonaddObject.get("Name");

			String date = (String) jsonaddObject.get("date");
			String time = (String) jsonaddObject.get("time");
			System.out.println("  Account Holder name- " + nameofperson);
			System.out.print("  Total Share -" + share);
			System.out.print("  Available amount -" + amount);
			System.out.print("  Date- " + date);
			System.out.print("  Time - " + time);
			System.out.println(" ");
			linkedList.add(jsonaddObject );

		}
		Object list = new LinkedList<>();
		System.out.print("Companies shares => ");
		for (int i = 0; i < linkedList.size(); i++) {
			list = linkedList.get(i);
			System.out.println(list);
			i++;
		}
		
		System.out.println(jsonArray);
		Iterator<?> iterator = jsonArray.iterator();
		JSONObject jsonObject = new JSONObject();
		LinkedList linkedList = new LinkedList();
		System.out.println("Enter the company name");
		String name = utility.inputString();
		boolean companystatus = true;
		while (iterator.hasNext()) {
			jsonObject = (JSONObject) iterator.next();
			if (name.equals(jsonObject.get("Name"))) {
				System.out.println("company already have");
				companystatus = false;
				break;
			}
		}
		if(companystatus=true)
		{
			JSONObject jsonaddshare = new JSONObject();
			System.out.println("Enter the number of share");
			int noofshare = utility.inputInteger();
			utility.inputString();
			System.out.println("Enter the shareprice");
			int shareprice = utility.inputInteger();
			utility.inputString();
			String time = Utility.getCurrentTime();
			String date =Utility.getCurrentDate();
			jsonaddshare.put("Name", name);
			jsonaddshare.put("noofshare", noofshare);
			jsonaddshare.put("Shareprice", shareprice);
			jsonaddshare.put("time", time);
			jsonaddshare.put("date",date);
			jsonArray.add(jsonaddshare);
			jsonObject2.put("stock", jsonArray);
			PrintWriter pw = new PrintWriter("Stockaccount.json");
			pw.write(jsonObject2.toJSONString());
			pw.flush();
			pw.close();
			displayShares(filePath);

		}
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
*/