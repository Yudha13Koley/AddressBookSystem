package com.training;

import java.util.Scanner;

public class AddressBookDirectory {
	private AddressBook[] Abook=new AddressBook[5];
	private int NumberOfBooks=-1;
	public AddressBookDirectory() {
	}
	public void createAddressBook(Scanner sc){
		NumberOfBooks++;
		System.out.println("Enter the Name of Address Book :");
		String name=sc.next();
		Abook[NumberOfBooks]=new AddressBook();
		Abook[NumberOfBooks].setAddressBookName(name);
	}
	public void addContactInAbook(Scanner sc){
		Abook[NumberOfBooks].addContact(sc);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AddressBookDirectory dir=new AddressBookDirectory();
		dir.createAddressBook(sc);
		dir.addContactInAbook(sc);
		dir.addContactInAbook(sc);
		System.out.println(dir.Abook[0]);
		dir.createAddressBook(sc);
		dir.addContactInAbook(sc);
	}

}
