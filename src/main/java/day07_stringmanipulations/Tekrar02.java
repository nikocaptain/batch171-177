package day07_stringmanipulations;

public class Tekrar02 {
    /*
        Note: bir grup datayı ifade etmek için "regular expressions" kullanırız.==>Regex
        note 2: bir grup datayı degistirmek için replaceAll() kullanılır
        Meshur Regex ler
   1) Tum rakamlar               ==> [0-9]
   2) Tum kucuk harfler          ==> [a-z]
   3) Tum buyuk harfler          ==> [A-Z]
   4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
   5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
   6) Tum noktalama isaretleri   ==> \\p{Punct}
   7) Tum sesli Harfler          ==> [aeiouAEIOU]
   8) Tum x,q,w harfleri         ==> [xqw]

   ******* Olumsuz Regex ler ******

   9) Kucuk harflerden farkli tum characterler => [^a-z]
   10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
   11) sadece space karakteri ==> \\s
   12)space karakteri hariç ==>\\S

        sadece rakamlar==>\\d(digit=rakam)
        rakamlar hariç \\D
         */
    public static void main(String[] args) {

        String t="!!inci 6 Yasindadir...";
        //ornek 1:"t" string indeki tüm rakamları yıldıza ceviriniz
        String t1=t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);//!!inci * Yasindadir...
        //ornek 2: "t" stringindeki tüm rakamları ve harfleri "!" çeviriniz

        String t2=t.replaceAll("[0-9a-zA-z]","!");
        System.out.println("t2 = " + t2);//!!!!!! ! !!!!!!!!!!...
        //ornek 3: "t" stringindeki tüm sesli harfleri "?" yapınız
        String t3=t.replaceAll("[aeiouAEİOU]","?");
        System.out.println("t3 = " + t3);//!!?nc? 6 Y?s?nd?d?r...

        //ornek 4: "t" stringindeki tüm harfler dışındaki tüm karakterleri "+" ceviriniz

       String t4= t.replaceAll("[^a-zA-z]","+");
        System.out.println("t4 = " + t4);//++inci+++Yasindadir+++

    }
}
