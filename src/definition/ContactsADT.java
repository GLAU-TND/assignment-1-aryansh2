package definition;

import java.util.ArrayList;

class Node<Person> {
    private Person data;
    private Node<Person> next;

    Node(Person data, Node<Person> next) {
        this.data = data;
        this.next = next;
    }

    private Person getData() {
        return data;
    }

    private void setData(Person data) {
        this.data = data;
    }

    private Node<Person> getNext() {
        return next;
    }

    private void setNext(Node<Person> next) {
        this.next = next;
    }
}

public class ContactsADT {
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
}