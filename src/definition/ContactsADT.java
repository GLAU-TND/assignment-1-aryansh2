package definition;

class Node<Person> {
    private Person data;
    private Node<Person> next;

    private Node(Person data, Node<Person> next) {
        this.data = data;
        this.next = next;
    }
}

public class ContactsADT {

}