package com.example.challenge80;

public class Magazine extends LibraryItem {
    public int issueNumber;

    Magazine(int issueNumber, String itemId, String title, String author) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }
}
