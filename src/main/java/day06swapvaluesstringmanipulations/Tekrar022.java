package day06swapvaluesstringmanipulations;

public class Tekrar022 {
    public static void main(String[] args) {
        //ornek 7:"t" string indeki tüm rakamları yıldıza ceviriniz
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

         */

        String s="Learn Java earn money";
        //ornek 2:"s" String indeki "money" kelimisini "dollar" kelimesine ceviriniz

        String s1=s.replace("money","dolar");
        System.out.println(s1);

        //ornek 4:s stringindeki "a" harflerini "*" olarak degistiriniz
        String s2=s.replace("a","*");
        System.out.println(s2);

        //ornek 5:"s" stringindeki "n " harflerini "xxx" degistiriniz

        String s3=s.replace("n","xxx");
        System.out.println(s3);
    }
}
