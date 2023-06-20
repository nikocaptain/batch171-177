package day29collections;

import java.util.TreeSet;

public class TekrarSets02 {
    public static void main(String[] args) {
        //ornek:ogrenci email adreslerini natural order a gore sıralanmış olarak depolayınız.

        TreeSet<String> emails=new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);

    }
}
