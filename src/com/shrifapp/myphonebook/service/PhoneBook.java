package com.shrifapp.myphonebook.service;

import com.shrifapp.myphonebook.model.BusinessContact;
import com.shrifapp.myphonebook.model.Contact;
import com.shrifapp.myphonebook.model.PersonalContact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private ArrayList<Contact> contacts=new ArrayList<>();

    public  void run(){
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                printAllContacts();
                    break;
                case 3:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid Number");
            }

        } while (choice != 3);
        scanner.close();
    }
   public void showMenu() {
        System.out.println("Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.Print All Contact");
        System.out.println("3.Exit");
        System.out.print("Please Enter Your Choice:");
    }

    public   void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("PhoneBook is Empty!");
        } else {
            System.out.println("Print All Contact");
        }
        System.out.println(" All Contacts:");
        int i = 1;
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
            /*System.out.println("Name[" + i  + "]" + ": " + contact.getName());
            System.out.println("Numberse[" + i + "]" + ": " + contact.getNumber());
            i++;*/
        }

    }

    public   void addContact(Scanner scanner) {
        System.out.println("ContactType:");
        System.out.println("1.Personal");
        System.out.println("2.Business(2 or other numbers)");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Family:");
            String family = scanner.nextLine();
            System.out.println("Enter Number:");
            String number = scanner.nextLine();

            PersonalContact personalContact = new PersonalContact(name, number);
            personalContact.setFamily(family);
            System.out.println("Contact Added Successfuly");

        } else {
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Fax Number:");
            String fax = scanner.nextLine();
            System.out.println("Enter Number:");
            String number = scanner.nextLine();

            BusinessContact personalContact = new BusinessContact(name, number);
            personalContact.setFax(fax);
            System.out.println("Contact Added Successfuly");

        }


    }
}
