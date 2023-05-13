package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {
    public static void main(String[] args) {
        //ornek 1:bir string in belirli bir karaktrinden başlayarak belirli bir karaktere kadar dynamic olarak alınız.
        //abcgmail.com==>gmail

        String a="abc@gmail.com";
        int startindIndex=a.indexOf('@')+1;
        int endingIndex=a.indexOf('.');
        String companyName=a.substring(startindIndex,endingIndex);
        System.out.println("companyName = " + companyName);

        //ornek 2: verilen iki stringin birbirinin aynısı olup olmadığını kontrol eden kodu yazınız

        String h="ali can";
        String i="Ali Can";
        boolean result=h.equals(i);
        System.out.println("result = " + result);//false verir key sensetive den dolayıdır.
  //------------------------------------------------------------------------------------------------------------------
        //Java da memory kullanımı
        /*
        java da 2 tsne memory vardır
        1)Stack memory==>Small
        a)küçük memory dir.
        b)primitive leri ve non primitive lerin adreslerini(reference) tutar

        2)Heap memory==>huge
        a)büyük memory dir.
        b) non primitive dataları içerir.
     ==>Java heap memory deyerleştirilen tüm non primitive datalar iin bir adres oluşturur
     // ve bu adresi stack memory e saklar
         */
        /*
        note:String lerin eşitliklerini kontrol ederken "==" yerine "equals()" methodu kullanırız.
        neden kullanırız?
        Cunku;"==" sembolu iki string i karşılaştırırken hem adreslerine hemde değerlerine bakar,
        ikiside ayni ise stringler esittir dr. ama biz code yazarken genellikle stringlerinn adresleri ile değil degerlri ile ilgileniriz.
        bu yuzden String karşılaştırmasında "==" kullanmayız

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir
         */

        String s="Tom";
        String t="Terry";
        String r=new String("Tom");
        System.out.println(s==t);//false cunku adresler ve degerler farklıdır
        System.out.println(s.equals(t));//false cunku degerler farklı
        System.out.println(s==r);//false cunku adresleri farklı
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar."s" ve "r" nin degerleri aynıdır.
// --------------------------------------------------------------------------------------------------------------------
        //ornek 3: verilen 2 string in birbirinin aynısı olup olmadığını buyuk kucuk haraf hassasiyeti olmadan kontrol ediniz
        //equalsIgnoreCase() iki stringin birbirinin aynısı olup olmadığını buyuk kucuk haraf hassasiyeti olmadan kontrol eder
        String j="ali Can";
        String k="Ali Can";
        boolean result33=j.equalsIgnoreCase(k);
        System.out.println("result33 = " + result33);//true

        /*homework :

        1) bir string variable oluşturunuz ve bu string deki rakam olmayan tüm karakterlerin sayısını konsola yazdırınız.
        2) bir string variable oluşturunuz ve ilk karakter ve son karakter dışındaki tüm karakterleri konsola yazdırınız
        3)bir string variable oluşturunuz ve bu stringdeki ilk ve son karakterlerin ascıı degerleri toplamını konsola yazdırınız
       4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz
         */


    }
}
