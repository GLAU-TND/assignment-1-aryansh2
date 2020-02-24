package adt;

public interface ContactADT<Person> {
    boolean add(Person person);

    boolean remove(int index);

    void search(String Name);

    void viewAll();
}
