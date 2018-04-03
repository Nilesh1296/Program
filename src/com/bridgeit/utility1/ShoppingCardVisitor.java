package com.bridgeit.utility1;

public interface ShoppingCardVisitor 
{
	int visit(Book book);
	int visit(Fruit fruit);
}
