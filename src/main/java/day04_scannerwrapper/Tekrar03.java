package day04_scannerwrapper;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        //ornek: kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki rakamlarının toplamını
        //yazdıran kodu yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz  :");
        int sayi= input.nextInt();

        int birlerbasamagi=sayi%10;
        System.out.println("birlerbasamagi = " + birlerbasamagi);

        sayi=sayi/10;
        int onlarbasamagi=sayi%10;
        System.out.println("onlarbasamagi = " + onlarbasamagi);

        sayi=sayi/10;
        int yuzlerbasamagi=sayi%10;
        System.out.println("yuzlerbasamagi = " + yuzlerbasamagi);
        sayi=sayi/10;
        int binlerbasamagi=sayi%10;
        System.out.println("binlerbasamagi = " + binlerbasamagi);
        sayi=sayi/10;
        int yuzbinlerbasamagi=sayi%10;
        System.out.println("yuzbinlerbasamagi = " + yuzbinlerbasamagi);

        System.out.println(birlerbasamagi+onlarbasamagi+binlerbasamagi+yuzbinlerbasamagi);
    }
}
