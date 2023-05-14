package day08stringmanipulationmemoryusageifstatement;

public class HomeWork {
    public static void main(String[] args) {
       // 1) bir string variable oluşturunuz ve bu string deki rakam olmayan tüm karakterlerin sayısını konsola yazdırınız.

        String str="java is Easy!!14.05.2023";
        System.out.println("str = " + str);
        int adet=str.replaceAll("[0-9]","").length();
        System.out.println("adet = " + adet);

        //2) bir string variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakterleri konsola büyük harf yazdırınız

       String buyuk="anneler Günü Kutlu OLSUN";
       String buyuk1=buyuk.substring(1,buyuk.length()-1);
       char kucuk=buyuk.toLowerCase().charAt(0);
        System.out.println("kucuk = " + kucuk);//a
        char son =buyuk.toLowerCase().charAt(buyuk.length()-1);
        System.out.println("son = " + son);//n
        System.out.println("buyuk1 = " + buyuk1);//nneler Günü Kutlu OLSU
       String buyuk2= buyuk1.toUpperCase();
        System.out.println("buyuk2 = " + buyuk2);//NNELER GÜNÜ KUTLU OLSU

        System.out.println(kucuk+buyuk2+son);

        //3)bir string variable oluşturunuz ve bu stringdeki ilk ve son karakterlerin ascıı
        // degerleri toplamını konsola yazdırınız

        String deger="İnci-Ayla Kardeşler";
        char ilk=deger.charAt(0);//İ
        char sonn=deger.charAt(deger.length()-1);//r
        System.out.println(ilk+sonn);//418

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin
        // ilk harfini buyuk harfle diger harflerini kucuk harflerle console a yazdirin

        String sehir="caLİforNİA";
        char ilkk =sehir.toUpperCase().charAt(0);
        String gerikalan=sehir.toLowerCase().substring(1,sehir.length());
        System.out.println("gerikalan = " + gerikalan);
        System.out.println(ilkk+gerikalan);




    }
}
