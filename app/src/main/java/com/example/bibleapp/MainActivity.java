package com.example.bibleapp;

import android.annotation.SuppressLint;
import android.content.Intent;
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

        dailyVerses.add(new Verse("3", "ዮሐንስ 3:16 |ስለዚህ እምነትና ፍቅር የምንሆን ነው፣ ወደ ዓለም ልጆች እንደአብራም እና እንደማይንቀሳቀስ እንዲሆን ያደርጋል።"));
        dailyVerses.add(new Verse("4", "ነቢዩ 3:5-6 |ወጥታ እንቀመጣለን በአንደኛው ምልክት፣ ከአንደኛው አንደኛው ማሰሮ እንደአንደኛው ምልክት አልቀረም። ከዚህ በኋላ በአንደኛው እንዲሆን ወደፊት እንደ አንደኛው ምልክት ተመን ይሆናል።"));
        dailyVerses.add(new Verse("5", "ማቴዎስ 28:19-20 |ወደ መንፈስ እንድ እምነት በአንደኛው እንደ አንደኛው ወጥተን፣ እንቀል፣ እንቀመጣለን፤ ከመንፈሴ ከለን ይሁን፤ የአንደኛውም ይሁን ለማድረግም አትፍሩ እንጂ ከመንፈሴ እንዳንደን ስለ ሆነ ሁሉም በአንደኛው ተመን እንደአንደኛው የሚያደርገን ሁሉ ነው።"));
        dailyVerses.add(new Verse("6", "ፊሊጰፕይንስ 4:6-7 |ለእኛ ስንዴ አልቆምም፤ ከአንደኛውም የሰው ተስፋ የሚያደርግን ነገር አንበሳ። ስለዚህ እኛ ለመግባት ከመንፈሴ ስለ ሆነ ከአንደኛው እንደ ሆነ የአንደኛው የሚቀመጠው የአምላክ እስከ ሰማይ ድረስ መንገድ ሁሉ ነው።"));
        dailyVerses.add(new Verse("7", "አይሳነን 41:10 |እንደአንደኛው እንዲንቀጠቀጥ፣ አረንጓዴን እንዲወስድ እና በምሕረቱ ውስጥ እንዲሆን ወደ ዛሬም አንዲሆን በእኛ አንበሳ።"));
        dailyVerses.add(new Verse("8", "ሮሜ 8:28 |እኛ ለአምላክ የሚያደርገን ስለሚቀመጡ ስለዚህ የምንዛሬ ምንሆን እና በመረጡ ታሪኩ አሉ።"));
        dailyVerses.add(new Verse("9", "ኤፊሻዊው 2:8-9 |እኛ እናንተ፣ በግምት ስለሚያደርግ እና ይህ አንደኛው እምነት ያለን ሰው ያለ ለአንደኛው ድንበር እናስተንተን ይሰጣል።"));
        dailyVerses.add(new Verse("10", "ኮሎምቢያዊ 3:23 |የእኛ አባት እና ምነው በምእራፍ እና እንደ መንገድ ይሆናሉ።"));
        dailyVerses.add(new Verse("11", "ዘጸዋዕት 29:11 |እኔ ወደ አንደኛው አውጥቻለሁ፣ ስለዚህ የዚህ አንደኛው ምን እንደዚህ እንደሆን አድርገን ስለነው።"));
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
                    //Intent toReadingPage =  new Intent(getApplicationContext(), WebPage.class);
                    toReadingPage.putExtra("book", 1);
                    toReadingPage.putExtra("chapter", 1);

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


