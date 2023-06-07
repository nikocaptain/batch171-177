package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tekrar02 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Kim");
        names.add("Tom");
        names.add("Jim");
        ArrayList<String> names1=new ArrayList<>();
        names1.add("Kim");
        names1.add("Tom");
        names1.add("Jim");
        boolean equal=names1.equals(names);//esit olmasi icin elemanlar sirasiyle ayni olmalidir.
        System.out.println(equal);//true

        //ornek:size verilen 2 Integer liste tatmiyla ayni eleman olup olmadigini kontrol ediniz.
        ArrayList<Integer> num1=new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);
        ArrayList<Integer> num2=new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        Collections.sort(num1);
        Collections.sort(num2);
        boolean r=num1.equals(num2);
        System.out.println(r);//true

        //Array List te bir elemanin ilk görünümü nasil silinir?

        System.out.println("num1.indexOf(0) = " + num1.remove(0));
        System.out.println(num1);//[9, 10]

        List<Integer> ages=new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //ornek: Bir Integer list olusturun ve 12 elemanini ages list den siliniz.

        ages.remove((Integer) 12);//Autoboxing yaparak 12 yi index den çıkarıp eleman yaptik
        System.out.println(ages);//[23, 7, 4]

        System.out.println("ages.indexOf(12) = " + ages.remove(ages.indexOf(23)));

        //Bİr ArrayList teki bir elemanin tüm görünümlerini nasil sileriz.

        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);
        //System.out.println("cities.remove(0) = " + cities.remove(0));//cities.remove(0) = Miami

        ArrayList<String> citiesremove=new ArrayList<>();//coklu silmelerde Collection olusturmak zorundayiiz
        citiesremove.add("Miami");
        citiesremove.add("Yozgat");
        cities.removeAll(citiesremove);
        System.out.println(cities);
        ArrayList<String> istanbul=new ArrayList<>();
        istanbul.add("Istanbul");

        cities.removeAll(istanbul);
        System.out.println(cities);

    }
}
