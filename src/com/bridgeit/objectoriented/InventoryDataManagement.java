package com.bridgeit.objectoriented;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class InventoryDataManagement 
{
  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException
  {
	  Utility utility = new Utility();
	  Utility.writeInventoryJsonFile();
	  JSONObject jsonObject = Utility.readFromInventoryFile("Inventory.json");
	  Utility.inventoryData(jsonObject);
  }
}
