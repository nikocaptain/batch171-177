package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s="Learn Java earn money";

        //ornek 1:"s" stringi inin "money " ile bitip bitmediğini kontrol ediniz
       boolean endwith1= s.endsWith("money");
        System.out.println("endwith1 = " + endwith1);//true

        //ornek 2:"s" String indeki "money" kelimisini "dollar" kelimesine ceviriniz

        String rename=s.replace("money","dollar");
        System.out.println("rename = " + rename);//Learn Java earn dollar

        //ornek 3:

        String rename1=s.replace("earn","win");

        System.out.println("rename1 = " + rename1);//Lwin Java win money

        //ornek 4:s stringindeki "a" harflerini "*" olarak degistiriniz

       String rename3= s.replace('a','*');
        System.out.println("rename3 = " + rename3);//Le*rn J*v* e*rn money

        //ornek 5:"s" stringindeki "n " harflerini "xxx" degistiriniz

        String rename4=s.replace("n","xxx");
        System.out.println("rename4 = " + rename4);//Learxxx Java earxxx moxxxey

        String rename5=s.replace("e","");
        System.out.println("rename5 = " + rename5);//Larn Java arn mony

        String t= "Ali 13 yasindadir!...";

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
        String t1=t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);//Ali ** yasindadir!...

    }
}
