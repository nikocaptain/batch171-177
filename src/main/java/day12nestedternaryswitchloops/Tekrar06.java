package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar06 {
    public static void main(String[] args) {
        // SwitchSoru7: Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen uc haneli bir sayi giriniz");
        int sayi=scan.nextInt();
        int birlerBasamagi=sayi%10;
        int onlarBasamagi=sayi/10%10;
        int yuzlerBasamagi=sayi/100%10;

        if (sayi<1000&&sayi>99){



        switch (yuzlerBasamagi){
            case 1 :
                System.out.print("yuz");
                break;
            case 2:
                System.out.print("ikiyüz");
                break;
            case 3:
                System.out.print("ucyuz");
                break;
            case 4:
                System.out.print("dortyuz");
                break;
            case 5:
                System.out.print("besyuz");
                break;
            case 6:
                System.out.print("altiyuz");
                break;
            case 7:
                System.out.print("yediyuz");
                break;
            case 8:
                System.out.print("sekizyuz");
                break;
            case 9:
                System.out.print("dokuzyuz");
                break;

        }
        switch (onlarBasamagi){
            case 0:
                System.out.println("");
                break;
            case 1 :
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kirk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmis");
                break;
            case 7:
                System.out.print("yetmis");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;


        }
        switch (birlerBasamagi){
            case 0:
                System.out.println("");
                break;
            case 1 :
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("uc");
                break;
            case 4:
                System.out.print("dort");
                break;
            case 5:
                System.out.print("bes");
                break;
            case 6:
                System.out.print("alti");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;

        }
        }else {
            System.out.println("hatali giris");
        }
    }
}
