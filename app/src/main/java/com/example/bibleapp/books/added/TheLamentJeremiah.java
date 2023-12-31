package com.example.bibleapp.books.added;

import com.example.bibleapp.models.Book;
import com.example.bibleapp.models.Chapter;
import com.example.bibleapp.models.Verse;

import java.util.ArrayList;
import java.util.List;

public class TheLamentJeremiah {
    private Book TheLamentJeremiahBook;

    public TheLamentJeremiah() {
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(chapterOne());
        chapters.add(chapterTwo());
        chapters.add(chapterThree());
        chapters.add(chapterFour());
        chapters.add(chapterFive());



        TheLamentJeremiahBook = new Book("ሰቆቃው ኤርምያስ።", chapters);
    }

    public Book getTheLamentJeremiahBook() {
        return TheLamentJeremiahBook;
    }

    private Chapter chapterOne() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አሌፍ። ሕዝብ ሞልቶባት የነበረች ከተማ ብቻዋን እንዴት ተቀመጠች! በአሕዛብ መካከል ታላቅ የነበረች እንደ መበለት ሆናለች፤ በአውራጆች መካከል ልዕልት የነበረች ተገዢ ሆናለች።\n" +
                "2 ፤ ቤት። በሌሊት እጅግ ታላቅሳለች፥ እንባዋም በጕንጭዋ ላይ አለ፤ ከውሽሞችዋ ሁሉ የሚያጽናናት የለም፤ ወዳጆችዋ ሁሉ ወነጀሉአት ጠላቶችም ሆኑአት።\n" +
                "3 ፤ ጋሜል። ይሁዳ ስለ መጨነቅና ስለ ባርነት ብዛት ተማረከች፤ በአሕዛብ መካከል ተቀመጠች ዕረፍትም አላገኘችም፤ የሚያስጨንቁአት ሁሉ ተጨንቃ አገኙአት።\n" +
                "4 ፤ ዳሌጥ። ወደ ዓመት በዓልም የሚመጣ የለምና የጽዮን መንገዶች አለቀሱ፤ በሮችዋ ሁሉ ፈርሰዋል ካህናቶችዋም እየጮኹ ያለቅሳሉ፤ ደናግሎችዋም ተጨነቁ እርስዋም በምሬት አለች።\n" +
                "5 ፤ ሄ። ስለ ኃጢአትዋ ብዛት እግዚአብሔር አስጨንቆአታልና አስጨናቂዎችዋ ራስ ሆኑ ጠላቶችዋም ተከናወነላቸው፤ ሕፃናቶችዋ በአስጨናቂዎች ፊት ተማርከዋል።\n" +
                "6 ፤ ዋው። ከጽዮን ሴት ልጅ ውበትዋ ሁሉ ወጥቶአል፤ አለቆችዋ ማሰማርያ እንደማያገኙ ዋላዎች ሆኑ፤ ከሚያባርሩአቸው ፊት ተዳክመው ሄዱ።\n" +
                "7 ፤ ዛይ። ኢየሩሳሌም በጭንቀትዋና በመከራዋ ወራት ከጥንት ጀምሮ የነበረላትን የከበረን ነገር ሁሉ አሰበች፤ ሕዝብዋ በአስጨናቂዎች እጅ በወደቀ ጊዜ የሚረዳትም በሌላት ጊዜ፥ አስጨናቂዎች አዩአት በመፍረስዋም ሳቁ።\n" +
                "8 ፤ ሔት። ኢየሩሳሌም እጅግ ኃጢአት ሠርታለች፤ ስለዚህ ረክሳለች፤ ያከብሩአት የነበሩ ሁሉ ኀፍረተ ሥጋዋን አይተዋታልና አቃለሉአት፤ እርስዋም እየጮኸች ታለቅሳለች ወደ ኋላም ዘወር አለች።\n" +
                "9 ፤ ጤት። አደፍዋ በልብስዋ ዘርፍ ነበረ፤ ፍጻሜዋን አላሰበችም፤ ስለዚህ በድንቅ ተዋርዳለች፥ የሚያጽናናትም የለም፤ አቤቱ፥ ጠላት ከፍ ከፍ ብሎአልና መከራዬን ተመልከት።\n" +
                "10 ፤ ዮድ። አስጨናቂው በከበረ ነገርዋ ሁሉ ላይ እጁን ዘረጋ፤ ወደ ጉባኤህ እንዳይገቡ ያዘዝሃቸው አሕዛብ ወደ መቅደስዋ ሲገቡ አይታለችና።\n" +
                "11 ፤ ካፍ። ሕዝብዋ ሁሉ እየጮኹ ያለቅሳሉ እንጀራም ይፈልጋሉ፤ ሰውነታቸውን ለማበርታት የከበረ ሀብታቸውን ስለ መብል ሰጥተዋል፤ አቤቱ፥ ተጐሳቍያለሁና እይ፥ ተመልከትም።\n" +
                "12 ፤ ላሜድ። እናንተ መንገድ አላፊዎች ሁሉ፥ በእናንተ ዘንድ ምንም የለምን? እግዚአብሔር በጽኑ ቍጣው ቀን እኔን እንዳስጨነቀበት በእኔ ላይ እንደ ተደረገው እንደ እኔ መከራ የሚመስል መከራ እንዳለ ተመልከቱ፥ እዩ።\n" +
                "13 ፤ ሜም። ከላይ እሳትን ወደ አጥንቴ ሰደደ በረታችበትም፤ ለእግሬ ወጥመድ ዘረጋ ወደ ኋላም መለሰኝ፥ አጠፋኝም ቀኑንም ሁሉ አደከመኝ።\n" +
                "14 ፤ ኖን። የኃጢአቶቼ ቀንበር በእጁ ተይዛለች፤ ታስረው በአንገቴ ላይ ወጥተዋል፤ ጕልበቴን አደከመ። ጌታ በፊታቸው እቆም ዘንድ በማልችላቸው እጅ አሳልፎ ሰጠኝ።\n" +
                "15 ፤ ሳምኬት። ጌታ ኃያላኖቼን ሁሉ ከውስጤ አስወገዳቸው፤ ጕልማሶቼን ያደቅቅ ዘንድ ጉባኤን ጠራብኝ፤ ጌታ ድንግሊቱን የይሁዳን ልጅ በመጥመቂያ እንደሚረገጥ አድርጎ ረገጣት።\n" +
                "16 ፤ ዔ። የሚያጽናናኝ ነፍሴንም የሚያበረታት ከእኔ ርቆአልና ስለዚህ አለቅሳለሁ፤ ዓይኔ፥ ዓይኔ ውኃ ያፈስሳል። ጠላት በርትቶአልና ልጆቼ ጠፍተዋል።\n" +
                "17 ፤ ፌ። ጽዮን እጅዋን ዘረጋች፤ የሚያጽናናት የለም፤ እግዚአብሔር በያዕቆብ ዙሪያ ያሉትን እንዲያስጨንቁት አዘዘ፤ ኢየሩሳሌም በመካከላቸው እንደ ርኩስ ነገር ሆናለች።\n" +
                "18 ፤ ጻዴ። በአፉ ነገር ላይ ዓመፅ አድርጌአለሁና እግዚአብሔር ጻድቅ ነው። እናንተ አሕዛብ ሁሉ፥ እባካችሁ፥ ስሙ መከራዬንም ተመልከቱ፤ ደናግሎቼና ጐበዛዝቴ ተማርከው ሄዱ።\n" +
                "19 ፤ ቆፍ። ውሽሞቼን ጠራሁ እነርሱም አታለሉኝ፤ ካህናቶቼና ሽማግሌዎቼ ሰውነታቸውን ያበረቱ ዘንድ መብል ሲፈልጉ በከተማ ውስጥ ሞቱ።\n" +
                "20 ፤ ሬስ። አቤቱ፥ ተጨንቄአለሁና፥ አንጀቴም ታውኮብኛልና ተመልከት፤ ዓመፃን ፈጽሞ አድርጌአለሁና ልቤ በውስጤ ተገላበጠብኝ፤ በሜዳ ሰይፍ ልጆቼን አጠፋ በቤትም ሞት አለ።\n" +
                "21 ፤ ሳን። እኔ እየጮኽሁ እንደማለቅስ ሰምተዋል፤ የሚያጽናናኝ የለም፤ ጠላቶቼ ሁሉ ስለ መከራዬ ሰምተዋል፤ አንተ አድርገኸዋልና ደስ አላቸው፤ ስለ እርሱ የተናገርኸውን ቀን ታመጣለህ እነርሱም እንደ እኔ ይሆናሉ።\n" +
                "22 ፤ ታው። ልቅሶዬ እጅግ ነውና፥ ልቤም ደክሞአልና ክፋታቸው ሁሉ ወደ ፊትህ ይድረስ፥ ስለ ኃጢአቴ ሁሉ እንዳደረግህብኝ አድርግባቸው።\n"));
        // Add more verses as needed
        return new Chapter(1, verses);
    }

    private Chapter chapterTwo() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አሌፍ። ጌታ በቍጣው የጽዮንን ሴት ልጅ እንደ ምን አደመናት! የእስራኤልን ውበት ከሰማይ ወደ ምድር ጣለ፥ በቍጣውም ቀን የእግሩን መረገጫ አላሰበም።\n" +
                "2 ፤ ቤት። ጌታ የያዕቆብን ማደሪያዎች ሁሉ ዋጠ፥ አልራራምም፤ በመዓቱ የይሁዳን ሴት ልጅ አምቦች አፈረሰ፥ ወደ ምድርም አወረዳቸው፤ መንግሥቱንና አለቆችዋን አረከሰ።\n" +
                "3 ፤ ጋሜል። በጽኑ ቍጣው የእስራኤልን ቀንድ ሁሉ ቀጠቀጠ፤ ቀኝ እጁን ከጠላት ፊት ወደ ኋላ መለሰ፥ በዙሪያውም እንደሚባላ እንደ እሳት ነበልባል ያዕቆብን አቃጠለ።\n" +
                "4 ፤ ዳሌጥ። ቀስቱን እንደ ጠላት ገተረ፥ እንደ አስጨናቂ ቀኝ እጁን አጸና፥ ለዓይንም የሚያምረውን ሁሉ ገደለ፤ በጽዮን ሴት ልጅ ድንኳን መዓቱን እንደ እሳት አፈሰሰ።\n" +
                "5 ፤ ሄ። ጌታ እንደ ጠላት ሆነ፥ እስራኤልን ዋጠ፤ አዳራሾችዋን ሁሉ ዋጠ፥ አምቦችዋን አጠፋ፤ በይሁዳም ሴት ልጅ ኀዘንና ልቅሶ አበዛ።\n" +
                "6 ፤ ዋው። ማደሪያውን እንደ አትክልት ነቀለ፤ የበዓሉን ስፍራ አጠፋ፤ እግዚአብሔር በጽዮን ዓመት በዓሉንና ሰንበቱን አስረሳ፥ በቍጣውም መዓት ንጉሡንና ካህኑን አቃለለ።\n" +
                "7 ፤ ዛይ። ጌታ መሠዊያውን ጣለ፥ መቅደሱን ጠላ፥ የአዳራሾችዋንም ቅጥር በጠላት እጅ አሳልፎ ሰጠ፤ ድምፃቸውን እንደ ዓመት በዓል ቀን በእግዚአብሔር ቤት ከፍ ከፍ አደረጉ።\n" +
                "8 ፤ ሔት። እግዚአብሔር የጽዮንን ሴት ልጅ ቅጥር ያፈርስ ዘንድ አሰበ፤ የመለኪያውን ገመድ ዘረጋ፥ እጁን ከማጥፋት አልመለሰም፤ ምሽጉና ቅጥሩ እንዲያለቅሱ አደረገ፤ በአንድነት ደከሙ።\n" +
                "9 ፤ ጤት። በሮችዋ በመሬት ውስጥ ሰጠሙ፥ መወርወሪያዎችዋን አጠፋ ሰበረም፤ ንጉሥዋና አለቆችዋ ሕግ በሌለባቸው በአሕዛብ መካከል አሉ፤ ነቢያቶቻዋም ከእግዚአብሔር ዘንድ ራእይ አላገኙም።\n" +
                "10 ፤ ዮድ። የጽዮን ሴት ልጅ ሽማግሌዎች ዝም ብለው በመሬት ላይ ተቀምጠዋል፤ ትቢያን በራሳቸው ላይ ነሰነሱ፥ ማቅም ታጠቁ፤ የኢየሩሳሌም ደናግል ራሳቸውን ወደ ምድር አዘነበሉ።\n" +
                "11 ፤ ካፍ። ሕፃኑና ጡት የሚጠባው በከተማይቱ ጐዳና ላይ ሲዝሉ፥ ዓይኔ በእንባ ደከመች፥ አንጀቴም ታወከ፤ ስለ ወገኔ ሴት ልጅ ቅጥቃጤ ጉበቴ በምድር ላይ ተዘረገፈ።\n" +
                "12 ፤ ላሜድ። በከተማ ጐዳና እንደ ተወጋ ሰው በዛሉ ጊዜ፥ ነፍሳቸውም በእናቶቻቸው ብብት በወጣች ጊዜ፥ እናቶቻቸውን። እህልና የወይን ጠጅ ወዴት አለ? ይሉአቸዋል።\n" +
                "13 ፤ ሜም። የኢየሩሳሌም ሴት ልጅ ሆይ፥ ምን እመሰክርልሻለሁ? በምንስ እመስልሻለሁ? ድንግሊቱ የጽዮን ልጅ ሆይ፥ አጽናናሽ ዘንድ በምን አስተካክልሻለሁ? ስብራትሽ እንደ ባሕር ታላቅ ነውና፤ የሚፈውስሽ ማን ነው?\n" +
                "14 ፤ ኖን። ነቢያቶችሽ ከንቱና ሐሰተኛ ራእይ አይተውልሻል፤ ምርኮሽንም ይመልሱ ዘንድ በደልሽን አልገለጡም፤ ከንቱና የማይረባ ነገርንም አይተውልሻል።\n" +
                "15 ፤ ሳምኬት። መንገድ አላፊዎች ሁሉ እጃቸውን ያጨበጭቡብሻልና። በውኑ የውበት ፍጻሜና የምድር ሁሉ ደስታ የሚሉአት ከተማ ይህች ናትን? እያሉ፥ በኢየሩሳሌም ሴት ልጅ ላይ ያፍዋጫሉ፥ ራሳቸውንም ያነቃንቃሉ።\n" +
                "16 ፤ ዔ። ጠላቶችሽ ሁሉ አፋቸውን አላቀቁብሽ፤ እያፍዋጩና ጥርሳቸውን እያፋጩ። ውጠናታል፤ ነገር ግን ተስፋ ያደረግናት ቀን ይህች ናት፤ አግኝተናታል አይተናትማል ይላሉ።\n" +
                "17 ፤ ፌ። እግዚአብሔር ያሰበውን አደረገ፤ በቀድሞ ዘመን ያዘዘውን ቃል ፈጸመ፤ አፈረሰ አልራራምም፤ ጠላትንም ደስ አሰኘብሽ፥ የሚያስጨንቁሽንም ቀንድ ከፍ ከፍ አደረገ።\n" +
                "18 ፤ ጻዴ። ልባቸው ወደ ጌታ ጮኸ። የጽዮን ሴት ልጅ ቅጥር ሆይ፥ እንባሽን እንደ ፈሳሽ ቀንና ሌሊት አፍስሺ፤ ለሰውነትሽ ዕረፍት አትስጪ፤ የዓይንሽ ብሌን አታቋርጥ።\n" +
                "19 ፤ ቆፍ። ተነሺ፥ በሌሊት በመጀመሪያ ክፍል ጩኺ፥ በጌታም ፊት ልብሽን እንደ ውኃ አፍስሺ፤ በጐዳና ሁሉ ራስ ላይ በራብ ስለ ደከሙ ስለ ሕፃናትሽ ነፍስ እጆችሽን ወደ እርሱ አንሺ።\n" +
                "20 ፤ ሬስ። አቤቱ፥ እይ፤ በማን ላይ እንደዚህ እንዳደረግህ ተመልከት። በውኑ ሴቶች ፍሬያቸውን፥ ያቀማጠሉአቸውን ሕፃናት፥ ይበላሉን? በውኑ ካህኑና ነቢዩ በጌታ መቅደስ ውስጥ ይገደላሉን?\n" +
                "21 ፤ ሳን። ብላቴናውና ሽማግሌው በመንገዶች ላይ ተጋደሙ፤ ደናግሎቼና ጐበዛዝቴ በሰይፍ ወድቀዋል፤ በቍጣህ ቀን ገደልሃቸው፤ ሳትራራ አረድሃቸው።\n" +
                "22 ፤ ታው። እንደ በዓል ቀን የሚያስፈሩኝን ከዙሪያዬ ጠራህ፥ በእግዚአብሔር ቍጣ ቀንም ያመለጠ ወይም የቀረ አልተገኘም፤ ያቀማጠልኋቸውንና ያሳደግኋቸውን ጠላቴ በላቸው።\n" ));
        // Add more verses as needed
        return new Chapter(2, verses);
    }

    private Chapter chapterThree() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1", "1 ፤ አሌፍ። በቍጣው በትር መከራ ያየ ሰው እኔ ነኝ።\n" +
                "2 ፤ ብርሃን ወደ ሌለበት ወደ ጨለማ መርቶ ወሰደኝ።\n" +
                "3 ፤ ዘወትር ቀኑን ሁሉ እጁን በላዬ መለሰ።\n" +
                "4 ፤ ቤት። ሥጋዬንና ቁርበቴን አስረጀ፥ አጥንቴን ሰበረ።\n" +
                "5 ፤ ቅጥር ሠራብኝ በሐሞትና በድካምም ከበበኝ።\n" +
                "6 ፤ ቀድሞ ሞተው እንደ ነበሩ በጨለማ አኖረኝ።\n" +
                "7 ፤ ጋሜል። እንዳልወጣ በዙሪያዬ ቅጥር ሠራብኝ፤ ሰንሰለቴን አከበደ።\n" +
                "8 ፤ በጠራሁና በጮኽሁ ጊዜ ጸሎቴን ከለከለ።\n" +
                "9 ፤ መንገዴን በተጠረበ ድንጋይ ዘጋ፥ ጐዳናዬንም አጣመመ።\n" +
                "10 ፤ ዳሌጥ። እንደሚሸምቅ ድብ እንደ ተሸሸገም አንበሳ ሆነብኝ።\n" +
                "11 ፤ መንገዴን ለወጠ፥ ገነጣጠለኝም፤ ባድማ አደረገኝ።\n" +
                "12 ፤ ቀስቱን ገተረ ለፍላጻውም እንደ ጊጤ አደረገኝ።\n" +
                "13 ፤ ሄ። የሰገባውን ፍላጻዎች በኵላሊቴ ውስጥ ተከለ።\n" +
                "14 ፤ ለወገኔ ሁሉ ማላገጫ ቀኑንም ሁሉ መሳለቂያ ሆንሁ።\n" +
                "15 ፤ ምሬት ሞላብኝ በእሬትም አጠገበኝ።\n" +
                "16 ፤ ዋው። ጥርሴን በጭንጫ ሰበረ፥ በአመድም ከደነኝ።\n" +
                "17 ፤ ነፍሴን ከሰላም አራቅህ፤ በጎ ነገርን ረሳሁ።\n" +
                "18 ፤ እኔም። ኃይሌ ከእግዚአብሔርም ዘንድ ያለው ተስፋዬ ጠፋ አልሁ።\n" +
                "19 ፤ ዛይ። መከራዬንና ችግሬን እሬትንና ሐሞትን አስብ።\n" +
                "20 ፤ ነፍሴ እያሰበችው በውስጤ ፈዘዘች።\n" +
                "21 ፤ ይህችን በልቤ አኖራለሁ፥ ስለዚህ እታገሣለሁ።\n" +
                "22 ፤ ሔት። ያልጠፋነው ከእግዚአብሔር ምሕረት የተነሣ ነው፤ ርኅራኄው አያልቅምና።\n" +
                "23 ፤ ማለዳ ማለዳ አዲስ ነው፤ ታማኝነትህ ብዙ ነው።\n" +
                "24 ፤ ነፍሴ። እግዚአብሔር እድል ፈንታዬ ነው፤ ስለዚህ ተስፋ አደርገዋለሁ አለች።\n" +
                "25 ፤ ጤት። እግዚአብሔር በተስፋ ለሚጠብቁት ለምትሻውም ነፍስ መልካም ነው።\n" +
                "26 ፤ ሰው ዝም ብሎ የእግዚአብሔርን ማዳን ተስፋ ቢያደርግ መልካም ነው።\n" +
                "27 ፤ ሰው በታናሽነቱ ቀንበር ቢሸከም መልካም ነው።\n" +
                "28 ፤ ዮድ። እርሱ አሸክሞታልና ዝም ብሎ ለብቻው ይቀመጥ።\n" +
                "29 ፤ ተስፋ የሆነው እንደ ሆነ አፉን በአፈር ውስጥ ያኑር።\n" +
                "30 ፤ ጕንጩን ለሚመታው ይስጥ፥ ስድብንም ይጥገብ።\n" +
                "31 ፤ ካፍ። ጌታ ለዘላለም አይጥልምና፤\n" +
                "32 ፤ ቢያሳዝንም እንደ ምሕረቱ ብዛት ይራራልና፤\n" +
                "33 ፤ የሰውን ልጆች ከልቡ አያስጨንቅም፥ አያሳዝንምም።\n" +
                "34 ፤ ላሜድ። በምድር የተጋዙትን ሁሉ ከእግሩ በታች ይረግጣቸው ዘንድ፥\n" +
                "35 ፤ የሰውን ፍርድ በልዑል ፊት ይመልስ ዘንድ፥\n" +
                "36 ፤ የሰውን ፍርድ ያጣምም ዘንድ ጌታ እሺ አይልም።\n" +
                "37 ፤ ሜም። ጌታ ያላዘዘውን የሚልና የሚፈጽም ማን ነው?\n" +
                "38 ፤ ከልዑል አፍ ክፉና መልካም ነገር አይወጣምን?\n" +
                "39 ፤ ሕያው ሰው የሚያጕረመርም፥ ሰው ስለ ኃጢአቱ ቅጣት የሚያጕረመርም ስለ ምንድር ነው?\n" +
                "40 ፤ ኖን። መንገዳችንን እንመርምርና እንፈትን፥ ወደ እግዚአብሔርም እንመለስ።\n" +
                "41 ፤ ልባችንን ከእጃችን ጋር በሰማይ ወዳለው ወደ እግዚአብሔር እናንሣ።\n" +
                "42 ፤ በድለናል ዐምፀናልም፥ አንተም ይቅር አላልህም።\n" +
                "43 ፤ ሳምኬት። በቍጣ ከደንኸን አሳደድኸንም፤ ገደልኸን፥ አልራራህም።\n" +
                "44 ፤ ጸሎት እንዳያልፍ ራስህን በደመና ከደንህ።\n" +
                "45 ፤ በአሕዛብ መካከል ጕድፍና ውዳቂ አደረግኸን።\n" +
                "46 ፤ ዔ። ጠላቶቻችን ሁሉ አፋቸውን ኣላቀቁብን።\n" +
                "47 ፤ ድንጋጤና ቍጣ፥ ጥፋትና ቅጥቃጤ ሆነብን።\n" +
                "48 ፤ ስለ ወገኔ ሴት ልጅ ቅጥቃጤ ዓይኔ የውኃ ፈሳሽ አፈሰሰች።\n" +
                "49 ፤\n" +
                "50 ፤ ፌ። እግዚአብሔር ከሰማይ እስኪጐበኝና እስኪመለከት ድረስ ዓይኔ ሳታቋርጥ ዝም ሳትል እንባ ታፈስሳለች።\n" +
                "51 ፤ ስለ ከተማዬ ቈነጃጅት ሁሉ ዓይኔ ነፍሴን አሳዘነች።\n" +
                "52 ፤ ጻዴ። በከንቱ ነገር ጠላቶች የሆኑኝ እንደ ወፍ ማደንን አደኑኝ።\n" +
                "53 ፤ ሕይወቴን በጕድጓድ አጠፉ፥ በላዬም ድንጋይ ጣሉ።\n" +
                "54 ፤ በራሴ ላይ ውኆች ተከነበሉ፤ እኔም። ጠፋሁ ብዬ ነበር።\n" +
                "55 ፤ ቆፍ። አቤቱ፥ በጠለቀ ጕድጓድ ውስጥ ሆኜ ስምህን ጠራሁ።\n" +
                "56 ፤ ድምፄን ሰማህ፤ ጆሮህን ከልመናዬ አትመልስ።\n" +
                "57 ፤ በጠራሁህ ቀን ቀርበህ። አትፍራ አልህ።\n" +
                "58 ፤ ሬስ። ጌታ ሆይ፥ ስለ ነፍሴ ተምዋግተህ ሕይወቴን ተቤዠህ።\n" +
                "59 ፤ አቤቱ፥ ጭንቀቴን አይተሃል፥ ፍርዴን ፍረድልኝ።\n" +
                "60 ፤ በቀላቸውን ሁሉና በእኔ ላይ ያለውን አሳባቸውን ሁሉ አየህ።\n" +
                "61 ፤ ሳን። አቤቱ፥ ስድባቸውንና በእኔ ላይ ያለውን አሳባቸውን ሁሉ፥\n" +
                "62 ፤ የተነሡብኝን ሰዎች ከንፈሮች ቀኑንም ሁሉ ያሰቡብኝን አሳባቸውን ሰማህ።\n" +
                "63 ፤ መቀመጣቸውንና መነሣታቸውን ተመልከት፤ እኔ መሳለቂያቸው ነኝ።\n" +
                "64 ፤ ታው። አቤቱ፥ እንደ እጃቸው ሥራ ፍዳቸውን ትከፍላቸዋለህ።\n" +
                "65 ፤ የልብ ዕውርነትንና እርግማንህን ትሰጣቸዋለህ።\n" +
                "66 ፤ አቤቱ፥ በቍጣ ታሳድዳቸዋለህ ከሰማይም በታች ታጠፋቸዋለህ።\n"));
        // Add more verses as needed
        return new Chapter(3, verses);
    }

    private Chapter chapterFour() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አሌፍ። ወርቁ እንዴት ደበሰ! ጥሩው ወርቅ እንዴት ተለወጠ! የመቅደሱ ድንጋዮች በጐዳና ሁሉ ራስ ተበተኑ።\n" +
                "2 ፤ ቤት። ጥሩ ወርቅ የሚመስሉ የከበሩ የጽዮን ልጆች፥ የሸክላ ሠሪ እጅ እንደ ሠራው እንደ ሸክላ ዕቃ እንዴት ተቈጠሩ!\n" +
                "3 ፤ ጋሜል። ቀበሮች እንኳ ጡቶታቸውን ገልጠው ግልገሎቻቸውን አጠቡ፤ የወገኔ ልጅ ግን እንደ ምድረ በዳ ሰጐን ጨካኝ ሆነች።\n" +
                "4 ፤ ዳሌጥ። ጡት የሚጠባው የሕፃን ምላስ ከጥም የተነሣ ወደ ትናጋው ተጣበቀ፤ ሕፃናት እንጀራ ለመኑ፥ የሚቈርስላቸውም የለም።\n" +
                "5 ፤ ሄ። የጣፈጠ ነገር ይበሉ የነበሩ በመንገድ ጠፉ፤ በቀይ ግምጃ ያድጉ የነበሩ የፍግ ክምር አቀፉ።\n" +
                "6 ፤ ዋው። የማንም እጅ ሳይወድቅባት ድንገት ከተገለበጠች ከሰዶም ኃጢአት ይልቅ የወገኔ ሴት ልጅ ኃጢአት በዛች።\n" +
                "7 ፤ ዛይ። አለቆችዋ ከበረዶ ይልቅ ጥሩ፥ ከወተት ይልቅ ነጭ ነበሩ፤ ገላቸው ከቀይ ዕንቍ ይልቅ ቀይ ነበረ፥ መልካቸውም እንደ ሰንፔር ነበረ።\n" +
                "8 ፤ ሔት። ፊታቸው ከጥቀርሻ ይልቅ ጠቍሮአል፥ በመንገድም አልታወቁም፤ ቁርበታቸው ወደ አጥንታቸው ተጣብቆአል፤ ደርቆአል፤ እንደ እንጨት ሆኖአል።\n" +
                "9 ፤ ጤት። በሰይፍ የሞቱ በራብ ከሞቱት ይሻላሉ፤ እነዚህ የምድርን ፍሬ አጥተው ተወግተውም ቀጥነዋል።\n" +
                "10 ፤ ዮድ። የርኅሩኆች ሴቶች እጆች ልጆቻችውን ቀቅለዋል፤ የወገኔ ሴት ልጅ በመቀጥቀጥዋ መብል ሆኑአቸው።\n" +
                "11 ፤ ካፍ። እግዚአብሔር መዓቱን ፈጽሞአል፥ ጽኑ ቍጣውን አፍስሶአል፤ እሳትን በጽዮን ውስጥ አቃጠለ፥ መሠረትዋንም በላች።\n" +
                "12 ፤ ላሜድ። የምድር ነገሥታት በዓለምም የሚኖሩ ሁሉ አስጨናቂና ጠላት በኢየሩሳሌም በር እንዲገባ አላመኑም።\n" +
                "13 ፤ ሜም። የጻድቃንን ደም በውስጥዋ ስላፈሰሱ ስለ ነቢያቶችዋ ኃጢአትና ስለ ካህናቶች በደል ነው።\n" +
                "14 ፤ ኖን። ታውረው በመንገድ ላይ ተቅበዘበዙ፤ ልብሳቸው እንዳይዳሰስ በደም ረክሰዋል።\n" +
                "15 ፤ ሳምኬት። እናንተ ርኩሳን፥ ራቁ፥ ርቃችሁም ሂዱ፥ አትንኩ ብለው ጮኹባቸው። በሸሹና በተቅበዘበዙ ጊዜ፥ በአሕዛብ መካከል። በዚህ ከእንግዲህ ወዲህ አይኖሩም ተባለ።\n" +
                "16 ፤ ዔ። የእግዚአብሔር ፊት በተናቸው እርሱም ከእንግዲህ ወዲህ አይመለከታቸውም፤ የካህናቱን ፊት አላፈሩም፥ ሽማግሌዎቹንም አላከበሩም።\n" +
                "17 ፤ ፌ። ዓይናችን ወደ ከንቱ ረዳታችን ገና ሲመለከት ጠፍቶአል፤ በመቆየታችን ማዳን የማይቻለውን ሕዝብ ጠብቀናል።\n" +
                "18 ፤ ጻዴ። በአደባባያችን እንዳንሄድ ፍለጋችንን ተከተሉ፤ ፍጻሜያችን ቀርቦአል፥ ዕድሜያችን አልቆአል፥ ፍጻሜያችን ደርሶአል።\n" +
                "19 ፤ ቆፍ። አሳዳጆቻችን ከሰማይ ንስር ይልቅ ፈጣኖች ሆኑ፤ በተራሮች ላይ አሳደዱን፥ በምድረ በዳ ሸመቁብን።\n" +
                "20 ፤ ሬስ። ስለ እርሱ። በአሕዛብ መካከል በጥላው በሕይወት እንኖራለን ያልነው በእግዚአብሔር የተቀባ፥ የሕይወታችን እስትንፋስ፥ በጕድጓዳቸው ተያዘ።\n" +
                "21 ፤ ሳን። በዖፅ ምድር የምትኖሪ የኤዶምያስ ልጅ ሆይ፥ ደስ ይበልሽ ሐሤትም አድርጊ፤ ጽዋው ደግሞ ወደ አንቺ ያልፋል፥ አንቺም ትሰክሪአለሽ ትራቈቻለሽም።\n" +
                "22 ፤ ታው። የጽዮን ልጅ ሆይ፥ የበደልሽ ቅጣት ተፈጸመ፤ ከእንግዲህ ወዲህ አያስማርክሽም። የኤዶምያስ ልጅ ሆይ፥ በደልሽን ይቀጣል፤ ኃጢአትሽን ይገልጣል።\n"));
        // Add more verses as needed
        return new Chapter(4, verses);
    }
    private Chapter chapterFive() {
        List<Verse> verses = new ArrayList<>();
        verses.add(new Verse("1","1 ፤ አቤቱ፥ የሆነብንን አስብ፤ ተመልከት ስድባችንንም እይ።\n" +
                "2 ፤ ርስታችን ለእንግዶች፥ ቤቶቻችን ለሌሎች ሆኑ።\n" +
                "3 ፤ ድሀ አደጎችና አባት የሌለን ሆነናል፤ እናቶቻችን እንደ መበለቶች ሆነዋል።\n" +
                "4 ፤ ውኃችንን በብር ጠጣን እንጨታችንን በዋጋ ገዛን።\n" +
                "5 ፤ አሳዳጆቻችን በአንገታችን ላይ ናቸው፤ እኛ ደክመናል ዕረፍትም የለንም።\n" +
                "6 ፤ ለግብጻውያንና ለአሦራውያን እንጀራ እንጠግብ ዘንድ እጅ ሰጠን።\n" +
                "7 ፤ አባቶቻችን ኃጢአትን ሠሩ ዛሬም የሉም፤ እኛም በደላቸውን ተሸከምን።\n" +
                "8 ፤ ባሪያዎች ሠልጥነውብናል፤ ከእጃቸው የሚታደገን የለም።\n" +
                "9 ፤ ከምድረ በዳ ሰይፍ የተነሣ በሕይወታችን እንጀራችንን እናመጣለን።\n" +
                "10 ፤ ከሚያቃጥል ከራብ ትኩሳት የተነሣ ቁርበታችን እንደ ምድጃ ጠቈረ።\n" +
                "11 ፤ በጽዮን ሴቶችን፥ በይሁዳም ከተሞች ደናግልን አጐሰቈሉ።\n" +
                "12 ፤ አለቆች በእጃቸው ተሰቀሉ፤ የሽማግሌዎች ፊት አልታፈረም።\n" +
                "13 ፤ ጕልማሶች ወፍጮን ተሸከሙ፥ ልጆችም ከእንጨት በታች ተሰናከሉ።\n" +
                "14 ፤ ሽማግሌዎች ከአደባባይ፥ ጕልማሶች ከበገናቸው ተሻሩ።\n" +
                "15 ፤ የልባችን ደስታ ቀርቶአል፤ ዘፈናችን ወደ ልቅሶ ተለውጦአል።\n" +
                "16 ፤ አክሊል ከራሳችን ወድቆአል፤ ኃጢአት ሠርተናልና ወዮልን!\n" +
                "17 ፤ ስለዚህ ልባችን ታምሞአል፤ ስለዚህም ነገር ዓይናችን ፈዝዞአል፤\n" +
                "18 ፤ ስለ ጽዮን ተራራ፥ ባድማ ሆናለችና፥ ቀበሮችም ተመላልሰውባታልና።\n" +
                "19 ፤ አቤቱ፥ አንተ ለዘላለም ትኖራለህ፤ ዙፋንህ ከትውልድ እስከ ትውልድ ነው።\n" +
                "20 ፤ ስለ ምን ለዘላለም ትረሳናለህ? ስለ ምንስ ለረጅም ዘመን ትተወናለህ?\n" +
                "21 ፤ አቤቱ፥ ወደ አንተ መልሰን እኛም እንመለሳለን፤ ዘመናችንን እንደ ቀድሞ አድስ።\n" +
                "22 ፤ ነገር ግን ፈጽመህ ጥለኸናል፤ እጅግ ተቈጥተኸናል።\n" +
                "\n"));

        return new Chapter(5, verses);
    }
}