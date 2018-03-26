package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockQueue
{
	public static JSONObject readFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("Stockaccount.json"));
		JSONObject jo = (JSONObject) obj;
		return jo;

	}

	
	
	public static  java.util.Queue<JSONObject> shareTransaction() throws FileNotFoundException, IOException, ParseException
	{
		Queue<JSONObject> queue = new java.util.LinkedList();
	JSONObject jsonObject = StockQueue.readFromFile("Stockaccount.json");
	JSONArray stock =(JSONArray) jsonObject.get("stock");
		for(int i=0;i<stock.size();i++)
	{
		JSONObject transaction =(JSONObject) stock.get(i);
		queue.add(transaction);
	}
		return queue;
	}
	
	
public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
{
	Queue<JSONObject> queue = StockQueue.shareTransaction();
	System.out.println(queue.toString());
				
}
}
