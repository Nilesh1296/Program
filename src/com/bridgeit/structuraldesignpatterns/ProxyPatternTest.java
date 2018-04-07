/******************************************************************************
  
 *  Purpose: we want to provide only admin users to have full access of above 
 *  class, if the user is not admin then only limited commands will be allowed.
 *  
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/

package com.bridgeit.structuraldesignpatterns;

import com.bridgeit.utilitydesignpattern.CommandExecProxy;
import com.bridgeit.utilitydesignpattern.CommandExecutor;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}

	}
}
