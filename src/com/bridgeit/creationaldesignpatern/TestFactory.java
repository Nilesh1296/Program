/******************************************************************************
  
 *   Purpose: Super class in factory design pattern can be an interface, abstract
 *   class or a normal java class. For our factory design pattern example, we 
 *   have abstract super class with overridden toString() method for testing 
 *   purpose.


 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/




package com.bridgeit.creationaldesignpatern;

import com.bridgeit.utilitydesignpattern.Computer;
import com.bridgeit.utilitydesignpattern.ComputerFactory;

public class TestFactory
{
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}
}
