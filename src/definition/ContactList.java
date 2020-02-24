package definition;

import adt.ContactADT;

import java.util.ArrayList;

public class ContactList<Person> implements ContactADT<Person> {
    ArrayList<String> arrayOfNames = new ArrayList<>();
    ArrayList<String> arrayOfFirstName = new ArrayList<>();
    private Node<Person> head;
    private int size = 0;
    private int counter;

    public int getSize() {
        return size;
    }

    private void addFirst(Person personData) {
        head = new Node<>(personData, head);
        size++;
    }

    private void addAfter(Node<Person> personNode, Person personData) {
        personNode.next = new Node<>(personData, personNode.next);
    }









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
