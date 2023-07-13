package day28interfacecollections;
public  interface Ac {

    void cool();
    void run();
     public final static int price=2000;
    /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilacagini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olarak public dir, abstracttir, static degildir
    5)interfaceler concrete method iceremezler dolayisiyla interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
    16,06,2023 sonu
    6)Coklu interface parentlerin her birinin icine ayni isimli methodlar koyabiliriz.
    Mesela "Ac" nin , "Engine" in ve "Security" nin iclerine "run()" methodu koymak gibi
    Child class herhangi birini override ettiginde hepsini override etmis olur, sonra da body i child
    class da yazarak uygulamasini yapmis olur.
    7)  a)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "final" dir. bu yüzden
    interface icindeki variable i olusturdugunuzda
    mutlaka deger atamasi yapmalisiniz . Bilindigi gibi "Final" variable larin degerleri degistirilemez
        b)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "public" dir.
        c)Interface lerdeki tüm variablelar otomatik olarak (default) olarak "static" dir.
     ==>Dolayisiyla interface lerde variable cagirirken interface adini kullanarak cagiririz.
     bu hem static variable olmanin geregidir, hem de okunurlugu arttirir
     8) Normalde "interface" içine "concrete method" konulamaz ama özel durumlarda "concrete method"
     koymamız gerekirse "default" keyword kullanarak bunu yapabiliriz
        static keyword'unu kullanarakta interface icine concrete method koyabiliriz
     9) "default" keywordunu kullanarak olusturdugunuz "concrete method"lara
     interface in child class'ından object olusturarak ulasabilirsiniz
     "static keywordunu" kulanarak olusturdugunuz concrete methodlara ulasmak icin obje ulastırmaya gerek yoktur
     interface ismi yeterlidir.
     10)interface lerden object olusturulamaz. interface lerin constructorları yoktur.
     11)
            Child               Parent               keyword
            class               class           ==>  extends
            interface           interface       ==>  extends
            class               interface       ==>  implement
            interface            class          ==>  olamaz

            ayni ise "extends" farklı ise "implement" kullanilir, ve interface, concrete class ın child i olamaz


            Abstract class ile interface arasındaki farklar nelerdir?

            1)abstract classlar hem abstract hemde concrete methodlar içerebilir fakat interfaceler sadece abstract method içerir
                ama interface'lerde istersek "default" ve "static" keywordlerini kullanarak "concrete" method uretebiliriz
            2)Abstract classlar multiple inheritance i desteklemez ama interface destekler
            3Abstract classlar içinde her türlü variable olusturulabilir,
            interface'ler icindeki variable'lar public,final ve static olmak zorundadır.
            4)interface, Class in child i olamaz ama ; abstract class, classın child i olabilir.
            5)abstract classlarda constructor vardır ama obje uretemez,
            interface'lerde constructor yoktur bu  yuzden obje uretilemez.

     */


}
