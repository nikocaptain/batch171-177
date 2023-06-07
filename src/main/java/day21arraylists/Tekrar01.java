package day21arraylists;

import java.util.ArrayList;

public class Tekrar01 {
    public static void main(String[] args) {
        ArrayList<Integer> age=new ArrayList<>();
        age.add(8);
        age.add(9);
        age.add(10);
        age.add(11);
        System.out.println(age);//[8, 9, 10, 11]
        age.add(1,99);
        System.out.println(age);//[8, 99, 9, 10, 11]
        ArrayList<Integer> newAge=new ArrayList<>();
        newAge.add(21);
        newAge.add(22);
        newAge.add(23);
        age.addAll(newAge);
        System.out.println(age);//[8, 99, 9, 10, 11, 21, 22, 23]
        age.addAll(2,newAge);
        System.out.println(age);

        int elemanSayisi=age.size();//List uzunluğu bulma methodu
        System.out.println(elemanSayisi);//11

        int eleman=age.get(1);//eleman bulma methodu
        System.out.println(eleman);//99

        age.set(0,88);//eleman degistirme methodu
        System.out.println(age);//[88, 99, 21, 22, 23, 9, 10, 11, 21, 22, 23]

        //age.clear();//tüm elemanlari silme methodu
        //System.out.println(age);//[]
        boolean r=age.contains(23);//bu methodla yazilan elemanin olup olmadigini kontrol ederiz
        System.out.println(r);//true
        boolean r1=age.isEmpty();
        System.out.println(r1);//false

        ArrayList<String> names=new ArrayList<>();
        names.add("niyazi");
        names.add("tugba");
        names.add("ayla");
        names.add("inci");

        if (names.size()==0){
            System.out.println("list is empty");
        }else {
            System.out.println("List has at least 1 element");//List has at least 1 element
        }
        names.clear();

        if (names.isEmpty()){
            System.out.println("list is empty");//list is empty
        }else {
            System.out.println("List has at least 1 element");//List has at least 1 element
        }
        /*
        Bir method ögrenirken 3 seyi ogrenin;
        1) O method ne ise yarar
        2) O method nasıl kullanılır?
        3) O method size neyi verir?

         */








    }
}
