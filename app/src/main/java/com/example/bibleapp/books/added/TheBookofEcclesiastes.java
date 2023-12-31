package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class TheBookofEcclesiastes {
    private Book TheBookofEcclesiastes;

    public TheBookofEcclesiastes () {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
        chapters.add(chapterFour());
        chapters.add(chapterFive());
        chapters.add(chapterSix());
        chapters.add(chapterSeven());
        chapters.add(chapterEight());
        chapters.add(chapterNine());
        chapters.add(chapterTen());
        chapters.add(chapterEleven());
        chapters.add(chapterTwelve());


        // Add more chapters as needed

        TheBookofEcclesiastes  = new Book("መጽሐፈ  መክብብ።", chapters);
    }

    public Book getTheBookofEcclesiastes() {
        return TheBookofEcclesiastes;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ በኢየሩሳሌም የነገሠ የሰባኪው የዳዊት ልጅ ቃል።\n" +
                "2 ፤ ሰባኪው። ከንቱ፥ ከንቱ፥ የከንቱ ከንቱ ሁሉ ከንቱ ነው ይላል።\n" +
                "3 ፤ ከፀሐይ በታች በሚደክምበት ድካም ሁሉ የሰው ትርፉ ምንድር ነው?\n" +
                "4 ፤ ትውልድ ይሄዳል፥ ትውልድም ይመጣል፤ ምድር ግን ለዘላለም ነው።\n" +
                "5 ፤ ፀሐይ ትወጣለች፥ ፀሐይም ትገባለች፥ ወደምትወጣበትም ስፍራ ትቸኵላለች።\n" +
                "6 ፤ ነፋስ ወደ ደቡብ ይሄዳል፥ ወደ ሰሜንም ይዞራል፤ ዘወትር በዙረቱ ይዞራል፥ ነፋስም በዙረቱ ደግሞ ይመለሳል።\n" +
                "7 ፤ ፈሳሾች ሁሉ ወደ ባሕር ይሄዳሉ፥ ባሕሩ ግን አይሞላም፤ ፈሳሾች ወደሚሄዱበት ስፍራ እንደ ገና ወደዚያ ይመለሳሉ።\n" +
                "8 ፤ ነገር ሁሉ ያደክማል ሰው ይናገረው ዘንድ አይችልም፤ ዓይን ከማየት አይጠግብም፥ ጆሮም ከመስማት አይሞላም።\n" +
                "9 ፤ የሆነው ነገር እርሱ የሚሆን ነው፥ የተደረገውም ነገር እርሱ የሚደረግ ነው፤ ከፀሐይም በታች አዲስ ነገር የለም።\n" +
                "10 ፤ ማንም። እነሆ፥ ይህ ነገር አዲስ ነው ይል ዘንድ ይችላልን? እርሱ ከእኛ በፊት በነበሩት ዘመናት ተደርጎአል።\n" +
                "11 ፤ ለፊተኞቹ ነገሮች መታሰቢያ የላቸውም፤ ከኋለኞቹም ነገሮች ከእነርሱ በኋላ በሚነሡት ሰዎች ዘንድ መታሰቢያ አይገኝላቸውም።\n" +
                "12 ፤ እኔ ሰባኪው በእስራኤል ላይ በኢየሩሳሌም ንጉሥ ነበርሁ።\n" +
                "13 ፤ ከሰማይም በታች የተደረገውን ሁሉ በጥበብ እፈልግና እመረምር ዘንድ ልቤን አተጋሁ፤ እግዚአብሔር ይደክሙባት ዘንድ ይህችን ለሰው ልጆች የሰጠ ክፉ ጥረት ናት።\n" +
                "14 ፤ ከፀሐይ በታች የተሠራውን ሥራ ሁሉ አየሁ፤ እነሆም፥ ሁሉ ከንቱ ነው፥ ነፋስንም እንደ መከተል ነው።\n" +
                "15 ፤ ጠማማ ይቀና ዘንድ አይችልም፤ ጐደሎም ይቈጠር ዘንድ አይችልም።\n" +
                "16 ፤ እኔ በልቤ። እነሆ፥ ከእኔ አስቀድመው በኢየሩሳሌም ላይ ከነበሩት ሁሉ ይልቅ ጥበብን አብዝቼ ጨመርሁ፤ ልቤም ብዙ ጥበብንና እውቀትን ተመለከተ ብዬ ተናገርሁ።\n" +
                "17 ፤ ጥበብንና ዕብደትን ሞኝነትንም አውቅ ዘንድ ልቤን ሰጠሁ፤ ይህም ደግሞ ነፋስን እንደ መከተል እንደ ሆነ አስተዋልሁ።\n" +
                "18 ፤ በጥበብ መብዛት ትካዜ ይበዛልና፤ እውቀትንም የሚጨምር ኀዘንን ይጨምራልና።\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ እኔ በልቤ። ና በደስታም እፈትንሃለሁ፥ መልካምንም ቅመስ አልሁ፤ ይህም ደግሞ እነሆ ከንቱ ነበረ።\n" +
                "2 ፤ ሳቅን። ዕብድ ነህ፤ ደስታንም። ምን ታደርጋለህ? አልሁት።\n" +
                "3 ፤ የሰው ልጆች በሕይወታቸው ዘመን ሁሉ ከፀሐይ በታች ሊሠሩት መልካም ነገር ምን እንደ ሆነ እስካይ ድረስ ልቤ በጥበብ እየመራኝ፥ ሰውነቴን በወይን ጠጅ ደስ ለማሰኘት ስንፍናንም ለመያዝ በልቤ መረመርሁ።\n" +
                "4 ፤ ትልቅ ሥራን ሠራሁ፥ ቤቶችንም አደረግሁ፥ ወይንም ተከልሁ፤\n" +
                "5 ፤ አትክልትንና ገነትን አደረግሁ፥ ልዩ ልዩ ፍሬ ያለባቸውንም ዛፎች ተከልሁባቸው፤\n" +
                "6 ፤ በዱር የተተከሉትን ዛፎች አጠጣበት ዘንድ የውኃ ማጠራቀሚያ አደረግሁ።\n" +
                "7 ፤ ወንዶችንና ሴቶችን ባሪያዎች ገዛሁ፥ የቤት ውልድ ባሪያዎችም ነበሩኝ፤ ከእኔ አስቀድመው በኢየሩሳሌም ከነበሩት ሁሉ ይልቅ ብዙ ከብቶችና መንጋዎች ነበሩኝ።\n" +
                "8 ፤ ብርንና ወርቅን የከበረውንም የነገሥታትና የአውራጆችን መዝገብ ሰበሰብሁ፤ አዝማሪዎችንና አርሆዎችን የሰዎች ልጆችንም ተድላ እጅግ የበዙ ሴቶችንም አከማቸሁ።\n" +
                "9 ፤ ታላቅም ሆንሁ፥ ከእኔም አስቀድመው በኢየሩሳሌም ከነበሩት ሁሉ ይልቅ ከበርሁ፤ ደግምም ጥበቤ ከእኔ ጋር ጸንታ ቀረች።\n" +
                "10 ፤ ዓይኖቼንም ከፈለጉት ሁሉ አልከለከልኋቸውም፤ ልቤም በድካሜ ሁሉ ደስ ይለው ነበርና ልቤን ከደስታ ሁሉ አላራቅሁትም ከድካሜም ሁሉ ይህ እድል ፈንታዬ ሆነ።\n" +
                "11 ፤ እጄ የሠራቻችን ሥራዬን ሁሉ የደከምሁበትንም ድካሜን ሁሉ ተመለከትሁ፤ እነሆ፥ ሁሉ ከንቱ ነፋስንም እንደ መከተል ነበር፥ ከፀሐይ በታችም ትርፍ አልነበረም።\n" +
                "12 ፤ እኔም ጥበብን ዕብደትንና ስንፍናን አይ ዘንድ ተመለከትሁ፤ በፊት ከተደረገው በቀር፥ ከንጉሥ በኋላ የሚመጣው ሰው ምን ያደርጋል?\n" +
                "13 ፤ እኔም ብርሃን ከጨለማ እንደሚበልጥ እንዲሁ ጥበብ ከስንፍና እንዲበልጥ አየሁ።\n" +
                "14 ፤ የጠቢብ ዓይኖች በራሱ ላይ ናቸው፥ ሰነፍ ግን በጨለማ ይሄዳል፤ ደግሞ ለሁለቱ መጨረሻቸው አንድ እንደ ሆነ አስተዋልሁ።\n" +
                "15 ፤ እኔም በልቤ። ለሰነፍ የሚደርሰው ለእኔም ይደርሳል፤ ለምን እጅግ ጠቢብ ሆንሁ? አልሁ። የዚያን ጊዜም በልቤ። ይህ ደግሞ ከንቱ ነው አልሁ።\n" +
                "16 ፤ በሚመጣው ዘመን ነገር ሁሉ የተረሳ ይሆናልና ለዘላለም የሚሆን የጠቢብና የሰነፍ መታሰቢያ አይገኝም። አዬ ጉድ! ጠቢብ ከሰነፍ ጋር እንዴት ይሞታል!\n" +
                "17 ፤ ከፀሐይም በታች የተሠራው ሥራ ሁሉ ከብዶብኛልና ሕይወትን ጠላሁ፤ ሁሉም ከንቱ ነፋስንም እንደ መከተል ነው።\n" +
                "18 ፤ ከእኔ በኋላ ለሚመጣው ሰው እተወዋለሁና ከፀሐይ በታች የደከምሁበትን ሁሉ ጠላሁት።\n" +
                "19 ፤ ጠቢብ ወይም ሰነፍ እንዲሆን የሚያውቅ ሰው ማን ነው? ከፀሐይ በታች በደከምሁበትና ጠቢብ በሆንሁበት በድካሜ ሁሉ ላይ ጌታ ይሆንበታል፤ ይህም ደግሞ ከንቱ ነው።\n" +
                "20 ፤ እኔም ተመልሼ ልቤን ከፀሐይ በታች በደከምሁበት ድካም ሁሉ ተስፋ አስቈረጥሁት።\n" +
                "21 ፤ ሰው በጥበብና በእውቀት በብልሃትም ከደከመ በኋላ ለሌላ ላልደከመበት ሰው ያወርሰዋልና፤ ይህም ደግሞ ከንቱ ትልቅም መከራ ነው።\n" +
                "22 ፤ ከፀሐይ በታች በደከመበት ድካም ሁሉና በልቡ አሳብ የሰው ጥቅም ምንድር ነው?\n" +
                "23 ፤ ዘመኑ ሁሉ ኀዘን፥ ጥረትም ትካዜ ነው፤ ልቡም በሌሊት አይተኛም፤ ይህም ደግሞ ከንቱ ነው።\n" +
                "24 ፤ ለሰው ከሚበላና ከሚጠጣ በድካሙም ደስ ከሚለው በቀር የሚሻለው ነገር የለም፤ ይህም ደግሞ ከእግዚአብሔር እጅ እንደ ተሰጠ አየሁ።\n" +
                "25 ፤ ያለ እርሱ ፈቃድ የበላ ደስ ብሎትም ተድላን የቀመሰ ማን ነው?\n" +
                "26 ፤ እርሱም ደስ ለሚያሰኘው ሰው ጥበብንና እውቀትን ደስታንም ይሰጠዋል፤ ለኃጢአተኛ ግን እግዚአብሔርን ደስ ለሚያሰኘው ሰው ይሰጥ ዘንድ እንዲሰበስብና እንዲያከማች ጥረትን ይሰጠዋል። ይህም ደግሞ ከንቱ ነፋስንም እንደ መከተል ነው።\n" ));
        // Add more verses as needed
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "1 ፤ ለሁሉ ዘመን አለው፥ ከሰማይ በታችም ለሆነ ነገር ሁሉ ጊዜ አለው።\n" +
                "2 ፤ ለመወለድ ጊዜ አለው፥ ለመሞትም ጊዜ አለው፤ ለመትከል ጊዜ አለው፥ የተተከለውንም ለመንቀል ጊዜ አለው፤\n" +
                "3 ፤ ለመግደል ጊዜ አለው፥ ለመፈወስም ጊዜ አለው፤ ለማፍረስ ጊዜ አለው፥ ለመሥራትም ጊዜ አለው፤\n" +
                "4 ፤ ለማልቀስ ጊዜ አለው፥ ለመሳቅም ጊዜ አለው፤ ዋይ ለማለት ጊዜ አለው፥ ለመዝፈንም ጊዜ አለው፤\n" +
                "5 ፤ ድንጋይን ለመጣል ጊዜ አለው፥ ድንጋይንም ለመሰብሰብ ጊዜ አለው፤ ለመተቃቀፍ ጊዜ አለው፥ ከመተቃቀፍም ለመራቅ ጊዜ አለው፤\n" +
                "6 ፤ ለመፈለግ ጊዜ አለው፥ ለማጥፋትም ጊዜ አለው፤ ለመጠበቅ ጊዜ አለው፥ ለመጣልም ጊዜ አለው፤\n" +
                "7 ፤ ለመቅደድ ጊዜ አለው፥ ለመስፋትም ጊዜ አለው፤ ዝም ለማለት ጊዜ አለው፥ ለመናገርም ጊዜ አለው፤\n" +
                "8 ፤ ለመውደድ ጊዜ አለው፥ ለመጥላትም ጊዜ አለው፤ ለጦርነት ጊዜ አለው፥ ለሰላምም ጊዜ አለው።\n" +
                "9 ፤ ለሠራተኛ የድካሙ ትርፍ ምንድር ነው?\n" +
                "10 ፤ እግዚአብሔር ለሰው ልጆች ይደክሙበት ዘንድ የሰጣቸውን ጥረት አይቻለሁ።\n" +
                "11 ፤ ነገርን ሁሉ በጊዜው ውብ አድርጎ ሠራው፤ እግዚአብሔርም ከጥንት ጀምሮ እስከ ፍጻሜ ድረስ የሠራውን ሥራ ሰው መርምሮ እንዳያገኝ ዘላለምነትን በልቡ ሰጠው።\n" +
                "12 ፤ ሰው ደስ ከሚለውና በሕይወቱ ሳለ መልካምን ነገር ከሚያደርግ በቀር መልካም ነገር እንደሌለ አወቅሁ።\n" +
                "13 ፤ ደግሞም ሰው ሁሉ ይበላና ይጠጣ ዘንድ በድካሙም ሁሉ ደስ ይለው ዘንድ የእግዚአብሔር ስጦታ ነው።\n" +
                "14 ፤ እግዚአብሔር ያደረገው ሁሉ ለዘላለም እንዲኖር አወቅሁ፤ ሊጨመርበት ወይም ከእርሱ ሊጐድል አይቻልም፤ እግዚአብሔርም በፊቱ ይፈሩ ዘንድ አደረገ።\n" +
                "15 ፤ አሁን ያለው በፊት ነበረ፥ የሚሆነውም በፊት ሆኖ ነበር፤ እግዚአብሔርም ያለፈውን መልሶ ይሻዋል።\n" +
                "16 ፤ ደግሞም ከፀሐይ በታች በፍርድ ስፍራ ኃጢአት፥ በጽድቅም ስፍራ ኃጢአት እንዳለ አየሁ።\n" +
                "17 ፤ እኔም በልቤ። በዚያ ለነገር ሁሉና ለሥራ ሁሉ ጊዜ አለውና በጻድቅና በኃጢአተኛ ላይ እግዚአብሔር ይፈርዳል አልሁ።\n" +
                "18 ፤ እኔ በልቤ ስለ ሰው ልጆች። እንደ እንስሳ መሆናቸውን እንዲያዩ እግዚአብሔር ይፈትናቸዋል አልሁ።\n" +
                "19 ፤ የሰው ልጆችና የእንስሳ እድል ፈንታ አንድ ነው፤ ድርሻቸውም ትክክል ነው፤ አንዱ እንደሚሞት ሌላውም እንዲሁ ይሞታል፤ የሁሉም እስትንፋስ አንድ ነው፤ ሁሉም ከንቱ ነውና ሰው ከእንስሳ ብልጫ የለውም።\n" +
                "20 ፤ ሁሉ ወደ አንድ ቦታ ይሄዳል፤ ሁሉ ከአፈር ነው ሁሉም ወደ አፈር ይመለሳል።\n" +
                "21 ፤ የሰው ልጆች ነፍስ ወደ ላይ እንደምትወጣ የእንስሳም ነፍስ ወደ ታች ወደ ምድር እንደምትወርድ የሚያውቅ ማን ነው?\n" +
                "22 ፤ ያም እድል ፈንታው ነውና ሰው በሥራው ደስ ከሚለው በቀር ሌላ መልካም ነገር እንደሌለው አየሁ፤ ከእርሱ በኋላስ የሚሆነውን ያይ ዘንድ የሚያመጣው ማን ነው?\n"));
        // Add more verses as needed
        return new Chapter(3, verses);
    }

    private Chapter chapterFour() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ እኔም ተመለስሁ፥ ከፀሐይ በታችም የሚደረገውን ግፍ ሁሉ አየሁ፤ እነሆም፥ የተገፉት ሰዎች እንባ ነበረ፤ የሚያጽናናቸውም አልነበረም፤ በሚገፉአቸውም እጅ ኃይል ነበረ፥ እነርሱን ግን የሚያጽናናቸው አልነበረም።\n" +
                "2 ፤ እኔም እስከ ዛሬ በሕይወት ካሉት ይልቅ በቀድሞ ዘመን የሞቱትን አመሰገንሁ፤\n" +
                "3 ፤ ከእነዚህም ከሁለቱ ይልቅ ገና ያልተወለደው ከፀሐይም በታች የሚደረገውን ግፍ ያላየው ይሻላል።\n" +
                "4 ፤ ደግሞም የሰውን ድካምና የብልሃት ሥራውን ሁሉ ተመለከትሁ፥ በባልንጀራውም ዘንድ ቅንዓት እንዲያስነሣ አየሁ፤ ይህም ደግሞ ከንቱ ነፋስንም እንደ መከተል ነው።\n" +
                "5 ፤ ሰነፍ እጆቹን ኮርትሞ ይቀመጣል፤ የገዛ ሥጋውንም ይበላል።\n" +
                "6 ፤ በድካምና ነፋስን በመከተል ከሁለት እጅ ሙሉ ይልቅ አንድ እጅ ሙሉ በዕረፍት ይሻላል።\n" +
                "7 ፤ እኔም ተመለስሁ፥ ከፀሐይ በታችም ከንቱን ነገር አየሁ።\n" +
                "8 ፤ አንድ ሰው ብቻውን አለ፥ ሁለተኛም የለውም ልጅም ሆነ ወንድም የለውም፤ ለድካሙ ግን መጨረሻ የለውም፥ ዓይኖቹም ከባለጠግነት አይጠግቡም። ለማን እደክማለሁ፥ ሰውነቴንስ መልካሙን ነገር ለምን እነፍጋታለሁ? ይላል። ይህም ደግሞ ከንቱ ነገር ክፉም ጥረት ነው።\n" +
                "9 ፤ ድካማቸው መልካም ዋጋ አለውና አንድ ብቻ ከመሆን ሁለት መሆን ይሻላል።\n" +
                "10 ፤ ቢወድቁ አንዱ ሁለተኛውን ያነሣዋልና፤ አንዱ ብቻውን ሆኖ በወደቀ ጊዜ ግን የሚያነሣው ሁለተኛ የለውምና ወዮለት።\n" +
                "11 ፤ ሁለቱም በአንድነት ቢተኙ ይሞቃቸዋል፤ አንድ ብቻውን ግን እንዴት ይሞቀዋል?\n" +
                "12 ፤ አንዱም አንዱን ቢያሸንፍ ሁለቱ በፊቱ ይቆማሉ፤ በሦስትም የተገመደ ገመድ ፈጥኖ አይበጠስም።\n" +
                "13 ፤ ድሀና ጠቢብ ብላቴና ተግሣጽን መቀበል ከእንግዲህ ወዲህ ከማያውቅ ከሰነፍ ሽማግሌ ንጉሥ ይሻላል።\n" +
                "14 ፤ ምንም በመንግሥቱ አገር ደግሞ ችግረኛ ሆኖ ቢወለድ፥ ከግዞቱ ቤት ወደ መንግሥት ወጥቶአልና።\n" +
                "15 ፤ ከፀሐይ በታች የሚሄዱትን ሕያዋን ሁሉ በእርሱ ፋንታ ከሚነሣው ከሌላው ጎበዝ ጋር ሆነው አየሁ።\n" +
                "16 ፤ ከእርሱ በፊት የተገዙለት ሕዝብ ሁሉ አይቈጠሩም፤ በኋላ የሚመጡት ግን በእርሱ ደስ አይላቸውም። ይህም ደግሞ ከንቱ ነፋስንም እንደ መከተል ነው።\n"));
        // Add more verses as needed
        return new Chapter(4, verses);
    }
    private Chapter chapterFive() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ ወደ እግዚአብሔር ቤት በገባህ ጊዜ እግርህን ጠብቅ፤ ለመስማት መቅረብ ከሰነፎች መሥዋዕት ይበልጣልና፤ እነርሱም ክፉ እንዲያደርጉ አያውቁምና።\n" +
                "2 ፤ እግዚአብሔር በሰማይ፥ አንተም በምድር ነህና በአፍህ አትፍጠን፥ በእግዚአብሔርም ፊት ቃልን ይናገር ዘንድ ልብህ አይቸኵል፤ ስለዚህም ቃልህ ጥቂት ትሁን።\n" +
                "3 ፤ ሕልም በሥራ ብዛት ይታያል፤ እንዲሁም የሰነፍ ድምፅ በቃሉ ብዛት ይሰማል።\n" +
                "4 ፤ ሰነፎች ደስ አያሰኙትምና ለእግዚአብሔር ስእለት በተሳልህ ጊዜ ትፈጽመው ዘንድ አትዘግይ፤ የተሳልኸውን ፈጽመው።\n" +
                "5 ፤ ተስለህ የማትፈጽም ብትሆን ባትሳል ይሻላል።\n" +
                "6 ፤ ሥጋህን በኃጢአት እንዳያስተው ለአፍህ አርነት አትስጥ፥ በመልአክም ፊት። ስሕተት ነበረ አትበል፤ እግዚአብሔር በቃልህ ይቈጣ ዘንድ የእጅህንም ሥራ ያጠፋ ዘንድ ስለምን ትሻለህ?\n" +
                "7 ፤ ብዙ ሕልም ባለበት ዘንድ፥ እንዲሁም ደግሞ ብዙ ቃል ባለበት ስፍራ በዚያ ብዙ ከንቱ ነገር አለ፤ አንተ ግን እግዚአብሔርን ፍራ።\n" +
                "8 ፤ ከፍ ካለው በላይ ከፍ ያለ ይመለከታልና፥ ከእነርሱም በላይ ደግሞ ሌሎች ከፍ ይላሉና በአገሩ ድሆች ሲገፉ፥ ፍርድና ጽድቅም ሲነጠቅ ባየህ ጊዜ በዚህ ነገር አታድንቅ።\n" +
                "9 ፤ በጠቅላላው ግን የአገሩ ጥቅም እርሻን የሚወድድ ንጉሥ ቢኖር ነው።\n" +
                "10 ፤ ብርን የሚወድድ ሰው ብርን አይጠግብም፤ ባለጠግነትንም የሚወድድ ትርፉን አይጠግብም፤ ይህም ደግሞ ከንቱ ነው።\n" +
                "11 ፤ ሀብት ሲበዛ የሚበሉት ይበዛሉ፤ ሀብቱን በዓይኑ ብቻ ከማየት በቀር ለባለቤቱ ምን ይጠቅመዋል?\n" +
                "12 ፤ እጅግ ወይም ጥቂት ቢበላ የሠራተኛ እንቅልፍ ጣፋጭ ነው የባለጠጋ ጥጋብ ግን እንቅልፍን ይከለክለዋል።\n" +
                "13 ፤ ከፀሐይ በታች የሚያሳዝን ክፉ ነገር አየሁ፤ ለመከራው በባለቤቱ ዘንድ የተቈጠበች ባለጠግነት ናት።\n" +
                "14 ፤ ያችም ባለጠግነት በክፉ ነገር ትጠፋለች፤ ልጅንም ቢወልድ በእጁ ምንም የለውም።\n" +
                "15 ፤ ከእናቱ ሆድ ራቁቱን እንደ ወጣ እንዲሁ እንደ መጣው ይመለሳል፤ ከጥረቱም በእጁ ሊወስድ የሚችለውን ምንም አያገኝም።\n" +
                "16 ፤ ይህም ደግሞ የሚያሳዝን ክፉ ነገር ነው፤ እንደ መጣ እንዲሁ ይሄዳል፤ ድካሙም ለነፋስ ከሆነ ጥቅሙ ምንድር ነው?\n" +
                "17 ፤ ዘመኑን ሁሉ በጨለማ በኀዘን በብስጭት በደዌና በቍጣ ነው።\n" +
                "18 ፤ እነሆ፥ እኔ ያየሁት መልካምና የተዋበ ነገር ሰው እግዚአብሔር በሰጠው በሕይወቱ ዘመን ሁሉ ይበላና ይጠጣ ዘንድ፥ ከፀሐይ በታችም በሚደክምበት ድካም ሁሉ ደስ ይለው ዘንድ ነው፤ ይህ እድል ፈንታው ነውና።\n" +
                "19 ፤ እግዚአብሔር ለሰው ሁሉ ባለጠግነትንና ሀብትን መስጠቱ፥ ከእርስዋም ይበላና እድል ፈንታውን ይወስድ ዘንድ በድካሙም ደስ ይለው ዘንድ ማሠልጠኑ፤ ይህ የእግዚአብሔር ስጦታ ነው።\n" +
                "20 ፤ እግዚአብሔር በልቡ ደስታን ስለ ሰጠው እርሱ የሕይወቱን ዘመን እጅግ አያስብም።\n"));

        return new Chapter(5, verses);
    }

    private Chapter chapterSix() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ ከፀሐይ በታች ያየሁት ክፉ ነገር አለ፥ እርሱም በሰው ላይ እጅግ የከበደ ነው።\n" +
                "2 ፤ እግዚአብሔር ለሰው ሀብትንና ጥሪትን ክብርንም ሰጠው፥ ከወደደውም ሁሉ ለነፍሱ አልጐደለውም፤ ነገር ግን ሌላ ሰው ይበላዋል እንጂ ከእርሱ ይበላ ዘንድ እግዚአብሔር አላሠለጠነውም፤ ይህም ከንቱና ክፉ ደዌ ነው።\n" +
                "3 ፤ ሰው መቶ ልጆች ቢወልድ እጅግ ዘመንም በሕይወት ቢኖር ዕድሜውም እጅግ ዓመት ቢሆን፥ ነፍሱም መልካምን ባትጠግብ መቃብርንም ባያገኝ፥ እኔ ስለ እርሱ። ከእርሱ ይልቅ ጭንጋፍ ይሻላል አልሁ።\n" +
                "4 ፤ በከንቱ መጥቶአል በጨለማ ይሄዳል ስሙም በጨለማ ይሸፈናል፤\n" +
                "5 ፤ ደግሞም ፀሐይን አላየውም አላወቀውምም፤ ለዚህም ከዚያ ይልቅ ዕረፍት አለው።\n" +
                "6 ፤ ሺህ ዓመት ሁለት ጊዜ በሕይወት ቢኖር መልካምንም ባያይ፥ ሁሉ ወደ አንድ ስፍራ የሚሄድ አይደለምን?\n" +
                "7 ፤ የሰው ድካም ሁሉ ለአፉ ነው፥ ነፍሱ ግን አትጠግብም።\n" +
                "8 ፤ ከሰነፍ ይልቅ ለጥበበኛ ጥቅም ምንድር ነው? በሕያዋን ፊትስ መሄድ ለሚያውቅ ለድሀ ጥቅሙ ምንድር ነው?\n" +
                "9 ፤ በዓይን ማየት በነፍስ ከመቅበዝበዝ ይሻላል፤ ይህም ደግሞ ከንቱ ነፋስንም እንደ መከተል ነው።\n" +
                "10 ፤ የሆነው ስሙ አስቀድሞ ተጠራ፥ ሰውም እንደ ሆነ ታወቀ፤ ከእርሱ ከሚበረታው ጋር ይፋረድ ዘንድ አይችልም።\n" +
                "11 ፤ ከንቱን የሚያበዛ ብዙ ነገር አለና ለሰው ጥቅሙ ምንድር ነው?\n" +
                "12 ፤ ሰው በከንቱ ወራቱ ቍጥርና እንደ ጥላ በሚያሳልፈው ዘመኑ በሕይወቱ ሳለ ለሰው የሚሻለውን የሚያውቅ ማነው? ወይስ ለሰው ከፀሐይ በታች ከእርሱ በኋላ የሚሆነውን ማን ይነግረዋል?\n" ));

        return new Chapter(6, verses);
    }

    private Chapter chapterSeven() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ ከመልካም ሽቱ መልካም ስም፥ ከመወለድ ቀንም የሞት ቀን ይሻላል።\n" +
                "2 ፤ ወደ ግብዣ ቤት ከመሄድ ወደ ልቅሶ ቤት መሄድ ይሻላል፤ እርሱ የሰው ሁሉ ፍጻሜ ነውና፥ ሕያውም የሆነ በልቡ ያኖረዋልና።\n" +
                "3 ፤ ከሳቅ ኀዘን ይሻላል፥ ከፊት ኀዘን የተነሣ ልብ ደስ ይሰኛልና።\n" +
                "4 ፤ የጠቢባን ልብ በልቅሶ ቤት ነው፤ የሰነፎች ልብ ግን በደስታ ቤት ነው።\n" +
                "5 ፤ ሰው የሰነፎችን ዜማ ከሚሰማ ይልቅ የጠቢባንን ተግሣጽ መስማት ይሻለዋል።\n" +
                "6 ፤ ከድስት በታች እንደሚቃጠል እሾህ ድምፅ የሰነፍ ሳቅ እንዲሁ ነው፤ ይህም ደግሞ ከንቱ ነው።\n" +
                "7 ፤ ግፍ ጠቢቡን ያሳብደዋል፤ ጉቦም ልቡን ያጠፋዋል።\n" +
                "8 ፤ የነገር ፍጻሜ ከመጀመሪያው ይሻላል፤ ታጋሽም ከትዕቢተኛ ይሻላል።\n" +
                "9 ፤ በነፍስህ ለቍጣ ችኩል አትሁን ቍጣ በሰነፍ ብብት ያርፋልና።\n" +
                "10 ፤ ከዚህ ዘመን ይልቅ ያለፈው ዘመን ለምን ተሻለ? ብለህ አትናገር፤ የዚህን ነገር በጥበብ አትጠይቅምና።\n" +
                "11 ፤ ጥበብ ከርስት ጋር መልካም ነው፤ ፀሐይንም ለሚያዩ ሰዎች ትርፍን ይሰጣል።\n" +
                "12 ፤ የጥበብ ጥላ እንደ ገንዘብ ጥላ ናትና፤ የእውቀትም ብልጫዋ ጥበብ ገንዘብ ላደረጋት ሕይወትን እንድትሰጥ ነው።\n" +
                "13 ፤ የእግዚአብሔርን ሥራ ተመልከት፤ እርሱ ጠማማ ያደረገውን ማን ሊያቀናው ይችላል?\n" +
                "14 ፤ በመልካም ቀን ደስ ይበልህ፤ በክፉም ቀን ተመልከት፤ ሰው ከእርሱ በኋላ መርምሮ ምንም እንዳያገኝ እግዚአብሔር ይህንም ያንም እንደዚያ ሠርቶአል።\n" +
                "15 ፤ ጻድቅ በጽድቁ ሲጠፋ ኀጥእም በክፋቱ እጅግ ዘመን ሲኖር፥ ይህን ሁሉ ከንቱ በሆነ ዘመኔ አየሁ።\n" +
                "16 ፤ እጅግ ጻድቅ አትሁን፥ እጅግ ጠቢብም አትሁን፥ እንዳትጠፋ።\n" +
                "17 ፤ እጅግ ክፉ አትሁን፥ እልከኛም አትሁን፥ ጊዜህ ሳይደርስ እንዳትሞት።\n" +
                "18 ፤ እግዚአብሔርን የሚፈራ ከሁሉ ይወጣልና ይህን ብትይዝ ከዚያም ደግሞ እጅህን ባታርቅ መልካም ነው።\n" +
                "19 ፤ በከተማ ከሚኖሩ ከአሥር ገዢዎች ይልቅ ጥበብ ጠቢብን ታበረታለች።\n" +
                "20 ፤ በምድር ላይ መልካምን የሚሠራ ኃጢአትንም የማያደርግ ጻድቅ አይገኝምና።\n" +
                "21 ፤ ባሪያህ ሲረግምህ እንዳትሰማ በሚጫወቱበት ቃል ሁሉ ልብህን አትጣል፤\n" +
                "22 ፤ አንተ ደግሞ ሌሎችን እንደ ረገምህ ልብህ ያውቃልና።\n" +
                "23 ፤ ይህን ሁሉ በጥበብ ፈተንሁ፤ ጠቢብ እሆናለሁ አልሁ፥ እርስዋ ግን ከእኔ ራቀች።\n" +
                "24 ፤ የሆነው ራቀ እጅግም ጠለቀ፤ መርምሮ የሚያገኘውስ ማን ነው?\n" +
                "25 ፤ አውቅና እመረምር ዘንድ፥ ጥበብንና የነገሩን ሁሉ መደምደሚያ እፈልግ ዘንድ፥ ኃጢአትም ስንፍና፥ ስንፍናም እብደት እንደ ሆነች አውቅ ዘንድ እኔ በልቤ ዞርሁ።\n" +
                "26 ፤ እኔም ከሞት ይልቅ የመረረ ነገር መርምሬ አገኘሁ፤ እርስዋም ልብዋ ወጥመድና መርበብ የሆነ፥ እጆችዋም እግር ብረት የሆኑ ሴት ናት፤ በእግዚአብሔር ፊት መልካም የሆነ ከእርስዋ ያመልጣል፥ ኃጢአተኛ ግን ይጠመድባታል።\n" +
                "27 ፤ አንዱን በአንዱ ላይ ጨምሬ ወደ ነገሩ ሁሉ መደምደሚያ እደርስ ዘንድ፥ እነሆ፥ ይህን ነገር አገኘሁ ይላል ሰባኪው፤\n" +
                "28 ፤ ነፍሴ እስከ ዛሬ ድረስ ትሻታለች፥ ነገር ግን አላገኘሁም፤ ከሺህ ወንዶች አንድ አገኘሁ፥ ከእነዚያ ሁሉ መካከል ግን አንዲት ሴት አላገኘሁም።\n" +
                "29 ፤ እግዚአብሔር ሰዎችን ቅኖች አድርጎ እንደ ሠራቸው፥ እነሆ፥ ይህን ብቻ አገኘሁ፤ እነርሱ ግን ብዙ ብልሃትን ፈለጉ።\n"));

        return new Chapter(7, verses);
    }

    private Chapter chapterEight() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ እንደ ጠቢብ የሆነ ሰው ማን ነው? ነገርንስ መተርጐም የሚያውቅ ማን ነው? የሰው ጥበብ ፊቱን ታበራለች፥ የፊቱንም ድፍረት ትለውጣለች።\n" +
                "2 ፤ እኔ። በእግዚአብሔር መሐላ ምክንያት የንጉሥን ትእዛዝ ጠብቅ እልሃለሁ።\n" +
                "3 ፤ የወደደውን ሁሉ ያደርጋልና ከፊቱ ትወገድ ዘንድ አትቸኵል፥ ክፉንም በማድረግ አትጽና።\n" +
                "4 ፤ የንጉሥ ቃል ኃይለኛ ነውና፤ ይህንስ ለምን ታደርጋለህ? ማን ይለዋል?\n" +
                "5 ፤ ትእዛዝን የሚጠብቅ ክፉን ነገር አያውቅም፤ የጠቢብም ልብ ጊዜንና ፍርድን ያውቃል።\n" +
                "6 ፤ የሰው መከራ በእርሱ ላይ እጅግ ስለ ሆነ ለነገር ሁሉ ጊዜና ፍርድ አለውና።\n" +
                "7 ፤ የሚሆነውንም አያውቅም፤ እንዴትስ እንደሚሆን የሚነግረው ማን ነው?\n" +
                "8 ፤ መንፈስን ለማስቀረት በመንፈስ ላይ ሥልጣን ያለው ሰው የለም፤ በሞቱም ቀን ሥልጣን የለውም፤ በሰልፍም ስንብቻ የለም፥ ኃጢአትም ሠሪውን አያድነውም።\n" +
                "9 ፤ ይህን ሁሉ አየሁ፥ ከፀሐይም በታች ወደ ተደረገው ሥራ ሁሉ ልቤን ሰጠሁ፤ ሰው ሰውን ለመጕዳት ገዢ የሚሆንበት ጊዜ አለ።\n" +
                "10 ፤ እንዲሁም ኀጥኣን ተቀብረው አየሁ፥ ወደ ዕረፍትም ገቡ፤ ነገር ግን ቅን አድራጊዎች ከቅድስት ስፍራ ወጡ፥ በከተማይቱም ውስጥ ተረሱ፤ ይህም ደግሞ ከንቱ ነው።\n" +
                "11 ፤ በክፉ ሥራ ላይ ፈጥኖ ፍርድ አይፈረድምና ስለዚህ በሰው ልጆች ውስጥ ልባቸው ክፉን ለመሥራት ጠነከረ።\n" +
                "12 ፤ ኃጢአተኛ መቶ ጊዜ ክፉን ቢሠራ ዘመኑም ረጅም ቢሆን፥ እግዚአብሔርን ለሚፈሩት በፊቱም ለሚፈሩት ደኅንነት እንዲሆን አውቃለሁ፤\n" +
                "13 ፤ ለኀጥእ ግን ደኅንነት የለውም፥ በእግዚአብሔርም ፊት አይፈራምና ዘመኑ እንደ ጥላ አትረዝምም።\n" +
                "14 ፤ በምድር የሚደረግ ከንቱ ነገር አለ፤ በኀጥኣን የሚደረገው ሥራ የሚደርስባቸው ጻድቃን አሉ፥ ለጻድቃንም የሚደረገው ሥራ የሚደርስላቸው ኀጥኣን አሉ፤ ይህም ደግሞ ከንቱ ነው አልሁ።\n" +
                "15 ፤ ከሚበላውና ከሚጠጣው ደስም ከሚለው በቀር ለሰው ከፀሐይ በታች ሌላ መልካም ነገር የለውምና እኔ ደስታን አመሰገንሁ፤ ከፀሐይም በታች ከድካሙ እግዚአብሔር በሰጠው በሕይወቱ ዘመን ይህ ደስታው ከእርሱ ጋር ይኖራል።\n" +
                "16 ፤ ጥበብን አውቅ ዘንድ በምድር የሚሆነውንም ድካም አይ ዘንድ ልቤን ሰጠሁ፥ በቀንና በሌሊት እንቅልፍን በዓይኑ የማያይ አለና፤\n" +
                "17 ፤ ከፀሐይም በታች የተደረገውን ሥራ መርምሮ ያገኝ ዘንድ ለሰው እንዳይቻለው የእግዚአብሔርን ሥራ ሁሉ አየሁ። ሰውም ሊፈልግ እጅግ ቢደክም መርምሮ አያገኘውም፤ ደግሞ ጠቢብ ሰው። ይህን አወቅሁ ቢል እርሱ ያኘው ዘንድ አይችልም።\n"));

        return new Chapter(8, verses);
    }

    private Chapter chapterNine() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "1 ፤ ጻድቃንና ጠቢባን ሥራዎቻቸውም በእግዚአብሔር እጅ እንደ ሆኑ፥ ይህን ሁሉ እመረምር ዘንድ በልቤ አኖርሁ፤ ፍቅር ወይም ጥል ቢሆን ሰው አያውቅም ሁሉ ወደ ፊታቸው ነው።\n" +
                "2 ፤ የጻድቁና የበደለኛው፥ የመልካሙና የክፉው፥ የንጹሑና የርኩሱ፥ መሥዋዕትን የሚሠዋውና የማይሠዋው፥ የሰው ሁሉ ድርሻው አንድ ነው፤ እንደ መልካሙ ሰው እንዲሁ ኃጢአተኛው፥ እንደ መሐለኛው ሰው እንዲሁ መሐላን የሚፈራው ነው።\n" +
                "3 ፤ አንድ ድርሻ ሁሉን እንዲያገኝ ከፀሐይ በታች በተደረገው ሁሉ ይህ ነገር ክፉ ነው፤ ደግሞም የሰው ልጆች ልብ ክፋትን ትሞላለች፥ በሕይወታቸውም ሳሉ እብደት በልባቸው ነው፥ ከዚያም በኋላ ወደ ሙታን ይወርዳሉ።\n" +
                "4 ፤ ያልሞተ ውሻ ከሞተ አንበሳ ይሻላልና ሰው ከሕያዋን ሁሉ ጋር በአንድነት ቢኖር ተስፋ አለው።\n" +
                "5 ፤ ሕያዋን እንዲሞቱ ያውቃሉና፤ ሙታን ግን አንዳች አያውቁም፤ መታሰቢያቸውም ተረስቶአልና ከዚያ በኋላ ዋጋ የላቸውም።\n" +
                "6 ፤ ፍቅራቸውና ጥላቸው ቅንዓታቸውም በአንድነት ጠፍቶአል፥ ከፀሐይ በታችም በሚሠራው ነገር ለዘላለም እድል ፈንታ ከእንግዲህ ወዲህ የላቸውም።\n" +
                "7 ፤ እግዚአብሔር ሥራህን ተቀብሎታልና ሂድ፥ እንጀራህን በደስታ ብላ፥ የወይን ጠጅህንም በተድላ ጠጣ።\n" +
                "8 ፤ ሁልጊዜ ልብስህ ነጭ ይሁን፤ ቅባትም ከራስህ ላይ አይታጣ።\n" +
                "9 ፤ በሕይወትህ፥ አንተም ከፀሐይ በታች በምትደክምበት ድካም ይህ እድል ፈንታህ ነውና ከንቱ በሆነ በሕይወትህ ዘመን ሁሉ፥ ከፀሐይ በታች በሰጠህ፥ በከንቱ ዘመንህ ሁሉ፥ ከምትወድዳት ሚስትህ ጋር ደስ ይበልህ።\n" +
                "10 ፤ አንተ በምትሄድበት በሲኦል ሥራና አሳብ እውቀትና ጥበብ አይገኙምና እጅህ ለማድረግ የምታገኘውን ሁሉ እንደ ኃይልህ አድርግ።\n" +
                "11 ፤ እኔም ተመለስሁ፥ ከፀሐይ በታችም ሩጫ ለፈጣኖች፥ ሰልፍም ለኃያላን፥ እንጀራም ለጠቢባን፥ ባለጠግነትም ለአስተዋዮች፥ ሞገስም ለአዋቂዎች እንዳልሆነ አየሁ፤ ጊዜና እድል ግን ሁሉን ይገናኛቸዋል።\n" +
                "12 ፤ ሰውም ጊዜውን አያውቅም፤ በክፉ መረብ እንደ ተጠመዱ ዓሣዎች፥ በወጥመድም እንደ ተያዙ ወፎች፥ እንዲሁ የሰው ልጆች በክፉ ጊዜ በድንገት ሲወድቅባቸው ይጠመዳሉ።\n" +
                "13 ፤ ከፀሐይ በታችም ይህን ጥበብ አየሁ፥ እርስዋም በእኔ ዘንድ ታላቅ መሰለችኝ።\n" +
                "14 ፤ ታናሽ ከተማ ነበረች፥ ጥቂቶች ሰዎችም ነበሩባት፤ ታላቅ ንጉሥም መጣባት ከበባትም፥ ታላቅ ግንብም ሠራባት።\n" +
                "15 ፤ ጠቢብ ድሀ ሰውም ተገኘባት፥ ያችንም ከተማ በጥበቡ አዳናት፤ ያን ድሀ ሰው ግን ማንም አላሰበውም።\n" +
                "16 ፤ እኔም። ከኃይል ይልቅ ጥበብ ትበልጣለች፤ የድሀው ጥበብ ግን ተናቀች ቃሉም አልተሰማችም አልሁ።\n" +
                "17 ፤ በሰነፎች መካከል ከሚጮኽ ከገዢው ጩኸት ይልቅ የጠቢባን ቃል በጸጥታ ትሰማለች።\n" +
                "18 ፤ ከጦር መሣሪያዎች ይልቅ ጥበብ ትሻላለች፤ አንድ ኃጢአተኛ ግን ብዙ መልካምን ያጠፋል።\n"));

        return new Chapter(9, verses);
    }

    private Chapter chapterTen() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ የሞቱ ዝንቦች የተቀመመውን የዘይት ሽቱ ያገሙታል፤ እንዲሁም ትንሽ ስንፍና ጥበብንና ክብርን ያጠፋል።\n" +
                "2 ፤ የጠቢብ ልብ በስተ ቀኙ ነው፥ የሰነፍ ልብ ግን በስተ ግራው ነው።\n" +
                "3 ፤ ደግሞም ሰነፍ በመንገድ ሲመላለስ እርሱ ልብ ይጐድለዋል፥ የሚያስበውም ሁሉ ስንፍና ነው።\n" +
                "4 ፤ ትዕግሥት ታላቁን ኃጢአት ጸጥ ያደርጋልና የገዢ ቍጣ የተነሣብህ እንደ ሆነ ስፍራህን አትልቀቅ።\n" +
                "5 ፤ ከፀሐይ በታች ያየሁት ክፉ ነገር አለ፥ እርሱም ከገዢ የሚወጣ ስሕተት ነው፤\n" +
                "6 ፤ ሰነፍ በታላቅ ማዕርግ ተሾመ፥ ባለጠጎች ግን በተዋረደ ስፍራ ተቀመጡ።\n" +
                "7 ፤ ባሪያዎች በፈረስ ላይ ሲቀመጡ መሳፍንትም እንደ ባሪያዎች በምድር ላይ ሲሄዱ አየሁ።\n" +
                "8 ፤ ጕድጓድን የሚምስ ይወድቅበታል፥ ቅጥርንም የሚያፈርስን እባብ ትነድፈዋለች።\n" +
                "9 ፤ ድንጋይን የሚፈነቅል ይታመምበታል፥ እንጨትንም የሚፈልጥ ይጐዳበታል።\n" +
                "10 ፤ ብረት ቢደነዝዝ ሰውም ባይስለው ኃይልን ሊያበዛ ይገባዋል፤ ጥበብ ግን ሥራውን ለማከናወን ትጠቅመዋለች።\n" +
                "11 ፤ ደጋሚ ሳይደግምባት እባብ ብትነድፍ ለደጋሚው ትርፍ የለውም።\n" +
                "12 ፤ የጠቢብ ሰው የአፉ ቃል ሞገስ ናት፤ የሰነፍ ከንፈሮች ግን ራሱን ይውጡታል።\n" +
                "13 ፤ የአፉ ቃል መጀመሪያ ስንፍና ነው፥ የንግግሩ ፍጻሜም ክፉ እብደት ነው።\n" +
                "14 ፤ ሰነፍ ቃሉን ያበዛል፤ ሰው ግን የሚሆነውን አያውቅም፤ ከእርሱስ በኋላ የሚሆነውን ማን ይነግረዋል?\n" +
                "15 ፤ የሰነፍ ሥራ ያደክመዋል ወደ ከተማ መሄድ አያውቅምና።\n" +
                "16 ፤ ንጉሥሽ ሕፃን የሆነ፥ መኳንንቶችሽም ማልደው የሚበሉ፥ አንቺ አገር ሆይ፥ ወዮልሽ!\n" +
                "17 ፤ ንጉሥሽ የከበረ ልጅ የሆነ፥ ለብርታት እንጂ ለስካር ያይደለ በጊዜ የሚበሉ መኳንንት ያሉሽ፥ አንቺ አገር ሆይ፥ የተመሰገንሽ ነሽ።\n" +
                "18 ፤ ተግባር በመፍታት ጣራው ይዘብጣል፥ በእጅም መታከት ቤት ያፈስሳል።\n" +
                "19 ፤ እንጀራን ለሳቅ የወይን ጠጅንም ለሕይወት ደስታ ያደርጉታል፥ ሁሉም ለገንዘብ ይገዛል።\n" +
                "20 ፤ የሰማይ ወፍ ቃሉን ይወስደዋልና፥ ባለ ክንፎችም ነገሩን ይናገራሉና በልብህ አሳብ እንኳ ቢሆን ንጉሥን አትስደብ፥ በመኝታ ቤትህም ባለጠጋን አትስደብ።\n"));

        return new Chapter(10, verses);
    }
    private Chapter chapterEleven() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ እንጀራህን በውኃ ፊት ላይ ጣለው፥ ከብዙ ቀን በኋላ ታገኛዋለህና።\n" +
                "2 ፤ ለሰባት ደግሞም ለስምንት እድል ፈንታን ክፈል፥ በምድር ላይ የሚሆነውን ክፉ ነገር ምን እንደሆነ አታውቅምና።\n" +
                "3 ፤ ደመናት ዝናብ በሞሉ ጊዜ በምድር ላይ ያፈስሱታል፤ ዛፍም ወደ ደቡብ ወይም ወደ ሰሜን ቢወድቅ፥ ዛፉ በወደቀበት ስፍራ በዚያ ይኖራል።\n" +
                "4 ፤ ነፋስን የሚጠባበቅ አይዘራም፥ ደመናንም የሚመለከት አያጭድም።\n" +
                "5 ፤ የነፋስ መንገድ እንዴት እንደ ሆነች አጥንትም በእርጉዝ ሆድ እንዴት እንድትዋደድ እንደማታውቅ፥ እንዲሁም ሁሉን የሚሠራውን የእግዚአብሔርን ሥራ አታውቅም።\n" +
                "6 ፤ ወይም ይህ ወይም ያ ማናቸው እንዲበቅል ወይም ሁለቱ መልካም እንዲሆኑ አታውቅምና በማለዳ ዘርህን ዝራ፥ በማታም እጅህን አትተው።\n" +
                "7 ፤ ብርሃን ጣፋጭ ነው ፀሐይንም ማየት ለዓይን መልካም ነው።\n" +
                "8 ፤ ሰው ብዙ ዘመን በሕይወት ቢኖር በሁሉም ደስ ይበለው፤ ሆኖም የጨለማውን ዘመን ያስብ፥ ብዙ ቀን ይሆናልና። የሚመጣው ነገር ሁሉ ከንቱ ነው።\n" +
                "9 ፤ አንተ ጐበዝ፥ በጕብዝናህ ደስ ይበልህ፥ በጕብዝናህም ወራት ልብህን ደስ ይበለው፥ በልብህም መንገድ ዓይኖችህም በሚያዩት ሂድ፤ ዳሩ ግን ስለዚህ ነገር ሁሉ እግዚአብሔር ወደ ፍርድ እንዲያመጣህ እወቅ።\n" +
                "10 ፤ ሕፃንነትና ጕብዝና ከንቱዎች ናቸውና ከልብህ ኀዘንን አርቅ፥ ከሰውነትህም ክፉን ነገር አስወግድ።\n"));
        // Add more verses as needed
        return new Chapter(11, verses);
    }

    private Chapter chapterTwelve() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ የጭንቀት ቀን ሳይመጣ በጕብዝናህ ወራት ፈጣሪህን አስብ፤ ደስ አያሰኙም የምትላቸውም ዓመታት ሳይደርሱ፤\n" +
                "2 ፤ ፀሐይና ብርሃን ጨረቃና ከዋክብትም ሳይጨልሙ፥ ደመናትም ከዝናብ በኋላ ሳይመለሱ፤\n" +
                "3 ፤ ቤት ጠባቆች በሚንቀጠቀጡበት፥ ኃያላን ሰዎችም በሚጎብጡበት፥ ጥቂቶች ሆነዋልና ፈጭታዎች ሥራ በሚፈቱበት፥ በመስኮትም ሆነው የሚመለከቱ በሚጨልሙበት፥ በአደባባይም ደጆቹ በሚዘጉበት ቀን፤\n" +
                "4 ፤ የወፍጮ ድምፅ ሲላሽ፥ ከወፍ ድምፅ የተነሣ ሰው ሲነሣ፥ ዜማም የሚጮኹ ሴቶች ልጆች ሁሉ ዝግ ሲሉ፤\n" +
                "5 ፤ ከፍ ያለውን ደግሞ ሲፈሩ፥ ድንጋጤም በመንገድ ላይ ሲሆን፤ ለውዝም ሲያብብ፥ አንበጣም እንደ ሸክም ሲከብድ፥ ፈቃድም ሲጠፋ፤ ሰው ወደ ዘላለም ቤት ሲሄድ፥ አልቃሾችም በአደባባይ ሲዞሩ፤\n" +
                "6 ፤ የብር ድሪ ሳይበጠስ፥ የወርቅም ኵስኵስት ሳይሰበር፥ ማድጋውም በምንጭ አጠገብ ሳይከሰከስ፥ መንኰራኵሩም በጕድጓድ ላይ ሳይሰበር፥\n" +
                "7 ፤ አፈርም ወደ ነበረበት ምድር ሳይመለስ፥ ነፍስም ወደ ሰጠው ወደ እግዚአብሔር ሳይመለስ ፈጣሪህን አስብ።\n" +
                "8 ፤ ሰባኪው። ከንቱ፥ ከንቱ፤ ሁሉ ከንቱ ነው ይላል።\n" +
                "9 ፤ ሰባኪውም ጠቢብ ስለ ሆነ ለሕዝቡ እውቀትን አስተማረ፤ እርሱም ብዙ ምሳሌዎችን መረመረና ፈላለገ አስማማም።\n" +
                "10 ፤ ሰባኪው ያማረውን በቅንም የተጻፈውን እውነተኛውን ቃል መርምሮ ለማግኘት ፈለገ።\n" +
                "11 ፤ የጠቢባን ቃል እንደ በሬ መውጊያ ነው፥ የተሰበሰቡትም ከአንድ እረኛ የተሰጡት ቃላት እንደ ተቸነከሩ ችንካሮች ናቸው።\n" +
                "12 ፤ ከዚህም ሁሉ በላይ፥ ልጄ ሆይ፥ ተግሣጽን ስማ፤ ብዙ መጻሕፍትን ማድረግ ፍጻሜ የለውም፥ እጅግም ምርምር ሰውነትን ያደክማል።\n" +
                "13 ፤ የነገሩን ሁሉ ፍጻሜ እንስማ፤ ይህ የሰው ሁለንተናው ነውና፤ እግዚአብሔርን ፍራ፥ ትእዛዙንም ጠብቅ።\n" +
                "14 ፤ እግዚአብሔር ሥራን ሁሉ የተሰወረውንም ነገር ሁሉ፥ መልካምም ቢሆን ክፉም ቢሆን፥ ወደ ፍርድ ያመጣዋልና።\n" ));
        // Add more verses as needed
        return new Chapter(12, verses);
    }
}

