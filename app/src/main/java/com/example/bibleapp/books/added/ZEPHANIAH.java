package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class ZEPHANIAH {
    private Book ZEPHANIAHBook;

    public ZEPHANIAH() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
 
        ZEPHANIAHBook = new Book("ትንቢተ ሶፎንያስ", chapters);
    }

    public Book getZEPHANIAHBook() {
        return ZEPHANIAHBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","በይሁዳ ንጉሥ በአሞጽ ልጅ በኢዮስያስ ዘመን ወደ ሕዝቅያስ ልጅ ወደ አማርያ ልጅ ወደ ጎዶልያስ ልጅ ወደ ኵሲ ልጅ ወደ ሶፎንያስ የመጣ የእግዚአብሔር ቃል ይህ ነው።  \n" +   
                "2 ፤ ነገርን ሁሉ ከምድር ፊት ፈጽሜ አጠፋለሁ፥ ይላል እግዚአብሔር።  \n" +   
                "3 ፤ ሰውንና እንስሳን አጠፋለሁ፤ የሰማይን ወፎችና የባሕርን ዓሣዎች ማሰናከያንም ከኃጢአተኞች ጋር አጠፋለሁ፤ ሰውንም ከምድር ፊት እቈርጣለሁ፥ ይላል እግዚአብሔር።  \n" +   
                "4 ፤ እጄንም በይሁዳ ላይ በኢየሩሳሌምም በሚኖሩት ሁሉ ላይ እዘረጋለሁ፤ ከዚህም ስፍራ የበኣልን ቅሬታና የጣዖታቱን ካህናት ስም አጠፋለሁ፤  \n" +   
                "5 ፤ በሰገነትም ላይ ለሰማይ ሠራዊት የሚሰግዱትን፥ በእግዚአብሔርና በንጉሣቸው በሚልኮም ምለው የሚሰግዱትን፥  \n" +   
                "6 ፤ እግዚአብሔርንም ከመከተል የተመለሱትን፥ እግዚአብሔርንም ያልፈለጉትንና ያልጠየቁትን አጠፋለሁ።  \n" +   
                "7 ፤ የእግዚአብሔር ቀን ቀርቦአልና፥ እግዚአብሔር መሥዋዕትን አዘጋጅቶአልና፥ የጠራቸውንም ቀድሶአልና በጌታ በእግዚአብሔር ፊት ዝም በሉ።  \n" +   
                "8 ፤ በእግዚአብሔርም መሥዋዕት ቀን አለቆችንና የንጉሥን ልጆች እንግዳ ልብስ የሚለብሱትንም ሁሉ እቀጣለሁ።  \n" +   
                "9 ፤ በዚያም ቀን በመድረኩ ላይ የሚዘልሉትን፥ የጌታቸውን ቤት ዓመፃንና ሽንገላን የሚሞሉትን እቀጣለሁ።  \n" +   
                "10 ፤ በዚያ ቀን፥ ይላል እግዚአብሔር፥ ከዓሣው በር የጩኸት ድምፅ፥ ከከተማውም በሁለተኛው ክፍል ውካታ፥ ከኮረብቶቹም ታላቅ ሽብር ይሆናል።  \n" +   
                "11 ፤ እናንተ በመክቴሽ የምኖሩ ሆይ፥ የከነዓን ሕዝብ ሁሉ ጠፍተዋልና፥ ብርም የተሸከሙ ሁሉ ተቈርጠዋልና አልቅሱ።  \n" +   
                "12 ፤ በዚያም ዘመን ኢየሩሳሌምን በመብራት እመረምራለሁ፤ በአተላቸውም ላይ የሚቀመጡትን፥ በልባቸውም። እግዚአብሔር መልካምን አያደርግም፥ ክፉም አያደርግም የሚሉትን ሰዎች እቀጣለሁ።  \n" +   
                "13 ፤ ብልጥግናቸውም ለምርኮ ይሆናል፥ ቤቶቻቸውም ይፈርሳሉ፤ ቤቶችንም ይሠራሉ፥ ነገር ግን አይቀመጡባቸውም፤ ወይንንም ይተክላሉ፥ የወይን ጠጁን ግን አይጠጡም።  \n" +   
                "14 ፤ ታላቁ የእግዚአብሔር ቀን ቀርቦአል፤ የእግዚአብሔር ቀን ድምፅ ቀርቦአል እጅግም ፈጥኖአል፤ ኃያሉም በዚያ በመራራ ልቅሶ ይጮኻል።  \n" +   
                "15 ፤ ያ ቀን የመዓት ቀን የመከራና የጭንቀት ቀን፥ የመፍረስና የመጥፋት ቀን፥ የጨለማና የጭጋግ ቀን፥ የደመናና የድቅድቅ ጨለማ ቀን፥  \n" +   
                "16 ፤ በተመሸጉ ከተሞችና በረዘሙ ግንቦች ላይ የመለከትና የሰልፍ ጩኸት ቀን ነው።  \n" +   
                "17 ፤ በእግዚአብሔርም ላይ ኃጢአት ሠርተዋልና እንደ ዕውር እስኪሄዱ ድረስ ሰዎችን አስጨንቃለሁ፤ ደማቸውም እንደ ትቢያ፥ ሥጋቸውም እንደ ጕድፍ ይፈስሳል።  \n" +   
                "18 ፤ በእግዚአብሔርም ቍጣ ቀን ብራቸውና ወርቃቸው ሊያድናቸው አይችልም፤ እርሱም በምድር የሚኖሩትን ሁሉ ፈጥኖ ይጨርሳቸዋልና ምድር ሁሉ በቅንዓቱ እሳት ትበላለች።"));

        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "እናንተ እፍረት የሌላችሁ ሕዝብ ሆይ፥  \n" +   
                "2 ፤ ትእዛዝ ሳይወጣ፥ ቀኑም እንደ ገለባ ሳያልፍ፥ የእግዚአብሔርም ቍጣ ትኵሳት ሳይመጣባችሁ፥ የእግዚአብሔርም ቍጣ ቀን ሳይደርስባችሁ ተሰብሰቡ፥ ተከማቹም።  \n" +   
                "3 ፤ እናንተ ፍርዱን የጠበቃችሁ የምድር ትሑታን ሁሉ፥ እግዚአብሔርን ፈልጉ፤ ጽድቅንም ፈልጉ፥ ትሕትናንም ፈልጉ፤ ምናልባት በእግዚአብሔር ቍጣ ቀን ትሰወሩ ይሆናል።  \n" +   
                "4 ፤ ጋዛ ትበረበራለች፥ አስቀሎናም ባድማ ትሆናለች፤ አዞጦንንም በቀትር ወደ ውጭ ያሳድዱአታል፥ አቃሮንም ትነቀላለች።  \n" +   
                "5 ፤ በባሕር ዳር ለሚኖሩ ለከሊታውያን ሕዝብ ወዮላቸው! የፍልስጥኤማውያን ምድር ከነዓን ሆይ፥ የእግዚአብሔር ቃል በአንተ ላይ ነው፥ የሚቀመጥብህም ሰው እንዳይኖር አጠፋሃለሁ።  \n" +   
                "6 ፤ ቀርጤስም የእረኞች መኖሪያና የመንጎች በረት ይሆናል።  \n" +   
                "7 ፤ የባሕሩም ዳር ለይሁዳ ቤት ቅሬታ ይሆናል፥ በዚያም ይሰማራሉ፤ አምላካቸው እግዚአብሔር ይጐበኛቸዋልና፥ ምርኮአቸውንም ይመልሳልና በአስቀሎና ቤቶች ውስጥ ማታ ይተኛሉ።  \n" +   
                "8 ፤ በሕዝቤም ላይ ያላገጡባትን፥ በድንበራቸውም ላይ እየታበዩ የተናገሩባትን የሞዓብን ማላገጥና የአሞንን ልጆች ስድብ ሰምቻለሁ።  \n" +   
                "9 ፤ ስለዚህ የእስራኤል አምላክ የሠራዊት ጌታ እግዚአብሔር እንዲህ ይላል። እኔ ሕያው ነኝና በእርግጥ ሞዓብ እንደ ሰዶም፥ የአሞንም ልጆች እንደ ገሞራ፥ የሳማ ስፍራና የጨው ጕድጓድ ለዘላለምም ምድረ በዳ ሆነው ይኖራሉ፤ የሕዝቤም ቅሬታ ይበዘብዛቸዋል፥ ከወገኔም የተረፉት ይወርሱአቸዋል።  \n" +   
                "10 ፤ በሠራዊት ጌታ በእግዚአብሔር ሕዝብ ላይ አላግጠዋልና፥ እየታበዩም ተናግረዋልና ይህ ስለ ትዕቢታቸው ያገኛቸዋል።  \n" +   
                "11 ፤ እግዚአብሔር በእነርሱ ላይ የተፈራ ይሆናል፥ የምድርንም አማልክት ሁሉ ያከሳቸዋል፤ በአሕዛብም ደሴቶች ሁሉ ላይ የሚኖሩ ሰዎች ሁሉ በስፍራቸው ሆነው ለእርሱ ይሰግዳሉ።  \n" +   
                "12 ፤ እናንተም ኢትዮጵያውያን ደግሞ፥ በሰይፌ ትገደላላችሁ።  \n" +   
                "13 ፤ እርሱም በሰሜን ላይ እጁን ይዘረጋል፥ አሦርንም ያጠፋል፤ ነነዌንም ባድማ፥ እንደ በረሃም ደረቅ ያደርጋታል።  \n" +   
                "14 ፤ መንጎችም የምድርም አራዊት ሁሉ በውስጥዋ ይመሰጋሉ፤ ይብራና ጃርት በዓምዶችዋ መካከል ያድራሉ፤ ድምፃቸው በመስኮቶችዋ ይጮኻል፤ የዝግባም እንጨት ሥራ ይገለጣልና በመድረኮችዋ ላይ ጥፋት ይሆናል።  \n" +   
                "15 ፤ ተዘልላ የተቀመጠች፥ በልብዋም። እኔ ነኝ፥ ከእኔም በቀር ሌላ የለም ያለች ደስተኛይቱ ከተማ ይህች ናት፤ አራዊት የሚመሰጉባት ባድማ እንዴት ሆነች! በእርስዋ በኩል የሚያልፈው ሁሉ እጁን እያወዛወዘ ያፍዋጫል።"));
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "ለዓመፀኛይቱና ለረከሰች ለአስጨናቂይቱም ከተማ ወዮላት!  \n" +   
                "2 ፤ ድምፅን አልሰማችም፥ ተግሣጽንም አልተቀበለችም፤ በእግዚአብሔርም አልታመነችም፥ ወደ አምላክዋም አልቀረበችም።  \n" +   
                "3 ፤ በውስጥዋ ያሉ አለቆችዋ እንደሚያገሡ አንበሶች ናቸው፤ ፈራጆችዋም እስከ ነገ ድረስ ምንም እንደማያስቀሩ እንደ ማታ ተኵላዎች ናቸው።  \n" +   
                "4 ፤ ነቢያቶችዋ ቅሌታሞችና ተንኰለኞች ሰዎች ናቸው፤ ካህናቶችዋም መቅደሱን አርክሰዋል፥ በሕግም ላይ ግፍ ሠርተዋል።  \n" +   
                "5 ፤ እግዚአብሔር በውስጥዋ ጻድቅ ነው፤ ክፋትን አያደርግም፤ ፍርዱን በየማለዳው ወደ ብርሃን ያወጣል፥ ሳያወጣውም አይቀርም፤ ዓመፀኛው ግን እፍረትን አያውቅም።  \n" +   
                "6 ፤ አሕዛብን አጥፍቻለሁ፤ ግንቦቻቸው ሁሉ ፈርሰዋል፤ መንገዳቸውን ማንም እንዳያልፍባት ምድረ በዳ አድርጌአለሁ፥ ከተሞቻቸውም ማንም እንዳይኖርባቸው፥ አንድስ እንኳ እንዳይቀመጥባቸው ፈርሰዋል።  \n" +   
                "7 ፤ እኔም- ይፈሩኛል፥ ተግሣጽንም ይቀበላሉ፤ ካዘዝኋትም ሁሉ ከዓይንዋ ምንም አይጠፋም ብዬ ነበር፤ እነርሱ ግን በማለዳ ተነሥተው ድርጊታቸውን ሁሉ አረከሱ።  \n" +   
                "8 ፤ መዓቴንና የቍጣዬን ትኵሳት ሁሉ አፈስስባቸው ዘንድ ፍርዴ አሕዛብን ለመሰብሰብ፥ መንግሥታትንም ለማከማቸት ነውና፥ ምድርም ሁሉ በቅንዓቴ እሳት ትበላለችና ስለዚህ ለመበዝበዝ እስከምነሣበት ቀን ድረስ ጠብቁኝ፥ ይላል እግዚአብሔር።  \n" +   
                "9 ፤ በዚያን ጊዜም አሕዛብ ሁሉ አንድ ሆነው እግዚአብሔርን ያገለግሉት ዘንድ ስሙን እንዲጠሩ ንጹሐን ልሳን እመልስላቸዋለሁ።  \n" +   
                "10 ፤ ከኢትዮጵያ ወንዞች ማዶ የሚማልዱኝ፥ የተበተኑት ሴቶች ልጆቼ፥ ቍርባኔን ያመጡልኛል።  \n" +   
                "11 ፤ በዚያን ጊዜ እየታበዩ የሚፎክሩትን ከመካከልሽ አወጣለሁና፥ አንቺም በቅዱስ ተራራዬ ዳግመኛ አትኰሪምና በዚያ ቀን በእኔ ላይ ተላልፈሽ በሠራሽው ሥራ ሁሉ አትፍሪም።  \n" +   
                "12 ፤ በመካከልሽም የዋህና ትሑት ሕዝብን አስቀራለሁ፤ በእግዚአብሔርም ስም ይታመናሉ።  \n" +   
                "13 ፤ የእስራኤል ቅሬታ ኃጢአትን አይሠሩም፥ ሐሰትንም አይናገሩም፥ በአፋቸውም ውስጥ ተንኰለኛ ምላስ አይገኝም፤ እነርሱም ይሰማራሉ፥ ይመሰጉማል፥ የሚያስፈራቸውም የለም።  \n" +   
                "14 ፤ የጽዮን ልጅ ሆይ፥ ዘምሪ፤ እስራኤል ሆይ፥ እልል በል፤ የኢየሩሳሌም ልጅ ሆይ፥ በፍጹም ልብሽ ሐሤት አድርጊ ደስም ይበልሽ።  \n" +   
                "15 ፤ እግዚአብሔር ፍርድሽን አስወግዶአል፥ ጠላትሽንም ጥሎአል፤ የእስራኤል ንጉሥ እግዚአብሔር በመካከልሽ አለ፥ ከእንግዲህም ወዲህ ክፉ ነገርን አታዪም።  \n" +   
                "16 ፤ በዚያን ቀን ለኢየሩሳሌም። ጽዮን ሆይ፥ አትፍሪ፥ እጆችሽም አይዛሉ።  \n" +   
                "17 ፤ አምላክሽ እግዚአብሔር በመካከልሽ ታዳጊ ኃያል ነው፤ በደስታ በአንቺ ደስ ይለዋል፥ በፍቅሩም ያርፋል፥ በእልልታም በአንቺ ደስ ይለዋል ይባላል።  \n" +   
                "18 ፤ ከጉባኤው ርቀው የሚያዝኑትን፥ ከአንቺም የሆኑትን እሰበስባለሁ፤ ስድብ እንደ ሸክም ከብዶባቸው ነበር።  \n" +   
                "19 ፤ በዚያ ዘመን እነሆ፥ ባስጨነቁሽ ሁሉ ላይ አደርግባቸዋለሁ፤ አንካሳይቱንም አድናለሁ፥ የተጣለችውንም እሰበስባታለሁ፤ ባፈሩባትም ምድር ሁሉ ላይ ለምስጋናና ለከበረ ስም አደርጋቸዋለሁ።  \n" +   
                "20 ፤ በዚያ ዘመን አስገባችኋለሁ፥ በዚያም ዘመን እሰበስባችኋለሁ፤ ምርኮአችሁንም በዓይናችሁ ፊት በመለስሁ ጊዜ በምድር አሕዛብ ሁሉ መካከል ለከበረ ስምና ለምስጋና አደርጋችኋለሁ፥ ይላል እግዚአብሔር።"));

        return new Chapter(3, verses);
    }
       
}