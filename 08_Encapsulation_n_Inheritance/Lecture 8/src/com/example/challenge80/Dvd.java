package com.example.challenge80;

public class Dvd extends LibraryItem{
    public int duration; // in minutes

    Dvd(int duration, String itemId, String title, String author){
        super(itemId, title, author);
        this.duration = duration;
    }
}
