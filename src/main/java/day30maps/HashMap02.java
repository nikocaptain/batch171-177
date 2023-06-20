package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges=new HashMap<>();

        stdAges.put("Suat",36);
        stdAges.put("Yusuf",33);
        stdAges.put("Serkant",26);
        stdAges.put("Emin",19);
        stdAges.put("Alparslan",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=19}
        stdAges.put("Alparslan",33);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=33, Serkant=26, Emin=19}
        //key'i tekrarlı kullandıgımızda hata vermez, en son verilen entry degerini kabul eder.
        //bu yontem value guncellemede kullanılabilir buna overwrite denir.


        //replace() methodu value lari key'leri kullanarak update eder.
        stdAges.replace("Alparslan",19);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=26, Emin=19}

        //replace("Serkant",26,23); methodu mapin içinde key value degeri eşleşirse güncellemeyi yapar
        stdAges.replace("Serkant",26,23);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19}

        //putIfAbsent("Ali",30); methodu map'de Ali key olarak yoksa Ali key'ini ekler varsa eklemez
        stdAges.putIfAbsent("Ali",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Emin=19, Ali=30}

        System.out.println(stdAges.get("Yusuf"));//33
        System.out.println(stdAges.getOrDefault("Yusuf", 0));//33

        //eger eleman mapte yoksa get() method ""null"" verir
        //getordefault() methodu ise sizin belirttiğiniz degeri verir.
        System.out.println(stdAges.get("Fatih"));//null
        System.out.println(stdAges.getOrDefault("Fatih", 35));//35

        //containsvalue() methodu value ların içinde 313 olup olmadıgını kontrol eder varsa true yoksa false yazar
        System.out.println(stdAges.containsValue(313));//false
        //containskey() methodu key ların içinde Mehmet olup olmadıgını kontrol eder varsa true yoksa false yazar
        System.out.println(stdAges.containsKey("Mehmet"));//false
        System.out.println(stdAges.containsKey("Yusuf"));//true

        //remove("Emin"); methodu key kullanarak entry i silmeye yarar
        stdAges.remove("Emin");
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=19, Serkant=23, Ali=30}
        //remove("Suat",36); methodu hemkey hem value kısmını kontrol eder eşleşirse siler.
        stdAges.remove("Suat",36);
        System.out.println(stdAges);



    }
}
