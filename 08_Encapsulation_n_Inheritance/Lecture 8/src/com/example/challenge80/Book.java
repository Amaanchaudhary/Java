package com.example.challenge80;

public class Book extends LibraryItem{
    public String isbn;

    Book(String isbn, String itemId, String title, String author){
        super(itemId, title, author);
        this.isbn = isbn;
    }
}
