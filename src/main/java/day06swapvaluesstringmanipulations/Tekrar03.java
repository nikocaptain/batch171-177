package day06swapvaluesstringmanipulations;

public class Tekrar03 {
    public static void main(String[] args) {
        String s="İnci 6 Yaşında";
        //ornek 1: "s" Stringindeki tüm karakterleri büyük harf yapıınız.
       String s1= s.toUpperCase();
        System.out.println("s1 = " + s1);

        //ornek 2:"s" String indeki "İnci" kelimisini "dollar" kelimesine ceviriniz

       String s2= s.replace("İnci","ayla");
        System.out.println("s2 = " + s2);

        //ornek 4:s stringindeki "a" harflerini "*" olarak degistiriniz

       String s3= s.replace('a','i');
        System.out.println("s3 = " + s3);

        //ornek2:"s" Stringindeki tüm karakterleri küçük harf yapıınız.

       String s4= s.toLowerCase();
        System.out.println("s4 = " + s4);
        //ornek 3:"s" Stringindeki ilk characteri alınız.
        char s5=s.charAt(2);
        System.out.println("s5 = " + s5);
        //ornek 5:"s" stringindeki karakter sayısını bulunuz.
       int s6= s.length();
        System.out.println("s6 = " + s6);

        //ornek 6: "s1" stringindeki ilk 4 karakteri alınız

        String s7=s.substring(1,6);
        System.out.println("s7 = " + s7);//s7 = nci 6

        //ornek 7:"s"stringindeki "ci" kelimesini alınız

       String s8= s.substring(2,4);
        System.out.println("s8 = " + s8);//s8 = ci

        //ornek 9:"s" stringinde "money" kelimesinin var olup olmadığını kontrol ediniz.

       boolean s9= s.contains("İnci");
        System.out.println("s9 = " + s9);//s9 = true

        //ornek 10: "s" String'inin belli bir harf ile başlayıp başlamadığını kontrol ediniz.

        boolean s10=s.startsWith("İ");
        System.out.println("s10 = " + s10);//s10 = true

        //ornek 11: "s" String'inin 5. index dahil olmak üzere bu indexten itibaren "i" karakteribaslayip baslamadığını
        //kontrol eden kodu yazınız

        boolean s11=s.startsWith("i",3);

        System.out.println("s11 = " + s11);//s11 = true


    }
}
