package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Bir List in baska bir list ile aynı olup olmadıgını nasil kontrol ederiz?
        //Iki Listin ayni olabilmesi icin ayni index te ayni eleman olmalıdır

        ArrayList<String> names1= new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2= new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");


       boolean s= names1.equals(names2);
        System.out.println(s);//false

        //ornek:size verilen 2 Integer liste tatmiyla ayni eleman olup olmadigini kontrol ediniz.

        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t=nums1.equals(nums2);
        System.out.println(t);//true

        //Array List te bir elemanin ilk görünümü nasil silinir?

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


        //remove() methodu bir elemanin iilk görünümünü siler
        //cities.remove("Miami");
        System.out.println(cities.remove("Miami"));//true==> silme işlemini yaptım diyor.
        System.out.println(cities);


        //Array List te bir eleman index i kullanilarak nasil silinir?
        //cities.remove(2);
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa silmiş oldugu datayi return eder.
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmediğini ifadee eden boolean return eder.

        //ornek: Bir Integer list olusturun ve 12 elemanini ages list den siliniz.


        //ArrayList olustururken sag tarafa(Constructor) ArrayList yazmak zorundayiz
        //
        List<Integer> ages=new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //ages.remove(12);
        //System.out.println(ages);

        //1. yol
        /*Integer nonPrimitive=12;
        ages.remove(nonPrimitive);
        System.out.println(ages);

         */


        //2. yol
        ages.remove((Integer) 12);//Autoboxing==> tavsiye edilir
        System.out.println(ages);

        //3. yol

        //ages.remove(Integer.valueOf(12));
        //System.out.println(ages);

        //4. yol
        // ages.remove(ages.indexOf(12));
        //System.out.println(ages);

        //Bİr ArrayList teki bir elemanin tüm görünümlerini nasil sileriz.


        List<String> citiesRemove=new ArrayList<>();//coklu silmelerde Collection olusturmak zorundayiiz
        citiesRemove.add("Yozgat");
        citiesRemove.add("Istanbul");
        cities.removeAll(citiesRemove);
        System.out.println(cities);


    }
}
