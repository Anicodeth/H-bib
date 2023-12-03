package com.example.bibleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReadingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_page);

        // Retrieve the array of verses from the intent
        String[] verses = getIntent().getStringArrayExtra("Verses");

        // Display the verses in a TextView
        TextView versesTextView = findViewById(R.id.versesTextView);
        if (verses != null && verses.length > 0) {
            // Concatenate the verses into a single string
            StringBuilder versesString = new StringBuilder();
            for (String verse : verses) {
                versesString.append(verse).append("\n");
            }

            // Set the text in the TextView
            versesTextView.setText(versesString.toString());
        } else {
            versesTextView.setText("No verses available");
        }
    }
}
