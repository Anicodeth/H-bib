package com.example.bibleapp.data;

import com.example.bibleapp.models.Bible;
import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class BibleRepository {
    private static Bible oldTestament;
    private static Bible newTestament;

    static {
        oldTestament = createOldTestament();
        newTestament = createNewTestament();
    }

    public static Bible getOldTestament() {
        return oldTestament;
    }

    public static Bible getNewTestament() {
        return newTestament;
    }

    private static Bible createOldTestament() {
        List<Book> oldTestamentBooks = new ArrayList<>();

        // Add books, chapters, and verses for the Old Testament as needed
        // For example:
        List<Chapter> genesisChapters = new ArrayList<>();
        List<Verse> genesisVerses = new ArrayList<>();
        genesisVerses.add(new Verse("1", "In the beginning, God created the heavens and the earth."));
        genesisChapters.add(new Chapter(1, genesisVerses));

        Book genesisBook = new Book("Genesis", genesisChapters);
        oldTestamentBooks.add(genesisBook);

        // Add more books as needed

        return new Bible(oldTestamentBooks);
    }

    private static Bible createNewTestament() {
        List<Book> newTestamentBooks = new ArrayList<>();

        // Add books, chapters, and verses for the New Testament as needed
        // For example:
        List<Chapter> matthewChapters = new ArrayList<>();
        List<Verse> matthewVerses = new ArrayList<>();
        matthewVerses.add(new Verse("1", "The book of the genealogy of Jesus Christ, the son of David..."));
        matthewChapters.add(new Chapter(1, matthewVerses));

        Book matthewBook = new Book("Matthew", matthewChapters);
        newTestamentBooks.add(matthewBook);

        // Add more books as needed

        return new Bible(newTestamentBooks);
    }
}
