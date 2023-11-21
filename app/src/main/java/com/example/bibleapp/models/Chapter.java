package com.example.bibleapp.models;

import java.util.List;

public class Chapter {
    int chapterNumber;
    List<Verse> verses;

    public Chapter(int chapterNumber, List<Verse> verses) {
        this.chapterNumber = chapterNumber;
        this.verses = verses;
    }
}
