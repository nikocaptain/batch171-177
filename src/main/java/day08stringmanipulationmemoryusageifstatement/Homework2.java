package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        /*
        5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre= scan.next();
        boolean uzunluk=sifre.length()>5;
        System.out.println("uzunluk = " + uzunluk);
       boolean buyukharf= sifre.replaceAll("[^A-Z]","").length()>0;
        System.out.println("buyukharf = " + buyukharf);
        boolean kucukharf=sifre.replaceAll("[^a-z]","").length()>0;
        System.out.println("kucukharf = " + kucukharf);
        boolean rakam=sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println("rakam = " + rakam);
        boolean sifre1=uzunluk&&buyukharf&&kucukharf&&rakam;
        System.out.println(" sifreniz  "+sifre1);
    }
}
