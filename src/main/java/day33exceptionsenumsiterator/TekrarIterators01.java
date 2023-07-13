package day33exceptionsenumsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TekrarIterators01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Niyazi");
        myList.add("Saadet");
        myList.add("Fevzi");
        myList.add("Suat");
        myList.add("Mustafa");
        System.out.println(myList);//[Niyazi, Saadet, Fevzi, Suat, Mustafa]
        Iterator<String> myItr = myList.iterator();
        System.out.println(myItr);//referans numarası verir.java.util.ArrayList$Itr@49e4cb85

        while (myItr.hasNext()) {
            myItr.next();
            myItr.remove();
        }
        System.out.println(myList);//[]
        List<String> myListt = new ArrayList<>();
        myListt.add("Niyazi");
        myListt.add("Saadet");
        myListt.add("Fevzi");
        myListt.add("Suat");
        myListt.add("Mustafa");

        Iterator<String> myItrr = myListt.iterator();
        while (myItrr.hasNext()) {

            String silinecek = myItrr.next();
            if (silinecek.equals("Fevzi")) {
                myItrr.remove();
            }

        }
        System.out.println(myListt);//[Niyazi, Saadet, Suat, Mustafa]
        ListIterator<String> yeniItr = myListt.listIterator();
        while (yeniItr.hasNext()) {
            String ekleme = yeniItr.next();
            yeniItr.set(ekleme + "*/*");
        }
        System.out.println(myListt);

        List<String> seninList = new ArrayList<>();
        seninList.add("Fevzi");
        seninList.add("Suat");
        seninList.add("Mustafa");
        System.out.println(seninList);//[Fevzi, Suat, Mustafa]
        ListIterator<String> seninItr = seninList.listIterator();
        //List<String> atanacak=new ArrayList<>();

        while (seninItr.hasNext()) {
            seninItr.next();
        }
        while (seninItr.hasPrevious()) {
            String kavanoz = seninItr.previous();
            // atanacak.add(kavanoz+"123");

            System.out.print(kavanoz + "123 ");//Mustafa123 Suat123 Fevzi123


        }
        //System.out.println(atanacak);//[Mustafa123, Suat123, Fevzi123]


    }
}
