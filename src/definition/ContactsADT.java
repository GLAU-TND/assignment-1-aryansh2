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

    public void setName(String FirstName, String LastName) {
        arrayOfNames.add(FirstName + " " + LastName);
    }

    public ArrayList getArrayOfNames() {
        return arrayOfNames;
    }


    @Override
    public boolean add(Person personData) {
        add(size, personData);
        return true;
    }

    private Person removeFirst() {
        Person response = null;
        Node<Person> temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    private Person removeAfter(Node<Person> node) {
        Person response = null;
        Node<Person> temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
            size--;
            response = temp.getData();
        }
        if (temp == null) {
            node = null;
            size--;
        }
        return response;
    }



    @Override
    public boolean remove(int index) {
        boolean response = false;
        if (index - 1 < 0 || (index - 1) > getSize()) {
            throw new IndexOutOfBoundsException(Integer.toString(index - 1));
        } else if (index - 1 == 0) {
            removeFirst();
            arrayOfNames.remove(index - 1);
            response = true;
        } else {
            Node<Person> previousNode = getNode(index - 1);
            removeAfter(previousNode);
            arrayOfNames.remove(index - 1);
            response = true;

        }
        return response;
    }

    public void setFirstNameInList(String name) {
        arrayOfFirstName.add(name);
    }

    public ArrayList getArrayOfFirstName() {
        return arrayOfFirstName;
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < arrayOfFirstName.size(); i++) {
            if (name.compareTo(arrayOfFirstName.get(i)) == 0) {
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println(counter + "Match Found");
            for (int i = 0; i < arrayOfFirstName.size(); i++) {
                if (name.compareTo(arrayOfFirstName.get(i)) == 0) {
                    Node<Person> personNode = getNode(i);
                    System.out.println(personNode.getData().toString());
                }
            }
        } else {
            System.out.println("No Match Found");
        }
    }

    @Override
    public void viewAll() {
        if (size != 0) {
            System.out.println("--Here are all your contacts--");
            for (int i = 0; i < size; i++) {
                Person data = this.getNode(i).getData();
                System.out.println(data);
            }
        } else {
            System.out.println("No Results Found!");
        }
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
