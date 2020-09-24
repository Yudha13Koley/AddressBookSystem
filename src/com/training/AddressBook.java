package com.training;

public class AddressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phoneNumber;
	private String email;
	
public AddressBook(String firstName, String lastName, String address, String city, String state, int zip,
			int phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getState() {
	return state;
}


public void setState(String state) {
	this.state = state;
}


public int getZip() {
	return zip;
}


public void setZip(int zip) {
	this.zip = zip;
}


public int getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
			+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
}


public static void main(String[] args) {
	AddressBook a1=new AddressBook("Yudhajit", "Koley", "xyz street" , "kolkata", "west bengal",700043 , 1234567890, "email@gmail.com");
	System.out.println(a1);
	AddressBook a2=new AddressBook("Ram", "Shankar", "xyzrts street" , "Bangalore", "Karnataka",400043 , 1234567887, "emaiaghsgyagxhsl@gmail.com");
	System.out.println(a2);
	
}
}
