package day07_stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        //ornek:
        //asagıdaki kurallara göre kullanıcının girdiği password u kontrol ediniz
        //1) en az 8 character olsun
        //2)space karakteri password de olmasın
        //3)en az 1 büyük harf olsun
        //4)en az 1 küçük harf olsun
       // 5)en az 1 rakam olsun

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen password giriniz :");
        String pwd=input.nextLine();
        //1) en az 8 character olsun


        boolean firstt=pwd.length()>7;
        boolean first=pwd.length()>7;
        System.out.println("en az 8 karakter var mi  :"+first);
        //2)space karakteri password de olmasın
        boolean second= !pwd.contains(" ");
        System.out.println("space karakteri yok mu  :"+second);
        //3)en az 1 büyük harf olsun
        //Note: buyuk harf olmayanları sildik
        //kalan karakter sayısına bak
        //character sayısı sifir ise buyuk harf yok demektir.
        //sifirdan buyuk ise buyuk harf var demektir.
       boolean third= pwd.replaceAll("[^A-Z]","").length()>0;//methodları aynı satırda yanyana kullanmaya
        // "method chain" denir

        System.out.println("en az 1 büyük harf var mi  :"+third);

        //4)en az 1 harf olsun

        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("en az 1 küçük harf var mi  :"+fourth);

        //5)en az 1 rakam olsun

        boolean fifth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("en az 1 rakam var mi  :"+fifth);

        //and operatoru ile calıştırırız
        System.out.println((("Password geçerli mi  :"+(first && second && third && fourth && fifth))));


        //3)en az 1 büyük harf olsun
        //4)en az 1 küçük harf olsun
        // 5)en az 1 rakam olsun




    }
}
