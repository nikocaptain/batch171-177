package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Tekrar02 {
    public static void main(String[] args) {
        //ornek 1: sayi 10 dan küçük ise konsola "küçük " yzdırın değilse " kucuk degil" yazdırın

        int sayi=8;
        String str=sayi<10 ? "küçük"  : "küçük değil";
        System.out.println(str);
        //ornek 4: kullanıcıdan 2 sayı alınız ve buyuk olmayan (kucuk veya eşit) sayıyı yazdırınız

        Scanner input=new Scanner(System.in);
        System.out.println("2 adet sayi giriniz...");
        int a= input.nextInt();
        int b= input.nextInt();

       int c= a<b ? a : b;
        System.out.println(c);
    }
}
