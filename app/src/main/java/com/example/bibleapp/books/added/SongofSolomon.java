
package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class SongofSolomon {
    private Book SongofSolomonBook;

    public SongofSolomon() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
        chapters.add(chapterFour());
        chapters.add(chapterFive());
        chapters.add(chapterSix());
        chapters.add(chapterSeven());
        chapters.add(chapterEight());



        SongofSolomonBook = new Book("መኃልየ መኃልይ ዘሰሎሞን።", chapters);
    }

    public Book getTSongofSolomonBook() {
        return SongofSolomonBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ ከመዝሙር ሁሉ የሚበልጥ የሰሎሞን መዝሙር።\n" +
                "2 ፤ በአፉ መሳም ይሳመኝ፥ ፍቅርህ ከወይን ጠጅ ይልቅ መልካም ነውና።\n" +
                "3 ፤ ዘይትህ መልካም መዓዛ አለው፤ ስምህ እንደሚፈስስ ዘይት ነው፤ ስለዚህ ደናግል ወደዱህ።\n" +
                "4 ፤ ሳበኝ፥ ከአንተም በኋላ እንሮጣለን፤ ንጉሡ ወደ ቤቱ አገባኝ በአንተ ደስ ይለናል፥ ሐሤትም እናደርጋለን፤ ከወይን ጠጅ ይልቅ ፍቅርህን እናስባለን፤ በቅንነት ይወድዱሃል።\n" +
                "5 ፤ እናንተ የኢየሩሳሌም ቈነጃጅት ሆይ፥ እኔ ጥቁር ነኝ፤ ነገር ግን ውብ ነኝ፥ እንደ ቄዳር ድንኳኖች እንደ ሰሎሞንም መጋረጃዎች።\n" +
                "6 ፤ ፀሐይ መልኬን አክስሎታልና፤ ጥቁር ስለ ሆንሁ አትዩኝ፤ የእናቴ ልጆች ተጣሉኝ፥ የወይን ቦታዎችንም ጠባቂ አደረጉኝ፤ ነገር ግን የእኔን ወይን ቦታ አልጠበቅሁም።\n" +
                "7 ፤ ነፍሴ የወደደችህ አንተ ንገረኝ፤ ወዴት ታሰማራለህ? በቅትርስ ጊዜ ወዴት ትመስጋለህ? ስለ ምንስ ከባልንጀሮችህ መንጎች በኋላ እቅበዘበዛለሁ?\n" +
                "8 ፤ አንቺ በሴቶች ዘንድ የተዋብሽ ሆይ፥ ያላወቅሽ እንደ ሆነ የመንጎችን ፍለጋ ተከትለሽ ውጪ፥ የፍየል ግልገሎችሽንም በእረኞች ድንኳኖች አጠገብ አሰማሪ።\n" +
                "9 ፤ ወዳጄ ሆይ፥ በፈርዖን ሰረገሎች እንዳለ ፈረስ መሰልሁሽ።\n" +
                "10 ፤ የጕንጭሽ ውበት በከበረ ሉል፥ አንገትሽም በዕንቍ ድሪ ያማረ ነው።\n" +
                "11 ፤ ባለ ብር ጕብጕብ የሆነ የወርቅ ጠልሰም እናደርግልሻለን።\n" +
                "12 ፤ ንጉሡ በማዕዱ ሳለ፥ የእኔ ናርዶስ መዓዛውን ሰጠ።\n" +
                "13 ፤ ውዴ ለእኔ በጡቶቼ መካከል እንደሚያርፍ እንደ ተቋጠረ ከርቤ ነው።\n" +
                "14 ፤ ውዴ ለእኔ በዓይንጋዲ ወይን ቦታ እንዳለ እንደ አበባ እቅፍ ነው።\n" +
                "15 ፤ ወዳጄ ሆይ፥ እነሆ፥ ውብ ነሽ፤ እነሆ፥ አንቺ ውብ ነሽ፤ ዓይኖችሽም እንደ ርግቦች ናቸው።\n" +
                "16 ፤ ውዴ ሆይ፥ እነሆ፥ አንተ ውብ ነህ፥ መልከ መልካምም ነህ፤ አልጋችንም ለምለም ነው።\n" +
                "17 ፤ የቤታችን ሰረገላ የዝግባ ዛፍ ነው፥ የጣሪያችንም ማዋቀሪያ የጥድ ዛፍ ነው።\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ እኔ የሳሮን ጽጌ ረዳ የቈላም አበባ ነኝ።\n" +
                "2 ፤ በእሾህ መካከል እንዳለ የሱፍ አበባ፥ እንዲሁ ወዳጄ በቈነጃጅት መካከል ናት።\n" +
                "3 ፤ በዱር እንዳለ እንኮይ፥ እንዲሁ ውዴ በልጆች መካከል ነው። ከጥላው በታች እጅግ ወድጄ ተቀመጥሁ፥ ፍሬውም በጕሮሮዬ ጣፋጭ ነው።\n" +
                "4 ፤ ወደ ወይን ጠጁም ቤት አገባኝ፥ በእኔ ላይ ያለው ዓላማውም ፍቅር ነው።\n" +
                "5 ፤ በዘቢብም አጽናኑኝ፥ በእንኮይ አበረታቱኝ፥ በፍቅሩ ተነድፌ ታምሜያለሁና።\n" +
                "6 ፤ ግራው ከራሴ በታች ናት፥ ቀኙም ታቅፈኛለች።\n" +
                "7 ፤ እናንተ የኢየሩሳሌም ቈነጃጅት ሆይ፥ እርሱ እስኪፈልግ ድረስ፥ ፍቅርን እንዳታስነሱትና እንዳታነሣሡት በሚዳቋ በምድረ በዳም ዋላ አምላችኋለሁ።\n" +
                "8 ፤ እነሆ፥ የውዴ ቃል! በተራሮች ላይ ሲዘልል፥ በኮረብቶችም ላይ ሲወረወር ይመጣል።\n" +
                "9 ፤ ውዴ ሚዳቋን ወይም የዋላን እምቦሳ ይመስላል፤ እነሆ፥ በመስኮቶች ሲጐበኝ፥ በዓይነ ርግብም ሲመለከት፥ እርሱ ከቅጥራችን በኋላ ቆሞአል።\n" +
                "10 ፤ ውዴ እንዲህ ብሎ ተናገረኝ። ወዳጄ ሆይ፥ ተነሺ፤ ውበቴ ሆይ፥ ነዪ።\n" +
                "11 ፤ እነሆ፥ ክረምት አለፈ፥ ዝናቡም አልፎ ሄደ።\n" +
                "12 ፤ አበቦች በምድር ላይ ተገለጡ፥ የዜማም ጊዜ ደረሰ፥ የቊርዬውም ቃል በምድራችን ተሰማ።\n" +
                "13 ፤ በለሱ ጐመራ፥ ወይኖችም አበቡ መዓዛቸውንም ሰጡ፤ ወዳጄ ሆይ፥ ተነሺ፤ ውበቴ ሆይ፥ ነዪ።\n" +
                "14 ፤ በዓለት ንቃቃትና በገደል መሸሸጊያ ያለሽ ርግብ ሆይ፥ ቃልሽ መልካም ፊትሽም ያማረ ነውና መልክሽን አሳዪኝ፥ ድምፅሽንም አሰሚኝ።\n" +
                "15 ፤ ወይናችን አብቦአልና የወይናችንን ቦታ የሚያጠፉትን ቀበሮች፥ ጥቃቅኑን ቀበሮች አጥምዳችሁ ያዙልን።\n" +
                "16 ፤ ውዴ የእኔ ነው፥ እኔም የእርሱ ነኝ፤ በሱፍ አበባዎች መካከልም መንጋውን ያሰማራል።\n" +
                "17 ፤ ውዴ ሆይ፥ ቀኑ እስኪነፍስ፥ ጥላውም እስኪሸሽ ድረስ ተመለስ፤ በቅመም ተራራ ላይ ሚዳቋውን ወይም የዋላውን እምቦሳ ምሰል።\n" ));
        // Add more verses as needed
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "1 ፤ ሌሊት በምንጣፌ ላይ ነፍሴ የወደደችውን ፈለግሁት፤ ፈለግሁት አላገኘሁትም።\n" +
                "2 ፤ እነሣለሁ በከተማይቱም እዞራለሁ፥ ነፍሴ የወደደችውን በጎዳናና በአደባባይ እፈልጋለሁ፤ ፈለግሁት አላገኘሁትም።\n" +
                "3 ፤ ከተማይቱን የሚዞሩት ጠባቂዎች አገኙኝ፤ ነፍሴ የወደደችውን አያችሁትን? አልኋቸውም።\n" +
                "4 ፤ ከእነርሱም ጥቂት እልፍ ብዬ ነፍሴ የወደደችውን አገኘሁት፥ ያዝሁትም ወደ እናቴም ቤት ወደ ወላጅ እናቴም እልፍኝ እስካገባው ድረስ አልተውሁትም።\n" +
                "5 ፤ እናንተ የኢየሩሳሌም ቈነጃጅት ሆይ፥ እርሱ እስኪፈልግ ድረስ፥ ፍቅርን እንዳታስነሡትና እንዳታነሣሡት በሚዳቋ በምድረ በዳም ዋላ አምላችኋለሁ።\n" +
                "6 ፤ መዓዛም እንደ ከርቤና እንደ ዕጣን የሆነችው፥ ከልዩ ከነጋዴ ቅመም ሁሉ የሆነችው፥ ይህች ከምድረ በዳ እንደ ጢስ ምስሶ የወጣችው ማን ናት?\n" +
                "7 ፤ እነሆ፥ የሰሎሞን አልጋ ናት፤ ከእስራኤል ኃያላን ስድሳ ኃያላን በዙሪያው ናቸው።\n" +
                "8 ፤ ሁሉም ሰይፍ የያዙ ሰልፈኞች ናቸው፤ በሌሊት ከሚወድቀው ፍርሃት የተነሣ ሰው ሁሉ ሰይፉ በወገቡ አለ።\n" +
                "9 ፤ ንጉሡ ሰሎሞን መሸከሚያን ከሊባኖስ እንጨት ለራሱ አሠራ።\n" +
                "10 ፤ ምሰሶቹን የብር፥ መደገፊያውንም የወርቅ፥ መቀመጫውንም ሐምራዊ ግምጃ አደረገ፤ ውስጡ በኢየሩሳሌም ቈነጃጅት ፍቅር የተለበጠ ነው።\n" +
                "11 ፤ እናንተ የጽዮን ቈነጃጅት፥ ውጡ፤ እናቱ በሠርጉ ቀንና በልቡ ደስታ ቀን ያደረገችለትን አክሊል ደፍቶ ንጉሥ ሰሎሞንን እዩ።\n"));
        // Add more verses as needed
        return new Chapter(3, verses);
    }

    private Chapter chapterFour() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ ወዳጄ ሆይ፥ እነሆ፥ ውብ ነሽ፤ እነሆ፥ አንቺ ውብ ነሽ፤ በዓይነ ርግብ መሸፈኛሽ ውስጥ ዓይኖችሽ እንደ ርግቦች ናቸው፤ ጠጕርሽ በገለዓድ ተራራ እንደሚወርድ እንደ ፍየል መንጋ ነው።\n" +
                "2 ፤ ጥርሶችሽ ታጥበው እንደ ተሸለቱ ሁሉም መንታ እንደ ወለዱ ከእነርሱም መካን እንደሌለባቸው መንጎች ናቸው።\n" +
                "3 ፤ ከንፈሮችሽ እንደ ቀይ ሐር ፈትል ናቸው፥ አፍሽም ያማረ ነው፤ በዓይነ ርግብ መሸፈኛሽ ውስጥ ጕንጭና ጕንጭሽ እንደ ተከፈለ ሮማን ናቸው።\n" +
                "4 ፤ አንገትሽ ለሰልፍ ዕቃ መስቀያ እንደ ተሠራው እንደ ዳዊት ግንብ ነው፤ ሺህ ጋሻ የኃያላንም መሣሪያ ሁሉ ተንጠልጥሎበታል።\n" +
                "5 ፤ ሁለቱ ጡቶችሽ መንታ እንደ ተወለዱ፥ በሱፍ አበባ መካከል እንደሚሰማሩ እንደ ሚዳቋ ግልገሎች ናቸው።\n" +
                "6 ፤ ቀኑ እስኪነፍስ ጥላውም እስኪያልፍ ድረስ፥ ወደ ከርቤው ተራራ ወደ ዕጣኑም ኮረብታ እሄዳለሁ።\n" +
                "7 ፤ ወዳጄ ሆይ፥ ሁለንተናሽ ውብ ነው፥ ነውርም የለብሽም።\n" +
                "8 ፤ ሙሽራዬ ሆይ፥ ከሊባኖስ ከእኔ ጋር ነዪ፤ ከሊባኖስ ከእኔ ጋር ነዪ፤ ከአማና ራስ ከሳኔርና ከኤርሞን ራስ፥ ከአንበሶች መኖሪያ ከነብሮችም ተራራ ተመልከች።\n" +
                "9 ፤ እኅቴ ሙሽራ ሆይ፥ ልቤን በደስታ አሳበድሽው፤ አንድ ጊዜ በዓይኖችሽ፥ ከአንገትሽ ድሪ በአንዱ ልቤን በደስታ አሳበድሽው።\n" +
                "10 ፤ እኅቴ ሙሽራ ሆይ፥ ፍቅርሽ እንዴት መልካም ነው! ፍቅርሽ ከወይን ጠጅ ይልቅ እንዴት ይሻላል! የዘይትሽም መዓዛ ከሽቱ ሁሉ!\n" +
                "11 ፤ ሙሽራዬ ሆይ፥ ከከንፈሮችሽ ማር ይንጠበጠባል፤ ከምላስሽ በታች ማርና ወተት አለ፥ የልብስሽም መዓዛ እንደ ሊባኖስ ሽታ ነው።\n" +
                "12 ፤ እኅቴ ሙሽራ የተቈለፈ ገነት፥ የተዘጋ ምንጭ የታተመም ፈሳሽ ናት።\n" +
                "13 ፤ ቡቃያሽ ሮማንና የተመረጠ ፍሬ፥ ቆዕ ከናርዶስ ጋር ያለበት ገነት ነው፥\n" +
                "14 ፤ ናርዶስ ከቀጋ ጋር፥ የሽቱ ሣርና ቀረፋ፥ ከልዩ ልዩ ዕጣን ጋር፥ ከርቤና እሬት ከክቡር ሽቱ ሁሉ ጋር።\n" +
                "15 ፤ አንቺ የገነት ምንጭ፥ የሕይወት ውኃ ጕድጓድ፥ ከሊባኖስም የሚፈስስ ወንዝ ነሽ።\n" +
                "16 ፤ የሰሜን ነፋስ ሆይ፥ ተነሥ፥ የደቡብም ነፋስ ና፤ በገነቴ ላይ ንፈስ፥ ሽቱውም ይፍሰስ፤ ውዴ ወደ ገነቱ ይግባ፥ መልካሙንም ፍሬ ይብላ።\n"));
        // Add more verses as needed
        return new Chapter(4, verses);
    }
    private Chapter chapterFive() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ እኅቴ ሙሽራዬ ሆይ፥ ወደ ገነቴ ገባሁ፥ ከርቤዬን ከሽቱዬ ጋር ለቀምሁ፥ እንጀራዬን ከማሬ ጋር በላሁ፥ የወይን ጠጄን ከወተቴ ጋር ጠጣሁ። ባልንጀሮቼ ሆይ፥ ብሉ፤ ወዳጄ ሆይ፥ ጠጪ፤ እስክትረኪ ድረስ ጠጪ።\n" +
                "2 ፤ እኔ ተኝቻለሁ፥ ልቤ ግን ነቅቶአል፤ የውዴ ቃል ነው፥ እርሱም ደጁን ይመታል፤ እኅቴ፥ ወዳጄ፥ ርግቤ፥ መደምደሚያዬ ሆይ፥ በራሴ ጠል፥ በቈንዳላዬም የሌሊት ነጠብጣብ ሞልቶበታልና ክፈችልኝ።\n" +
                "3 ፤ ቀሚሴን አወለቅሁ፤ እንዴት እለብሰዋለሁ? እግሬን ታጠብሁ፤ እንዴት አሳድፈዋለሁ?\n" +
                "4 ፤ ውዴ እጁን በቀዳዳ ሰደደ፥ አንጀቴም ስለ እርሱ ታወከ።\n" +
                "5 ፤ ለውዴ እከፍትለት ዘንድ ተነሣሁ፤ እጆቼ በደጅ መወርወሪያ ላይ ከርቤን አፈሰሱ፥ ጣቶቼ ፈሳሹን ከርቤ አንጠበጠቡ።\n" +
                "6 ፤ ለውዴ ከፈትሁለት፥ ውዴ ግን ፈቀቅ ብሎ አልፎ ነበር። ነፍሴ ከቃሉ የተነሣ ደነገጠች፤ ፈለግሁት፥ አላገኘሁትም፤ ጠራሁት፥ አልመለሰልኝም።\n" +
                "7 ፤ ከተማይቱን የሚዞሩት ጠባቂዎች አገኙኝ፤ መቱኝ፥ አቈሰሉኝም፤ ቅጥር ጠባቂዎችም የዓይነ ርግብ መሸፈኛዬን ወሰዱት።\n" +
                "8 ፤ እናንተ የኢየሩሳሌም ቈነጃጅት ሆይ፥ አምላችኋለሁ፤ ውዴን ያገኛችሁት እንደ ሆነ፥ እኔ ከፍቅር የተነሣ መታመሜን ንገሩት።\n" +
                "9 ፤ አንቺ በሴቶች ዘንድ የተዋብሽ ሆይ፥ ከሌላ ወዳጅ ይልቅ ውድሽ ማን ነው? ይህን የሚያህል አምለሽናልና ከሌላ ወዳጅ ይልቅ ውድሽ ማን ነው?\n" +
                "10 ፤ ውዴ ነጭና ቀይ ነው፥ ከእልፍ የተመረጠ ነው።\n" +
                "11 ፤ ራሱ ምዝምዝ ወርቅ ነው፤ ቈንዳላው የተዝረፈረፈ ነው፥ እንደ ቁራ ጥቁረትም ጥቁር ነው።\n" +
                "12 ፤ ዓይኖቹ በሙሉ ፈሳሽ አጠገብ እንዳሉ በወተት እንደ ታጠቡ በፈሳሽ ውኃ አጠገብ እንደ ተቀመጡ እንደ ርግቦች ናቸው።\n" +
                "13 ፤ ጕንጩና ጕንጩ የሽቱ መደብ እርከን እንዳለበት እንደ ሽቱ አትክልት ናቸው፤ ከንፈሮቹ እንደ አበቦች ናቸው፥ የሚፈስስ ከርቤንም ያንጠበጥባሉ።\n" +
                "14 ፤ እጆቹ የቢረሌ ፈርጥ እንዳለበት እንደ ወርቅ ቀለበት ናቸው፤ አካሉ ብልሃተኛ እንደ ሠራው በሰንፔር እንዳጌጠ እንደ ዝሆን ጥርስ ነው።\n" +
                "15 ፤ እግሮቹ በምዝምዝ ወርቅ እንደ ተመሠረቱ እንደ ዕብነ በረድ ምሰሶች ናቸው፤ መልኩ እንደ ሊባኖስና እንደ ዝግባ ዛፍ መልካም ነው።\n" +
                "16 ፤ አፉ እጅግ ጣፋጭ ነው፥ እርሱም ፈጽሞ ያማረ ነው፤ እናንተ የኢየሩሳሌም ቈነጃጅት ሆይ፥ ውዴ ይህ ነው፥ ባልንጀራዬም ይህ ነው።\n"));

        return new Chapter(5, verses);
    }

    private Chapter chapterSix() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አንቺ በሴቶች ዘንድ የተዋብሽ ሆይ፥ ከአንቺ ጋር እንፈልገው ዘንድ ውድሽ ወዴት ሄደ? ውድሽስ ወዴት ፈቀቅ አለ?\n" +
                "2 ፤ ውዴ በገነቱ መንጋውን ያሰማራ ዘንድ አበባውንም ይሰበስብ ዘንድ ወደ ሽቱ መደብ ወደ ገነቱ ወረደ።\n" +
                "3 ፤ እኔ የወዴ ነኝ ውዴም የእኔ ነው፤ በሱፉ አበባ መካከል መንጋውን ያሰማራል።\n" +
                "4 ፤ ወዳጄ ሆይ፥ እንደ ቴርሳ ውብ ነሽ፥ እንደ ኢየሩሳሌምም ያማርሽ ነሽ፤ ዓላማ ይዞ እንደ ተሰለፈ ሠራዊት ታስፈሪያለሽ።\n" +
                "5 ፤ አውከውኛልና ዓይኖችሽን ከፊቴ መልሺ፤ ጠጕርሽ ከገለዓድ እንደ ወረደ እንደ ፍየል መንጋ ነው።\n" +
                "6 ፤ ጥርሶችሽ ታጥበው እንደ ወጡ ሁሉ መንታ እንደ ወለዱ ከእነርሱም መካን እንደሌለባቸው መንጎች ናቸው።\n" +
                "7 ፤ በዓይነ ርግብ መሸፈኛሽ ውስጥ ጕንጭና ጕንጭሽ እንደ ተከፈለ ሮማን ናቸው።\n" +
                "8 ፤ ስድሳ ንግሥታት ሰማንያም ቍባቶች ቍጥር የሌላቸውም ቈነጃጅት አሉ።\n" +
                "9 ፤ ርግቤ መደምደሚያዬም አንዲት ናት፤ ለእናትዋ አንዲት ናት ለወለደቻትም የተመረጠች ናት። ቈነጃጅትም አይተው አሞገሱአት፥ ንግሥታትና ቍባቶችም አመሰገኑአት።\n" +
                "10 ፤ ይህች እንደ ማለዳ ብርሃን የምትጐበኝ፥ እንደ ጨረቃ የተዋበች እንደ ፀሐይም የጠራች፥ ዓላማ ይዞ እንደ ተሰለፈ ሠራዊት የምታስፈራ ማን ናት?\n" +
                "11 ፤ የወንዙን ዳር ልምላሜ አይ ዘንድ፥ ወይኑ አብቦ ሮማኑም አፍርቶ እንደ ሆነ እመለከት ዘንድ ወደ ገውዝ ገነት ወረድሁ።\n" +
                "12 ፤ ሳላውቅ ነፍሴ በከበረው ሰረገላ ላይ አስቀመጠችኝ።\n" +
                "13\n" ));

        return new Chapter(6, verses);
    }

    private Chapter chapterSeven() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አንቺ ሱላማጢስ ሆይ፥ ተመለሽ፥ ተመለሽ፤ እናይሽ ዘንድ ተመለሽ፥ ተመለሽ። በሱላማጢስ ምን ታያላችሁ? እርስዋ እንደ መሃናይም ዘፈን ናት።\n" +
                "2 ፤ አንቺ የመኰንን ልጅ ሆይ፥ እግሮችሽ በጫማ ውስጥ እንዴት ውቦች ናቸው! ዳሌዎችሽስ በአንጥረኛ እጅ እንደ ተሠሩ እንደ ዕንቍዎች ይመስላሉ።\n" +
                "3 ፤ እንብርትሽ የወይን ጠጅ እንደማይጐድልበት እንደ ተነጠጠ ጽዋ ነው፤ ሆድሽ እንደ ስንዴ ክምር፥ በአበባም እንደ ታጠረ ነው።\n" +
                "4 ፤ ሁለቱ ጡቶችሽ እንደ ሁለቱ መንታ እንደ ሚዳቋ ግለገሎች ናቸው።\n" +
                "5 ፤ አንገትሽ እንደ ዝሆን ጥርስ ግንብ ነው፤ ዓይኖችሽ በሐሴቦን ውስጥ በባትረቢ በር አጠገብ እንደ ውኃ ኵሬዎች ናቸው፤ አፍንጫሽ ወደ ደማስቆ አፋዛዥ እንደሚመለከት እንደ ሊባኖስ ግንብ ነው።\n" +
                "6 ፤ ራስሽ እንደ ቀርሜሎስ ተራራ በላይሽ ነው፤ የራስሽም ጠጕር እንደ ሐምራዊ ሐር ነው፤ ንጉሡ በሹርባው ታስሮአል።\n" +
                "7 ፤ ወዳጄ ሆይ፥ እንዴት የተዋብሽ ነሽ! እንዴትስ ደስ ታሰኛለሽ!\n" +
                "8 ፤ ይህ ቁመትሽ የዘንባባ ዛፍ ይመስላል፥ ጡቶችሽም የወይን ዘለላ ይመስላሉ።\n" +
                "9 ፤ ወደ ዘንባባው ዛፍ እወጣለሁ ጫፎችዋንም እይዛለሁ አልሁ፤ ጡቶችሽ እንደ ወይን ዘለላ የአፍንጫሽም ሽቱ እንደ እንኮይ ናቸው።\n" +
                "10 ፤ ጕሮሮሽ ለወዳጄ እየጣፈጠ እንደሚገባ፥ የተኙትን ከንፈሮች ይናገሩ ዘንድ እንደሚያደርግ፥ እንደ ማለፊያ የወይን ጠጅ ነው።\n" +
                "11 ፤ እኔ የውዴ ነኝ፥ የእርሱም ምኞት ወደ እኔ ነው።\n" +
                "12 ፤ ውዴ ሆይ፥ ና፥ ወደ መስክ እንውጣ በመንደሮችም እንደር።\n" +
                "13 ፤ ወደ ወይኑ ቦታ ማልደን እንሂድ፤ ወይኑ አብቦ አበባውም ፍሬ አንዠርግጎ ሮማኑም አፍርቶ እንደ ሆነ እንይ፤ በዚያ ውዴን እሰጥሃለሁ።\n" +
                "[14]፤ ትርንጎዎች መዓዛን ሰጡ፤ መልካሞች ፍሬዎች ሁሉ፥ አሮጌው ከአዲሱ ጋር፥ በደጃችን አሉ፤ ውዴ ሆይ፥ ሁሉን ለአንተ ጠበቅሁልህ።\n"));

        return new Chapter(7, verses);
    }

    private Chapter chapterEight() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አንተ የእናቴን ጡት እንደ ጠባ እንደ ወንድሜ ምነው በሆንህ! በሜዳ ባገኘሁህ ጊዜ በሳምሁህ፥ ማንም ባልናቀኝም ነበር።\n" +
                "2 ፤ መርቼ ወደ እናቴ ቤት ባገባሁህ፥ በዚያም አንተ ባስተማርከኝ፤ እኔም ከመልካሙ ወይን ጠጅ ከሮማኔም ውኃ ባጠጣሁህ ነበር።\n" +
                "3 ፤ ግራው ከራሴ በታች በሆነች ቀኙም ባቀፈችኝ ነበር።\n" +
                "4 ፤ እናንተ የኢየሩሳሌም ቈነጃጅት ሆይ፥ እርሱ እስኪፈልግ ድረስ ፍቅርን እንዳታስነሡት እንዳታነሣሡትም አምላችኋለሁ።\n" +
                "5 ፤ በውድዋ ላይ ተደግፋ ከምድረ በዳ የምትወጣ ይህች ማን ናት? ከእንኮይ በታች አስነሣሁህ፤ በዚያ እናትህ ወለደችህ፥ በዚያም ወላጅ እናትህ አማጠችህ።\n" +
                "6 ፤ እንደ ማኅተም በልብህ፥ እንደ ማኅተም በክንድህ አኑረኝ፤ ፍቅር እንደ ሞት የበረታች ናትና፥ ቅንዓትም እንደ ሲኦል የጨከነች ናትና። ፍንጣሪዋ እንደ እሳት ፍንጣሪ፥ እንደ እግዚአብሔር ነበልባል ነው።\n" +
                "7 ፤ ብዙ ውኃ ፍቅርን ያጠፋት ዘንድ አይችልም፥ ፈሳሾችም አያሰጥሙአትም፤ ሰው የቤቱን ሀብት ሁሉ ስለ ፍቅር ቢሰጥ ፈጽሞ ይንቁታል።\n" +
                "8 ፤ እኛ ጡት የሌላት ታናሽ እኅት አለችን፤ ስለ እርስዋ በሚናገሩባት ቀን ለእኅታችን ምን እናድርግላት?\n" +
                "9 ፤ እርስዋ ቅጥር ብትሆን የብር ግንብ በላይዋ እንሠራለን፤ ደጅም ብትሆን በዝግባ ሳንቃ እንከብባታለን።\n" +
                "10 ፤ እኔ ቅጥር ነኝ ጡቶቼም እንደ ግንብ ናቸው፤ በዚያን ጊዜ በፊቱ ሰላምን እንደምታገኝ ሆንሁ።\n" +
                "11 ፤ ለሰሎሞን በብኤላሞን የወይን ቦታ ነበረው፤ የወይኑን ቦታ ለጠባቂዎች አከራየው፤ ሰው ሁሉ ለፍሬው ሺህ ብር ያመጣለት ነበር።\n" +
                "12 ፤ ለእኔ ያለኝ የወይን ቦታ በፊቴ ነው፤ ሰሎሞን ሆይ፥ ሺሁ ለአንተ፥ ሁለት መቶውም ፍሬውን ለሚጠብቁ ይሆናል።\n" +
                "13 ፤ በገነቱ የምትቀመጪ ሆይ፥ ባልንጀሮች የአንቺን ቃል ያደምጣሉ፤ ቃልሽን አሰሚኝ።\n" +
                "14 ፤ ውዴ ሆይ፥ ፍጠን፤ በቅመም ተራራ ላይ ሚዳቋን ወይም የዋላን እምቦሳ ምሰል።\n"));

        return new Chapter(8, verses);
    }
}