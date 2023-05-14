package day04_scannerwrapper;

import java.util.Scanner;

public class Tekrar01 {
    public static void main(String[] args) {
        //Ornek: kullanıcıdan iki sayı alıp dört işlem yapan ve işlemlerini sonuçlarını ekrana yazdıran kodu yazdırın

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz :  ");
        double a=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        double b= input.nextInt();

        System.out.println("toplama :  "+(a+b));
        System.out.println("çıkarma :  "+(a-b));
        System.out.println("çarpma  :  "+(a*b));
        System.out.println("bölme   :  "+(a/b));
    }
}
