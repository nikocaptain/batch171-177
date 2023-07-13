package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> depo=new LinkedList<>();
        depo.add("Egg");
        depo.add("Milk");
        depo.add("Cheese");
        depo.add("meat");
        System.out.println(depo);//[Egg, Milk, Cheese, meat]

        System.out.println(depo.remove());//Egg
        System.out.println(depo);//[Milk, Cheese, meat]
        System.out.println(depo.poll());//Milk
        System.out.println(depo);//[Cheese, meat]
        System.out.println(depo.element());//Cheese
        System.out.println(depo);//[Cheese, meat]

        depo.clear();
        System.out.println(depo);//[]
        System.out.println(depo.peek());//null
        System.out.println(depo.poll());//null
        //System.out.println(depo.element());//Exception in thread "main" java.util.NoSuchElementException


    }
}
