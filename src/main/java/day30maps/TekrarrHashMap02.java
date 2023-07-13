package day30maps;

import java.util.HashMap;

public class TekrarrHashMap02 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges=new HashMap<>();
        stdAges.put("Suat",36);
        stdAges.put("Yusuf",33);
        stdAges.put("Serkant",26);
        stdAges.put("Emin",19);
        stdAges.put("Alparslan",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=19}
        //replace() methodu value lari key'leri kullanarak update eder.
        stdAges.replace("Emin",23);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=23}
        //putIfAbsent("Ali",30); methodu map'de Ali key olarak yoksa Ali key'ini ekler varsa eklemez
        stdAges.putIfAbsent("Ali",30);
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Emin=23, Ali=30}
        System.out.println(stdAges.get("Yusuf"));//33
        System.out.println(stdAges.getOrDefault("Mehmet",-1));
        //eger eleman mapte yoksa get() method ""null"" verir
        //getordefault() methodu ise sizin belirttiğiniz degeri verir.
        System.out.println(stdAges.get("kamil"));//null
        System.out.println(stdAges.getOrDefault("kamil", -1));///-1
        //containsvalue() methodu value ların içinde 313 olup olmadıgını kontrol eder varsa true yoksa false yazar

        System.out.println(stdAges.containsValue(23));//true
        System.out.println(stdAges.containsValue(12));//false
        System.out.println(stdAges.containsKey("Yusuf"));//true
        System.out.println(stdAges.containsKey("Yusuf"));//false
        //containskey() methodu key ların içinde Mehmet olup olmadıgını kontrol eder varsa true yoksa false yazar

        //remove("Emin"); methodu key kullanarak entry i silmeye yarar
        System.out.println(stdAges.remove("Emin"));
        System.out.println(stdAges);//{Suat=36, Yusuf=33, Alparslan=30, Serkant=26, Ali=30}

        System.out.println(stdAges.remove("Suat", 36));
        System.out.println(stdAges);//{Yusuf=33, Alparslan=30, Serkant=26, Ali=30}


    }
}
