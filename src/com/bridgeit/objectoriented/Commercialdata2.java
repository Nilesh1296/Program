package com.bridgeit.objectoriented;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class Commercialdata2 {
	
		public static JSONObject readFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
			Object obj = new JSONParser().parse(new FileReader("Stockaccount.json"));
			JSONObject jo = (JSONObject) obj;
			return jo;

		}

		public static void addtoFile(String filename) throws FileNotFoundException, IOException, ParseException {
			Utility utility = new Utility();
			JSONObject jsonObject = readFromFile("Stockaccount.json");
			JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
			JSONObject jsonObject2 = new JSONObject();
			System.out.println("Enter the name of the share");
			String name = utility.inputString();
			System.out.println("Enter the number of share");
			int noofshare = utility.inputInteger();
			utility.inputString();
			System.out.println("Enter the shareprice");
			int shareprice = utility.inputInteger();
			utility.inputString();
			System.out.println("Enter the time");
			String time = utility.inputString();
			System.out.println("Enter the date");
			String date = utility.inputString();
			jsonObject2.put("Name", name);
			jsonObject2.put("noofshare", noofshare);
			jsonObject2.put("Shareprice", shareprice);
			jsonObject2.put("time", time);
			jsonObject2.put("date",date);
			jsonArray.add(jsonObject2);
			jsonObject.put("stock", jsonArray);

			PrintWriter pw = new PrintWriter("Stockaccount.json");
			pw.write(jsonObject.toJSONString());
			pw.flush();
			pw.close();

		}

		public static void deletetoFile(String filename) throws FileNotFoundException, IOException, ParseException {
			Utility utility = new Utility();
			JSONObject jsonObject = readFromFile("Stockaccount.json");
			JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
			JSONObject jsonObject3 = new JSONObject();

			System.out.println("Enter the name from user");
			String name1 = utility.inputString();

			for (int i = 0; i < jsonArray.size(); i++) {

				jsonObject3 = (JSONObject) jsonArray.get(i);
				String name = (String) jsonObject3.get("Name");
				if (name.equalsIgnoreCase(name1)) {
					jsonArray.remove(i);
					jsonObject.put("stock", jsonArray);
					PrintWriter pw = new PrintWriter("Stockaccount.json");
					pw.write(jsonObject.toJSONString());
					pw.flush();
					pw.close();
					break;
				}
			}

		}

		public static int numberofrecord(String filePath) throws IOException, ParseException {
			int count = 0;
			JSONObject jsonObject = readFromFile("Stockaccount.json");
			JSONArray jsonArray = (JSONArray) jsonObject.get("stock");
			JSONObject jsonObject3 = new JSONObject();
			Iterator<?> iterator = jsonArray.iterator();

			while (iterator.hasNext()) {
				jsonObject3 = (JSONObject) iterator.next();
				count++;
			}
			return count;

		}

		public static void sell(long shareToSell) throws IOException, ParseException {
		
			Utility utility = new Utility();
			JSONObject jsonObject2 = readFromFile("Stockaccount.json");
			JSONArray jsonArray =  (JSONArray) jsonObject2.get("stock");
			JSONObject jsonObject3 = new JSONObject();
			System.out.println("Enter the name from user");
			String name1 = utility.inputString();

			for (int i = 0; i < jsonArray.size(); i++) {
				jsonObject3 = (JSONObject) jsonArray.get(i);
				String name2 = (String) jsonObject3.get("Name");
				if (name1.equalsIgnoreCase(name2)) {
					System.out.println("hi");
					long totalshare = (long) jsonObject3.get("noofshare");
					long remainingshare = totalshare - shareToSell;
					jsonObject3.put("noofshare", remainingshare);
					jsonObject2.put("stock", jsonObject3);
					PrintWriter pw = new PrintWriter("Stockaccount.json");
					pw.write(jsonObject2.toJSONString());
					pw.flush();
					pw.close();
					break;

				}

			}
		}

		
		public static void buy(long sharetoBuy) throws FileNotFoundException, IOException, ParseException
		{
			Utility utility = new Utility();
			JSONObject jsonObject2 = readFromFile("Stockaccount.json");
			JSONArray jsonArray =  (JSONArray) jsonObject2.get("stock");
			JSONObject jsonObject3 = new JSONObject();
			System.out.println("Enter the name from user");
			String name1 = utility.inputString();

			for (int i = 0; i < jsonArray.size(); i++) {
				jsonObject3 = (JSONObject) jsonArray.get(i);
				String name2 = (String) jsonObject3.get("Name");
				if (name1.equalsIgnoreCase(name2)) {
					System.out.println("hi");
					long totalshare = (long) jsonObject3.get("noofshare");
					long finalshare = totalshare + sharetoBuy;
					jsonObject3.put("noofshare", finalshare);
					jsonObject2.put("stock", jsonObject3);
					PrintWriter pw = new PrintWriter("Stockaccount.json");
					pw.write(jsonObject2.toJSONString());
					pw.flush();
					pw.close();
					break;

				}

			}
			
		}
		  public static void display(String filePath) throws IOException, ParseException
		    {
			    Utility utility = new Utility();
				JSONObject jsonObject2 = readFromFile("Stockaccount.json");
				JSONArray jsonArray =  (JSONArray) jsonObject2.get("stock");
		    	Iterator<?> iterator =  jsonArray.iterator();
		    	JSONObject jsonObject = new JSONObject();
		    	while(iterator.hasNext())
		    	{
		    		jsonObject=(JSONObject)iterator.next();
		    		long share = (long)jsonObject.get("noofshare");
		    		long amount = (long)jsonObject.get("Shareprice");
		    		String name = (String)jsonObject.get("Name");
		    		String date = (String) jsonObject.get("date");
		    		String time = (String) jsonObject.get("time");
		    		System.out.println("Account Holder name "+name);
		    		System.out.println("Total Share"+share);
		    		System.out.println("Available amount "+amount);
		    		
		    	}
		    }
		public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
			Utility utility = new Utility();
			System.out.println("Enter any positive number");
			int choice1 = utility.inputInteger();

			while (choice1 > 0) {
	            System.out.println("enter 1 to add share details to the file");
	            System.out.println("enter 2 to delete the share from the file");
	            System.out.println("enter 3 to count number of account");
	            System.out.println("enter 4 to sell number of share");
	            System.out.println("enter 5 to buy number of share ");
	            System.out.println("enter 6 to display the json file");
				System.out.println("Enter the choice");
				int choice = utility.inputInteger();
				utility.inputString();
				switch (choice) {
				case 1:

					addtoFile("Stockaccount.json");
					break;

				case 2:
					deletetoFile("Stockaccount.json");
					break;

				case 3:
					int count1 = numberofrecord("Stockaccount.json");
					System.out.println(count1);

					break;

				case 4:
					System.out.println("enter the number of share to sell");
					long shareToSell = utility.inputLong();
					
					sell(shareToSell);
				case 5:
					System.out.println("enter the number of share to buy");
					long sharetoBuy = utility.inputLong();
					buy(sharetoBuy);
				case 6 :
					System.out.println("display the json file");
					display("Stockaccount.json");
				}

			}
		}
	}
	

	