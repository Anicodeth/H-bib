package com.example.bibleapp.data;

import com.example.bibleapp.books.Acts;
import com.example.bibleapp.books.Chronicles1;
import com.example.bibleapp.books.Colossians;
import com.example.bibleapp.books.Corinthians1;
import com.example.bibleapp.books.Corinthians2;
import com.example.bibleapp.books.Deuteronomy;
import com.example.bibleapp.books.Ephesians;
import com.example.bibleapp.books.Exodus;
import com.example.bibleapp.books.Galatians;
import com.example.bibleapp.books.Genesis;
import com.example.bibleapp.books.HEBREWS;
import com.example.bibleapp.books.JAMES;
import com.example.bibleapp.books.JOHN1st;
import com.example.bibleapp.books.JOHN2nd;
import com.example.bibleapp.books.JOHN3rd;
import com.example.bibleapp.books.JUDE;
import com.example.bibleapp.books.John;
import com.example.bibleapp.books.Joshua;
import com.example.bibleapp.books.Judges;
import com.example.bibleapp.books.Kings1;
import com.example.bibleapp.books.Kings2;
import com.example.bibleapp.books.Leviticus;
import com.example.bibleapp.books.Luke;
import com.example.bibleapp.books.MARK;
import com.example.bibleapp.books.MATTHEW;
import com.example.bibleapp.books.Numbers;
import com.example.bibleapp.books.PETER1st;
import com.example.bibleapp.books.PETER2nd;
import com.example.bibleapp.books.PHILEMON;
import com.example.bibleapp.books.Philippians;
import com.example.bibleapp.books.REVELATION;
import com.example.bibleapp.books.Romans;
import com.example.bibleapp.books.Ruth;
import com.example.bibleapp.books.Samuel1;
import com.example.bibleapp.books.Samuel2;
import com.example.bibleapp.books.THESSALONIANS2nd;
import com.example.bibleapp.books.TIMOTHY1st;
import com.example.bibleapp.books.TIMOTHY2nd;
import com.example.bibleapp.books.TITUS;
import com.example.bibleapp.books.Thessalonians;
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
        Genesis genesis = new Genesis();
        Exodus exodus = new Exodus();
        Leviticus leviticus = new Leviticus();
        Numbers numbers = new Numbers();
        Deuteronomy deuteronomy = new Deuteronomy();
        Joshua joshua = new Joshua();
        Judges judges = new Judges();
        Ruth ruth = new Ruth();
        Samuel1 samuel1 = new Samuel1();
        Samuel2 samuel2 = new Samuel2();
        Kings1 kings1 = new Kings1();
        Kings2 kings2 = new Kings2();
        Chronicles1 chronicles1 = new Chronicles1();



        oldTestamentBooks.add(genesis.getGenesisBook());
        oldTestamentBooks.add(exodus.getExodusBook());
        oldTestamentBooks.add(leviticus.getLeviticusBook());
        oldTestamentBooks.add(numbers.getLNumbersBook());
        oldTestamentBooks.add(deuteronomy.getDeuteronomyBook());
        oldTestamentBooks.add(joshua.getjoshuaBook());
        oldTestamentBooks.add(judges.getjudgesBook());
        oldTestamentBooks.add(ruth.getruthBook());
        oldTestamentBooks.add(samuel1.getsamuel1Book());
        oldTestamentBooks.add(samuel2.getsamuel1Book());
        oldTestamentBooks.add(kings1.getkings1Book());
        oldTestamentBooks.add(kings2.getkings2Book());
        oldTestamentBooks.add(chronicles1.getchronicles1Book());












        // Add more books as needed

        return new Bible(oldTestamentBooks);
    }

    private static Bible createNewTestament() {
        List<Book> newTestamentBooks = new ArrayList<>();
        MATTHEW matthew = new MATTHEW();
        MARK mark = new MARK();
        Luke luke = new Luke();
        John john = new John();
        Acts acts = new Acts();
        Romans romans = new Romans();
        Corinthians1 corinthians1 = new Corinthians1();
        Corinthians2 corinthians2 = new Corinthians2();
        Galatians galatians = new Galatians();
        Ephesians ephesians = new Ephesians();
        Philippians philippians = new Philippians();
        Colossians colossians = new Colossians();
        Thessalonians thessalonians = new Thessalonians();
        THESSALONIANS2nd thessalonians2nd = new THESSALONIANS2nd();
        TIMOTHY1st timothy1st = new TIMOTHY1st();
        TIMOTHY2nd timothy2nd = new TIMOTHY2nd();
        TITUS titus = new TITUS();
        PHILEMON philemon = new PHILEMON();
        HEBREWS hebrews = new HEBREWS();
        JAMES james = new JAMES();
        PETER1st peter1st = new PETER1st();
        PETER2nd peter2nd = new PETER2nd();
        JOHN1st john1st = new JOHN1st();
        JOHN2nd john2nd = new JOHN2nd();
        JOHN3rd john3rd = new JOHN3rd();
        JUDE jude = new JUDE();
        REVELATION revelation = new REVELATION();




        newTestamentBooks.add(matthew.getMATTHEWBook());
        newTestamentBooks.add(mark.getMARKBook());
        newTestamentBooks.add(luke.getLukeBook());
        newTestamentBooks.add(john.getJohnBook());
        newTestamentBooks.add(acts.getActsBook());
        newTestamentBooks.add(romans.getRomansBook());
        newTestamentBooks.add(corinthians1.getCorinthians1Book());
        newTestamentBooks.add(corinthians2.getCorinthians2Book());
        newTestamentBooks.add(galatians.getGalatiansBook());
        newTestamentBooks.add(ephesians.getEphesiansBook());
        newTestamentBooks.add(philippians.getPhilippiansBook());
        newTestamentBooks.add(colossians.getColossiansBook());
        newTestamentBooks.add(thessalonians.getThessaloniansBook());

        newTestamentBooks.add(thessalonians2nd.getTHESSALONIANS2ndBook());
        newTestamentBooks.add(timothy1st.getTIMOTHY1stBook());
        newTestamentBooks.add(timothy2nd.getTIMOTHY2ndBook());
        newTestamentBooks.add(titus.getTITUSBook());
        newTestamentBooks.add(philemon.getPHILEMONBook());
        newTestamentBooks.add(hebrews.getHEBREWSBook());
        newTestamentBooks.add(james.getJAMESBook());
        newTestamentBooks.add(peter1st.getPETER1stSBook());
        newTestamentBooks.add(peter2nd.getPETER2ndBook());
        newTestamentBooks.add(john1st.getJOHN1stBook());
        newTestamentBooks.add(john2nd.getJOHN2ndBook());
        newTestamentBooks.add(john3rd.getJOHN3rdBook());
        newTestamentBooks.add(jude.getJUDESBook());
        newTestamentBooks.add(revelation.getREVELATIONBook());

        return new Bible(newTestamentBooks);
    }
}
