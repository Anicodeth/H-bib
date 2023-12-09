package com.example.bibleapp.books;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class JOHN3rd {
    private Book JOHN3rdBook;

    public JOHN3rd() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());

        JOHN3rdBook = new Book("3ኛ የዮሐንስ መልእክት", chapters);
    }

    public Book getJOHN3rdBook() {
        return JOHN3rdBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "ሽማግሌው በእውነት እኔ ለምወደው ለተወደደው ለጋይዮስ።\n" +
                "2 ወዳጅ ሆይ፥ ነፍስህ እንደሚከናወን፥ በነገር ሁሉ እንዲከናወንልህና ጤና እንዲኖርህ እጸልያለሁ።\n" +
                "3 ወንድሞች መጥተው አንተ በእውነት እንደምትሄድ ስለ እውነትህ ሲመሰክሩ እጅግ ደስ ብሎኛልና።\n" +
                "4 ልጆቼ በእውነት እንዲሄዱ ከመስማት ይልቅ የሚበልጥ ደስታ የለኝም።\n" +
                "5 ወዳጅ ሆይ፥ ምንም እንግዶች ቢሆኑ፥ ለወንድሞች በምታደርገው ሁሉ የታመነ ሥራ ትሠራለህ፥ እነርሱም በማኅበር ፊት ስለ ፍቅርህ መስክረዋል፤\n" +
                "6 ለእግዚአብሔር እንደሚገባ አድርገህ በጉዞአቸው ብትረዳ መልካም ታደርጋለህ፤\n" +
                "7 ከአሕዛብ አንዳች ሳይቀበሉ ስለ ስሙ ወጥተዋልና።\n" +
                "8 እንግዲህ ከእውነት ጋር አብረን እንድንሠራ እኛ እንዲህ ያሉትን በእንግድነት ልንቀበል ይገባናል።\n" +
                "9 ወደ ቤተ ክርስቲያን ጻፍሁ፤ ዳሩ ግን ዋናቸው ሊሆን የሚወድ ዲዮጥራጢስ አይቀበለንም።\n" +
                "10 ስለዚህ፥ እኔ ብመጣ፥ በእኛ ላይ በክፉ ቃል እየለፈለፈ የሚያደርገውን ሥራውን አሳስባለሁ፤ ይህም ሳይበቃው እርሱ ራሱ ወንድሞችን አይቀበልም፥ ሊቀበሉአቸውም የሚወዱትን ከልክሎ ከቤተ ክርስቲያን ያወጣቸዋል።\n" +
                "11 ወዳጅ ሆይ፥ በጎ የሆነውን እንጂ ክፉን አትምሰል። በጎ የሚያደርግ ከእግዚአብሔር ነው፤ ክፉን የሚያደርግ ግን እግዚአብሔርን አላየውም።\n" +
                "12 ለድሜጥሮስ ሁሉ ይመሰክሩለታል፥ እውነት ራስዋም ትመሰክርለታለች፤ እኛም ደግሞ እንመሰክርለታለን፥ ምስክርነታችንም እውነት እንደ ሆነ ታውቃላችሁ።\n" +
                "13 ልጽፍልህ የምፈልገው ብዙ ነገር ነበረኝ፥ ዳሩ ግን በቀለምና በብርዕ ልጽፍልህ አልወድም፤\n" +
                "14 ነገር ግን ወዲያው ላይህ ተስፋ አደርጋለሁ፥ አፍ ለአፍም እንነጋገራለን።\n" +
                "[15] ሰላም ለአንተ ይሁን። ወዳጆች ሰላምታ ያቀርቡልሃል። ወዳጆችን በየስማቸው እየጠራህ ሰላምታ አቅርብልኝ።" +
                "\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

}