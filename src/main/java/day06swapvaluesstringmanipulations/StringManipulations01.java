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

    }

}
