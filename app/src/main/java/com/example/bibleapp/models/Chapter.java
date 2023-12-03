package com.example.bibleapp.models;

import java.util.List;

public class Chapter {
    public int chapterNumber;
    public List<Verse> verses;

    public Chapter(int chapterNumber, List<Verse> verses) {
        this.chapterNumber = chapterNumber;
        this.verses = verses;
    }
}
