package day06swapvaluesstringmanipulations;

public class Tekrar01 {
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
    public static void main(String[] args) {
        //ornek 7:"t" string indeki tüm noktalama işaretlerini yıldıza ceviriniz
        String t= "Ali 13 yasindadir!...";
       String t1= t.replaceAll("[a-z]","*");//A** 13 **********!...
        System.out.println("t1 = " + t1);//A** 13 **********!...

       String t2= t.replaceAll("\\p{Punct}","i");
        System.out.println("t2 = " + t2);

       String t3= t.replaceAll("[lyn]","+");
        System.out.println("t3 = " + t3);

        //ornek 5:"s" stringindeki "n " harflerini "xxx" degistiriniz
      String t4=  t.replace("a","xxx");
        System.out.println("t4 = " + t4);
    }
}
