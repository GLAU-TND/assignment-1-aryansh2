package definition;

class Node<Person> {
    private Person data;
    private Node<Person> next;

    private Node(Person data, Node<Person> next) {
        this.data = data;
        this.next = next;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node<Person> getNext() {
        return next;
    }

    public void setNext(Node<Person> next) {
        this.next = next;
    }
}

public class ContactsADT {

}