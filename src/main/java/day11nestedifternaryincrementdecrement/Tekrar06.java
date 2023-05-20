package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Tekrar06 {
    public static void main(String[] args) {
        //HW-5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz

        // a)En az 6 character olsun
        // b)En az bir tane buyuk harf olsun
        // c)En az bir tane kucuk harf olsun
        // d)En az bir tane rakam olsun
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre= input.nextLine();
        boolean uzunluk=sifre.length()>=6;
        System.out.println("uzunluk = " + uzunluk);//a
        boolean buyukHarf=sifre.replaceAll("[^A-Z]","").length()>=1;
        System.out.println("buyukHarf = " + buyukHarf);//b
        boolean kucukHarf=sifre.replaceAll("[^a-z]","").length()>=1;
        System.out.println("kucukHarf = " + kucukHarf);
        boolean rakam=sifre.replaceAll("[^0-9]","").length()>=1;
        System.out.println("rakam = " + rakam);


    }
}
