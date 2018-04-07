/******************************************************************************
  
 *  Purpose:Here we have created Serialized and singletion  we need to implement
 *  Serializable interface in Singleton class so  that we can store it’s state 
 *  in file system and retrieve it at later point of time
 *   
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/





package com.bridgeit.creationaldesignpatern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
}
