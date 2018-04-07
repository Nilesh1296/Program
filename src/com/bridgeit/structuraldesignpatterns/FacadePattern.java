/******************************************************************************
  
 *  Purpose: A Facade Pattern says that just "just provide a unified and 
 *  simplified interface to a set of interfaces in a subsystem, therefore
 *  it hides the complexities of the subsystem from the client".

 
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   12-03-2018
 *
 ******************************************************************************/





package com.bridgeit.structuraldesignpatterns;

import com.bridgeit.utilitydesignpattern.ShapeMaker;

public class FacadePattern
{
	public static void main(String[] args)
	{
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();		
	   }
}
