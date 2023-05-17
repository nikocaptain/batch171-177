package day10ifstatements;

import java.util.Scanner;

public class Tekrar00 {
    public static void main(String[] args) {
        //Example:  Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz :");
        int num= input.nextInt();

        if (num<0){
            System.out.println("girilen sayı negetiftir...");

        } else if (num>0) {
            System.out.println("girilen sayi pozitiftir...");

        }else {
            System.out.println("girilen sayi notrdur...");

        }
    }
}
