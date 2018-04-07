/******************************************************************************
  
 *  Purpose: The easier way to create a thread-safe singleton class is to make
 *   the global access method synchronized, so that only one thread can execute 
 *   this method at a time. General implementation of this approach is like the 
 *   below class.
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/





package com.bridgeit.creationaldesignpatern;
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
}