package com.shubh.practice.lang;

class Book {

    private int id;
    private String bookName;

    public Book(int id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }
}

public class Person implements Cloneable {

    private int id;
    private Book book;

    public Person(int id, Book book) {
        this.id = id;
        this.book = book;
    }

    public static void main(String[] args) {

        Book book = new Book(1, "Harry Potter");

        Person person = new Person(1, book);
        try {
            Person personClone = (Person) person.clone();
            System.out.println("Book object >> " + book.hashCode());
            System.out.println("Original Person Object >> " + person.hashCode());
            System.out.println("Cloned Person Object>> " + personClone.hashCode());
            System.out.println("Cloned Person Book Object >> " + personClone.getBook().hashCode());

            String s = null;
            System.out.println(s);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }
}
