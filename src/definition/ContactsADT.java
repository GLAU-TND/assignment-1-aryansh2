package definition;

import adt.ContactADT;

public class ContactsADT<Person> implements ContactADT<Person> {


    @Override
    public boolean add(Person person) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void search(String Name) {

    }

    @Override
    public void viewAll() {

    }

    private static class Node<Person> {
        private Person data;
        private Node<Person> next;
    }
}
