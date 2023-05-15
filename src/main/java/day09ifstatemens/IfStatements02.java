package day09ifstatemens;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //ornek 1: kullanıcıdan alınan bir sayinin tek mi çift mi olduğunu konsala yazdırın

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz :");

        int num= input.nextInt();

        //1. yol

        if (num%2==0){
            System.out.println("sayi cift sayidir..");
        }
        if (num%2!=0){
            System.out.println("sayi tek sayidir");
        }

        //2. yol ==> kontrol edilen condition sayisi az olduğundan dolayi tavsiye edilir.
        if (num%2==0){
            System.out.println("cift sayi");

        }else {//aksi halde demektir sadece bir blog çalışır
            System.out.println("tek sayi");

        }


    }
}
