/******************************************************************************
  
 *  Purpose: Here we have created eagerinitialized singletion by using static 
 *  keyword and it is loaded at the time of the class loading
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/



package com.bridgeit.creationaldesignpatern;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
