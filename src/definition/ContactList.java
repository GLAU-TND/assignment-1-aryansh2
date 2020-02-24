package definition;

import adt.ContactADT;

import java.util.ArrayList;

public class ContactList<Person> implements ContactADT<Person> {
    ArrayList<String> arrayOfNames = new ArrayList<>();

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
}
