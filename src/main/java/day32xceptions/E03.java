package day32xceptions;

public class E03 {
    /*
    throw keyword bir methodun body si icinde istedigimiz yerde, istedigimiz kosullar icin istedigimiz kadar
    Exception atmamizi saglar.

    throw keword yazildiktan sonra bir exception class object i olusturulur.
    orek:throw new IllegalArgumentException("Age cannot be negative");

    Exception class constructor parantezi icine istediginiz exception mesajini yazabilirsiniz.
     */
    public static void main(String[] args) {
        try {
            printAge(-50);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        System.out.println("handel disi");

    }

    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }

    }
}
