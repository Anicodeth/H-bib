package com.example.bibleapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bibleapp.data.BibleRepository;
import com.example.bibleapp.models.Bible;
import com.example.bibleapp.models.Book;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get instances of the Old and New Testament from the repository
        BibleRepository BiblesRepository = new BibleRepository();
        Bible oldTestament = BiblesRepository.getOldTestament();
        Bible newTestament = BiblesRepository.getNewTestament();

        // Example: Print the names of books in the Old Testament
        printBookNames(oldTestament);

        // Example: Print the names of books in the New Testament
        printBookNames(newTestament);
    }

    private void printBookNames(Bible bible) {
        List<Book> books = bible.books;
        for (Book book : books) {
            Log.d("BookName", book.bookName);
        }
    }
}
