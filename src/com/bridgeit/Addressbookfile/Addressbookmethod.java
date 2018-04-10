package Addressbookfile;

import java.util.LinkedList;
import java.util.Scanner;

public class Addressbookmethod implements Addressbook {
	LinkedList<Object> list = new LinkedList<Object>();
	Scanner scanner = new Scanner(System.in);
   
   
	@Override
	
	public void addPerson() {
		 Address add = new Address();
		 Person person = new Person();
       System.out.println("Enter the First name");
       String name = scanner.next();
       person.setFirstname(name);
       System.out.println("Enter the last name");
       String lastname = scanner.next();
       person.setLastname(lastname);
       System.out.println("Enter the phone number");
       long phonenumber = scanner.nextLong();
       person.setPhonenumber(phonenumber);
       scanner.nextLine();
       System.out.println("Enter the city");
       String cityname = scanner.next();
       add.setCity(cityname);
       System.out.println("Enter the state");
       String state = scanner.next();
       add.setState(state);
       System.out.println("Enter the zipcode");
       int zip = scanner.nextInt();
       add.setZip(zip);
       person.setAddress(add);
      list.add(person);
       for(int i=0;i<list.size();i++)
       {
    	  System.out.println(list.get(i));
       }
		
	}

	@Override
	public boolean editPerson() {
		

		return false;
	}

	@Override
	public boolean deletePerson() {
		

		return false;
	}

	@Override
	public void sortByName() {
		
		
	}

	@Override
	public void sortByCode() {
		
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
