package main;

import definition.ContactsADT;
import definition.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactsADT contactList = new ContactsADT();
        String FirstName;
        String LastName;
        String[] contactNumber = new String[3];
        String email;
        boolean flag;
        while (flag = true) {
            System.out.println("Welcome to Aryan's contact list");
            System.out.println("Press 1 to add a new contact\n " +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the person");
                    System.out.println("First name");
                    FirstName = scanner.nextLine();
                    System.out.println("Last Name");
                    LastName = scanner.nextLine();
                    contactList.setName(FirstName, LastName);
                    contactList.setFirstNameInList(FirstName);
                    System.out.println("Contact Number:");
                    contactNumber[0] = scanner.nextLine();
                    for (int i = 1; i <= 2; i++) {
                        System.out.println("Would you like to add new Number?");
                        char response = scanner.next().charAt(0);
                        if (response == 'y') {
                            contactNumber[i] = scanner.next();
                        } else {
                            break;
                        }
                    }
                    System.out.println("Enter the Email:");
                    email = scanner.next();
                    Person person = new Person(FirstName, LastName, contactNumber, email);
                    contactList.add(person);
                    break;
        }
    }
