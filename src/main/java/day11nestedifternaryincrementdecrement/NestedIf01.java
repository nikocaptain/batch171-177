package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
          /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */

        Scanner input=new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz :");
       String gender= input.next();
        System.out.println("Yaşınızı girniz :");
        int age =input.nextInt();

        if (age<0 || age>120){
            System.out.println("lutfen yasi 0 ile 120 arasında giriniz...");

        }else if(gender.equalsIgnoreCase("kadin")){
            if (age>60){
                System.out.println("emekli olabilirsin");

            }else{
                System.out.println("calismali...");

            }


        } else if (gender.equalsIgnoreCase("erkek")) {
            if(age>65){
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("kesinlikle calismalisin");
            }

        }else {
            System.out.println("Tanımlı değil");

        }
    }
}
