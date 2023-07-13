package day33exceptionsenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        /*
        1-Iterator'lar loopların yaptıgı aynı şeyi yapar.
        2-Iteratorlarda sonsuz loop oluşma ihtimali yoktur
        3-Iterator'lar ile loop lar arasında performans farkı yoktur.
        4-Iterator'lar bir collection dan eleman silme ve bir collection daki eleman degistirme konusunda daha başarılıdır.
        5-Iki tip iterator vardır;
            a)Iterator: bu sadece eleman silmede kullanilir.
            Eleman eklemek veya degistirme mumkun degildir.
            b)ListIterator: bu eleman ekleyebilir ve silebilir

            Note:iterator sadece soldan saga (ilk elemandan son elemana) calisir.
                 Listiterator ise iki yönlü çalışır.

         */
        List<String> myList =new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Saadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");
        System.out.println(myList);
       Iterator<String> myItr= myList.iterator();//[Niyazi, Saadet, Fevzi, Suat, Mustafa]
       Iterator<String> myyourItr=myList.iterator();


        while (myItr.hasNext()){//hasNext() pointer a senden sonra eleman var mı? diye sorar
            //Eleman varsa true yoksa false return eder

            String el= myItr.next();//next(); pointeri bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder
            if (el.equals("Niyazi")){
                myItr.remove();//next(); methodunun return ettigi elemani siler
            }

        }
        System.out.println(myList);//[Saadet, Fevzi, Suat, Mustafa]
        Iterator<String> myItrr= myList.iterator();
        while (myItrr.hasNext()){//hasNext() pointer a senden sonra eleman var mı? diye sorar
            //Eleman varsa true yoksa false return eder

             myItrr.next();//next() pointer i bir sonraki

            myItrr.remove();

        }
        System.out.println(myList);//[]

        //ListIterator kullanımı
        List<String> yourList =new ArrayList<>();
        yourList.add("Niyazi");
        yourList.add("Saadet");
        yourList.add("Fevzi");
        System.out.println(yourList);

        ListIterator<String> yourListItr=yourList.listIterator();

        while (yourListItr.hasNext()){
          String el=  yourListItr.next();

          yourListItr.set(el+"*");

        }
        System.out.println(yourList);//[Niyazi*, Saadet*, Fevzi*]

        //ListIterator kullanımı
        List<String> list3 =new ArrayList<>();
        list3.add("Niyazi");
        list3.add("Saadet");
        list3.add("Fevzi");
        System.out.println(list3);//[Niyazi, Saadet, Fevzi]

        ListIterator<String> listItr=list3.listIterator();//[Niyazi, Saadet, Fevzi]

        //Loop kullanarak pointeri en sona koymalıyız

        while (listItr.hasNext()){
            listItr.next();
        }

        while (listItr.hasPrevious()){
          String el=  listItr.previous();

            System.out.println(el+"*");

        }





    }
}
