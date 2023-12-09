package com.example.bibleapp.books;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class JOHN2nd {
    private Book JOHN2ndBook;

    public JOHN2nd() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());

        JOHN2ndBook = new Book("2ኛ የዮሐንስ መልእክት", chapters);
    }

    public Book getJOHN2ndBook() {
        return JOHN2ndBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "በእኛ ስለሚኖርና ከእኛ ጋር ለዘላለም ስለሚሆን እውነት፥\n" +
                "2 እኔ ሽማግሌው በእውነት ለምወዳቸውና እኔ ብቻ ሳልሆን እውነትን የሚያውቁ ሁሉ ደግሞ ለሚወዱአቸው ለተመረጠች እመቤትና ለልጆችዋ፤\n" +
                "3 ከእግዚአብሔር አብና ከአብ ልጅ ከኢየሱስ ክርስቶስ ጸጋና ምሕረት ሰላምም በእውነትና በፍቅር ከእኛ ጋር ይሆናሉ።\n" +
                "4 ትእዛዝን ከአብ እንደ ተቀበልን ከልጆችሽ በእውነት የሚሄዱ አንዳንዶችን ስለ አገኘኋቸው እጅግ ደስ ብሎኛል።\n" +
                "5 አሁንም፥ እመቤት ሆይ፥ እርስ በርሳችን እንድንዋደድ እለምንሻለሁ፤ ይህች ከመጀመሪያ በእኛ ዘንድ የነበረች ትእዛዝ ናት እንጂ አዲስ ትእዛዝን እንደምጽፍልሽ አይደለም።\n" +
                "6 እንደ ትእዛዛቱም እንሄድ ዘንድ ይህ ፍቅር ነው፤ ከመጀመሪያ እንደ ሰማችሁ፥ በእርስዋ ትሄዱ ዘንድ ትእዛዙ ይህች ናት።\n" +
                "7 ብዙ አሳቾች ወደ ዓለም ገብተዋልና እነርሱም ኢየሱስ ክርስቶስ በሥጋ እንደ መጣ የማያምኑ ናቸው፤ ይህ አሳቹና የክርስቶስ ተቃዋሚው ነው።\n" +
                "8 ሙሉ ደመወዝን እንድትቀበሉ እንጂ የሠራችሁትን እንዳታጠፉ ለራሳችሁ ተጠንቀቁ።\n" +
                "9 ለሚወጣ ሁሉ በክርስቶስም ትምህርት ለማይኖር ሰው አምላክ የለውም፤ በክርስቶስ ትምህርት ለሚኖር አብና ወልድ አሉት።\n" +
                "10 ማንም ወደ እናንተ ቢመጣ ይህንም ትምህርት ባያመጣ በቤታችሁ አትቀበሉት ሰላምም አትበሉት፤\n" +
                "11 ሰላም የሚለው ሰው በክፉ ሥራው ይካፈላልና።\n" +
                "12 እንድጽፍላችሁ የምፈልገው ብዙ ነገር ሳለኝ በወረቀትና በቀለም ልጽፈው አልወድም፥ ዳሩ ግን ደስታችሁ ፍጹም እንዲሆን ወደ እናንተ ልመጣ አፍ ለአፍም ልናገራችሁ ተስፋ አደርጋለሁ።\n" +
                "13 የተመረጠችው የእኅትሽ ልጆች ሰላምታ ያቀርቡልሻል።" +
                "\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

}