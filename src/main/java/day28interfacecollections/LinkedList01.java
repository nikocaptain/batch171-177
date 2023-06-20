package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        //aynı tip coklu data ları saklayabilen yapılara Collection denir.
        //Arrayler collection degildir daha ilkeldir sayi belirlemek gerekir ve sadece primitive saklar
        //Array listler collection ornegidir.

//        ArrayList<String> list1=new ArrayList<>();//bu ilk olusturma seklimiz
//        List<String> list2=new ArrayList<>();// data tipini list secebildik cunku parenti Array list in
//        List<String> list3=new List<>();//olmaz List bir interface dir.Lİstlerin constructoru yoktur obje uretemezler to do list tir.
//        Array list is a List, array list is a Collection, Array list is an Interable, Array list is an Object diye tanimlanabilir.


        /*
        ArrayList'ler eleman ekleme ve silme de tekrar index leme yapmak zorunda
        olduklarıindan eleman ekleme ve silmede basarisizdirlar

        Node => Düğümlemek. Pointerler bağlanıyor buradan anlayabiliriz.
        LinkedList'te index yoktur. silmede pointer bir sonrakine geçer otomatik olarak
        LinkedList'te index yoktur. eklemede pointer kırılır eklenen elemanı gösterir,
        eklenen eleman sonraki elemana bağlanır popinterı da onu gosterir
        1)LinkedListler index kullanmazlar bu yüzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz
        2)LinkedListlerde node ekleme ve silme islemleri yaparken sadece pointerleri degistirir
         */

        /*
   1)ArrayListler eleman ekleme ve silme islemlerinde basarisizdirlar
    bu yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez
   2)LinkedList ler index kullanmadiklarinda node silme ve ekleme de re-index yapilmasina gerek yoktur
   Bu da LinkedList leri eleman ekleme ve silme e cok basarili hale getirir
   Bu yüzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir
   3)ArrayList'lerde search işlemi kolay yapilişr cunku indexler data gibidir.
   4)LinkedList'lerde search islemi zor yapılır cunku LinkedList'ler index kullanmaz,index kullanmayinca
   herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir.
        */

        LinkedList<String> s=new LinkedList<>();

        s.add("nuriye");
        s.add("orhan");
        s.add("bünyamin");
        s.add("saadet");
        s.add("niyazi");
        s.add("bilal");
        s.add("abdullah");
        s.add("nuriye");
        System.out.println(s);//[nuriye, orhan, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]
        s.add(2,"omer");
        System.out.println(s);//[nuriye, orhan, omer, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]
        s.addFirst("mahmut tuncer");
        System.out.println(s);//[mahmut tuncer, nuriye, orhan, omer, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]
        s.addLast("emin");
        System.out.println(s);//[mahmut tuncer, nuriye, orhan, omer, bünyamin, saadet, niyazi, bilal, abdullah, nuriye, emin]


    }
}
