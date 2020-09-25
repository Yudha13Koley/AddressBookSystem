package com.training;

import java.util.Scanner;

public class AddressBook {
	private Contacts contact=new Contacts();
	private String AddressBookName;
	public AddressBook()  {
	}
	
	public String getAddressBookName() {
		return AddressBookName;
	}
	public void setAddressBookName(String addressBookName) {
		AddressBookName = addressBookName;
	}
	public void addContact(ContactPerson contactPerson) {
		contact.contactArray[contact.noOfContacts]=contactPerson;
		contact.noOfContacts++;
	}
		
	public void addContact(Scanner sc) {
		contact.contactArray[contact.noOfContacts]=new ContactPerson();
		System.out.println("Enter the Details to Add Contact :");
		System.out.println("Enter First Name :");
		contact.contactArray[contact.noOfContacts].setFirstName(sc.next());
		System.out.println("Enter Last Name :");
		contact.contactArray[contact.noOfContacts].setLastName(sc.next());
		System.out.println("Enter Address :");
		contact.contactArray[contact.noOfContacts].setAddress(sc.next());
		System.out.println("Enter City :");
		contact.contactArray[contact.noOfContacts].setCity(sc.next());
		System.out.println("Enter State :");
		contact.contactArray[contact.noOfContacts].setState(sc.next());
		System.out.println("Enter Zip :");
		contact.contactArray[contact.noOfContacts].setZip(sc.next());
		System.out.println("Enter Phone No :");
		contact.contactArray[contact.noOfContacts].setPhoneNumber(sc.next());
		System.out.println("Enter Email ID :");
		contact.contactArray[contact.noOfContacts].setEmail(sc.next());
		System.out.println("Contact Saved Successfully !");
		System.out.println(contact.contactArray[contact.noOfContacts]);
		contact.noOfContacts++;
	}
	public int searchByName(Scanner sc) {
		int i=0;
		System.out.println("Enter the First Name You Want to Search !");
		String name=sc.next();
		for(i=0;i<contact.noOfContacts;i++)
		{
			if(contact.contactArray[i].getFirstName().equalsIgnoreCase(name))
				break;
		}
		System.out.println(contact.contactArray[i]);
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
		contact.contactArray[i].setFirstName(sc.next());
		break;
		case 2:System.out.println("Enter Last Name :");
		contact.contactArray[i].setLastName(sc.next());
		break;
		case 3:System.out.println("Enter Address :");
		contact.contactArray[i].setAddress(sc.next());
		break;
		case 4:System.out.println("Enter City :");
		contact.contactArray[i].setCity(sc.next());
		break;
		case 5:System.out.println("Enter State :");
		contact.contactArray[i].setState(sc.next());
		break;
		case 6:System.out.println("Enter Zip :");
		contact.contactArray[i].setZip(sc.next());
		break;
		case 7:System.out.println("Enter Phone No :");
		contact.contactArray[i].setPhoneNumber(sc.next());
		break;
		case 8:System.out.println("Enter Email ID :");
		contact.contactArray[i].setEmail(sc.next());
		break;
		case 9:System.out.println("Edited Contact :");
			System.out.println(contact.contactArray[i]);
			System.exit(0);
		break;
			default:System.out.println("Select From Menu !");
		}
		}
	}
	public void deleteContact(Scanner sc) {
		System.out.println("Search the Name of Contact You Want to Delete : ");
		int i=this.searchByName(sc);
		while(i<contact.noOfContacts)
		{if(i+1==contact.noOfContacts)
			contact.contactArray[i]=null;
		else
			contact.contactArray[i]=contact.contactArray[i+1];
		i++;
		}
		System.out.println("Contact Deleted Succesfully !");
		contact.noOfContacts--;
	}
	public void printContact() {
		if (contact.noOfContacts==0)
		{
			System.out.println("Address Book is Empty !");
		}
		else {
			for(int i=0;i<contact.noOfContacts;i++)
			{
				System.out.println(contact.contactArray[i]);
			}
		}
	}

}
