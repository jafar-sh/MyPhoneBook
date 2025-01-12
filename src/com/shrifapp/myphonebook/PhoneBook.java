package com.shrifapp.myphonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<String> nunbers=new ArrayList<>();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Add Contact");
            System.out.println("2.Print All Contact");
            System.out.println("3.Exit");
            System.out.print("Please Enter Your Choice:");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Enter Name:");
                   String name= scanner.nextLine();
                   System.out.println("Enter Number:");
                   String number= scanner.nextLine();
                   names.add(name);
                   nunbers.add(number);
                    System.out.println("Contact Added Successfuly");
                    break;
                case 2:
                    if (names.isEmpty()){
                        System.out.println("PhoneBook is Empty!");
                    }else {
                        System.out.println("Print All Contact");
                    }
                    System.out.println(" All Contacts:");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println("Name["+(i+1)+"]"+": "+names.get(i));
                        System.out.println("Numberse["+(i+1)+"]"+": "+nunbers.get(i));

                    }
                    break;
                case 3:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Invalid Number");
            }

        }while (choice != 3);
        scanner.close();
    }
}

        

