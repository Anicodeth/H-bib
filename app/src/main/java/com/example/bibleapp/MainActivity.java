package com.example.bibleapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bibleapp.data.BibleRepository;
import com.example.bibleapp.models.Bible;
import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    LinearLayout booksList;
    LinearLayout chapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booksList = findViewById(R.id.booksList);

        BibleRepository BiblesRepository = new BibleRepository();
        Bible oldTestament = BiblesRepository.getOldTestament();
        Bible newTestament = BiblesRepository.getNewTestament();
        Button oldButton = findViewById(R.id.oldButton);
        Button newButton = findViewById(R.id.newButton);
        chapterList = findViewById(R.id.chaptersList);


        // Get instances of the Old and New Testament from the repository
        addBookNames(oldTestament);

        oldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                booksList.removeAllViews();
                chapterList.removeAllViews();
                addBookNames(oldTestament);
           }
        });
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                booksList.removeAllViews();
                chapterList.removeAllViews();

                addBookNames(newTestament);
            }
        });
    }

    private void addBookNames(Bible bible) {
        List<Book> books = bible.books;
        for (Book book : books) {
            createBooksButton(book.bookName, book.chapters);
        }
    }



    private void createBooksButton(String buttonText, List<Chapter> chapters) {
        // Create a new Button
        Button button = new Button(this);

        // Set layout parameters
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                (int) getResources().getDimension(R.dimen.button_height)
        );
        button.setLayoutParams(layoutParams);
        button.setBackgroundResource(R.drawable.button_border);


        // Set text
        button.setText(buttonText);

        // Add the button to your layout (e.g., a LinearLayout)
        LinearLayout linearLayout = findViewById(R.id.booksList);
        linearLayout.addView(button);

        // Set click listener if needed
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chapterList.removeAllViews();
                for( Chapter chapter : chapters){
                    createChaptersButton(String.valueOf(chapter.chapterNumber), chapter.verses);
                }
            }
          }
        );
    }
    private void createChaptersButton(String buttonText, List<Verse> verses) {
        // Create a new Button
        Button button = new Button(this);

        // Set layout parameters
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                (int) getResources().getDimension(R.dimen.button_height)
        );

        button.setLayoutParams(layoutParams);
        button.setBackgroundResource(R.drawable.button_border);

        // Set text
        button.setText(buttonText);

        // Add the button to your layout (e.g., a LinearLayout)
        chapterList.addView(button);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button click
                    Intent toReadingPage =  new Intent(getApplicationContext(), ReadingPage.class);
                    List<String> temp = new ArrayList<>();
                    for (Verse verse : verses) {
                        temp.add(verse.verseContent);
                    }

                    // Convert the List to an array
                    String[] verseArray = temp.toArray(new String[0]);

                    // Put the array into the Intent
                    toReadingPage.putExtra("Verses", verseArray);

                    // Start the new activity
                    startActivity(toReadingPage);

                    //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                }
            });
        }
    }


