package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //ornek:ogrenci email adreslerini natural order a gore sıralanmış olarak depolayınız.

       Long t1= System.nanoTime();

        TreeSet<String> emails=new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");

        System.out.println(emails);//[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]
       Long t2= System.nanoTime();

        HashSet<String> hs=new HashSet<>();
        hs.add("z@gmail.com");
        hs.add("b@gmail.com");
        hs.add("k@gmail.com");
        hs.add("v@gmail.com");
        hs.add("h@gmail.com");
        hs.add("e@gmail.com");
        hs.add("a@gmail.com");
        hs.add("m@gmail.com");
//        System.out.println(hs);

        TreeSet<String> emailTsHs=new TreeSet<>(hs);
        System.out.println(emailTsHs);//[a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]
        Long t3=System.nanoTime();

        System.out.println(t2-t1);//1006900
        System.out.println(t3-t2);//81800


    }
}
