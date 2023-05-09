package day04_scannerwrapper;

import java.util.Scanner;

public class scanner04 {
    public static void main(String[] args) {
        //ornek: kullanıcıdan bir dikdörtgenin 2 kenar uzunlugunu alınız.
        //a)alanını hesaplayınız
        //b)cevresini hesaplayınız
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin kısa kenarını giriniz");
        double kisakenar=input.nextDouble();
        System.out.println("lütfen dikdörtgenin uzun kenarını giriniz");
        double uzunkenar=input.nextDouble();
        System.out.println("dikdörtgenin cevresi = " +(2*(kisakenar+uzunkenar)));
        System.out.println("dikdörtgenin alanı = " + (kisakenar*uzunkenar));


    }
}
