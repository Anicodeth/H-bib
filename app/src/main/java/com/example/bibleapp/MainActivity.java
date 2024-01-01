package com.example.bibleapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bibleapp.data.BibleRepository;
import com.example.bibleapp.models.Bible;
import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout booksList;
    LinearLayout chapterList;

    TextView verseTitle;
    TextView verseContent;

    List<Verse> dailyVerses = new ArrayList<>();
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booksList = findViewById(R.id.booksList);
        verseTitle = findViewById(R.id.verseTitle);
        verseContent = findViewById(R.id.verseContent);

        dailyVerses.add(new Verse("3", "የዮሐንስ ወንጌል 3:16 |በእርሱ የሚያምን ሁሉ የዘላለም ሕይወት እንዲኖረው እንጂ እንዳይጠፋ እግዚአብሔር አንድያ ልጁን እስኪሰጥ ድረስ ዓለሙን እንዲሁ ወዶአልና።"));
        dailyVerses.add(new Verse("4", "የማቴዎስ ወንጌል 18:3 |እንዲህም አለ። እውነት እላችኋለሁ፥ ካልተመለሳችሁ እንደ ሕፃናትም ካልሆናችሁ፥ ወደ መንግሥተ ሰማያት ከቶ አትገቡም።\n"));
        dailyVerses.add(new Verse("5", "የዮሐንስ ወንጌል 3:36 |በልጁ የሚያምን የዘላለም ሕይወት አለው፤ በልጁ የማያምን ግን የእግዚአብሔር ቍጣ በእርሱ ላይ ይኖራል እንጂ ሕይወትን አያይም።"));
        dailyVerses.add(new Verse("6", "መጽሐፈ ነህምያ። 8:10 |እርሱም። ሂዱ፥ የሰባውንም ብሉ፥ ጣፋጩንም ጠጡ፥ ለእነዚያም ላልተዘጋጀላቸው እድል ፈንታቸውን ስደዱ፤ ዛሬ ለጌታችን የተቀደሰ ቀን ነው፤ የእግዚአብሔርም ደስታ ኃይላችሁ ነውና አትዘኑ አላቸው።"));
        dailyVerses.add(new Verse("7", "መጽሐፈ ምሳሌ 12:13,17 |የኅጥኣን ፈቃድ የክፉዎች ወጥመድ ናት፤ የጻድቃን ሥር ግን ፍሬን ያፈራል። እውነተኛን ነገር የሚናገር ቅን ነገርን ያወራል፤ የሐሰት ምስክር ግን ተንኰልን ያወራል።"));

        int randomNumber = random.nextInt(dailyVerses.size());

        verseTitle.setText((dailyVerses.get(randomNumber).verseContent).split("\\|")[0]);
        verseContent.setText((dailyVerses.get(randomNumber).verseContent).split("\\|")[1]);



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



     Button lastClickedButton;
    Button lastChapterButton;

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
                // Reset background color of the last clicked button
                if (lastClickedButton != null) {
                    lastClickedButton.getBackground().setColorFilter(null);
                }

                // Change background color to grayish
                button.getBackground().setColorFilter(Color.parseColor("#CCCCCC"), PorterDuff.Mode.MULTIPLY);

                // Set the current button as the last clicked button
                lastClickedButton = button;

                // Remove other views and create chapters buttons
                chapterList.removeAllViews();
                for (Chapter chapter : chapters) {
                    createChaptersButton(String.valueOf(chapter.chapterNumber), chapter.verses);
                }
            }
        });
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

             Button lastClickedButton;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button click
                    Intent toReadingPage =  new Intent(getApplicationContext(), ReadingPage.class);
                    //Intent toReadingPage =  new Intent(getApplicationContext(), WebPage.class);
                    toReadingPage.putExtra("book", 1);
                    toReadingPage.putExtra("chapter", 1);
                    button.getBackground().setColorFilter(Color.parseColor("#CCCCCC"), PorterDuff.Mode.MULTIPLY);
                    if (lastChapterButton != null) {
                        lastChapterButton.getBackground().setColorFilter(null);
                    }

                    // Change background color to grayish

                    // Set the current button as the last clicked button
                    lastChapterButton = button;
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


