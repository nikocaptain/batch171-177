package day29collections;

import java.util.LinkedList;

public class TekrarLinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s=new LinkedList<>();
        s.add("nuriye");
        s.add("orhan");
        s.add("bünyamin");
        s.add("saadet");
        s.add("niyazi");
        s.add("bilal");
        s.add("abdullah");
        s.add("nuriye");
        System.out.println(s);

//        System.out.println(s.remove(2));
//        System.out.println(s);

//        System.out.println(s.remove("mehmet"));
//        System.out.println(s);

//        s.removeFirstOccurrence("nuriye");
//        System.out.println(s);

//        s.removeLastOccurrence("nuriye");
//        System.out.println(s);

        String r1= s.peek();
        System.out.println(r1);
        System.out.println(s);

       String r2= s.poll();
        System.out.println(r2);
        System.out.println(s);

        String r3=s.element();
        System.out.println(r3);
        System.out.println(s);

        String r4=s.pop();
        System.out.println(r4);
        System.out.println(s);




    }
}
