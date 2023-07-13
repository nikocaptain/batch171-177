package day31mapsexception;

import java.util.Hashtable;

public class Hashtable01 {
    public static void main(String[] args) {
       /*
       HashMap ile Hashtable arasındaki fark nedir?
       1)HashMap thread-safe(multi-thread) ve syncronized degildir,Hashtable thread-safe ve syncronized dir.
       2)HashMap bir tane null key'e ve istediginiz kadar null value ye izin verir.
         Hashtable keylerde ve valuelerde null kullanilmasina musaade etmez
       3)HashMap hizlidir,Hashtable hashmaplere göre yavaştır.

       note:HashMap ve Hashtable ikisi de entry leri rastgele sıralar
        */

        Hashtable<String,Integer> stdAges=new Hashtable<>();
        stdAges.put("Mustafa",41);
        stdAges.put("Seda",30);
        stdAges.put("Ekim",22);
        stdAges.put("Ali Can",18);
        System.out.println(stdAges);
    }

}
