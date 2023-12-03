package com.example.bibleapp.models;

import java.util.List;

public class Book {
    public String bookName;
    public List<Chapter> chapters;

    public Book(String bookName, List<Chapter> chapters) {
        this.bookName = bookName;
        this.chapters = chapters;
    }
}
