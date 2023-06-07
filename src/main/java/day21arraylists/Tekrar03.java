package day21arraylists;

import java.util.List;

public class Tekrar03 {
    public static void main(String[] args) {
        //kisa yoldan bir list nasil olusturulur?
        //List.of() methodu degistririlemez bir list olusturmak icin kullanilir
        //Degisiklik yapmaya yonelik methodlari desteklemez.

        List<Character> initials=List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d, k]
       // initials.remove('a');
        //System.out.println(initials);
        //initials.add('z');
        //System.out.println(initials);

        //indexOf(Aranan Karakter) methodu aranan karakterin ilk görünümünün index ini verir.
        int r1=initials.indexOf('k');
        System.out.println(r1);//1

        //LastIndexOf(aranan karater) methodu aranan karakterin son gorunum index ini verir.
        int r2=initials.lastIndexOf('k');
        System.out.println(r2);//4
        for (int i = 0; i < initials.size(); i++) {
            if (initials.get(i)==initials.get(initials.size()-1)){
                System.out.print(initials.get(i)+" ");
            }

        }





    }
}
