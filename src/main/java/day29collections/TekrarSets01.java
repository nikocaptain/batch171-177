package day29collections;

import java.util.*;

public class TekrarSets01 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Gulce");
        hs.add("Seda");
        hs.add("Omer");
        hs.add("Hasan");
        hs.add("Benna");
        System.out.println(hs);
        hs.add("Seda");
        System.out.println(hs);

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(19);
        lhs.add(13);
        lhs.add(-33);
        lhs.add(312);
        System.out.println(lhs);

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(19);
        ls.add(13);
        ls.add(313);
        ls.add(45);

        System.out.println(lhs.retainAll(ls));
        System.out.println(lhs);
        System.out.println(ls);

        TreeSet<Character> ts=new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');//tekrar old. için yazmadı
        System.out.println(ts);

//        ts.add(null);//TreeSet'lerde null eklenemez.
        System.out.println(ts);//[A, B, E, G, L, Y]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Y

        System.out.println(ts.lower('E'));//B
        System.out.println(ts.higher('E'));//G
        System.out.println(ts.headSet('E', true));//[A, B, E]
        System.out.println(ts.headSet('E'));//[A, B]
        System.out.println(ts.ceiling('A'));//A
        System.out.println(ts.ceiling('M'));//Y
        System.out.println(ts.floor('E'));//E
        System.out.println(ts.floor('C'));//B
        System.out.println(ts.subSet('B', 'L'));//[B, E, G]
        System.out.println(ts.subSet('E', false, 'Y', true));//[G, L, Y]

    }
}
