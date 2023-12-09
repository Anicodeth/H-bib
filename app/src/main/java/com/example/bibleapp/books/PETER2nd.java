package com.example.bibleapp.books;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class PETER2nd {
    private Book PETER2ndBook;

    public PETER2nd() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());

        PETER2ndBook = new Book("2ኛ የጴጥሮስ መልእክት", chapters);
    }

    public Book getPETER2ndBook() {
        return PETER2ndBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "የኢየሱስ ክርስቶስ ባሪያና ሐዋርያ የሆነ ስምዖን ጴጥሮስ፥ በአምላካችንና በመድኃኒታችን በኢየሱስ ክርስቶስ ጽድቅ ካገኘነው ጋር የተካከለ የክብር እምነትን ላገኙ፤\n" +
                "2 -\n" +
                "3 የመለኮቱ ኃይል፥ በገዛ ክብሩና በበጎነቱ የጠራንን በማወቅ፥ ለሕይወትና እግዚአብሔርን ለመምሰል የሚሆነውን ነገር ሁሉ ስለ ሰጠን፥ በእግዚአብሔርና በጌታችን በኢየሱስ እውቀት ጸጋና ሰላም ይብዛላችሁ።\n" +
                "4 ስለ ክፉ ምኞት በዓለም ካለው ጥፋት አምልጣችሁ ከመለኮት ባሕርይ ተካፋዮች በተስፋ ቃል እንድትሆኑ፥ በእነዚያ ክብርና በጎነት የተከበረና እጅግ ታላቅ የሆነ ተስፋን ሰጠን።\n" +
                "5 ስለዚህም ምክንያት ትጋትን ሁሉ እያሳያችሁ በእምነታችሁ በጎነትን ጨምሩ፥\n" +
                "6 በበጎነትም እውቀትን፥ በእውቀትም ራስን መግዛት፥ ራስንም በመግዛት መጽናትን፥ በመጽናትም እግዚአብሔርን መምሰል፥\n" +
                "7 እግዚአብሔርንም በመምሰል የወንድማማችን መዋደድ፥ በወንድማማችም መዋደድ ፍቅርን ጨምሩ።\n" +
                "8 እነዚህ ነገሮች ለእናንተ ሆነው ቢበዙ፥ በጌታችን በኢየሱስ ክርስቶስ እውቀት ሥራ ፈቶችና ፍሬ ቢሶች እንዳትሆኑ ያደርጉአችኋልና፤\n" +
                "9 እነዚህ ነገሮች የሌሉት ዕውር ነውና፥ በቅርብም ያለውን ብቻ ያያል፥ የቀደመውንም ኃጢአቱን መንጻት ረስቶአል።\n" +
                "10 ስለዚህ፥ ወንድሞች ሆይ፥ መጠራታችሁንና መመረጣችሁን ታጸኑ ዘንድ ከፊት ይልቅ ትጉ፤ እነዚህን ብታደርጉ ከቶ አትሰናከሉምና።\n" +
                "11 እንዲሁ ወደ ዘላለሙ ወደ ጌታችንና መድኃኒታችን ወደ ኢየሱስ ክርስቶስ መንግሥት መግባት በሙላት ይሰጣችኋልና።\n" +
                "12 ስለዚህ እነዚህን ነገሮች ምንም ብታውቁ በእናንተም ዘንድ ባለ እውነት ምንም ብትጸኑ፥ ስለ እነዚህ ዘወትር እንዳሳስባችሁ ቸል አልልም።\n" +
                "13 ሁልጊዜም በዚህ ማደሪያ ሳለሁ በማሳሰቤ ላነቃችሁ የሚገባኝ ይመስለኛል።\n" +
                "14 ጌታችን ኢየሱስ ክርስቶስ እንዳመለከተኝ ከዚህ ማደሪያዬ መለየቴ ፈጥኖ እንዲሆን አውቃለሁና።\n" +
                "15 ከመውጣቴም በኋላ እነዚህን ነገሮች እንድታስቡ በየጊዜው ትችሉ ዘንድ እተጋለሁ።\n" +
                "16 የእርሱን ግርማ አይተን እንጂ በብልሃት የተፈጠረውን ተረት ሳንከተል የጌታችንን የኢየሱስ ክርስቶስን ኃይልና መምጣት አስታወቅናችሁ።\n" +
                "17 ከገናናው ክብር። በእርሱ ደስ የሚለኝ የምወደው ልጄ ይህ ነው የሚል ያ ድምፅ በመጣለት ጊዜ ከእግዚአብሔር አብ ክብርንና ምስጋናን ተቀብሎአልና፤\n" +
                "18 እኛም በቅዱሱ ተራራ ከእርሱ ጋር ሳለን ይህን ድምፅ ከሰማይ ሲወርድ ሰማን።\n" +
                "19 ከእርሱም ይልቅ እጅግ የጸና የትንቢት ቃል አለን፤ ምድርም እስኪጠባ ድረስ የንጋትም ኮከብ በልባችሁ እስኪወጣ ድረስ፥ ሰው በጨለማ ስፍራ የሚበራን መብራት እንደሚጠነቀቅ ይህን ቃል እየጠነቀቃችሁ መልካም ታደርጋላችሁ።\n" +
                "20 ይህን በመጀመሪያ እወቁ፤ በመጽሐፍ ያለውን ትንቢት ሁሉ ማንም ለገዛ ራሱ ሊተረጉም አልተፈቀደም፤\n" +
                "21 ትንቢት ከቶ በሰው ፈቃድ አልመጣምና፥ ዳሩ ግን በእግዚአብሔር ተልከው ቅዱሳን ሰዎች በመንፈስ ቅዱስ ተነድተው ተናገሩ።" +
                "\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "ነገር ግን ሐሰተኞች ነቢያት ደግሞ በሕዝቡ መካከል ነበሩ እንዲሁም በመካከላችሁ ደግሞ ሐሰተኞች አስተማሪዎች ይሆናሉ፤ እነርሱም የዋጃቸውን ጌታ እንኳ ክደው የሚፈጥንን ጥፋት በራሳቸው ላይ እየሳቡ የሚያጠፋ ኑፋቄን አሹልከው ያገባሉ፤\n" +
                "2 ብዙዎችም በመዳራታቸው ይከተሉአቸዋል በእነርሱም ጠንቅ የእውነት መንገድ ይሰደባል።\n" +
                "3 ገንዘብንም በመመኘት በተፈጠረ ነገር ይረቡባችኋል፤ ፍርዳቸውም ከጥንት ጀምሮ አይዘገይም ጥፋታቸውም አያንቀላፋም።\n" +
                "4 እግዚአብሔር ኃጢአትን ላደረጉ መላእክት ሳይራራላቸው ወደ ገሃነም ጥሎ በጨለማ ጉድጓድ ለፍርድ ሊጠበቁ አሳልፎ ከሰጣቸው፥\n" +
                "5 ለቀደመውም ዓለም ሳይራራ ከሌሎች ሰባት ጋር ጽድቅን የሚሰብከውን ኖኅን አድኖ በኃጢአተኞች ዓለም ላይ የጥፋትን ውኃ ካወረደ፥\n" +
                "6 ኃጢአትንም ያደርጉ ዘንድ ላሉት ምሳሌ አድርጎ ከተማዎችን ሰዶምንና ገሞራን አመድ እስኪሆኑ ድረስ አቃጥሎና ገልብጦ ከፈረደባቸው፥\n" +
                "7 -\n" +
                "8 ጻድቅ ሎጥም በመካከላቸው ሲኖር እያየና እየሰማ ዕለት ዕለት በዓመፀኛ ሥራቸው ጻድቅ ነፍሱን አስጨንቆ ነበርና በዓመፀኞች ሴሰኛ ኑሮ የተገፋውን ያን ጻድቅ ካዳነ፥\n" +
                "9 -\n" +
                "10 ጌታ እግዚአብሔርን የሚያመልኩትን ከፈተና እንዴት እንዲያድን፥ በደለኞችንም ይልቁንም በርኵስ ምኞት የሥጋን ፍትወት እየተከተሉ የሚመላለሱትን ጌትነትንም የሚንቁትን እየቀጣቸው ለፍርድ ቀን እንዴት እንዲጠብቅ ያውቃል። ደፋሮችና ኵሩዎች ሆነው ሥልጣን ያላቸውን ሲሳደቡ አይንቀጠቀጡም፤\n" +
                "11 ዳሩ ግን መላእክት በኃይልና በብርታት ከእነርሱ ይልቅ ምንም ቢበልጡ በጌታ ፊት በእነርሱ ላይ የስድብን ፍርድ አያመጡም።\n" +
                "12 እነዚህ ግን ለመጠመድና ለመጥፋት በፍጥረታቸው እንደ ተወለዱ አእምሮ እንደ ሌላቸው እንስሶች ሆነው፥ በማያውቁት ነገር እየተሳደቡ በጥፋታቸው ይጠፋሉ፤\n" +
                "13 የዓመፃቸውን ደመወዝ ይቀበላሉ። በቀን ሲዘፍኑ እንደ ተድላ ይቆጥሩታል፤ ነውረኞችና ርኵሳን ሆነው ከእናንተ ጋር ሲጋበዙ በፍቅር ግብዣ ይዘፍናሉ፤\n" +
                "14 ምንዝር የሞላባቸው ኃጢአትንም የማይተዉ ዓይኖች አሉአቸው፤ የማይጸኑትን ነፍሳት ያታልላሉ፤ መመኘትን የለመደ ልብ አላቸው፤ የተረገሙ ናቸው።\n" +
                "15 ቅንን መንገድ ትተው ተሳሳቱ፤ የባሶርን ልጅ የበለዓምን መንገድ ተከተሉ፤ እርሱ የዓመፃን ደመወዝ ወደደ፥\n" +
                "16 ነገር ግን ስለ መተላለፉ ተዘለፈ፤ ቃል የሌለው አህያ በሰው ቃል ተናግሮ የነቢዩን እብድነት አገደ።\n" +
                "17 ድቅድቅ ጨለማ ለዘላለም የተጠበቀላቸው እነዚህ ውኃ የሌለባቸው ምንጮች በዐውሎ ነፋስም የተነዱ ደመናዎች ናቸው።\n" +
                "18 ከንቱና ከመጠን ይልቅ ታላቅ የሆነውን ቃል ይናገራሉና፥ በስሕተትም ከሚኖሩት አሁን የሚያመልጡትን በሥጋ ሴሰኛ ምኞት ያታልላሉ።\n" +
                "19 ራሳቸው የጥፋት ባሪያዎች ሆነው። አርነት ትወጣላችሁ እያሉ ተስፋ ይሰጡአቸዋል፤ ሰው ለተሸነፈበት ለእርሱ ተገዝቶ ባሪያ ነውና።\n" +
                "20 በጌታችንና በመድኃኒታችን በኢየሱስ ክርስቶስ እውቀት ከዓለም ርኵሰት ካመለጡ በኋላ ዳግመኛ በእርስዋ ተጠላልፈው የተሸነፉ ቢሆኑ፥ ከፊተኛው ኑሮአቸው ይልቅ የኋለኛው የባሰ ሆኖባቸዋል።\n" +
                "21 አውቀዋት ከተሰጣቸው ከቅድስት ትእዛዝ ከሚመለሱ የጽድቅን መንገድ ባላወቋት በተሻላቸው ነበርና።\n" +
                "22 ውሻ ወደ ትፋቱ ይመለሳል፥ ደግሞ። የታጠበች እርያ በጭቃ ለመንከባለል ትመለሳለች እንደሚባል እውነተኞች ምሳሌዎች ሆኖባቸዋል።\n"));
        // Add more verses as needed
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "ወዳጆች ሆይ፥ አሁን የምጽፍላችሁ መልእክት ይህች ሁለተኛይቱ ናት። በቅዱሳን ነቢያትም ቀድሞ የተባለውን ቃል በሐዋርያቶቻችሁም ያገኛችኋትን የጌታንና የመድኃኒትን ትእዛዝ እንድታስቡ በሁለቱ እያሳሰብኋችሁ ቅን ልቡናችሁን አነቃቃለሁ።\n" +
                "2 በመጨረሻው ዘመን እንደ ራሳቸው ምኞት የሚመላለሱ ዘባቾች በመዘበት እንዲመጡ ይህን በፊት እወቁ፤\n" +
                "3 እነርሱም። የመምጣቱ የተስፋ ቃል ወዴት ነው? አባቶች ከሞቱባት ጊዜ፥ ከፍጥረት መጀመሪያ ይዞ ሁሉ እንዳለ ይኖራልና ይላሉ።\n" +
                "4 ሰማያት ከጥንት ጀምረው ምድርም በእግዚአብሔር ቃል ከውኃ ተጋጥማ በውኃ መካከል እንደ ነበሩ ወደው አያስተውሉምና፤\n" +
                "5 በዚህም ምክንያት ያን ጊዜ የነበረ ዓለም በውኃ ሰጥሞ ጠፋ፤\n" +
                "6 አሁን ያሉ ሰማያትና ምድር ግን እግዚአብሔርን የማያመልኩት ሰዎች እስከሚጠፉበት እስከ ፍርድ ቀን ድረስ ተጠብቀው በዚያ ቃል ለእሳት ቀርተዋል።\n" +
                "7 እናንተ ግን ወዳጆች ሆይ፥ በጌታ ዘንድ አንድ ቀን እንደ ሺህ ዓመት፥ ሺህ ዓመትም እንደ አንድ ቀን እንደ ሆነ ይህን አንድ ነገር አትርሱ።\n" +
                "8 ለአንዳንዶች የሚዘገይ እንደሚመስላቸው ጌታ ስለ ተስፋ ቃሉ አይዘገይም፥ ነገር ግን ሁሉ ወደ ንስሐ እንዲደርሱ እንጂ ማንም እንዳይጠፋ ወዶ ስለ እናንተ ይታገሣል።\n" +
                "9 የጌታው ቀን ግን እንደ ሌባ ሆኖ ይመጣል፤ በዚያም ቀን ሰማያት በታላቅ ድምፅ ያልፋሉ፥ የሰማይም ፍጥረት በትልቅ ትኵሳት ይቀልጣል፥ ምድርም በእርስዋም ላይ የተደረገው ሁሉ ይቃጠላል።\n" +
                "10 -\n" +
                "11 ይህ ሁሉ እንዲህ የሚቀልጥ ከሆነ፥ የእግዚአብሔርን ቀን መምጣት እየጠበቃችሁና እያስቸኰላችሁ፥ በቅዱስ ኑሮ እግዚአብሔርንም በመምሰል እንደ ምን ልትሆኑ ይገባችኋል? ስለዚያ ቀን ሰማያት ተቃጥለው ይቀልጣሉ የሰማይም ፍጥረት በትልቅ ትኵሳት ይፈታል፤\n" +
                "12 ነገር ግን ጽድቅ የሚኖርባትን አዲስ ሰማይና አዲስ ምድር እንደ ተስፋ ቃሉ እንጠብቃለን።\n" +
                "13 ስለዚህ፥ ወዳጆች ሆይ፥ ይህን እየጠበቃችሁ ያለ ነውርና ያለ ነቀፋ ሆናችሁ በሰላም በእርሱ እንድትገኙ ትጉ፥\n" +
                "14 የጌታችንም ትዕግሥት መዳናችሁ እንደ ሆነ ቍጠሩ። እንዲህም የተወደደው ወንድማችን ጳውሎስ ደግሞ እንደ ተሰጠው ጥበብ መጠን ጻፈላችሁ፥ በመልእክቱም ሁሉ ደግሞ እንደ ነገረ ስለዚህ ነገር ተናገረ።\n" +
                "15 በእነዚያ ዘንድ ለማስተዋል የሚያስቸግር ነገር አለ፥ ያልተማሩትና የማይጸኑትም ሰዎች ሌሎችን መጻሕፍት እንደሚያጣምሙ እነዚህን ደግሞ ለገዛ ጥፋታቸው ያጣምማሉ።\n" +
                "16 እንግዲህ እናንተ፥ ወዳጆች ሆይ፥ ይህን አስቀድማችሁ ስለምታውቁ፥ በዓመፀኞቹ ስሕተት ተስባችሁ ከራሳችሁ ጽናት እንዳትወድቁ ተጠንቀቁ፤\n" +
                "17 ነገር ግን በጌታችንና በመድኃኒታችን በኢየሱስ ክርስቶስ ጸጋና እውቀት እደጉ። ለእርሱ አሁንም እስከ ዘላለምም ቀን ድረስ ክብር ይሁን፤ አሜን።"));

        return new Chapter(3, verses);
    }

}