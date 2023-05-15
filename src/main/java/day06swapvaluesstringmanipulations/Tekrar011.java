package day06swapvaluesstringmanipulations;

public class Tekrar011 {
    public static void main(String[] args) {
        String s="Java is easy";

        //ornek 1: "s" Stringindeki tüm karakterleri büyük harf yapıınız.
        String s1=s.toUpperCase();
        System.out.println(s1);

        //ornek2:"s" Stringindeki tüm karakterleri küçük harf yapıınız

        String s2=s.toLowerCase();
        System.out.println(s2);

        //ornek 3:"s" Stringindeki ilk characteri alınız.

        char s3=s.charAt(0);
        System.out.println(s3);

        //ornek 4: "s" stringindeki bastan ikinci ve sondan ikinci
        char ilk=s.charAt(1);
       char son= s.charAt(10);
        System.out.println(ilk+son);//212
        System.out.println(ilk+""+son);//as

        //ornek 5:"s" stringindeki karakter sayısını bulunuz.

        int s4=s.length();
        System.out.println(s4);//12

        //ornek 6: "s" stringindeki ilk 4 karakteri alınız

       String s5=s.substring(0,4);
        System.out.println(s5);//Java

        //ornek 7:"s"stringindeki "is" kelimesini alınız

        String s6=s.substring(5,7);
        System.out.println(s6);//is

        //ornek 8:"s"stringindeki "easy" kelimesini alınız

        String s7=s.substring(8,12);
        System.out.println(s7);//easy

        //ikinci yol

        String sub1=s.substring(8);
        System.out.println(sub1);//easy

        //ornek 9:"s" stringinde "money" kelimesinin var olup olmadığını kontrol ediniz.

        boolean s8=s.contains("money");
        System.out.println(s8);//false

       boolean isexist= s.contains("easy");
        System.out.println(isexist);//true

        //ornek 10: "s" String'inin belli bir harf ile başlayıp başlamadığını kontrol ediniz.

        boolean isstart=s.startsWith("J");
        System.out.println(isstart);//true

        boolean isstart1=s.startsWith("j");
        System.out.println(isstart1);//false

        boolean isstart2=s.startsWith("Java");
        System.out.println(isstart2);//true

        //ornek 11: "s" String'inin 5. index dahil olmak üzere bu indexten itibaren "i" karakteribaslayip baslamadığını
        //kontrol eden kodu yazınız

        boolean isstart3=s.startsWith("i",5);
        System.out.println(isstart3);//true

        boolean isstart4=s.startsWith("v",2);
        System.out.println(isstart4);//true



    }
}
