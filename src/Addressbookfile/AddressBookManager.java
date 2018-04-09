package Addressbookfile;

import java.io.IOException;

public interface AddressBookManager 
{
public void newAddressBook() throws IOException;
public void open();
public void delete();
public void save();
public void saveAs();
public void quit();

}
