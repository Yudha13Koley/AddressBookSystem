package com.training;

import java.util.Scanner;

public class AddressBook {
	public int noOfContacts;
	private ContactPerson[] contactArray;
	public AddressBook()  {
		contactArray=new ContactPerson[5];
	}
	public void addContact(ContactPerson contactPerson) {
		contactArray[noOfContacts]=contactPerson;
		noOfContacts++;
	}
		
	public void addContact(Scanner sc) {
		contactArray[noOfContacts]=new ContactPerson();
		System.out.println("Enter the Details to Add Contact :");
		System.out.println("Enter First Name :");
		contactArray[noOfContacts].setFirstName(sc.next());
		System.out.println("Enter Last Name :");
		contactArray[noOfContacts].setLastName(sc.next());
		System.out.println("Enter Address :");
		contactArray[noOfContacts].setAddress(sc.next());
		System.out.println("Enter City :");
		contactArray[noOfContacts].setCity(sc.next());
		System.out.println("Enter State :");
		contactArray[noOfContacts].setState(sc.next());
		System.out.println("Enter Zip :");
		contactArray[noOfContacts].setZip(sc.next());
		System.out.println("Enter Phone No :");
		contactArray[noOfContacts].setPhoneNumber(sc.next());
		System.out.println("Enter Email ID :");
		contactArray[noOfContacts].setEmail(sc.next());
		System.out.println("Contact Saved Successfully !");
		System.out.println(contactArray[noOfContacts]);
		noOfContacts++;
	}
	public int searchByName(Scanner sc) {
		int i=0;
		System.out.println("Enter the First Name You Want to Search !");
		String name=sc.next();
		for(i=0;i<noOfContacts;i++)
		{
			if(contactArray[i].getFirstName().equalsIgnoreCase(name))
				break;
		}
		System.out.println(contactArray[i]);
		return i;
		}
	public void editContact(Scanner sc) {
		int i=this.searchByName(sc);
		for(;;) {
		System.out.println("To Edit this Contact : ");
		System.out.println("Press 1 to Edit First Name :");
		System.out.println("Press 2 to Edit Last Name :");
		System.out.println("Press 3 to Edit Address :");
		System.out.println("Press 4 to Edit City :");
		System.out.println("Press 5 to Edit State :");
		System.out.println("Press 6 to Edit Zip :");
		System.out.println("Press 7 to Edit Phone No:");
		System.out.println("Press 8 to Edit Email :");
		System.out.println("Press 9 to Exit :");
	    String choice=sc.next();
		switch(Integer.parseInt(choice))
		{
		case 1 :System.out.println("Enter First Name :");
		contactArray[i].setFirstName(sc.next());
		break;
		case 2:System.out.println("Enter Last Name :");
		contactArray[i].setLastName(sc.next());
		break;
		case 3:System.out.println("Enter Address :");
		contactArray[i].setAddress(sc.next());
		break;
		case 4:System.out.println("Enter City :");
		contactArray[i].setCity(sc.next());
		break;
		case 5:System.out.println("Enter State :");
		contactArray[i].setState(sc.next());
		break;
		case 6:System.out.println("Enter Zip :");
		
		contactArray[i].setZip(sc.next());

		break;
		case 7:System.out.println("Enter Phone No :");
		contactArray[i].setPhoneNumber(sc.next());
		break;
		case 8:System.out.println("Enter Email ID :");
		contactArray[i].setEmail(sc.next());
		break;
		case 9:System.out.println("Edited Contact :");
			System.out.println(contactArray[i]);
			System.exit(0);
		break;
			default:System.out.println("Select From Menu !");
		}
		}
	}
	public void deleteContact(Scanner sc) {
		System.out.println("Search the Name of Contact You Want to Delete : ");
		int i=this.searchByName(sc);
		while(i<noOfContacts)
		{if(i+1==noOfContacts)
			contactArray[i]=null;
		else
			contactArray[i]=contactArray[i+1];
		i++;
		}
		System.out.println("Contact Deleted Succesfully !");
		noOfContacts--;
	}
	public void printContact() {
		if (noOfContacts==0)
		{
			System.out.println("Address Book is Empty !");
		}
		else {
			for(int i=0;i<noOfContacts;i++)
			{
				System.out.println(contactArray[i]);
			}
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	AddressBook A1=new AddressBook();	
	A1.addContact(sc);
	A1.addContact(sc);
	A1.addContact(sc);
	A1.addContact(sc);
	A1.printContact();
}
}
