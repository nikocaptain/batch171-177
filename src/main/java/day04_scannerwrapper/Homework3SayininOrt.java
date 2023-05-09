package day04_scannerwrapper;

import java.util.Scanner;

public class Homework3SayininOrt {
    //homework 1
    //kullanıcıdan aldiğimiz 3 tane sayının ortalamısını bulan kodu yazınız
    //orneğin =>3,5,7 (3+5+7)/3=5


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen ilk tamsayıyı giriniz:");
        int sayi1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int sayi2=input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz:");
        int sayi3=input.nextInt();
        System.out.println("Üç sayının ortalaması : "+(sayi1+sayi2+sayi3)/3);
    }
}
