package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String bir non primitive data type dir ve ayni zamanda bir class dir.
        String s="Java is easy";

        //ornek 1: "s" Stringindeki tüm karakterleri büyük harf yapıınız.
        String sUpper=s.toUpperCase();
        System.out.println("sUpper = " + sUpper);//JAVA İS EASY

        //ornek2:"s" Stringindeki tüm karakterleri küçük harf yapıınız.

        String sLower=s.toLowerCase();
        System.out.println("sLower = " + sLower);//java is easy
        //ornek 3:"s" Stringindeki ilk characteri alınız.

        char firstchar=s.charAt(0);
        System.out.println("firstchar = " + firstchar);

        //ornek 4: "s" stringindeki bastan ikinci ve sondan ikinci
        char secondhead=s.charAt(1);
        char secondlast=s.charAt(10);
        System.out.println("secondhead = " + secondhead);
        System.out.println("secondlast = " + secondlast);
        System.out.println(""+secondhead+secondlast);//as

        //ornek 5:"s" stringindeki karakter sayısını bulunuz.
        int sLengt=s.length();
        System.out.println("sLengt = " + sLengt);//12

        //ornek 6: "s" stringindeki ilk 4 karakteri alınız
        // s.substring(0,4)==> bu kullanımda ilk index dahildir ikinci index hariçtir

        String sub1=s.substring(0,4);
        System.out.println("sub1 = " + sub1);//Java



        //ornek 7:"s"stringindeki "is" kelimesini alınız
        String sub2=s.substring(5,7);
        System.out.println("sub2 = " + sub2);//is

        //ornek 8:"s"stringindeki "easy" kelimesini alınız

       String sub3= s.substring(8,12);
        System.out.println("sub3 = " + sub3);//easy

        //ikinci yol
        String sub4=s.substring(8);
        System.out.println(sub4);//easy

        //ornek 9:"s" stringinde "money" kelimesinin var olup olmadığını kontrol ediniz.

        boolean isexist=s.contains("money");
        System.out.println("isexist = " + isexist);//false

        boolean isexist1=s.contains("easy");
        System.out.println("isexist1 = " + isexist1);//true

        boolean isexist3=s.contains("");
        System.out.println("isexist3 = " + isexist3);//true

        //ornek 10: "s" String'inin belli bir harf ile başlayıp başlamadığını kontrol ediniz.


       boolean isstart= s.startsWith("j");
        System.out.println("isstart = " + isstart);//false

        boolean isstart1= s.startsWith("Java");
        System.out.println("isstart1 = " + isstart1);//true

        //ornek 11: "s" String'inin 5. index dahil olmak üzere bu indexten itibaren "i" karakteribaslayip baslamadığını
        //kontrol eden kodu yazınız

        boolean isstart2=s.startsWith("i",5);
        System.out.println("isstart2 = " + isstart2);//true

        boolean isstart3=s.startsWith("v",2);
        System.out.println("isstart3 = " + isstart3);//true


    }

}
