package day01variables;//package isimleri küçük harflerden oluşturulur.ıcınde bulunulan package ismi

public class Variables01 {//class isimleri büyük harfle başlar.
    public static void main(String[] args) {
        //project icinde sayısız package vardır.package icinde sayısız class vardır.
        // açıklama satırıdır. java bu satırı okumaz.kendimize ve diger arkadaslara acıklamadır.
        /*
        java bu satırlarıda okumaz.enter a basınca diğeri otamatik gelir.
         */
        // Variable (pasif özellikler) nasıl oluştrulur?variable icin reserve area olusturulur.
        // data type + variable name + assignment Operator(atama oparatörü) + variable değeri + noktalı virgül

        int age =6;//bu duruma variable declaration denir.java da tanımlama yapıyoruz.
        // "=" sagında gordugu degerı solunda bulunan sepete atar.
        // java cümlesi =>statement olarak adlandırılır.
        //dilbilgisinde nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gosterir.
        //eger variable declaration yapar, asignment yapmazsaniz java kendi default degerlerini koyar
        //default deger sayilar icin sifirdir
        //Java da "=" assignment Operatorudur ve java bu operatoru gorunce önce sag tarafı calıstırır
        // ve sagdakı degerı alır soldakı kutuya koyar.
        // Java da esıttır demek ==>  "==",,  matematikte "=", Java da "=="
        // data type + variable name ===> variable declaratıon
        // assignment Operator(atama oparatörü) + variable değeri===> Assıgnment
        /*
        Java da temelde 2 tip data vardır;
        1)primitive (ilkel) data type:
        char,boolean,byte,short,int,long,float,double  8 adet tir sabittir.

        2)non primitive (ilkel olmayan-gelişmiş) data type:
        sınırsızdır örnek String
         */
        // ornek 1: ogrenci ismi icin variable olusturup Ali Can atayınız

        String ogrenciAdi= "Ali Can";
        // String lere verilen degerler daima cift tırnak icinde olmalıdır.
        //null ==> hiclik, default deger text icin null dir
        //String ler icin default value(==>varsayılan deger)  "null" dir
        /*
        String variable olusturdugumuzda cogu zaman ona bir deger atar. atama yapmazsak java o variable icin varsayılan
        deger olarak null koyar
        null demek 0 demek degıldır, 0 da coding te bir degerdir, null ie hiclik demektir.
        null demek icinde variable veya method bulunmayan bos bir objedir
        * {}==>eleman yok  {0}==> elemani sifir
         */

       // char data type:
        // tek karakterler icin kullanılır. sayi, sembol yada harf fark etmez.
        // ornegin ==> A,?,4,x

        //ornek 2:  char data type ında bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayınız.
        char isminIlkHarfi = 'A';

        //note: char data type ında degerler tek tırnak icine konulmalıdır.


        //boalean data type:
        //boalean lar sadece 2 farklı deger alabilir; true veya false
        //isimlendirme yapilirken basina is konulur
        //ornek 3: boolean data type ında emeklimisin sorusu icin bir variable olusturun ve false degerini atayin
        boolean isretire= false;

        //byte data type:
        // tam sayilar icindir hafizada 1 byte yer kaplar.
        //byte: -128 den baslar +127 e (dahil) kadar tamsayi degerleri icin kullanılır.
        //ornek 4: byte data type ında ögrenci yasi icin bir variable olusturunuz

        byte ogrenciYasi=18;


        //short data type:
        // tam sayilar icindir hafizada 2 byte yer kaplar.
        //short: -32768 den baslar +32767 e (dahil) kadar tamsayi degerleri icin kullanılır.
        //ornek 5: site nufusu icin bir variable olusturun ve bir deger atayın

        short SiteNufusu=1300;

        //int data type
        //tam sayilar icindir hafizada 4 byte yer kaplar.
        //int: -2,147,483,648 den baslar 2,147,483,647 e (dahil) kadar tamsayi degerleri icin kullanılır.

        //ornek 6:ulke nufuslari icin bir variable olusturup deger atayın

        int UlkeNufusu= 90000000;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar.
        //long: -2,147,483,648 den baslar 2,147,483,647 e (dahil) kadar tamsayi degerleri icin kullanılır.

        //ornek 7:insan vücundaki hucre sayisi icin variable olusturup deger atayin

        long cell=25556885346878L;
        //note: bir deger long ise "L"()tavsiye edilir yada "l" konulur.

        // eger long'a atadıginiz deger int lerin aralıgında ise sonuna L koymaya gerek yok.
        //Long dememize ragmen sonuna L koymazsdak eger int araliginda ise java onu int kabul eder. hafiza yönetimi için

        //float data type:
        //virgüllü sayilar (decimel numbers==>ondalıklı sayılar) için kullanılır.(fiyatlandirmalar)

        //ornek 8:gomlek ve ayakkabi fiyatlari icin 2 tane variable olusturunuz.

        float GomlekFiyati=12.99F;
        //note: java ondalikli sayilari otamatik olarak double kabul eder
        //float olmasında israr ediliyorsa "F" veya "f" koyulmalidir
        // 4 byte yer kaplar

        float Shoesprice=15.99f;

        //double data type:
        //double memory de 8 byte yer kaplar,ondalikli kisim için daha fazla rakam alir
        //ondalikli sayilar icin kullanilir.
        //ornek 9: hucre agırlıgı ve amipin agirligi icin bir variable olusturunuz

        double weightcell=0.00000000112;
        double weightamip=0.000000000000001123;

        //ornek 10:ogrenci notları icin 2 adet variable olusturunuz ve toplamlarını ekrana yazdırınız.
        /*ekrana yazdırmak icin
        System.out.println();ekrana yazdirmak icindir.

         */
        //System.out.println(5);ekrana 5 yazdırır pointer'ı alt satıra indirir.
        //System.out.print(15);ekrana 15 yazdirir ve pointer'ı ayni satırda tutar.

        byte note1=55;
        byte note2=88;
        System.out.println("Ogrenci notlari toplami ="+" "+(note1+note2) );
        System.out.println(note1+note2);
        System.out.println("note1 = " + note1);

        //homework
        /*
        1) 3 farkli data türünüde variable oluşturun ve bunları farklı satırlarda oluşturun
        2) ulke ve sehir isimleri icin 2 variable olusturun ve bunları yazdirin
        3) 2 tamsayi türünde variable oluşturup toplamını yazdırınız
         */







    }

    }
