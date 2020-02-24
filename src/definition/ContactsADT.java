package definition;

import adt.ContactADT;

import java.util.ArrayList;

public class ContactsADT<Person> implements ContactADT<Person> {
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

    public void add(int index, Person personData) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (size == 0) {
            addFirst(personData);
        } else {
            Node<Person> node = getNode(index - 1);
            addAfter(node, personData);
        }
    }

    private Node<Person> getNode(int index) {
        Node<Person> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
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

    private static class Node<Person> {
        private Person data;
        private Node<Person> next;

        private Node(Person data, Node<Person> next) {
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
}
