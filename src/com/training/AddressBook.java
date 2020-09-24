package com.training;

import java.util.Scanner;

public class AddressBook {
	public ContactPerson contactPerson;
	public void addContact(ContactPerson contactPerson) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Details to Add Contact :");
		System.out.println("Enter First Name :");
		contactPerson.setFirstName(sc.nextLine());
		System.out.println("Enter Last Name :");
		contactPerson.setLastName(sc.nextLine());
		System.out.println("Enter Address :");
		contactPerson.setAddress(sc.nextLine());
		System.out.println("Enter City :");
		contactPerson.setCity(sc.nextLine());
		System.out.println("Enter State :");
		contactPerson.setState(sc.nextLine());
		System.out.println("Enter Zip :");
		Scanner sc2=new Scanner(System.in);
		contactPerson.setZip(sc2.nextInt());
		System.out.println("Enter Phone No :");
		contactPerson.setPhoneNumber(sc.nextLine());
		System.out.println("Enter Email ID :");
		contactPerson.setEmail(sc.nextLine());
		System.out.println("Contact Saved Successfully !");
		sc.close();
		sc2.close();
	}
public static void main(String[] args) {
	ContactPerson p1=new ContactPerson();
	AddressBook A1=new AddressBook();
	A1.addContact(p1);
System.out.println(p1);
	
}
}
