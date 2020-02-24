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
                case 2:
                    contactList.viewAll();
                    break;
                case 3:
                    System.out.println("You could search for a contact from there contact name");
                    String name = scanner.next();
                    contactList.search(name);
                case 4:
                    System.out.println("Here are your Contacts");
                    for (int i = 0; i < contactList.getArrayOfNames().size(); i++) {
                        System.out.println((i + 1) + ". " + contactList.getArrayOfNames().get(i));
                    }
                    System.out.println("Press the number against the contact to delete it");
                    int index = scanner.nextInt();
                    String tempName = contactList.getArrayOfNames().get(index - 1).toString();
                    contactList.remove(index);
                    System.out.println(tempName + "has been deleted from your contact");
                    break;
                case 5:
                    System.out.println("Thank you for using our services");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }


        }
    }
}