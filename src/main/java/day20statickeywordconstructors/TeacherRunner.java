package day20statickeywordconstructors;

import java.util.Scanner;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Alican",40,"istanbul");
        Teacher t2=new Teacher("velihan",41);
        Teacher t3=new Teacher();

        t3.name= "Niyazi";
        t3.age=28;
        t3.address="sultanbeyli";
        System.out.println(t3);

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
    }

}
