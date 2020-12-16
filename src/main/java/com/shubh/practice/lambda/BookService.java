package com.shubh.practice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    private List<Book> bookList;

    protected static final class Book{
        int id;
        String name;
        String author;

        public Book(int id, String name, String author) {
            this.id = id;
            this.name = name;
            this.author = author;
        }

        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

    public List<Book> getBooksInSortedOrder(){
        bookList = new ArrayList<>();
        bookList.add(new Book(3, "Java", "Shubh"));
        bookList.add(new Book(4, "C", "Rahul"));
        bookList.add(new Book(1, "Ruby", "Guddu"));
        bookList.add(new Book(2, "Python", "Akash"));



        Collections.sort(bookList, Comparator.comparing(Book::getName));

        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return bookList;
    }
}
