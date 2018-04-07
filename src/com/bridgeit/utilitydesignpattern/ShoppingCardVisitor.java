package com.bridgeit.utilitydesignpattern;

public interface ShoppingCardVisitor 
{
	int visit(Book book);
	int visit(Fruit fruit);
}
