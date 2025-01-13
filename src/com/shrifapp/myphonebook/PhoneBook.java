package com.shrifapp.myphonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {

private static ArrayList<Contact> contacts=new ArrayList<>();
    public static void main(String[] args) {
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

    private static void showMenu() {
        System.out.println("Menu");
        System.out.println("1.Add Contact");
        System.out.println("2.Print All Contact");
        System.out.println("3.Exit");
        System.out.print("Please Enter Your Choice:");
    }

    private static void printAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("PhoneBook is Empty!");
        } else {
            System.out.println("Print All Contact");
        }
        System.out.println(" All Contacts:");
        int i=1;
        for (Contact contact:contacts){
            System.out.println(contact.toString());
            /*System.out.println("Name[" + i  + "]" + ": " + contact.getName());
            System.out.println("Numberse[" + i + "]" + ": " + contact.getNumber());
            i++;*/
        }

    }

    private static void addContact(Scanner scanner) {

        Contact newContact=new Contact();
        System.out.println("Enter Name:");


        newContact.setName(scanner.nextLine());
        System.out.println("Enter Number as Number only without zero at start:");
        int number = scanner.nextInt();
        scanner.nextLine();
        newContact.setNumber(number);

        contacts.add(newContact);
        System.out.println("Contact Added Successfuly");

    }
}

        

