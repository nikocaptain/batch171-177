package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
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

        //s.remove(2);
        //System.out.println(s);//indexteki karakteri siler

       // s.remove("bilal");
        //System.out.println(s);

       // s.removeFirstOccurrence("nuriye");
        //System.out.println(s);//ilk nuriyeyi siler

        //s.removeLastOccurrence("nuriye");
        //System.out.println(s);

//        System.out.println(s.remove(2));//bünyamin
//        System.out.println(s);//[nuriye, orhan, saadet, niyazi, bilal, abdullah, nuriye]

//        System.out.println(s.remove("bilal"));
//        System.out.println(s);


//        System.out.println(s.removeFirstOccurrence("nuriye"));//true
//        System.out.println(s);//[orhan, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]


//        s.removeLastOccurrence("nuriye");
//        System.out.println(s);//[nuriye, orhan, bünyamin, saadet, niyazi, bilal, abdullah]

       String r1= s.peek();//ilk nodu(elemanı) silmeden verir. copy-paste
       System.out.println(r1);//nuriye
       System.out.println(s);//[nuriye, orhan, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]
/*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty

 */

        String r2=s.poll();//ilk nodu(elemanı) silip verir. cut-paste
        System.out.println(r2);//nuriye
        System.out.println(s);//[orhan, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]

        /*
        Retrieves and removes the head (first element) of this list.
        Returns:the head of this list, or null if this list is empty
         */

       String r3= s.element();//ilk nodu(elemanı) silmeden verir. copy-paste
        System.out.println(r3);//orhan
        System.out.println(s);//[orhan, bünyamin, saadet, niyazi, bilal, abdullah, nuriye]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty

        NOTE: peek() ile element() ikiside ilk elamani silmeden verir
        ama peek() list bos oldugunda size null verir, element() ise hata verir
         */
       String r4=s.pop();
        System.out.println(r4);//orhan
        System.out.println(s);//[bünyamin, saadet, niyazi, bilal, abdullah, nuriye]

        //note: poll() ile pop() ikiside ilk elemani siler ve size verir(cut+paste)
        //ama poll() list bos oldugunda size null verir, pop() ise hata verir

    }
}
