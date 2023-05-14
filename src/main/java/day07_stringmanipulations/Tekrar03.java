package day07_stringmanipulations;

import java.util.Scanner;

public class Tekrar03 {
    public static void main(String[] args) {
        //ornek:
        //asagıdaki kurallara göre kullanıcının girdiği password u kontrol ediniz
        //1) en az 8 character olsun
        //2)space karakteri password de olmasın
        //3)en az 1 büyük harf olsun
        //4)en az 1 küçük harf olsun
        // 5)en az 1 rakam olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz  :  ");
        String sifre=scan.nextLine();
        boolean uzunluk =sifre.length()>7;
        System.out.println("uzunluk = " + uzunluk);
        boolean space =!sifre.contains(" ");//boolean space=sifre.replaceAll("\\S","").length()==0;
        System.out.println("space = " + space);
        boolean buyukharf=sifre.replaceAll("[^A-Z]","").length()>0;
        System.out.println("buyukharf = " + buyukharf);
        boolean kucukharf=sifre.replaceAll("[^a-z]","").length()>0;
        System.out.println("kucukharf = " + kucukharf);
        boolean rakam=sifre.replaceAll("[^0-9]","").length()>0;
        System.out.println("rakam = " + rakam);
        boolean sonuc =uzunluk&&space&&buyukharf&&kucukharf&&rakam;

        System.out.println(" Şifreniz......Geçerli mi......"+sonuc);
    }
}
