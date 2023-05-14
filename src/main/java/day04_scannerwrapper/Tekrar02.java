package day04_scannerwrapper;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {


        //ornek: kullanıcıdan bir dikdörtgenin 2 kenar uzunlugunu alınız.
        //a)alanını hesaplayınız
        //b)cevresini hesaplayınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısakenarını giriniz :");
        int kisakenar= input.nextInt();
        System.out.println("Lütfen dikdörgenin uzunkenarını giriniz  :");
        int uzunkenar= input.nextInt();

        int dikalan= uzunkenar*kisakenar;
        int dikcevre=(uzunkenar+kisakenar)*2;
        System.out.println("dikdörtgenin alanı  :  "+(dikalan));
        System.out.println("dikdörtgenin çevresi:  "+(dikcevre));
    }
}
