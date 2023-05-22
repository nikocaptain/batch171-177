package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Tekrar07 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("km-mil dönüşümü için :1 \ncelciusa fahrenheit dönüşümü için :2\nsaniye saat dönüşümü için :3");
        byte deger= scan.nextByte();
        deger =(byte) Math.abs(deger);
        if (deger==1){
            System.out.println("Lütfen km giriniz :");
            double km=scan.nextDouble();
            km=Math.abs(km);
            System.out.println(km+" kilometre "+(km*0.62)+" mil'dir");
        } else if (deger==2) {
            System.out.println("lütfen celsius değeri giriniz :");
            double celsius= scan.nextDouble();

            System.out.println(celsius+ " celsius "+(celsius*1.8+32)+ " fahrenheit'tir");

        } else if (deger==3) {
            System.out.println("lütfen saniye degerini giriniz");
            double saniye= scan.nextDouble();
            saniye =Math.abs(saniye);
            System.out.println(saniye+" saniye "+(saniye/60/60)+" saat'tir");

        }else
            System.out.println("hatalı giriş");

    }
}
