package day20statickeywordconstructors;

public class StaticBlocks01 {

    //bir variable olusturdugunuzda deger atamazsaniz o variable i "initialize" etmediniz demektir.
     static double pi;
     static String shape;
     static int age;
     //bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir.
    //bu yuzden static bloks kullanilir.
     //note 1: static blocks variable lari initialize etmek icin kullanilirlar
    //*******ve class icerisinde herseyden once calistirilirlar********
    //birden fazla static blocks oldugunda static blocks yukaridan asagiya dogru yani yukarida olan once baslar.

    static {
        pi=3.14;
        System.out.println("static block 1 "+pi);
    }
    static {
        shape="Circle";
        System.out.println("static block 2 "+shape);
    }
    static {
        age=33;
        System.out.println("static blocks 3: "+age);
    }

    public static void main(String[] args) {
         /*
         bazen main method da calistirilmadan once variable larin hazir hale getirilmesi gerekir.
         bu nedenle "static block" lara ihtiyac duyabiliriz.

         static variable lar static blocklar icinde initialize edilirse o class in icinde herseyden once hazir hale getirilmis olur.
          */
        pi=3.14;

        System.out.println(pi);
        System.out.println("main method");
    }


}
