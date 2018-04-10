package Addressbookfile;

public class Person 
{
private String firstname;
private String lastname;
private long phonenumber;
private Address address;


public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
@Override
public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", address="
			+ address + "]";
}

}
