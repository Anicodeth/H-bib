package com.example.bibleapp.books;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class JUDE {
    private Book JUDEBook;

    public JUDE() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());

        JUDEBook = new Book("የይሁዳ መልእክት", chapters);
    }

    public Book getJUDESBook() {
        return JUDEBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "የኢየሱስ ክርስቶስ ባሪያ የያዕቆብም ወንድም የሆነ ይሁዳ፥ በእግዚአብሔር አብ ተወደው ለኢየሱስ ክርስቶስም ተጠብቀው ለተጠሩ፤\n" +
                "2 ምሕረትና ሰላም ፍቅርም ይብዛላችሁ።\n" +
                "3 ወዳጆች ሆይ፥ ስለምንካፈለው ስለ መዳናችን ልጽፍላችሁ እጅግ ተግቼ ሳለሁ፥ ለቅዱሳን አንድ ጊዜ ፈጽሞ ስለ ተሰጠ ሃይማኖት እንድትጋደሉ እየመከርኋችሁ እጽፍላችሁ ዘንድ ግድ ሆነብኝ።\n" +
                "4 ከብዙ ጊዜ በፊት ለዚህ ፍርድ የተጻፉ አንዳንዶች ሰዎች ሾልከው ገብተዋልና፤ ኃጢአተኞች ሆነው የአምላካችንን ጸጋ በሴሰኝነት ይለውጣሉ ንጉሣችንንና ጌታችንንም ብቻውን ያለውን ኢየሱስ ክርስቶስን ይክዳሉ።\n" +
                "5 ዳሩ ግን ሁሉን አንድ ጊዜ ፈጽሞ ምንም የተማራችሁ ብትሆኑ ጌታ ከግብፅ አገር ሕዝቡን አድኖ የማያምኑትን በኋላ እንዳጠፋቸው ላሳስባችሁ እወዳለሁ።\n" +
                "6 መኖሪያቸውንም የተዉትን እንጂ የራሳቸውን አለቅነት ያልጠበቁትን መላእክት በዘላለም እስራት ከጨለማ በታች እስከ ታላቁ ቀን ፍርድ ድረስ ጠብቆአቸዋል።\n" +
                "7 እንዲሁም እንደ እነርሱ ዝሙትን ያደረጉና ሌላን ሥጋ የተከተሉ ሰዶምና ገሞራ በዙሪያቸውም የነበሩ ከተማዎች በዘላለም እሳት እየተቀጡ ምሳሌ ሆነዋል።\n" +
                "8 እንዲሁም እነዚህ ሰዎች ደግሞ እያለሙ ሥጋቸውን ያረክሳሉ ጌትነትንም ይጥላሉ ሥልጣን ያላቸውንም ይሳደባሉ።\n" +
                "9 የመላእክት አለቃ ሚካኤል ግን ከዲያብሎስ ጋር በተከራከረ ጊዜ ስለ ሙሴ ሥጋ ሲነጋገር። ጌታ ይገሥጽህ አለው እንጂ የስድብን ፍርድ ሊናገረው አልደፈረም።\n" +
                "10 እነዚህ ግን የማያውቁትን ሁሉ ይሳደባሉ፥ አእምሮም እንደሌላቸው እንስሶች በፍጥረታቸው በሚያውቁት ሁሉ በእርሱ ይጠፋሉ።\n" +
                "11 ወዮላቸው፥ በቃየል መንገድ ሄደዋልና ስለ ደመወዝም ለበለዓም ስሕተት ራሳቸውን አሳልፈው ሰጥተዋል በቆሬም መቃወም ጠፍተዋል።\n" +
                "12 እነዚህ ከእናንተ ጋር ሲጋበዙ በፍቅር ግብዣችሁ እንደ እድፍ ናቸው፤ እንደ እረኞች ያለ ፍርሃት ራሳቸውን ይጠብቃሉ፤ በነፋስ የተወሰዱ ውኃ የሌለባቸው ደመናዎች፥ ፍሬ የማያፈሩ ሁለት ጊዜ የሞቱ ከነሥራቸው የተነቀሉ በበጋ የደረቁ ዛፎች፥\n" +
                "13 የገዛ ነውራቸውን አረፋ እየደፈቁ ጨካኝ የባሕር ማዕበል፥ ድቅድቅ ጨለማ ለዘላለም የተጠበቀላቸው የሚንከራተቱ ከዋክብት ናቸው።\n" +
                "14 -\n" +
                "15 ከአዳም ጀምሮ ሰባተኛ የሆነ ሄኖክ። እነሆ፥ ጌታ በሁሉ ላይ እንዲፈርድ፥ በኃጢአተኝነትም ስላደረጉት ስለ ኃጢአተኛ ሥራቸው ሁሉ ዓመፀኞችም ኃጢአተኞች በእርሱ ላይ ስለ ተናገሩ ስለ ጭከና ነገር ሁሉ ኃጢአተኞችን ሁሉ እንዲወቅስ ከአእላፋት ቅዱሳኑ ጋር መጥቶአል ብሎ ለእነዚህ ደግሞ ትንቢት ተናገረ።\n" +
                "16 እነዚህ እንደ ምኞታቸው እየሄዱ የሚያንጎራጉሩና ስለ ዕድላቸው የሚያጕረመርሙ ናቸው፥ እንዲረባቸውም ለሰው ፊት እያደሉ አፋቸው ከመጠን ይልቅ ታላቅ ቃል ይናገራል።\n" +
                "17 እናንተ ግን፥ ወዳጆች ሆይ፥ በጌታችን በኢየሱስ ክርስቶስ ሐዋርያት ቀድሞ የተነገረውን ቃል አስቡ፤\n" +
                "18 እነርሱ። በመጨረሻው ዘመን በኃጢአተኝነት እንደ ገዛ ምኞታቸው እየሄዱ ዘባቾች ይሆናሉ ብለዋችኋልና።\n" +
                "19 እነዚህ የሚያለያዩ ሥጋውያንም የሆኑ መንፈስም የሌላቸው ሰዎች ናቸው።\n" +
                "20 እናንተ ግን፥ ወዳጆች ሆይ፥ ከሁሉ ይልቅ በተቀደሰ ሃይማኖታችሁ ራሳችሁን ለማነጽ እየተጋችሁ በመንፈስ ቅዱስም እየጸለያችሁ፥\n" +
                "21 ወደ ዘላለም ሕይወት የሚወስደውን የጌታችንን የኢየሱስ ክርስቶስን ምሕረት ስትጠባበቁ በእግዚአብሔር ፍቅር ራሳችሁን ጠብቁ።\n" +
                "22 አንዳንዶች ተከራካሪዎችንም ውቀሱ፥ አንዳንዶችንም ከእሳት ነጥቃችሁ አድኑ፥\n" +
                "23 አንዳንዶችንም በሥጋ የረከሰውን ልብስ እንኳ እየጠላችሁ በፍርሃት ማሩ።\n" +
                "24 ሳትሰናከሉም እንዲጠብቃችሁ፥ በክብሩም ፊት በደስታ ነውር የሌላችሁ አድርጎ እንዲያቆማችሁ ለሚችለው\n" +
                "25 ብቻውን ለሆነ አምላክና መድኃኒታችን ከዘመን ሁሉ በፊት አሁንም እስከ ዘላለምም ድረስ በጌታችን በኢየሱስ ክርስቶስ ክብርና ግርማ ኃይልም ሥልጣንም ይሁን፤ አሜን።" +
                "\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

}