package com.bridgeit.objectoriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.bridgeit.utility.Utility;

public class StockAccount
{
	Utility utility = new Utility();
	public static JSONArray jsonFileReader(String filePath) throws FileNotFoundException
	  {
		  File file = new File(filePath);
		  JSONArray jsonArray = null;
		  try 
		  { 
			  FileReader fileReader = new FileReader(file);
		      JSONParser jsonParser = new JSONParser();
		      jsonArray = new JSONArray();
		      jsonArray =(JSONArray)jsonParser .parse(fileReader);
		      
			  
		  }
		  catch(Exception e)
		  {
			 System.out.println(e);
			  
		  }
		return jsonArray;

		  
	  }
	  
	    public  void  jsonFileWriter(String filePath,JSONArray jsonArray)
	    {
	    	FileWriter fileWriter = null;
	    	try
	    	{
	    		fileWriter = new FileWriter(filePath);
	    		fileWriter.write(JSONValue.toJSONString(jsonArray));
	    		
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}
			
	    	
	    }
	  
	    public int numberofrecord(String filePath) throws FileNotFoundException
	    {
	    	int count=0;
	    	JSONArray jsonArray = new JSONArray();
	    	jsonArray = Utility.jsonFileReader(filePath);
	    	Iterator<?> iterator =  jsonArray.iterator();
	    	JSONObject jsonObject = new JSONObject();
	    	while(iterator.hasNext())
	    	{
	    		jsonObject = (JSONObject)iterator.next();
	    		count++;
	    	}
			return count;
	    	
	    }
	    public void display(String filePath) throws FileNotFoundException
	    {
	    	JSONArray jsonArray = new JSONArray();
	    	jsonArray = Utility.jsonFileReader(filePath);
	    	Iterator<?> iterator =  jsonArray.iterator();
	    	JSONObject jsonObject = new JSONObject();
	    	while(iterator.hasNext())
	    	{
	    		jsonObject=(JSONObject)iterator.next();
	    		long share = (long)jsonObject.get("Share");
	    		long amount = (long)jsonObject.get("amount");
	    		String name = (String)jsonObject.get("name");
	    		System.out.println("Account Holder name "+name);
	    		System.out.println("Total Share"+share);
	    		System.out.println("Available amount "+amount);
	    		
	    	}
	    }
	    public void createAccount(String filePath)
	    {
	    	Utility utility = new Utility();
	    	try
	    	{
	    		System.out.println("Enter your name");
	    		String name = utility.inputString();
	    		System.out.println("Enter the starting balance of account");
	    		long balance = utility.inputLong();
	    		System.out.println("Enter the number of share");
	    		long share = utility.inputLong();
	    		JSONArray jsonArray = new JSONArray();
	    		jsonArray = utility.jsonFileReader(filePath);
	    		JSONObject jsonObject = new JSONObject();
	    		jsonObject.put("name",name);
	    		jsonObject.put("amount",balance);
	    		jsonObject.put("Share",share);
	    		jsonArray.add(jsonObject);
	    		utility.jsonFileWriter(filePath, jsonArray);
	    	}
	    	catch(Exception e)
	    	
	    	{
	    	System.out.println(e);	
	    	}
	    }
	    
	    public void sell1(long shareToSell,String name) throws FileNotFoundException
	    {
	    	StockAccount stockaccount = new StockAccount();
	    	String filePathForStockAccount ="/home/bridgeit/Documents/Nilesh/Filesforjson/Commercial.json";
	    	String filePathForShareFile = "/home/bridgeit/Documents/Nilesh/Filesforjson/StockAccount1.json";
	    	JSONArray jsonArray = new JSONArray();
	    	jsonArray = Utility.jsonFileReader(filePathForShareFile);
	    	Iterator<?> iterator =  jsonArray.iterator();
	    	JSONObject jsonObject = new JSONObject();
	    	boolean checktransaction = false;
	    	while(iterator.hasNext())
	    	{
	    		jsonObject =(JSONObject)iterator.next();
	    		if(name.equals((String)jsonObject.get("name")))
	    		{
	    			long totalShareInCompany =(long)jsonObject.get("Share");
	    			long sharePrice =(long)jsonObject.get("amount");
	    			boolean checkSell = stockaccount.isPersonAvailable(filePathForStockAccount,sharePrice,shareToSell);
	    			if(checkSell)
	    			{
	    				long finalShare = totalShareInCompany-shareToSell;
	    				jsonObject.put("Share", finalShare);
	    				checktransaction =true;
	    				System.out.println("Your "+shareToSell+" shares has been selled.");
	    				break;
	    				
	    			}
	    		}
	    		
	        }
	    	if(checktransaction)
	    	{
	    		utility.jsonFileWriter(filePathForShareFile, jsonArray);
	    	}
	    	else if(!checktransaction)
	    	{
	    		System.out.println("your selling is not complete");
	    	}
	} 
	    public void sell(long shareToSell,String name) throws FileNotFoundException
	    {
	    	StockAccount stockaccount = new StockAccount();
	    	String filePathForStockAccount ="/home/bridgeit/Documents/Nilesh/Filesforjson/Commercial.json";
	    	String filePathForShareFile = "/home/bridgeit/Documents/Nilesh/Filesforjson/StockAccount1.json";
	    	JSONArray jsonArray = new JSONArray();
	    	jsonArray = Utility.jsonFileReader(filePathForShareFile);
	    	Iterator<?> iterator =  jsonArray.iterator();
	    	JSONObject jsonObject = new JSONObject();
	    	boolean checktransaction = false;
	    	while(iterator.hasNext())
	    	{
	    		jsonObject =(JSONObject)iterator.next();
	    		if(name.equals((String)jsonObject.get("name")))
	    		{
	    			long totalShareInCompany =(long)jsonObject.get("Share");
	    			long sharePrice =(long)jsonObject.get("amount");
	    			boolean checkSell = stockaccount.isPersonAvailable(filePathForStockAccount,sharePrice,shareToSell);
	    			if(checkSell)
	    			{
	    				long finalShare = totalShareInCompany-shareToSell;
	    				jsonObject.put("Share", finalShare);
	    				checktransaction =true;
	    				System.out.println("Your "+shareToSell+" shares has been selled.");
	    				break;
	    				
	    			}
	    		}
	    		
	        }
	    	if(checktransaction)
	    	{
	    		utility.jsonFileWriter(filePathForShareFile, jsonArray);
	    	}
	    	else if(!checktransaction)
	    	{
	    		System.out.println("your selling is not complete");
	    	}
	} 

	    
	    boolean isPersonAvailable(String filePath,long sharePrice,long shareToSell) throws FileNotFoundException
	    {
	    	Utility utility=new Utility();
	    	JSONArray jsonArray = new JSONArray();
	    	jsonArray = Utility.jsonFileReader(filePath);
	    	Iterator<?> iterator=jsonArray.iterator();
	    	JSONObject jsonObject = new JSONObject();
	    	System.out.println("Enter your name");
	    	String name = utility.inputString();
	    	boolean checkPerson = false;
	    	boolean checkSell = false;
	    	while(iterator.hasNext())
	    	{
	    		jsonObject =(JSONObject)iterator.next();
	    		if(name.equalsIgnoreCase((String)jsonObject.get("name")))
	    		{
	    			checkPerson=true;
	    			long share =(long)jsonObject.get("Share");
	    			if(share>=sharePrice)
	    			{
	    				long finalShare = share-shareToSell;
	    				long amount = sharePrice*shareToSell;
	    				long finalAmount = amount+(long)jsonObject.get("amount");
	    				jsonObject.put("shares",finalShare);
	    				jsonObject.put("amount", finalAmount);
	    				checkSell = true;
	    				break;
	    			}
	    			else
	    			{
	    				System.out.println("you does not have"+shareToSell+"shares to sell");
	    			}
	    		}
	    	}
	    	if(checkPerson)
	    	{
	    		utility.jsonFileWriter(filePath, jsonArray);
	    	}
	    	else if(!checkPerson)
	    		
	    	{
	    		System.out.println(name+"you doesnot have account,please first create account");
	    	}
			return checkSell;
	    	
	    }
	    
	    public void buy(long shareToBuy, String symbol) throws FileNotFoundException
		{
	    	Utility utility=new Utility();
	    	StockAccount stockaccount = new StockAccount();
			String filePathForStockAccount="/home/bridgeit/Documents/Nilesh/Filesforjson/share.json";
			String filePathForShareFile="/home/bridgeit/Documents/Nilesh/Filesforjson/StockAccount.json";
			JSONArray jsonArray=new JSONArray();
			jsonArray=Utility.jsonFileReader(filePathForShareFile);
			Iterator<?> iterator=jsonArray.iterator();
			JSONObject jsonObject=new JSONObject();
			boolean checktransaction=false;
			boolean check=false;
			while(iterator.hasNext())
			{
				jsonObject=(JSONObject) iterator.next();
				if(symbol.equals((String)jsonObject.get("symbol")))
				{
					
					long totalShareOfCompany=(long)jsonObject.get("share");
					long sharePrice=(long) jsonObject.get("price");
					check=stockaccount.isPersonAvailable2(filePathForStockAccount, sharePrice, shareToBuy, totalShareOfCompany);
					if(check)
					{
						long finalshare=(long)jsonObject.get("share")-shareToBuy;
						jsonObject.put("share", finalshare);
						System.out.println("Share has been bought.");
						checktransaction=true;
						break;
					}
				}
			}
			if(!checktransaction)
			{
				System.out.println("Your buying is not done.");
			}
			else if(check)
			{
				utility.jsonFileWriter(filePathForShareFile, jsonArray);
			}
		}
		
		private boolean isPersonAvailable2(String filePath, long sharePrice, long shareToBuy, long totalShareOfCompany) throws FileNotFoundException
		{
			Utility utility=new Utility();
			long amount1=sharePrice*shareToBuy;
			JSONArray jsonArray=new JSONArray();
			jsonArray=Utility.jsonFileReader(filePath);
			Iterator<?> iterator=jsonArray.iterator();
			JSONObject jsonObject=new JSONObject();
			System.out.println("Enter your name : ");
			String name=utility.inputString();
			boolean checkPerson=false;
			boolean checkBuy=false;
			while(iterator.hasNext())
			{
				jsonObject=(JSONObject)iterator.next();
				if(name.equalsIgnoreCase((String) jsonObject.get("name")))
				{
					checkPerson=true;
					long share=(long) jsonObject.get("shares");
					long totalAmountOfPerson=(long)jsonObject.get("amount");
					if(share>=shareToBuy && totalAmountOfPerson>=amount1)
					{
						long finalShare=share+shareToBuy;
						
						long finalAmount=(long)jsonObject.get("amount")-amount1;
						jsonObject.put("shares", finalShare);
						jsonObject.put("amount", finalAmount);
						checkBuy=true;
						break;
					}
					else
					{
						System.out.println("You doesn't have "+shareToBuy+" shares to sell.");
					}
				}
			}
			if(checkBuy)
			{
				utility.jsonFileWriter(filePath, jsonArray);
			}
			else if(!checkPerson)
			{
				System.out.println(name+" you doesn't have account, please first create account.");
			}
			return checkBuy;
		}
		
	}

