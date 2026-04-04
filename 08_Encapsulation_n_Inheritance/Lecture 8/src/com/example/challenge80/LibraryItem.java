package com.example.challenge80;

public class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;

    protected LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    void checkout() {
        System.out.println("Checkout " + title);
    }

    void returnItem() {
        System.out.println("Returned " + title);
    }
}
