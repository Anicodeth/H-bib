package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class MICAH {
    private Book MICAHBook;

    public MICAH() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
        chapters.add(chapterFour());
        chapters.add(chapterFive());
        chapters.add(chapterSix());
        chapters.add(chapterSeven());
 
        JONAHBook = new Book("ትንቢተ ሚክያስ", chapters);
    }

    public Book getMICAHBook() {
        return MICAHBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","በይሁዳ ነገሥታት በኢዮአታምና በአካዝ በሕዝቅያስም ዘመን ወደ ሞሬታዊው ወደ ሚክያስ የመጣው፥ ስለ ሰማርያና ስለ ኢየሩሳሌም ያየው፥ የእግዚአብሔር ቃል ይህ ነው።  \n" +   
                "2 ፤ እናንተ አሕዛብ ሁሉ፥ ስሙ፤ ምድርም ሙላዋም ታድምጥ፤ ጌታ እግዚአብሔርም፥ እርሱም በቅዱስ መቅደሱ የሆነ ጌታ፥ ይመስክርባችሁ።  \n" +   
                "3 ፤ እነሆ፥ እግዚአብሔር ከስፍራው ይወጣል፥ ወርዶም በምድር ከፍታዎች ላይ ይረግጣል።  \n" +   
                "4 ፤ ተራሮችም በእሳት ፊት እንዳለ ሰም፥ በገደልም ወርዶ እንደሚፈስስ ውኃ፥ በበታቹ ይቀልጣሉ፥ ሸለቆችም ይሰነጠቃሉ።  \n" +   
                "5 ፤ ይህ ሁሉ ስለ ያዕቆብ በደልና ስለ እስራኤል ቤት ኃጢአት ነው። የያዕቆብም በደል ምንድር ነው? ሰማርያ አይደለችምን? የይሁዳስ የኮረብታው መስገጃ ምንድር ነው? ኢየሩሳሌም አይደለችምን?  \n" +   
                "6 ፤ ስለዚህ ሰማርያን በሜዳ እንደሚገኝ የድንጋይ ክምር፥ ወይን እንደሚተከልበትም ስፍራ አደርጋታለሁ፤ ድንጋዮችዋንም ወደ ሸለቆ እወረውራለሁ፥ መሠረቶችዋንም እገልጣለሁ።  \n" +   
                "7 ፤ የተቀረጹትም ምስሎችዋ ይደቅቃሉ፥ በግልሙትና ያገኘችው ዋጋ ሁሉ በእሳት ይቃጠላል፥ ጣዖታትዋንም ሁሉ አጠፋለሁ፤ በግልሙትና ዋጋ ሰበሰበቻቸው፥ ወደ ግልሙትናም ዋጋ ይመለሳሉና።  \n" +   
                "8 ፤ ስለዚህ ነገር ዋይ ብላ ታለቅሳለች፥ ባዶ እግርዋንና ዕራቁትዋን ሆና ትሄዳለች፤ እንደ ቀበሮ ታለቅሳለች፥ እንደ ሰጐንም ዋይ ትላለች፤  \n" +   
                "9 ፤ ቍስልዋ የማይፈወስ ነውና፤ እስከ ይሁዳም ደርሶአልና፥ ወደ ሕዝቤም በር ወደ ኢየሩሳሌም ቀርቦአልና።  \n" +   
                "10 ፤ በጌት ላይ አታውሩ፤ በአኮ ላይ እንባን አታድርጉ፤ በቤትዓፍራ በትቢያ ላይ ተንከባለሉ።  \n" +   
                "11 ፤ በሻፊር የምትቀመጪ ሆይ፥ በዕራቁትነትሽና በእፍረት እለፊ፤ በጸዓናን የምትቀመጠው አልወጣችም፤ የቤትኤጼል ልቅሶ ከእናንተ ዘንድ መኖሪያውን ይወስዳል።  \n" +   
                "12 ፤ ክፉ ነገር ከእግዚአብሔር ዘንድ እስከ ኢየሩሳሌም በር ድረስ ወርዶአልና በማሮት የምትቀመጠው በጎነትን ትጠባበቃለች።  \n" +   
                "13 ፤ በለኪሶ የምትቀመጪ ሆይ፥ ሰረገላውን ለፈረስ እሰሪ፤ እርስዋ ለጽዮን ሴት ልጅ የኃጢአት መጀመሪያ ነበረች፤ የእስራኤል በደል በአንቺ ዘንድ ተገኝቶአልና።  \n" +   
                "14 ፤ ስለዚህ ትሎት ለሞሬሼትጌት ትሰጪአለሽ፤ የአክዚብ ቤቶች ለእስራኤል ነገሥታት አታላይ ይሆናሉ።  \n" +   
                "15 ፤ በመሪሳ የምትቀመጪ ሆይ፥ ወራሽ አመጣብሻለሁ፤ የእስራኤል ክብር ወደ ዓዶላም ይመጣል።  \n" +   
                "16 ፤ ተማርከው ከአንቺ ዘንድ ወጥተዋልና ስለ ተድላሽ ልጆች ራስሽን ንጪ፥ ጠጕርሽንም ተቈረጪ፤ ቡሃነትሽንም እንደ ንስር አስፊ።"));

        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "በመኝታቸው ላይ በደልን ለሚያስቡ ክፋትንም ለሚያደርጉ ወዮላቸው! ኃይል በእጃቸው ነውና ሲነጋ ይፈጽሙታል።  \n" +   
                "2 ፤ በእርሻው ላይ ይመኛሉ፥ በግዴታም ይይዙታል፤ በቤቶችም ላይ ይመኛሉ፥ ይወስዱአቸውማል፤ ሰውንና ቤቱን፥ ሰውንና ርስቱንም ይነጥቃሉ።  \n" +   
                "3 ፤ ስለዚህ እግዚአብሔር እንዲህ ይላል። እነሆ፥ በዚህ ወገን ላይ በክፉ አስባለሁ፥ ከዚያም አንገታችሁን አታነሡም፤ ዘመኑም ክፉ ነውና ቀጥ ብላችሁ አትሄዱም።  \n" +   
                "4 ፤ በዚያ ቀን በምሳሌ ይመስሉባችኋል፥ በጽኑ ልቅሶም ያለቅሱላችኋል፤ እነርሱም። ፈጽመን ጠፍተናል፤ የሕዝቤን እድል ፈንታ ይሰፍራል፥ እርሱንም የሚከለክል የለም፤ እርሻችንን ለዓመፀኞች ይከፍላል ይላሉ።  \n" +   
                "5 ፤ ስለዚህ በእግዚአብሔር ጉባኤ መካከል በዕጣ ገመድ የሚጥል አይኖርህም።  \n" +   
                "6 ፤ ትንቢት አትናገሩ ብለው ይናገራሉ፤ በእነዚህ ላይ ትንቢት አይናገሩም፥ ስድብም አይርቅም።  \n" +   
                "7 ፤ የያዕቆብ ቤት የተባልህ ሆይ፥ በውኑ የእግዚአብሔር መንፈስ የማይታገሥ ነውን? ወይስ ሥራው እንደዚች ናትን? ቃሌስ በቅን ለሚሄድ በጎነት አያደርግምን?  \n" +   
                "8 ፤ ነገር ግን ከቅርብ ጊዜ ጀምሮ ሕዝቤ እንደ ጠላት ሆኖ ተነሥቶአል፤ ቀሚስንና መጐናጸፊያን ገፈፋችሁ፤ ሳይፈሩም፤ የሚያልፉትን ከሰልፍ እንደሚመለሱ አደረጋችኋቸው።  \n" +   
                "9 ፤ የሕዝቤንም ሴቶች ከተሸለሙ ቤቶቻቸው አሳደዳችኋቸው፤ ከሕፃናቶቻቸውም ክብሬን ለዘላለም ወሰዳችሁ።  \n" +   
                "10 ፤ በዚህ ዕረፍት የላችሁምና ተነሥታችሁ ሂዱ፤ በርኵሰት ምክንያት ክፉ ጥፋት ታጠፋችኋለች።  \n" +   
                "11 ፤ ነፋስንም ተከትሎ። ስለ ወይን ጠጅና ስለ ስካር ትንቢት እናገርልሃለሁ ብሎ ሐሰትን የሚናገር ሰው ቢኖር እርሱ ለዚህ ሕዝብ ነቢይ ይሆናል።  \n" +   
                "12 ፤ ያዕቆብ ሆይ፥ ሁለንተናህን ፈጽሞ እሰበስባለሁ፥ የእስራኤልንም ቅሬታ ፈጽሞ አከማቻለሁ፤ እንደ ባሶራ በጎችና እንደ መንጋ በማሰማርያቸው ውስጥ በአንድነት አኖራቸዋለሁ፤ ከሰው ብዛት የተነሣ ድምፃቸውን ያሰማሉ።  \n" +   
                "13 ፤ ሰባሪው በፊታቸው ወጥቶአል፤ እነርሱም ሰብረው ወደ በሩ አልፈዋል፥ በእርሱም በኩል ወጥተዋል፤ ንጉሣቸውም በፊታቸው አልፎአል፥ እግዚአብሔርም በራሳቸው ላይ ነው።"));
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "እንዲህም አልሁ። የያዕቆብ አለቆችና የእስራኤል ቤት ገዦች ሆይ፥ እባካችሁ ስሙኝ፤ ፍርድን ታውቁ ዘንድ አይገባችሁምን?  \n" +   
                "2 ፤ መልካሙን ጠልታችኋል፥ ክፉውንም ወድዳችኋል፤ ቁርበታቸውን ገፍፋችኋቸዋል፥ ሥጋቸውንም ከአጥንታቸው ለያይታችኋል፤  \n" +   
                "3 ፤ የሕዝቤን ሥጋ በልታችኋል፥ ቁርበታቸውንም ገፍፋችኋቸዋል፥ አጥንታቸውንም ሰብራችኋል፤ ለአፍላል እንደሚሆን ሥጋ ለድስትም እንደሚሆን ሙዳ ቈራረጣችኋቸው።  \n" +   
                "4 ፤ የዚያን ጊዜ ወደ እግዚአብሔር ይጮኻሉ፥ እርሱም አይሰማቸውም፤ ሥራቸውንም ክፉ አድርገዋልና በዚያን ጊዜ ፊቱን ከእነርሱ ይሰውራል።  \n" +   
                "5 ፤ እግዚአብሔር ሕዝቤን ስለሚያስቱ ነቢያት እንዲህ ይላል፤ በጥርሳቸው ሲነክሱ በሰላም ይሰብካሉ፤ በአፋቸው ግን አንዳች በማይሰጥ ሰው ላይ ሰልፍን ያስቡበታል።  \n" +   
                "6 ፤ ስለዚህ ሌሊት ይሆንባችኋል እንጂ ራእይ አይሆንላችሁም፤ ጨለማም ይሆንባችኋል እንጂ አታምዋርቱም፤ ፀሐይም በነቢያት ላይ ትገባለች፥ ቀኑም ይጠቁርባቸዋል።  \n" +   
                "7 ፤ ከእግዚአብሔርም ዘንድ መልስ የለምና ባለ ራእዩቹ ያፍራሉ፥ ምዋርተኞችም ይዋረዳሉ፤ ሁሉም ከንፈራቸውን ይሸፍናሉ።  \n" +   
                "8 ፤ እኔ ግን በደሉን ለያዕቆብ፥ ኃጢአቱንም ለእስራኤል እነግር ዘንድ በእግዚአብሔር መንፈስ ኃይልንና ፍርድን ብርታትንም ተሞልቻለሁ።  \n" +   
                "9 ፤ ፍርድን የምትጠሉ ቅን ነገርንም ሁሉ የምታጣምሙ እናንተ የያዕቆብ ቤት አለቆችና የእስራኤል ቤት ገዦች ሆይ፥ እባካችሁ ይህን ስሙ።  \n" +   
                "10 ፤ ጽዮንን በደም፥ ኢየሩሳሌምንም በኃጢአት ይሠራሉ።  \n" +   
                "11 ፤ አለቆችዋ በጉቦ ይፈርዳሉ፥ ካህናቶችዋም በዋጋ ያስተምራሉ፥ ነቢያቶችዋም በገንዘብ ያምዋርታሉ፤ ከዚህም ጋር። እግዚአብሔር በመካከላችን አይደለምን? ክፉ ነገር ምንም አይመጣብንም እያሉ በእግዚአብሔር ይታመናሉ።  \n" +   
                "12 ፤ ስለዚህ በእናንተ ምክንያት ጽዮን እንደ እርሻ ትታረሳለች፥ ኢየሩሳሌምም የድንጋይ ክምር ትሆናለች፥ የቤቱም ተራራ እንደ ዱር ከፍታ ይሆናል።"));

        return new Chapter(3, verses);
    }

    private Chapter chapterFour() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "በመጨረሻውም ዘመን የእግዚአብሔር ቤት ተራራ በተራሮች ራስ ላይ ጸንቶ ይቆማል፥ ከኮረብቶችም በላይ ከፍ ከፍ ይላል፤ አሕዛብም ወደ እርሱ ይጐርፋሉ።  \n" +   
                "2 ፤ ከጽዮን ሕግ፥ ከኢየሩሳሌምም የእግዚአብሔር ቃል ይወጣልና ብዙዎች አሕዛብ ሄደው። ኑ፥ ወደ እግዚአብሔር ተራራ፥ ወደ ያዕቆብ አምላክ ቤት እንውጣ፤ እርሱም መንገዱን ያስተምረናል፥ በፍለጋውም እንሄዳለን ይላሉ።  \n" +   
                "3 ፤ በብዙዎችም አሕዛብ መካከል ይፈርዳል፥ በሩቅም ባሉ በብርቱዎች አሕዛብ ላይ ይበይናል፤ ሰይፋቸውንም ማረሻ፥ ጦራቸውንም ማጭድ ለማድረግ ይቀጠቅጣሉ፤ ሕዝብም በሕዝብ ላይ ሰይፍ አያነሣም ከእንግዲህም ወዲህ ሰልፍ አይማሩም።  \n" +   
                "4 ፤ የሠራዊት ጌታ የእግዚአብሔር አፍም ተናግሮአልና ሰው እያንዳንዱ ከወይኑና ከበለሱ በታች ይቀመጣል፥ የሚያስፈራውም የለም።  \n" +   
                "5 ፤ ሕዝብም ሁሉ እያንዳንዱ በየአምላኩ ስም ይሄዳል፥ እኛም በአምላካችን በእግዚአብሔር ስም ለዘላለም እንሄዳለን።  \n" +   
                "6 ፤ በዚያ ቀን አንካሳይቱን እሰበስባለሁ፥ ይላል እግዚአብሔር፥ የባከነችውንና ያስጨነቅኋትንም አከማቻለሁ፤  \n" +   
                "7 ፤ አንካሳይቱንም ለቅሬታ፥ ወደ ሩቅም የተጣለችውን ለብርቱ ሕዝብ አደርጋታለሁ፤ ከዚያም ወዲያ እስከ ዘላለም ድረስ እግዚአብሔር በጽዮን ተራራ በእነርሱ ላይ ይነግሣል።  \n" +   
                "8 ፤ አንተም የመንጋ ግንብ ሆይ፥ የጽዮን ሴት ልጅ አምባ፥ ወደ አንተ ትመጣለች፤ የቀደመችው ግዛት፥ የኢየሩሳሌም ሴት ልጅ መንግሥት ትደርሳለች።  \n" +   
                "9 ፤ አሁንስ ለምን ትጮኺአለሽ? እንደምትወልድ ሴት ምጥ የደረሰብሽ፥ ንጉሥ ስለሌለሽ ነውን? ወይስ መካሪ ስለ ጠፋብሽ ነውን?  \n" +   
                "10 ፤ የጽዮን ልጅ ሆይ፥ እንደምትወልድ ሴት አምጠሽ ውለጂ፤ አሁን ከከተማ ትወጫለሽና፥ በሜዳም ትቀመጫለሽ፥ ወደ ባቢሎንም ትደርሻለሽ፤ በዚያም ያድንሻል፥ በዚያም እግዚአብሔር ከጠላቶችሽ እጅ ይቤዥሻል።  \n" +   
                "11 ፤ አሁንም። ርኩስ ትሁን፥ ዓይናችንም በጽዮን ላይ ይይ የሚሉ ብዙ አሕዛብ በአንቺ ላይ ተሰብስበዋል።  \n" +   
                "12 ፤ ነገር ግን የእግዚአብሔርን አሳብ አያውቁም፥ ምክሩንም አያስተውሉም፤ እንደ ነዶ ወደ አውድማ አከማችቶአቸዋልና።  \n" +   
                "13 ፤ የጽዮን ልጅ ሆይ፥ ቀንድሽን ብረት፥ ጥፍርሽንም ናስ አደርጋለሁና ተነሺ አሂጂ፤ ብዙ አሕዛብንም ታደቅቂአለሽ፤ ትርፋቸውንም ለእግዚአብሔር፥ ሀብታቸውንም ለምድር ሁሉ ጌታ ትቀድሻለሽ።"));

        return new Chapter(4, verses);
    }

    private Chapter chapterFive() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "የጭፍሮች ሴት ልጅ ሆይ፥ ጭፍሮችሽን አሁን ሰብስቢ፤ ከብቦ አስጨንቆናል፤ የእስራኤልን ፈራጅ ጕንጩን በበትር ይመታሉ።  \n" +   
                "2 ፤ አንቺም ቤተ ልሔም ኤፍራታ ሆይ፥ አንቺ በይሁዳ አእላፋት መካከል ትሆኚ ዘንድ ታናሽ ነሽ፤ ከአንቺ ግን አወጣጡ ከቀድሞ ጀምሮ ከዘላለም የሆነ፥ በእስራኤልም ላይ ገዥ የሚሆን ይወጣልኛል።  \n" +   
                "3 ፤ ስለዚህ ወላጂቱ እስከምትወልድበት ጊዜ ድረስ አሳልፎ ይሰጣቸዋል፤ የቀሩትም ወንድሞቹ ወደ እስራኤል ልጆች ይመለሳሉ።  \n" +   
                "4 ፤ እርሱም ይቆማል፥ በእግዚአብሔርም ኃይል በአምላኩ በእግዚአብሔር ስም ግርማ መንጋውን ይጠብቃል፤ እነርሱም ይኖራሉ፤ እርሱ አሁን እስከ ምድር ዳርቻ ድረስ ታላቅ ይሆናልና።  \n" +   
                "5 ፤ ይህም ለሰላም ይሆናል፤ አሦራዊውም ወደ አገራችን በገባ ጊዜ፥ ምድራችንንም በረገጠ ጊዜ ሰባት እረኞችና ስምንት አለቆች እናስነሣበታለን።  \n" +   
                "6 ፤ የአሦርንም አገር በሰይፍ፥ የናምሩድንም አገር በመግቢያው ውስጥ ያፈርሳሉ፤ አሦራዊውም ወደ አገራችን በገባ ጊዜ፥ ዳርቾቻችንንም በረገጠ ጊዜ እርሱ ይታደገናል።  \n" +   
                "7 ፤ የያዕቆብም ቅሬታ በብዙ አሕዛብ መካከል ከእግዚአብሔር ዘንድ እንደሚወርድ ጠል፥ በሣር ላይ እንደሚወድ ካፊያ፤ ሰውንም እንደማይጠብቅ፥ የሰውንም ልጆች ተስፋ እንደማያደርግ ይሆናል።  \n" +   
                "8 ፤ በዱር አራዊትም መካከል እንዳለ አንበሳ፥ በበጎች መንጋም መካከል አልፎ እንደሚረግጥ፥ የሚታደግም ሳይኖር እንደሚነጥቅ እንደ አንበሳ ደቦል፥ እንዲሁ የያዕቆብ ቅሬታ በአሕዛብና በብዙ ወገኖች መካከል ይሆናል።  \n" +   
                "9 ፤ እጅህ በጠላቶችህ ላይ ከፍ ከፍ ትበል፥ ጠላቶችህም ሁሉ ይጥፉ።  \n" +   
                "10 ፤ በዚያም ቀን ፈረሶችህን ከመካከልህ አጠፋለሁ፥ ሰረገሎችህንም እሰብራለሁ፥ ይላል እግዚአብሔር፤  \n" +   
                "11 ፤ የምድርህንም ከተሞች አጠፋለሁ፥ ምሽጎችህንም ሁሉ አፈርሳለሁ፤  \n" +   
                "12 ፤ መተትንም ከእጅህ አጠፋለሁ፥ ምዋርተኞችም ከእንግዲህ ወዲህ አይሆኑልህም፤  \n" +   
                "13 ፤ የተቀረጹትን ምስሎችህንና ሐውልቶችህን ከመካከልህ አጠፋለሁ፥ ለእጅህም ሥራ ከእንግዲህ ወዲህ አትሰግድም፤  \n" +   
                "14 ፤ የማምለኪያ ዐፀዶችህንም ከመካከልህ እነቅላለሁ፥ ከተሞችህንም አፈርሳለሁ።  \n" +   
                "15 ፤ ባልሰሙም አሕዛብ ላይ በቍጣና በመዓት እበቀላለሁ።"));

        return new Chapter(5, verses);
    }

    private Chapter chapterSix() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "አሁን። ተነሣ፥ በተራሮችም ፊት ተፋረድ፥ ኮረብቶችም ቃልህን ይስሙ ብሎ እግዚአብሔር የሚለውን ስሙ።  \n" +   
                "2 ፤ ተራሮች ሆይ፥ ጠንካሮች የምድር መሠረቶችም ሆይ፥ እግዚአብሔር ከሕዝቡ ጋር ክርክር አለውና፥ ከእስራኤልም ጋር ይፋረዳልና የእግዚአብሔርን ክርክር ስሙ።  \n" +   
                "3 ፤ ሕዝቤ ሆይ፥ ምን አድርጌሃለሁ? በምንስ አድክሜሃለሁ? መስክርብኝ።  \n" +   
                "4 ፤ ከግብጽ ምድር አውጥቼሃለሁ፥ ከባርነት ቤትም ተቤዥቼሃለሁ፤ በፊትህም ሙሴንና አሮንን ማርያምንም ልኬልህ ነበር።  \n" +   
                "5 ፤ ሕዝቤ ሆይ፥ የሞዓብ ንጉሥ ባላቅ የመከረውን፥ የቢዖርም ልጅ በለዓም የመለሰለትን አሁን አስብ፤ የእግዚአብሔርንም የጽድቅ ሥራ ታውቅ ዘንድ ከሰጢም ጀምሮ እስከ ጌልገላ ድረስ አስብ።  \n" +   
                "6 ፤ ምን ይዤ ወደ እግዚአብሔር ፊት ልምጣና በልዑል አምላክ ፊት ልስገድ? የሚቃጠለውን መሥዋዕትና የአንዱን ዓመት ጥጃ ይዤ በፊቱ ልምጣን?  \n" +   
                "7 ፤ እግዚአብሔርስ በሺህ አውራ በጎች ወይስ በእልፍ የዘይት ፈሳሾች ደስ ይለዋልን? ወይስ የበኵር ልጄን ስለ በደሌ፥ የሆዴንም ፍሬ ስለ ነፍሴ ኃጢአት እሰጣለሁን?  \n" +   
                "8 ፤ ሰው ሆይ፥ መልካሙን ነግሮሃል፤ እግዚአብሔርም ከአንተ ዘንድ የሚሻው ምንድር ነው? ፍርድን ታደርግ ዘንድ፥ ምሕረትንም ትወድድ ዘንድ፥ ከአምላክህም ጋር በትሕትና ትሄድ ዘንድ አይደለምን?  \n" +   
                "9 ፤ የእግዚአብሔር ድምፅ ከተማይቱን ይጠራታል፤ ስምህን መፍራት ጥበብ ነው፤ የመቅሠፍትን በትር፥ እርሱንም ያዘጋጀ ማን እንደ ሆነ ስሙ።  \n" +   
                "10 ፤ በውኑ በኃጢአተኛ ቤት የኃጢአት መዝገብ፥ የተጸየፈም ውሽተኛ መስፈሪያ ገና አለ ይሆን?  \n" +   
                "11 ፤ በአባይ ሚዛንና በከረጢት ባለ በተንኰል መመዘኛ ንጹሕ እሆናለሁን?  \n" +   
                "12 ፤ ባለ ጠጎችዋን ግፍ ሞልቶባቸዋል፤ በእርስዋም የሚኖሩ በሐሰት ተናግረዋል፥ ምላሳቸውም በአፋቸው ውስጥ ተንኰለኛ ነው።  \n" +   
                "13 ፤ ስለዚህ እኔ ደግሞ በክፉ ቍስል መታሁህ፤ ስለ ኃጢአትህም አፈርስሁህ።  \n" +   
                "14 ፤ ትበላለህ፥ ነገር ግን አትጠግብም፥ ችጋርህም በመካከልህ ይሆናል፤ ትወስዳለህ፥ ነገር ግን አታድንም፤ የምታድነውንም ለሰይፍ እሰጣለሁ።  \n" +   
                "15 ፤ ትዘራለህ፥ ነገር ግን አታጭድም፤ ወይራውንም ትጨምቃለህ፥ ነገር ግን ዘይቱን አትቀባም፤ ወይኑንም ትጨምቃለህ፥ ነገር ግን የወይን ጠጁን አትጠጣም።  \n" +   
                "16 ፤ አንተን ለጥፋት፥ በእርስዋም የሚኖሩትን ለማፍዋጫ እሰጥ ዘንድ የዘንበሪን ሥርዓትና የአክዓብን ቤት ሥራ ሁሉ ጠብቃችኋል፥ በምክራቸውም ሄዳችኋል፤ የሕዝቤንም ስድብ ትሸከማላችሁ።"));

        return new Chapter(6, verses);
    }

    private Chapter chapterSeven() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "የዛፍ ፍሬና የወይን ፍሬ ከተለቀሙ በኋላ እንደ ቀረው ቃርሚያ ሆኛለሁና ወዮልኝ! መብል የሚሆን ዘለላ፥ ነፍሴም የተመኘችው በመጀመሪያ የበሰለው በለስ የለም።  \n" +   
                "2 ፤ ደግ ሰው ከምድር ጠፍቶአል፥ በሰውም መካከል ቅን የለም፤ ሁሉ ደምን ለማፍሰስ ያደባሉ፥ ሰውም ሁሉ ወንድሙን በመረብ ለመያዝ ይከታተለዋል።  \n" +   
                "3 ፤ እጆቻቸውን ለክፋት ያነሣሉ፤ አለቃውና ፈራጁ ጉቦን ይፈልጋሉ፥ ትልቁም ሰው እንደ ነፍሱ ምኞት ይናገራል፤ እንዲሁም ክፋትን ይጐነጕናሉ።  \n" +   
                "4 ፤ ከእነርሱም ሁሉ የተሻለው እርሱ እንደ አሜከላ ነው፥ ከሁሉም ቅን የሆነው እንደ ኵርንችት ነው፤ ጠባቆችህ የሚጐበኙበት ቀን መጥቶአል፤ አሁን ይሸበራሉ።  \n" +   
                "5 ፤ ባልንጀራን አትመኑ፥ በወዳጅም አትታመኑ፤ የአፍህን ደጅ በብብትህ ከምትተኛው ጠብቅ።  \n" +   
                "6 ፤ ወንድ ልጅ አባቱን ይንቃልና፥ ሴት ልጅ በእናትዋ ላይ፥ ምራቲቱም በአማትዋ ላይ ትነሣለችና፥ የሰው ጠላቶች የቤቱ ሰዎች ናቸውና።  \n" +   
                "7 ፤ እኔ ግን ወደ እግዚአብሔር እመለከታለሁ፥ የመድኃኒቴንም አምላክ ተስፋ አደርጋለሁ፤ አምላኬም ይሰማኛል።  \n" +   
                "8 ፤ ጠላቴ ሆይ፥ ብወድቅ እነሣለሁና፥ በጨለማም ብቀመጥ እግዚአብሔር ብርሃን ይሆንልኛልና በእኔ ላይ ደስ አይበልሽ።  \n" +   
                "9 ፤ በእግዚአብሔር ላይ ኃጢአት ሠርቻለሁና እስኪምዋገትልኝ ድረስ፥ ፍርድን ለእኔ እስኪያደርግ ድረስ ቍጣውን እታገሣለሁ። ወደ ብርሃን ያወጣኛል፥ ጽድቅንም አያለሁ።  \n" +   
                "10 ፤ ጠላቴም ታያለች፥ እኔንም። አምላክህ እግዚአብሔር ወዴት ነው? ያለች በእፍረት ትከደናለች።  \n" +   
                "11 ፤ ዓይኖቼ ይመለከቱአታል፤ አሁን እንደ መንገድ ጭቃ ትረገጣለች። ቅጥርሽ በሚሠራበት በዚያ ቀን ድንበርሽ ትስፋፋለች።  \n" +   
                "12 ፤ በዚያ ቀን ከአሦርና ከግብጽ ከተሞች፥ ከግብጽ እስከ ወንዙ፥ ከባሕርም እስከ ባሕር፥ ከተራራም እስከ ተራራ ድረስ ወደ አንቺ ይመጣሉ።  \n" +   
                "13 ፤ ምድሪቱ ግን በሚኖሩባት በሥራቸው ፍሬ ምክንያት ባድማ ትሆናለች።  \n" +   
                "14 ፤ በቀርሜሎስ መካከል ባለው ዱር ብቻቸውን የተቀመጡት ሰዎችህ፥ የርስትህን በጎች፥ በበትርህ አግድ፤ እንደ ቀደመውም ዘመን በበሳንና በገለዓድ ይሰማሩ።  \n" +   
                "15 ፤ ከግብጽ ምድር እንደ ወጣህበት ዘመን ተአምራትን አሳያቸዋለሁ።  \n" +   
                "16 ፤ አሕዛብ አይተው በጕልበታቸው ሁሉ ያፍራሉ፤ እጃቸውን በአፋቸው ላይ ያኖራሉ፥ ጆሮአቸውም ትደነቍራለች፤  \n" +   
                "17 ፤ እንደ እባብም መሬት ይልሳሉ፥ እንደ ምድርም ተንቀሳቃሾች እየተንቀጠቀጡ ከግንባቸው ይመጣሉ፤ ፈርተውም ወደ አምላካችን ወደ እግዚአብሔር ይመጣሉ፥ ስለ አንተም ይፈራሉ።  \n" +   
                "18 ፤ በደልን ይቅር የሚል፥ የርስቱንም ቅሬታ ዓመፅ የሚያሳልፍ እንደ አንተ ያለ አምላክ ማን ነው? ምሕረትን ይወድዳልና ቍጣውን ለዘላለም አይጠብቅም።  \n" +   
                "19 ፤ ተመልሶ ይምረናል፤ ክፋታችንንም ይጠቀጥቃል፥ ኃጢአታችንንም በባሕሩ ጥልቅ ይጥለዋል።  \n" +   
                "20 ፤ ከቀድሞ ዘመን ጀምረህ ለአባቶቻችን የማልህላቸውን እውነት ለያዕቆብ፥ ምሕረትንም ለአብርሃም ታደርጋለህ።"));

        return new Chapter(7, verses);
    }
       
}