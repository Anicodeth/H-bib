package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class JOEL {
    private Book JOELBook;

    public JOEL() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
 
        JOELBook = new Book("ትንቢተ ኢዮኤል", chapters);
    }

    public Book getJOELBook() {
        return JOELBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","ወደ ባቱኤል ልጅ ወደ ኢዩኤል የመጣው የእግዚአብሔር ቃል ይህ ነው።  \n" +   
                "2 ፤ እናንተ ሽማግሌዎች፥ ይህን ስሙ፤ በምድርም የምትኖሩ ሁሉ፥ አድምጡ። ይህ በዘመናችሁ ወይስ በአባቶቻችሁ ዘመን ሆኖ ነበርን?  \n" +   
                "3 ፤ ይህን ለልጆቻችሁ ንገሩ፤ ልጆቻችሁም ለልጆቻቸው፥ ልጆቻቸውም ለኋለኛው ትውልድ ይንገሩ።  \n" +   
                "4 ፤ ከተሞች የቀረውን አንበጣ በላው፤ ከአንበጣም የቀረውን ደጎብያ በላው፤ ከደጎብያም የቀረውን ኩብኩባ በላው።  \n" +   
                "5 ፤ በተሃ ወይን ጠጃችሁ ከአፋችሁ ተወግዶአልና እናንተ ሰካራሞች፥ ነቅታችሁ አልቅሱ፤ እናንተም የወይን ጠጅ የምትጠጡ ሁሉ፥ ዋይ በሉ።  \n" +   
                "6 ፤ ቍጥርም የሌለው ብርቱ ሕዝብ በምድሬ ላይ ወጥቶአልና፤ ጥርሳቸው እንደ አንበሳ ጥርስ፥ መንጋጋቸውም እንደ እንስቲቱ አንበሳ መንጋጋ ነው።  \n" +   
                "7 ፤ ወይኔን ባዶ ምድር አደረገው፥ በለሴንም ሰበረው፤ ባዶም አደረገው፥ ጣለውም፤ ቅርንጫፎቹም ነጡ።  \n" +   
                "8 ፤ ለቍንጅናዋ ባል ማቅ ለብሳ እንደምታለቅስ ድንግል አልቅሺ።  \n" +   
                "9 ፤ የእህሉ ቍርባንና የመጠጡ ቍርባን ከእግዚአብሔር ቤት ተወግዶአል፤ የእግዚአብሔርም አገልጋዮች ካህናቱ አለቀሱ።  \n" +   
                "10 ፤ እህሉ ጠፍቶአልና፥ ወይኑም ደርቆአልና፥ ዘይቱም ጐድሎአልና እርሻው ምድረ በዳ ሆኖአል፥ ምድሪቱም አልቅሳለች።  \n" +   
                "11 ፤ መከሩ ከእርሻቸው ጠፍቶአልና ገበሬዎች ስለ ስንዴውና ስለ ገብሱ አፈሩ፤ የወይን አትክልተኞችም አለቀሱ።  \n" +   
                "12 ፤ ወይኑ ደርቆአል፥ በለሱም ጠውልጎአል፤ ሮማኑና ተምሩ እንኰዩም የምድርም ዛፎች ሁሉ ደርቀዋል፤ ደስታም ከሰው ልጆች ዘንድ ርቆአል።  \n" +   
                "13 ፤ የእህሉ ቍርባንና የመጠጡ ቍርባን ከአምላካችሁ ቤት ቀርቶአልና እናንተ ካህናት፥ ማቅ ታጥቃችሁ አልቅሱ፤ እናንተም የመሠዊያ አገልጋዮች፥ ዋይ በሉ፤ እናንተ የአምላኬ አገልጋዮች፥ ኑ፥ ሌሊቱን ሁሉ በማቅ ላይ ተኙ።  \n" +   
                "14 ፤ ጾምን ቀድሱ፥ ጉባኤውንም አውጁ፤ ሽምግሌዎችንና በምድር የሚኖሩትን ሁሉ ወደ አምላካችሁ ወደ እግዚአብሔር ቤት ሰብስቡ፥ ወደ እግዚአብሔርም ጩኹ።  \n" +   
                "15 ፤ የእግዚአብሔር ቀን ቀርቦአልና ለቀኑ ወዮ! እርሱም ሁሉን ከሚችል ከአምላክ ዘንድ እንደ ጥፋት ይመጣል።  \n" +   
                "16 ፤ ከዓይናችን ፊት ምግብ፥ ከአምላካችንም ቤት ደስታና እልልታ የጠፋ አይደለምን?  \n" +   
                "17 ፤ ዘሩ በምድር ውስጥ በሰበሰ፤ እህሉ ደርቆአልና ጎተራዎቹ ባዶ ናቸው፥ ጎታዎቹም ፈርሰዋል።  \n" +   
                "18 ፤ እንስሶች እጅግ ጮኹ፤ የላምም መንጎች ማሰማርያ የላቸውምና ተጠራጠሩ፤ የበግም መንጎች ጠፍተዋል።  \n" +   
                "19 ፤ አቤቱ፥ እሳት የምድረ በዳውን ማሰማርያ በልቶአልና፥ ነበልባሉም የዱሩን ዛፍ ሁሉ አቃጥሎአልና ወደ አንተ እጮኻለሁ።  \n" +   
                "20 ፤ ፈሳሹ ውኃ ደርቆአልና፥ እሳቱም የምድረ በዳውን ማሰማርያ በልቶአልና የምድር አራዊት ወደ አንተ አለኸለኩ።"));

        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "የእግዚአብሔር ቀን መጥቶአልና፥ እርሱም ቀርቦአልና በጽዮን መለከትን ንፉ፥ በቅዱሱም ተራራዬ ላይ እሪ በሉ፤ በምድርም የሚኖሩ ሁሉ ይንቀጥቀጡ፤ የእግዚአብሔር ቀን መጥቶአልና፤  \n" +   
                "2 ፤ የጨለማና የጭጋግ ቀን፥ የደመናና የድቅድቅ ጨለማ ቀን ነው፤ ታላቅና ብርቱ ሕዝብ በተራሮች ላይ እንደ ወገግታ ተዘርግቶአል፤ ከዘላለምም ጀምሮ እንደ እነርሱ ያለ አልነበረም፥ ከእነርሱም በኋላ እስከ ብዙ ትውልድ ድረስ እንደ እነርሱ ያለ ከእንግዲህ ወዲህ አይሆንም።  \n" +   
                "3 ፤ እሳት በፊታቸው ትባላለች፥ በኋላቸውም ነበልባል ታቃጥላለች፤ ምድሪቱ በፊታቸው እንደ ዔድን ገነት፥ በኋላቸውም የምድረ በዳ በረሃ ናት፤ ከእነርሱም የሚያመልጥ የለም።  \n" +   
                "4 ፤ መልካቸው እንደ ፈረስ መልክ ነው፥ እንደ ፈረሶችም ይሮጣሉ።  \n" +   
                "5 ፤ በተራራ ላይ እንዳሉ ሰረገሎች ድምፅ፥ ገለባውንም እንደሚበላ እንደ እሳት ነበልባል ድምፅ፥ ለሰልፍም እንደ ተዘጋጀ እንደ ብርቱ ሕዝብ ያኰበኵባሉ።  \n" +   
                "6 ፤ ከፊታቸው አሕዛብ ይንቀጠቀጣሉ፤ የሰውም ፊት ሁሉ ይጠቍራል።  \n" +   
                "7 ፤ እንደ ኃያላን ይሮጣሉ፥ እንደ ሰልፈኞችም በቅጥሩ ላይ ይወጣሉ፤ እያንዳንዱም በመንገዱ ላይ ይራመዳል፥ ከእርምጃቸውም አያፈገፍጉም።  \n" +   
                "8 ፤ አንዱ ካንዱ ጋር አይጋፉም፥ እያንዳንዱም መንገዱን ይጠበጥባል፤ በሰልፍ መካከል ያልፋሉ፥ እነርሱም አይቈስሉም።  \n" +   
                "9 ፤ በከተማም ያኰበkWbaሉ፥ በቅጥሩም ላይ ይሮጣሉ፤ ወደ ቤቶችም ይወጣሉ፥ እንደ ሌባም በመስኮቶች ይገባሉ።  \n" +   
                "10 ፤ ምድሪቱም ከፊታቸው ትናወጣለች፥ ሰማያትም ይንቀጠቀጣሉ፤ ፀሐይና ጨረቃም ይጨልማሉ፥ ከዋክብትም ብርሃናቸውን ይሰውራሉ።  \n" +   
                "11 ፤ እግዚአብሔርም በሠራዊቱ ፊት ድምፁን ይሰጣል፤ ሰፈሩ እጅግ ብዙ ነውና፥ ቃሉንም የሚያደርግ እርሱ ኃያል ነውና፤ የእግዚአብሔርም ቀን ታላቅና እጅግ የሚያስፈራ ነውና ማንስ ይችለዋል?  \n" +   
                "12 ፤ አሁንስ፥ ይላል እግዚአብሔር፥ በፍጹም ልባችሁ፥ በጾምም፥ በልቅሶና በዋይታ ወደ እኔ ተመለሱ።  \n" +   
                "13 ፤ ልባችሁን እንጂ ልብሳችሁን አትቅደዱ፤ አምላካችሁም እግዚአብሔር ቸርና መሐሪ፥ ው የዘገየ፥ ምሕረቱም የበዛ፥ ለክፋትም የተጸጸተ ነውና ወደ እርሱ ተመለሱ።  \n" +   
                "14 ፤ የሚመለስና የሚጸጸት እንደ ሆነ፥ ለአምላካችሁም ለእግዚአብሔር የእህልና የመጠጥ ባን የሚሆነውን በረከት የሚያተርፍ እንደ ሆነ ማን ያውቃል?  \n" +   
                "15 ፤ በጽዮን መለከትን ንፉ፥ ጾምንም ቀድሱ፥ ጉባኤውንም አውጁ፥  \n" +   
                "16 ፤ ሕዝቡንም አከማቹ፥ ማኅበሩንም ቀድሱ፥ ሽማግሌዎቹንም ሰብስቡ፥ ሕፃናቱንና ጡት የሚጠቡትን አከማቹ፤ ሙሽራው ከእልፍኙ፥ ሙሽራይቱም ከጫጉላዋ ይውጡ።  \n" +   
                "17 ፤ የእግዚአብሔርም አገልጋዬች ካህናት ከወለሉና ከመሠዊያው መካከል እያለቀሱ። አቤቱ፥ ለሕዝብህ ራራ፥ አሕዛብም እንዳይነቅፉአቸው ርስትህን ለማላገጫ አሳልፈህ አትስጥ፤ ከአሕዛብ መካከል። አምላካቸው ወዴት ነው? ስለ ምን ይላሉ? ይበሉ።  \n" +   
                "18 ፤ እግዚአብሔርም ስለ ምድሩ ቀና፥ ለሕዝቡም ራራለት።  \n" +   
                "19 ፤ እግዚአብሔርም መልሶ ሕዝቡን። እነሆ፥ እህልንና ወይንን ዘይትንም እሰድድላችኋለሁ፥ እናንተም በእርሱ ትጠግባላችሁ፤ ከእንግዲህም ወዲያ በአሕዛብ መካከል መሰደቢያ አላደርጋችሁም።  \n" +   
                "20 ፤ የሰሜንንም ሠራዊት ከእናንተ ዘንድ አርቃለሁ፥ ወደ በረሃና ወደ ምድረበዳ፥ ፊቱን ወደ ምሥራቁ ባሕር ጀርባውንም ወደ ምዕራቡ ባሕር አድርጌ አሳድደዋለሁ፤ እርሱም ትዕቢትን አድርጎአልና ግማቱ ይወጣል፥ ክርፋቱም ይነሣል አለ።  \n" +   
                "21 ፤ ምድር ሆይ፥ እግዚአብሔር ታላቅ ነገር አድርጎአልና አትፍሪ፥ ደስም ይበልሽ፥ እልልም በዪ።  \n" +   
                "22 ፤ እናንተ የምድር እንስሶች ሆይ፥ የምድር በዳው ማሰማርያ ለምልሞአልና፥ ዛፉም ፍሬውን አፍርቶአልና፥ በለሱና ወይኑም ኃይላቸውን ሰጥተዋልና አትፍሩ።  \n" +   
                "23 ፤ እናንተ የጽዮን ልጆች፥ አምላካችሁ እግዚአብሔር የፊተኛውን ዝናብ በጽድቅ ሰጥቶአችኋልና፥ እንደ ቀድሞውም የፊተኛውንና የኋለኛውን ዝናብ አዝንቦላችኋልና በእርሱ ደስ ይበላችሁ፥ ለእርሱም እልል በሉ።  \n" +   
                "24 ፤ አውድማዎችም እህልን ይሞላሉ፥ መጥመቂያዎችም የወይን ጠጅንና ዘይትን አትረፍርፈው ያፈስሳሉ።  \n" +   
                "25 ፤ የሰደድሁባችሁ ታላቁ ሠራዊቴ አንበጣና ደጎብያ ኩብኩባና ተምች የበላቸውን ዓመታት እመልስላችኋለሁ።  \n" +   
                "26 ፤ ብዙ መብል ትበላላችሁ፥ ትጠግቡማላችሁ፤ ከእናንተም ጋር ተአምራትን የሠራውን የአምላካችሁን የእግዚአብሔርን ስም ታመሰግናላችሁ፤ ሕዝቤም ለዘላለም አያፍርም።  \n" +   
                "27 ፤ እኔም በእስራኤል መካከል እንዳለሁ፥ እኔም አምላካችሁ እግዚአብሔር እንደ ሆንሁ፥ ከእኔም በቀር ሌላ አምላክ እንደሌለ ታውቃላችሁ፤ ሕዝቤም ለዘላለም አያፍርም።  \n" +   
                "28 ፤ ከዚህም በኋላ እንዲህ ይሆናል፤ መንፈሴን በሥጋ ለባሽ ሁሉ ላይ አፈስሳለሁ፤ ወንዶችና ሴቶች ልጆቻችሁም ትንቢት ይናገራሉ፥ ሽማግሌዎቻችሁም ሕልምን ያልማሉ፥ ጐበዞቻችሁም ራእይ ያያሉ፤  \n" +   
                "29 ፤ ደግሞም በዚያ ወራት በወንዶችና በሴቶች ባሪያዎች ላይ መንፈሴን አፈስሳለሁ፤  \n" +   
                "30 ፤ በላይ በሰማይ ድንቆችን አሳያለሁ፥ በታች በምድርም ደምና እሳት የጢስም ጭጋግ።  \n" +   
                "31 ፤ ታላቁና የሚያስፈራው የእግዚአብሔር ቀን ሳይመጣ ፀሐይ ወደ ጨለማ፥ ጨረቃም ወደ ደም ይለወጣል።  \n" +   
                "32 ፤ እንዲህም ይሆናል፤ የእግዚአብሔር ስም የሚጠራ ሁሉ ይድናል፤ እግዚአብሔርም እንደ ተናገረ፥ በጽዮን ተራራና በኢየሩሳሌም መድኃኒት ይገኛል። ደግሞም እግዚአብሔር የጠራቸው፥ የምስራች የሚሰበከላቸው ይገኛሉ።"));
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "እነሆም፥ በዚህ ወራትና በዚህ ዘመን፥ የይሁዳንና የኢየሩሳሌምን ምርኮ በምመልስበት ጊዜ፥  \n" +   
                "2 ፤ አሕዛብን ሁሉ ሰብስቤ ወደ ኢዮሣፍጥ ሸለቆ አወርዳቸዋለሁ፤ በዚያም ስለ ሕዝቤና ስለ ርስቴ ስለ እስራኤል በአሕዛብ መካከል የበተኑአቸውን ምድሬንም የተካፈሉአትን እፋረድባቸዋለሁ።  \n" +   
                "3 ፤ በሕዝቤም ላይ ዕጣ ተጣጣሉ፤ ወንድ ልጅን ለጋለሞታ ዋጋ ሰጡ፥ ሴት ልጅን ለወይን ጠጅ ሸጡ፥ ጠጡም።  \n" +   
                "4 ፤ ጢሮስና ሲዶና የፍልስጥኤምም ግዛት ሁሉ ሆይ፥ ከእናንተ ጋር ለእኔ ምን አለኝ? በውኑ ብድራትን ትመልሱልኛላችሁን? ብድራትን ብትመልሱልኝ ፈጥኜ በችኰላ ብድራታችሁን በራሳችሁ ላይ እመልሳለሁ።  \n" +   
                "5 ፤ ብሬንና ወርቄን ወስዳችኋልና፥ የተወደደውንም መልካሙን ዕቃዬን ወደ መቅደሳችሁ አግብታችኋልና፥  \n" +   
                "6 ፤ ከዳርቻቸውም ታርቁአቸው ዘንድ የይሁዳንና የኢየሩሳሌምን ልጆች ለግሪክ ሰዎች ሸጣችኋልና፥  \n" +   
                "7 ፤ እነሆ፥ እነርሱን ከሸጣችሁበት ስፍራ አስነሣቸዋለሁ፥ ብድራታችሁንም በራሳችሁ ላይ እመልሳለሁ።  \n" +   
                "8 ፤ እግዚአብሔር ተናግሮአልና ወንዶችና ሴቶች ልጆቻችሁን በይሁዳ ልጆች እጅ እሸጣለሁ፥ እነርሱም ለሩቆቹ ሕዝብ ለሳባ ሰዎች ይሸጡአችኋል።  \n" +   
                "9 ፤ ይህን በአሕዛብ መካከል አውጁ ለሰልፍ ተዘጋጁ ኃያላንን አስነሡ ሰልፈኞች ሁሉ ይቅረቡ ይውጡም።  \n" +   
                "10 ፤ ማረሻችሁን ሰይፍ፥ ማጭዳችሁንም ጦር ለማድረግ ቀጥቅጡ፤ ደካማውም። እኔ ብርቱ ነኛ ይበል።  \n" +   
                "11 ፤ እናንተ በዙሪያ ያላችሁ አሕዛብ ሁሉ፥ ቸkWlaችሁ ኑ፥ ተሰብሰቡ፤ አቤቱ፥ ኃያላኖችህን ወደዚያ አውርድ።  \n" +   
                "12 ፤ አሕዛብ ይነሡ፥ ወደ ኢዮሣፍጥ ሸለቆም ይውጡ፤ በዙሪያ ባሉ አሕዛብ ሁሉ ላይ እፈርድ ዘንድ በዚያ እቀመጣለሁና።  \n" +   
                "13 ፤ መከሩ ደርሶአልና ማጭድ ስደዱ መጥመቂያውም ሞልቶአልና ኑ እርገጡ፤ ክፉታቸውም በዝቶአልና መጥመቂያ ሁሉ ፈርሶአል።  \n" +   
                "14 ፤ የእግዚአብሔር ቀን በፍርድ ሸለቆ ቀርቦአልና የብዙ ብዙ ሕዝብ ውካታ በፍርድ ሸለቆ አለ።  \n" +   
                "15 ፤ ፀሐይና ጨረቃ ጨልመዋል፥ ከዋክብትም ብርሃናቸውን ሰውረዋል።  \n" +   
                "16 ፤ እግዚአብሔርም በጽዮን ሆኖ ድምፁን ከፍ አድርጎ ይጮኻል፥ በኢየሩሳሌምም ሆኖ ቃሉን ይሰጣል፤ ሰማይና ምድርም ይናወጣሉ፤ እግዚአብሔር ግን ለሕዝቡ መሸሸጊያ፥ ለእስራኤልም ልጆች መጠጊያ ይሆናል።  \n" +   
                "17 ፤ እኔም በተቀደሰው ተራራዬ በጽዮን የምቀመጥ አምላካችሁ እግዚአብሔር እንደ ሆንሁ ታውቃላችሁ፤ የዚያን ጊዜም ኢየሩሳሌም የተቀደሰች ትሆናለች፥ እንግዶችም ከእንግዲህ ወዲህ አያልፉባትም።  \n" +   
                "18 ፤ በዚያም ቀን እንዲህ ይሆናል፤ ተራሮች በተሃ ጠጅ ያንጠባጥባሉ፥ ኮረብቶችም ወተትን ያፈስሳሉ፥ በይሁዳም ያሉት ፈፋዎች ሁሉ ውኃን ያጐርፋሉ ከእግዚአብሔርም ቤት ምንጭ ትፈልቃለች፥ የሰጢምንም ሸለቆ ታጠጣለች።  \n" +   
                "19 ፤ በአገራቸው ንጹሑን ደም አፍስሰዋልና በይሁዳ ልጆች ላይ ስላደረጉት ግፍ ግብጽ ምድረ በዳ፥ ኤዶምያስም በረሃ ይሆናል።  \n" +   
                "20 ፤ ነገር ግን ይሁዳ ለዘላለም፥ ኢየሩሳሌምም ለልጅ ልጅ መኖሪያ ይሆናል።  \n" +   
                "21 ፤ እኔም ንጹሕ ያላደረግሁትን ደማቸውን ንጹሕ አደርገዋለሁ፥ እግዚአብሔርም በጽዮን ያድራል።  \n" +   
                "  \n" +   
                ""));

        return new Chapter(3, verses);
    }
       
}