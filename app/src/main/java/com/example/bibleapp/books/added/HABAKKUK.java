package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class HABAKKUK {
    private Book HABAKKUKBook;

    public HABAKKUK() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
 
        HABAKKUKBook = new Book("ትንቢተ ዕንባቆም", chapters);
    }

    public Book getHABAKKUKBook() {
        return HABAKKUKBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","ነቢዩ ዕንባቆም ያየው ሸክም ይህ ነው።  \n" +   
                "2 ፤ አቤቱ፥ እኔ ስጮኽ የማትሰማው እስከ መቼ ነው? ስለ ግፍ ወደ አንተ እጮኻለሁ፥ አንተም አታድንም።  \n" +   
                "3 ፤ በደልንስ ስለ ምን አሳየኸኝ? ጠማምነትንስ ስለ ምን ትመለከታለህ? ጥፋትና ግፍ በፊቴ ነው፤ ጠብና ክርክር ይነሣሉ።  \n" +   
                "4 ፤ ስለዚህ ሕግ ላልቶአል፥ ፍርድም ድል ነሥቶ አይወጣም፤ ኃጢአተኛ ጻድቅን ይከብባልና፤ ስለዚህ ፍርድ ጠማማ ሆኖ ይወጣል።  \n" +   
                "5 ፤ እናንተ የምትንቁ ሆይ፥ አንድ ቢተርክላችሁ ስንኳ የማታምኑትን ሥራ በዘመናችሁ እሠራለሁና እዩ፥ ተመልከቱ፥ ተደነቁ።  \n" +   
                "6 ፤ እነሆ፥ የእነርሱ ያልሆነውን መኖሪያ ይወርሱ ዘንድ በምድር ስፋት ላይ የሚሄዱትን መራሮችንና ፈጣኖችን ሕዝብ ከለዳውያንን አስነሣለሁ።  \n" +   
                "7 ፤ እነርሱ የሚያስፈሩና የሚያስደነግጡ ናቸው፤ ፍርዳቸውና ክብራቸው ከራሳቸው ይወጣል።  \n" +   
                "8 ፤ ፈረሶቻቸውም ከነብር ይልቅ ፈጣኖች ናቸው፥ ከማታም ተኵላ ይልቅ ጨካኞች ናቸው፤ ፈረሰኞቻቸውም ይንሳፈፋሉ፥ ከሩቅም ይመጣሉ፥ ለመብልም እንደሚቸኵል ንስር ይበርራሉ።  \n" +   
                "9 ፤ ሁሉም ለግፍ ሥራ ይመጣሉ፥ ፊታቸውንም እንደ ምሥራቅ ነፋስ ያቀናሉ፤ ምርኮኞችንም እንደ አሸዋ ይሰበስባሉ።  \n" +   
                "10 ፤ በነገሥታት ላይ ያላግጣሉ፥ መሳፍንትም ዋዛ ሆነውላቸዋል፤ በምሽጉ ሁሉ ይስቃሉ፥ አፈሩንም ከምረው ይወስዱታል።  \n" +   
                "11 ፤ የዚያን ጊዜም እንደ ነፋስ አልፎ ይሄዳል፥ ይበድልማል፤ ኃይሉንም አምላክ ያደርገዋል።  \n" +   
                "12 ፤ አቤቱ፥ የተቀደስህ አምላኬ ሆይ፥ አንተ ከዘላለም ጀምሮ አልነበርህምን? እኛ አንሞትም፤ አቤቱ፥ ለፍርድ ሠርተኸዋል፥ ለተግሣጽም አድርገኸዋል።  \n" +   
                "13 ፤ ዓይኖችህ ክፉ እንዳያዩ ንጹሐን ናቸው፥ ጠማምነትንም ትመለከት ዘንድ አትችልም፤ አታላዮችንስ ለምን ትመለከታለህ? ኃጢአተኛውስ ከእርሱ ይልቅ ጻድቅ የሆነውን ሲውጠው ስለ ምን ዝም ትላለህ?  \n" +   
                "14 ፤ ሰዎችንም እንደ ባሕር ዓሣዎች፥ አለቃም እንደሌላቸው ተንቀሳቃሾች ለምን ታደርጋቸዋለህ?  \n" +   
                "15 ፤ ሁሉን በመቃጥን ያወጣል፥ በመረቡም ይይዛቸዋል፥ በአሽክላውም ውስጥ ያከማቻቸዋል፤ ስለዚህ ደስ እያለው እልል ይላል።  \n" +   
                "16 ፤ እድል ፈንታው በእነርሱ ሰብታለችና፥ መብሉም በዝቶአልና ስለዚህ ለመረቡ ይሠዋል፥ ለአሽክላውም ያጥናል።  \n" +   
                "17 ፤ ስለዚህ መረቡን ይጥላልን? አሕዛብንም ዘወትር ይገድል ዘንድ አይራራምን?"));

        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "በመጠበቂያዬ ላይ እቆማለሁ፥ በአምባ ላይም እወጣለሁ፤ የሚናገረኝንም፥ ስለ ክርክሬም የምመልሰውን አውቅ ዘንድ እመለከታለሁ።  \n" +   
                "2 ፤ እግዚአብሔርም መለሰልኝ እንዲህም አለ። አንባቢው ይፈጥን ዘንድ ራእዩን ጻፍ፥ በጽላትም ላይ ግለጠው።  \n" +   
                "3 ፤ ራእዩ ገና እስከ ተወሰነው ጊዜ ነው፥ ወደ ፍጻሜውም ይቸኵላል፥ እርሱም አይዋሽም፤ ቢዘገይም በእርግጥ ይመጣልና ታገሠው፤ እርሱ አይዘገይም።  \n" +   
                "4 ፤ እነሆ፥ ነፍሱ ኰርታለች፥ በውስጡም ቅን አይደለችም፤ ጻድቅ ግን በእምነቱ በሕይወት ይኖራል።  \n" +   
                "5 ፤ እርሱ አታላይና ኵሩ ሰው ነው፤ በስፍራው ዐርፎ አይቀመጥም፤ ስስቱን እንደ ሲኦል ያሰፋል፥ እርሱም እንደ ሞት አይጠግብም፤ አሕዛብንም ሁሉ ወደ እርሱ ይሰበስባል፥ ወገኖቹንም ሁሉ ወደ እርሱ ያከማቻል።  \n" +   
                "6 ፤ እነዚህ ሁሉ። ለእርሱ ያልሆነውን ወደ እርሱ ለሚሰበስብ መያዣውንም ለራሱ የሚያበዛ ወዮለት! እስከ መቼ ነው? እያሉ ምሳሌ አይመስሉበትምን?  \n" +   
                "7 ፤ ተረትም አይተርቱበትምን? የሚነክሱህ ድንገት አይነሡብህምን? የሚያስጨንቁህም ይነቃሉ፤ ለእነርሱም ብዝበዛ ትሆናለህ።  \n" +   
                "8 ፤ የሰውን ደም ስላፈሰስህ፥ በምድሪቱና በከተማይቱም በእርስዋም በሚኖሩ ሁሉ ላይ ስላደረግኸው ግፍ፥ አንተ ብዙዎችን አሕዛብን በዝብዘሃልና ከአሕዛብ የቀሩት ሁሉ ይበዘብዙሃል።  \n" +   
                "9 ፤ ከክፉ እንዲድን ጐጆውን በከፍታ ላይ ያደርግ ዘንድ ለቤቱ ክፉ ትርፍን ለሚሰበስብ ወዮለት!  \n" +   
                "10 ፤ ብዙ አሕዛብን አጥፍተሃልና ለቤትህ እፍረትን መክረሃል፥ በነፍስህም ላይ ኃጢአትን አድርገሃል።  \n" +   
                "11 ፤ ድንጋይም ከግንብ ውስጥ ይጮኻል፥ እንጨትም ከውቅር ውስጥ ይመልስለታል።  \n" +   
                "12 ፤ ከተማን በደም ለሚሠራ፥ ከተማንም በኃጢአት ለሚመሠርት ወዮለት!  \n" +   
                "13 ፤ እነሆ፥ አሕዛብ ስለ እሳት እንዲሠሩ፥ ወገኖችም ስለ ከንቱነት እንዲደክሙ ከሠራዊት ጌታ ከእግዚአብሔር ዘንድ የሆነ አይደለምን?  \n" +   
                "14 ፤ ውኃ ባሕርን እንደሚከድን ምድር የእግዚአብሔርን ክብር በማወቅ ትሞላለችና።  \n" +   
                "15 ፤ ኀፍረተ ሥጋውን ለማየት ባልንጀራውን ለሚያጠጣ፥ ክፉንም ለሚጨምርበት፥ ለሚያሰክረውም ወዮለት!  \n" +   
                "16 ፤ በክብር ፋንታ እፍረት ሞልቶብሃል፤ አንተ ደግሞ ጠጥተህ ተንገድገድ፤ የእግዚአብሔር የቀኙ ጽዋ ይመለስብሃል፥ እፍረትም በክብርህ ላይ ይሆናል።  \n" +   
                "17 ፤ የሰውንም ደም ስላፈሰስህ፥ በምድሪቱና በከተማይቱም በእርስዋም በሚኖሩ ሁሉ ላይ ስላደረግኸው ግፍ፥ በሊባኖስ ላይ የሠራኸው ግፍ ይከድንሃል፤ የአራዊትም አደጋ ያስፈራራሃል።  \n" +   
                "18 ፤ የተቀረጸውን ምስል ሠሪው የቀረጸው ለምን ጥቅም ነው? ዲዳንም ጣዖት ይሠራ ዘንድ ሠሪው የታመነበቱ፥ ሐሰትን የሚያስተምር ቀልጦ የተሠራ ምን ይጠቅማል?  \n" +   
                "19 ፤ እንጨቱን። ንቃ፥ ዲዳውንም ድንጋይ። ተነሣ ለሚለው ወዮለት! በውኑ ይህ ያስተምራልን? እነሆ፥ በወርቅና በብር ተለብጦአል፥ ምንም እስትንፋስ የለበትም።  \n" +   
                "20 ፤ እግዚአብሔር ግን በተቀደሰ መቅደሱ አለ፤ ምድርም ሁሉ በፊቱ ዝም ትበል።"));
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "የነቢዩ የዕንባቆም ጸሎት በመዝሙር።  \n" +   
                "2 ፤ አቤቱ፥ ዝናህን ሰምቼ ፈራሁ፤ አቤቱ፥ በዓመታት መካከል ሥራህን ፈጽም፤ በዓመታት መካከል ትታወቅ፤ በመዓት ጊዜ ምሕረትን አስብ።  \n" +   
                "3 ፤ እግዚአብሔር ከቴማን፥ ቅዱሱም ከፋራን ተራራ ይመጣል። ክብሩ ሰማያትን ከድኖአል፥ ምስጋናውም ምድርን ሞልቶአል።  \n" +   
                "4 ፤ ፀዳሉም እንደ ብርሃን ነው፤ ጨረር ከእጁ ወጥቶአል፤ ኃይሉም በዚያ ተሰውሮአል።  \n" +   
                "5 ፤ ቸነፈር በፊቱ ይሄዳል፥ የእሳትም ነበልባል ከእግሩ ይወጣል።  \n" +   
                "6 ፤ ቆመ፥ ምድርንም አወካት፤ ተመለከተ፥ አሕዛብንም አናወጠ፤ የዘላለምም ተራሮች ተቀጠቀጡ፥ የዘላለምም ኮረብቶች ቀለጡ፤ መንገዱ ከዘላለም ነው።  \n" +   
                "7 ፤ የኢትዮጵያ ድንኳኖች ሲጨነቁ አየሁ፤ የምድያም አገር መጋረጃዎች ተንቀጠቀጡ።  \n" +   
                "8 ፤ በውኑ እግዚአብሔር በወንዞች ላይ ተቈጥቶአልን? ቍጣህ በወንዞች ላይ፥ መዓትህም በባሕር ላይ ነውን? በፈረሶችህና በማዳንህ ሰረገሎች ላይ ተቀምጠሃልና።  \n" +   
                "9 ፤ በቃልህ እንደ ማልህ መቅሠፍትህን አወጣህ፤ ቀስትህንም ገተርህ፤ ምድርን ሰንጥቀህ ፈሳሾችን አወጣህ።  \n" +   
                "10 ፤ ተራሮች አንተን አይተው ተጨነቁ፤ የውኃ ሞገድ አልፎአል፤ ቀላዩም ድምፁን ሰጥቶአል፥ እጁንም ወደ ላይ አንሥቶአል።  \n" +   
                "11 ፤ ፍላጾችህ ከወጡበት ብርሃን የተነሣ፥ ከሚንቦገቦገውም ከጦርህ ፀዳል የተነሣ፥ ፀሐይና ጨረቃ በመኖሪያቸው ቆሙ።  \n" +   
                "12 ፤ በምድር ላይ በመዓት ተራመድህ፤ አሕዛብን በቍጣ አሄድሃቸው።  \n" +   
                "13 ፤ ሕዝብህን ለመታደግ፥ የቀባኸውንም ለማዳን ወጣህ፤ የኃጢአተኛውን ቤት ራስ ቀጠቀጥህ፤ መሠረቱን እስከ አንገቱ ድረስ ገለጥህ።  \n" +   
                "14 ፤ የአለቆችን ራስ በገዛ በትራቸው ወጋህ፤ እኔን ይበትኑ ዘንድ እንደ ዐውሎ ነፋስ መጡ፤ ችግረኛውን በስውር ለመዋጥ ደስታቸው ነው።  \n" +   
                "15 ፤ ፈረሶችህን በባሕር፥ በብዙ ውኆችም ላይ አስረገጥህ።  \n" +   
                "16 ፤ እኔ ሰምቻለሁ፥ ልቤም ደነገጠብኝ፤ ከድምፁ የተነሣ ከንፈሮቼ ተንቀጠቀጡ፤ መንቀጥቀጥ ወደ አጥንቶቼ ውስጥ ገባ፤ በስፍራዬ ሆኜ ተናወጥሁ፤ በሚያስጨንቁን ሕዝብ ላይ እስኪመጣ ድረስ የመከራን ቀን ዝም ብዬ እጠብቃለሁ።  \n" +   
                "17 ፤ ምንም እንኳ በለስም ባታፈራ፥ በወይንም ሐረግ ፍሬ ባይገኝ፥ የወይራ ሥራ ቢጐድል፥ እርሾችም መብልን ባይሰጡ፥ በጎች ከበረቱ ቢጠፉ፥ ላሞችም በጋጡ ውስጥ ባይገኙ፥  \n" +   
                "18 ፤ እኔ ግን በእግዚአብሔር ደስ ይለኛል፤ በመድኃኒቴ አምላክ ሐሤት አደርጋለሁ።  \n" +   
                "19 ፤ ጌታ እግዚአብሔር ኃይሌ ነው፤ እግሮቼን እንደ ዋላ እግሮች ያደርጋል፤ በከፍታዎችም ላይ ያስሄደኛል።"));

        return new Chapter(3, verses);
    }


       
}