package day02datatypesmethodcreation;

public class Variables02 {

        /*
        java da temelde 2 tip data vardir
        1)primitive data type:
        char,boolean,byte,short,int,long,float,double  sadece 8 adettir.

        2)non-primitive data type:
        String.....
         */
        /*
        note 1: primitive data type'larini java olusturmustur. biz olusturamayız
        note 2: primitive data type'larin isimlerinde sadece kucuk harf kullanılır.
        note 3: primitive data'lar data type'larina gore memory de farkli yer kaplarlar.
        note 4: primitive data'lar iclerinde SADECE sizin atadiginiz degeri barindirirlar
         */
        /*
        Non-primitive data types
        Ornek=> String.... sayisi belirsizdir.
            *uretilen her bir class ayni zamanda bir Non-primitive data type dir.
            *Bu yuzden Non-primitive data type lar sinirsiz sayidadir denilebilir.
            *Non-primitive data type ların isimleri buyuk harfle baslar.
            *Non-primitive ler icin java memory de buyuklugune gore degisen boyutlarda yer ayirir.
            *Non-primitive ler ayrıca class lardır.

         */
        public static void main(String[] args) {
            //ornek: ulke ismi icin bir variable olusturun ve ekrana yazdirin



            String ulkeIsmi="Turkiye";

            System.out.println(ulkeIsmi);
            /*
            Interview sorusu: primitive ve Non-primitive data type lar arasındaki fark nedir?
            1)"primitive" ler sadece bizim atadığımız değeri icerir.
            "Non-primitive" ler bizim atadıgımız degeri ve method lari icerir. method
            2)"primitive"ler kucuk harfle baslar "Non-primitive"ler buyuk harfle baslar.
            3)"primitive"leri java uretmistir sayisi bellidir ve 8 tanedir.
              "Non-primitive"leri java ve bizler belirleriz.
            4)"primitive"ler memory de data type larina gore sabit boyutta bellek kullanir.
              "Non-primitive"ler icin java memory de buyuklugune gore degisen boyutlarda bellek kullanabilirler.
              */
        }
}
