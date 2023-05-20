package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ay numarasını giriniz :");
        int monthNum= input.nextInt();
        switch (monthNum){
            case 1 :
                System.out.println("ocak ");
            case 2 :
                System.out.println("şubat");
            case 3 :
                System.out.println(" mart ");
            case 4:
                System.out.println("nisan ");
            case 5:
                System.out.println("mayıs ");
            case 6:
                System.out.println("haziran ");
            case 7:
                System.out.println("temmuz ");
            case 8:
                System.out.println("ağustos ");
            case 9:
                System.out.println("eylül");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12 :
                System.out.println("Aralık");
                break ;//break koyulmazsa break görene kadar alt satırları da yazdırır.
            default :
                System.out.println("Geçerli ay giriniz...");

        }
        /*
        Note : "switch" condition parantezi içinde String, int, byte, short, char kullanılabilir
        Note : "switch" condition parantezi içinde Long, float, double, boolean kullanılmaz
         */
    }
}
