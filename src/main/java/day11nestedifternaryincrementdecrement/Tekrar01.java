package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
          /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz :");
        String gender= input.next();
        System.out.println("lütfen yaşınızı giriniz :");
        int age= input.nextInt();
        if (age>120||age<0){
            System.out.println("lütfen yaşınızı düzgün girin");

        }else if (gender.equalsIgnoreCase("female")){
            if (age>60){
                System.out.println("emeklisiniz");
            }else {
                System.out.println((60-age)+"  yil daha calismalisin");
            }

        } else if (gender.equalsIgnoreCase("male")) {
            if (age>65){
                System.out.println("emeklisiniz");

            }else {
                System.out.println((65-age)+"  yil daha calismalisiniz");

            }

        }else{
            System.out.println("lütfen cisiyetinizi düzgün girin...");
        }
    }
}
