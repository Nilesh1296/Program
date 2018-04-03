package com.bridgeit.structuraldesignpatterns;

import com.bridgeit.utility1.CommandExecProxy;
import com.bridgeit.utility1.CommandExecutor;

public class ProxyPatternTest 
{
	public static void main(String[] args){
		CommandExecutor executor = new CommandExecProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
